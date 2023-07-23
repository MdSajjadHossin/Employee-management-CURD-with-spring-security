package com.shossin.springboot.cruddemo.service;

import com.shossin.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
