package com.shossin.springboot.cruddemo.dao;

import com.shossin.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
