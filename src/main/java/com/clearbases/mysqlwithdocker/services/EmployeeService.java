package com.clearbases.mysqlwithdocker.services;

import com.clearbases.mysqlwithdocker.models.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void insertEmployee(Employee employee);

}
