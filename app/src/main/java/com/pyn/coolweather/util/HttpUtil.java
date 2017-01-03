package com.pyn.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * describtion: 网络请求工具类
 * Created by pengyn on 2017/1/3.
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }

}
