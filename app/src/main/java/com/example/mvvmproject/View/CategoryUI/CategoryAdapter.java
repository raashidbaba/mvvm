package com.example.mvvmproject.View.CategoryUI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmproject.R;
import com.example.mvvmproject.data.model.CategoryModel;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private final Context context;
    private List<CategoryModel> categoryModelList;

    public CategoryAdapter(Context context, List<CategoryModel> categoryModelList) {
        this.context = context;
        this.categoryModelList = categoryModelList;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View root = LayoutInflater.from(context).inflate(R.layout.category_item,parent,false);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if(categoryModelList != null){
            return this.categoryModelList.size();
        }
        return 0;
    }

    static class CategoryViewHolder extends RecyclerView.ViewHolder{
        ImageView CategoryImage;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
