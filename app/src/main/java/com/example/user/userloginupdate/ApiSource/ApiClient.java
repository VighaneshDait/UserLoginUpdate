package com.example.user.userloginupdate.ApiSource;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static  String User_Login_Request="http://132.148.245.100/api/";

    private static Retrofit retrofit;


    public static Retrofit getClient(){

        if(retrofit==null)
        {

            retrofit=new Retrofit.Builder()
                    .baseUrl(User_Login_Request)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        return retrofit;
    }
}
