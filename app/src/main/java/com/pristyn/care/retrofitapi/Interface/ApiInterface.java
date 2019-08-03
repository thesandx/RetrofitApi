package com.pristyn.care.retrofitapi.Interface;

import com.pristyn.care.retrofitapi.Model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {


            @GET("employees")
   public  Call<List<Employee>>  getEmployee();

}
