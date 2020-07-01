package com.rt.mylibrary.utils;

import com.rt.layoutlibrary.http.ApiServer;
import com.rt.mylibrary.http.RetrofitServiceManager;

public class ApiConfig {
    public static float mScaleX = 1;
    public static float mScaleY = 1;
    public static float mScale = 1;

    public static String BASE_URL = "http://empty.com/";

    public static ApiServer apiServer = RetrofitServiceManager.getInstance().create(ApiServer.class);
}