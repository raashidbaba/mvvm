package com.example.mvvmproject.data.model;

import com.google.gson.annotations.SerializedName;

public class PopularModel {
    @SerializedName("id")
    private int id;
    @SerializedName("backdrop_path")
    private String backdrop_path;

    public PopularModel(int id, String backdrop_path) {
        this.id = id;
        this.backdrop_path = backdrop_path;
    }

    public PopularModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }
}
