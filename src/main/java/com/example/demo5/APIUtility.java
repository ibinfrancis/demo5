package com.example.demo5;


import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIUtility {

    // Function to translate text using the Google Translate API
    public static Translation translateText(String textToTranslate, String targetLanguage, String sourceLanguage) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        String endpoint = "https://google-translate1.p.rapidapi.com/language/translate/v2";

        // Prepare the request body with the text to be translated, target language, and source language
        String requestBody = "q=" + textToTranslate + "&target=" + targetLanguage + "&source=" + sourceLanguage;

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .header("content-type", "application/x-www-form-urlencoded")
                .header("Accept-Encoding", "application/gzip")
                .header("X-RapidAPI-Key", "5a424808d5msh1f7ebadefeb91e4p1fcd75jsn1416d9121048")
                .header("X-RapidAPI-Host", "google-translate1.p.rapidapi.com")
                .method("POST", HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        try {
            // Sends this HTTP request and get the response
            HttpResponse<String> response = client.send(httpRequest,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());

            // Parse the JSON response using Gson library and convert it into a Translation object
            Gson gson = new Gson();
            return gson.fromJson(response.body(), Translation.class);
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

}
