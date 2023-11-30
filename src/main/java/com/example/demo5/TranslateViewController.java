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

    @FXML
    void translateAPI(ActionEvent event) throws IOException, InterruptedException {
        String translate = languageOneTextField.getText();
        String target = targetTextArea.getText();
        String source = sourceTextArea.getText();


        Translation translation = APIUtility.translateText(translate, target, source);


        if (translation != null) {
            translatedLabel.setText(translation.getTranslatedText());
        } else {
            translatedLabel.setText("Error occurred while translating");
        }
    }

}
