package com.ems.module.repository;

import com.ems.module.Domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepoository extends JpaRepository<Employee, Long> {

}
