package com.example.mvvmproject.data.Api;

import com.example.mvvmproject.data.model.PopularModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MvvmApi {
    // get popular movies.
    @GET("popular/{api_key}")
    Call<List<PopularModel> > Popular(@Path("api_key") String Api_key);
}
