package com.example.demo5;

import com.google.gson.annotations.SerializedName;

public class Translation {
    @SerializedName("translatedText")
    private String translatedText;

    // Getter method to retrieve the translated text
    public String getTranslatedText() {
        return translatedText;
    }

}