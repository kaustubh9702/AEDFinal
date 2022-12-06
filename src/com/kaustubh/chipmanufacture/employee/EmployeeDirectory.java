/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaustubh.chipmanufacture.employee;

import com.kaustubh.base.GenericDirectory;

/**
 *
 * @author kaustubh
 */
public class EmployeeDirectory extends GenericDirectory<Employee>{
     public EmployeeDirectory() {
    }

    
    public static Employee createEmployee(int id,String name, String phoneNumber, String profileLocation){
        Employee employee = new Employee(id,name,phoneNumber, profileLocation);
        return employee;
    }
    public  Employee addEmployee(String name, String phoneNumber, String profileLocation){
        Employee employee = createEmployee(size(),name, phoneNumber, profileLocation);
        add(employee);
        return employee;
    }
}
