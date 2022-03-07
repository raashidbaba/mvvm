package com.example.mvvmproject.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvmproject.data.Client.MvvmApiManager;
import com.example.mvvmproject.data.model.CategoryModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MvvmRepository {
    private static MvvmRepository instance;
    private MvvmApiManager apiManager;

    private final MutableLiveData<List<CategoryModel>> category = new MutableLiveData<>();

    public MvvmRepository(MvvmApiManager apiManager) {
        this.apiManager = apiManager;
    }

    private static MvvmRepository getInstance(MvvmApiManager manager) {
       if(instance == null){
           instance = new MvvmRepository(manager);
       }
       return instance;
    }

    public MutableLiveData<List<CategoryModel>> GetCategoryObserver(){
        apiManager.getCategories(new Callback<List<CategoryModel>>() {
            @Override
            public void onResponse(Call<List<CategoryModel>> call, Response<List<CategoryModel>> response) {
                if(response.isSuccessful()){
                    List<CategoryModel> body = response.body();
                    category.setValue(body);
                }else {
                    category.postValue(null);
                }
            }

            @Override
            public void onFailure(Call<List<CategoryModel>> call, Throwable t) {
                category.postValue(null);
            }
        });
        return category;
    }
}
