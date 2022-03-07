package com.example.mvvmproject.View.CategoryUI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvvmproject.R;
import com.example.mvvmproject.data.model.CategoryModel;

public class CategoryFragment extends Fragment {
    CategoryViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_category, container, false);

        viewModel.GetCategoryObserver().observe(getViewLifecycleOwner(),categoryModels -> {

        });
        return root;
    }
}