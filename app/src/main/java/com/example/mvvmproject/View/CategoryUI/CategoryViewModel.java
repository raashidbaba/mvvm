package com.example.mvvmproject.View.CategoryUI;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmproject.data.model.CategoryModel;
import com.example.mvvmproject.data.repo.MvvmRepository;

import java.util.List;

public class CategoryViewModel extends ViewModel {

    private final MvvmRepository mvvmRepository;

    public CategoryViewModel(MvvmRepository mvvmRepository) {
        this.mvvmRepository = mvvmRepository;
    }

    public MutableLiveData<List<CategoryModel>> GetCategoryObserver(){
        return mvvmRepository.GetCategoryObserver();
    }
}
