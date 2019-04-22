package com.clearbases.mysqlwithdocker.controllers;

import com.clearbases.mysqlwithdocker.models.Employee;
import com.clearbases.mysqlwithdocker.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService empService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getEmployees() {

        return empService.getAllEmployees();

    }

    @RequestMapping(value = "/insertemployee", method = RequestMethod.POST)
    public void insertEmployee(@RequestBody Employee employee) {
        empService.insertEmployee(employee);
    }

}
