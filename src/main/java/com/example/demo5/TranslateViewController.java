package com.example.demo5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


import java.io.IOException;

public class TranslateViewController {


    @FXML
    private TextField languageOneTextField;

    @FXML
    private TextArea sourceTextArea;

    @FXML
    private TextArea targetTextArea;

    @FXML
    private Label translatedLabel;

    // Method to handle translation using the API
    @FXML
    void translateAPI(ActionEvent event) throws IOException, InterruptedException {

        // Get text from input fields
        String translate = languageOneTextField.getText();
        String target = targetTextArea.getText();
        String source = sourceTextArea.getText();

        // Call the APIUtility to perform translation
        Translation translation = APIUtility.translateText(translate, target, source);

        // Display the translated text or an error message
        if (translation != null) {
            translatedLabel.setText(translation.getTranslatedText());
        } else {
            translatedLabel.setText("Error occurred while translating");
        }
    }

    // Method to switch to the "code-view" scene
    @FXML
    void viewCode(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "code-view.fxml");
    }
}
