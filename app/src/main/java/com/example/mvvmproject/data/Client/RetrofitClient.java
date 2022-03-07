package com.example.mvvmproject.data.Client;

import com.example.mvvmproject.Config.Configuration;
import com.example.mvvmproject.data.Api.MvvmApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static MvvmApi Create(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Configuration.ROOTAPI)//APi Call
                .addConverterFactory(GsonConverterFactory.create()) //Gson
                .build();
        return retrofit.create(MvvmApi.class);
    }
}
