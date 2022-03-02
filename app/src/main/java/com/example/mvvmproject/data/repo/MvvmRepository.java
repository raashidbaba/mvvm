package com.example.mvvmproject.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvmproject.data.Client.MvvmApiManager;
import com.example.mvvmproject.data.model.PopularModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MvvmRepository {
    private static MvvmRepository instance;
    private MvvmApiManager apiManager;

    private final MutableLiveData<List<PopularModel>> popularMovies = new MutableLiveData<>();

    public MvvmRepository(MvvmApiManager apiManager) {
        this.apiManager = apiManager;
    }

    private static MvvmRepository getInstance(MvvmApiManager manager) {
       if(instance == null){
           instance = new MvvmRepository(manager);
       }
       return instance;
    }

    public MutableLiveData<List<PopularModel>> GetPopularMovies(){
        apiManager.getPopularMovies(new Callback<List<PopularModel>>() {
            @Override
            public void onResponse(Call<List<PopularModel>> call, Response<List<PopularModel>> response) {
                if(response.isSuccessful()){
                    List<PopularModel> body = response.body();
                    popularMovies.setValue(body);
                }else {
                    popularMovies.postValue(null);
                }
            }

            @Override
            public void onFailure(Call<List<PopularModel>> call, Throwable t) {
                popularMovies.postValue(null);
            }
        });
        return popularMovies;
    }
}
