package com.pristyn.care.retrofitapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BSAE_URL="http://dummy.restapiexample.com/api/v1/";
    public static Retrofit retrofit = null;

    //method that return instance of retrofit

    //singleton method

    public static Retrofit getApiClient(){
        if (retrofit==null){
            //create the instance
            retrofit=new Retrofit.Builder().baseUrl(BSAE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }

        return  retrofit;
    }

}
