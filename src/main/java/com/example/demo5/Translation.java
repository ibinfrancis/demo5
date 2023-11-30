package com.example.demo5;

import com.google.gson.annotations.SerializedName;

public class Translation {
    @SerializedName("translatedText")
    private String translatedText;

    public String getTranslatedText() {
        return translatedText;
    }

}
