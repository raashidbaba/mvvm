package com.example.mvvmproject.data.Api;

import com.example.mvvmproject.data.model.CategoryModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MvvmApi {

    @GET("api/Category")
    Call<List<CategoryModel>> Category();
}
