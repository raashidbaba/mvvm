package com.example.mvvmproject.data.model;

import com.google.gson.annotations.SerializedName;

public class CategoryModel {

    @SerializedName("id")
    private int id;
    @SerializedName("categoryName")
    private String CategoryName;
    @SerializedName("imageUrl")
    private String ImageUrl;

    public CategoryModel() {}

    public CategoryModel(int id, String categoryName, String imageUrl) {
        this.id = id;
        CategoryName = categoryName;
        ImageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }
}
