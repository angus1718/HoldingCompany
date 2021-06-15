package com.example.app;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofitservice {
    public static final String URL="https://084a6b45ece5.ngrok.io";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public ResApi api = retrofit.create(ResApi.class);

}
