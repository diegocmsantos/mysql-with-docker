package com.clearbases.mysqlwithdocker.services;

import com.clearbases.mysqlwithdocker.daos.EmployeeDAO;
import com.clearbases.mysqlwithdocker.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDao;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeDao.getAllEmployees();
        return employees;
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeDao.insertEmployee(employee);

    }

}
