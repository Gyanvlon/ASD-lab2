package com.ems.module.service;

import com.ems.module.Domain.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> fetchAllEmployees();
    public Employee fetchEmployeeById( Long id);
    public Employee updateEmployee( Long id, Employee employee);
    public void deleteEmployee(Long id);
}
