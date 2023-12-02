package com.example.demo5;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class LanguageCode extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LanguageCode.class.getResource("code-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Translation App");
        stage.getIcons().add(new Image(LanguageCode.class.getResourceAsStream("images/google-translate-5.png")));//Unique Translation icon
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}