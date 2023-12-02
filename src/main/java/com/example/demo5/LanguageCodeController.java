package com.example.demo5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LanguageCodeController {
    @FXML
    private ListView<String> languageListView;

    //This method is called when the file is loaded
    public void initialize() {

        // Initially, hide the languageListView
        languageListView.setVisible(false);

        // Array of language code from Google Translate API
        String[] languageCodes = {"Afrikaans - af",
                "Albanian - sq",
                "Amharic - am",
                "Arabic - ar",
                "Armenian - hy",
                "Azerbaijani - az",
                "Basque - eu",
                "Belarusian - be",
                "Bengali - bn",
                "Bosnian - bs",
                "Bulgarian - bg",
                "Catalan - ca",
                "Cebuano - ceb",
                "Chinese(S) -zh-CN",
                "Chinese(T) - zh-TW",
                "Corsican - co",
                "Croatian - hr",
                "Czech - cs",
                "Danish - da",
                "Dutch - nl",
                "English - en",
                "Esperanto - eo",
                "Estonian - et",
                "Finnish - fi",
                "French - fr",
                "Frisian - fy",
                "Galician - gl",
                "Georgian - ka",
                "German - de",
                "Greek - el",
                "Gujarati - gu",
                "Haitian Creole - ht",
                "Hausa - ha",
                "Hawaiian - haw",
                "Hebrew - he",
                "Hindi - hi",
                "Hmong - hmn",
                "Hungarian - hu",
                "Icelandic - is",
                "Igbo - ig",
                "Indonesian - id",
                "Irish - ga",
                "Italian - it",
                "Japanese - ja",
                "Javanese - jw",
                "Kannada - kn",
                "Kazakh - kk",
                "Khmer - km",
                "Korean - ko",
                "Kurdish - ku",
                "Kyrgyz - ky",
                "Lao - lo",
                "Latin - la",
                "Latvian - lv",
                "Lithuanian - lt",
                "Luxembourgish - lb",
                "Macedonian - mk",
                "Malagasy - mg",
                "Malay - ms",
                "Malayalam - ml",
                "Maltese - mt",
                "Maori - mi",
                "Marathi - mr",
                "Mongolian - mn",
                "Myanmar - my",
                "Nepali - ne",
                "Norwegian - no",
                "Nyanja - ny",
                "Pashto - ps",
                "Persian - fa",
                "Polish - pl",
                "Portuguese - pt",
                "Punjabi - pa",
                "Romanian - ro",
                "Russian - ru",
                "Samoan - sm",
                "Scots Gaelic - gd",
                "Serbian - sr",
                "Sesotho - st",
                "Shona - sn",
                "Sindhi - sd",
                "Sinhala - si",
                "Slovak - sk",
                "Slovenian - sl",
                "Somali - so",
                "Spanish - es",
                "Sundanese - su",
                "Swahili - sw",
                "Swedish - sv",
                "Tagalog - tl",
                "Tajik - tg",
                "Tamil - ta",
                "Telugu - te",
                "Thai - th",
                "Turkish - tr",
                "Ukrainian - uk",
                "Urdu - ur",
                "Uzbek - uz",
                "Vietnamese - vi",
                "Welsh - cy",
                "Xhosa - xh",
                "Yiddish - yi",
                "Yoruba - yo",
                "Zulu - zu"};

        // Convert the array to an ObservableList
        ObservableList<String> languageList = FXCollections.observableArrayList(languageCodes);
        languageListView.setItems(languageList);
    }

    // Button for getting the language code
    @FXML
    void getCode(ActionEvent event) {

        // Make the languageListView visible when the button is pressed
        languageListView.setVisible(true);
    }

    // Button for returning to the main view
    @FXML
    void returnToMain(ActionEvent event) throws IOException {

        // Change the scene to "translate-view.fxml" when the button is pressed
        SceneChanger.changeScenes(event, "translate-view.fxml");

    }


}