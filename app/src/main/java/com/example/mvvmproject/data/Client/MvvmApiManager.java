package com.example.mvvmproject.data.Client;

import com.example.mvvmproject.Config.Configuration;
import com.example.mvvmproject.data.Api.MvvmApi;
import com.example.mvvmproject.data.model.CategoryModel;

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

    public void getCategories(Callback<List<CategoryModel>> callback){
        Call<List<CategoryModel>> popular = service.Category();
        popular.enqueue(callback);
    }
}
