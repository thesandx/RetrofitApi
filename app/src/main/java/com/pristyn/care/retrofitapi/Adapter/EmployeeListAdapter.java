package com.pristyn.care.retrofitapi.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pristyn.care.retrofitapi.Model.Employee;
import com.pristyn.care.retrofitapi.R;

import org.w3c.dom.Text;

import java.util.List;


public class EmployeeListAdapter extends RecyclerView.Adapter<EmployeeListAdapter.MyViewHolder> {

    public List<Employee> employeeList;

    public EmployeeListAdapter(List<Employee> employees){
        this.employeeList=employees;
    }






    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText(employeeList.get(position).getName());
        holder.salary.setText(employeeList.get(position).getSalary());




    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView salary;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.employee_name);
            salary = itemView.findViewById(R.id.employee_salary);
        }
    }



}
