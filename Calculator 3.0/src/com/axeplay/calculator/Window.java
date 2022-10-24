package com.axeplay.calculator;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SuppressWarnings("all")
public class Window extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(FXMLLoader.load(Window.class.getResource("main.fxml")));

        primaryStage.setTitle("Calc");
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(loadIcon());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Image loadIcon() {
        return new Image(Window.class.getResourceAsStream("icon.png"));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
