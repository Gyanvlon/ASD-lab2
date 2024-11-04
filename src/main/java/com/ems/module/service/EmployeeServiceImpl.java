package com.ems.module.service;

import com.ems.module.Domain.Employee;
import com.ems.module.repository.EmployeeRepoository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepoository employeeRepoository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepoository.save(employee);
    }

    @Override
    public List<Employee> fetchAllEmployees() {
        return employeeRepoository.findAll();
    }

    @Override
    public Employee fetchEmployeeById(Long id) {
        return employeeRepoository.findById(id).get();
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        if (employeeRepoository.existsById(id)) {
            employee.setFirstName(employee.getFirstName());
            employee.setLastName(employee.getLastName());
            employee.setSalary(employee.getSalary());
            return employeeRepoository.save(employee);
        }
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepoository.deleteById(id);
    }
}
