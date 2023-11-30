package com.example.demo5;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIUtility {


    public static void main(String[] args) throws IOException, InterruptedException {
        translateText("Hello who is this" , "it", "en");
    }

    public static Translation translateText(String textToTranslate, String targetLanguage, String sourceLanguage) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        String endpoint = "https://google-translate1.p.rapidapi.com/language/translate/v2";
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
            HttpResponse<String> response = client.send(httpRequest,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());

            Gson gson = new Gson();
            return gson.fromJson(response.body(), Translation.class);
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
