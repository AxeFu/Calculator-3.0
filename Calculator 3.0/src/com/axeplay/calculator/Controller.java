package com.axeplay.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private TextField inputField;

    @FXML
    private void onButtonPressed(MouseEvent e) {
        String buttonText = ((Button)e.getSource()).getText();
        switch (buttonText) {
            case "<-": backspace(); break;
            case "=": calc(); return;
            case "C": inputField.setText(""); break;
            default: inputField.setText(inputField.getText() + buttonText);
        }
        inputField.positionCaret(inputField.getText().length());
    }

    @FXML
    private void calc() {
        inputField.setText(Analyser.start(inputField.getText()));
        inputField.positionCaret(inputField.getText().length());
    }

    private void backspace() {
        String text = inputField.getText();
        inputField.setText("");
        for (int i = 0, length = text.length()-1; i < length; i++) {
            inputField.setText(inputField.getText() + text.charAt(i));
        }
    }
}
