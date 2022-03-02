package com.example.mvvmproject.View;

import android.app.Application;

import com.example.mvvmproject.data.Client.MvvmApiManager;

public class MainApplication extends Application {
    public static MvvmApiManager apiManager;
    @Override
    public void onCreate() {
        super.onCreate();
        apiManager = MvvmApiManager.getInstance();
    }
}
