package com.clearbases.mysqlwithdocker.daos;

import com.clearbases.mysqlwithdocker.models.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();
    void insertEmployee(Employee employee);

}
