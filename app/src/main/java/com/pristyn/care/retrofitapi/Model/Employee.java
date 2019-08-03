package com.pristyn.care.retrofitapi.Model;

import com.google.gson.annotations.SerializedName;

public class Employee {




    @SerializedName("employee_name")
    private String Name;


    @SerializedName("employee_salary")
    private String salary;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


}
