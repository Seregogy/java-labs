package com.test.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Main {
    public static void main(String[] args) {
        try {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .get()
                    .url("https://api.thecatapi.com/v1/images/search?limit=10")
                    .addHeader("x-api-key", System.getenv("api_key"))
                    .build();

            System.out.println(
                new GsonBuilder()
                        .setPrettyPrinting()
                        .create().toJson(
                            JsonParser.parseString(
                                    client.newCall(request).execute().body().string()
                            )
                        )
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}