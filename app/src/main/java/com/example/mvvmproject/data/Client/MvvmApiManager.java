package com.example.mvvmproject.data.Client;

import com.example.mvvmproject.Config.Configuration;
import com.example.mvvmproject.data.Api.MvvmApi;
import com.example.mvvmproject.data.model.PopularModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MvvmApiManager {
    private static MvvmApi service;
    private static MvvmApiManager ApiManager;

    public MvvmApiManager() {
        service = RetrofitClient.Create();
    }

    public static MvvmApiManager getInstance(){
        if (ApiManager == null){
            ApiManager = new MvvmApiManager();
        }
        return  ApiManager;
    }

    public void getPopularMovies(Callback<List<PopularModel>> callback){
        Call<List<PopularModel>> popular = service.Popular(Configuration.APIKEY);
        popular.enqueue(callback);
    }
}
