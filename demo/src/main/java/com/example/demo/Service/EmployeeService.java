package com.example.demo.Service;
import java.beans.JavaBean;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
@Service
public interface EmployeeService {
 
    List<Employee>  getALLEmployee();
    Employee getEmployeeById(long empId);
    void UpdateEmployees(long empId,Employee updatedEmployee);
    void addEmployee(Employee emp);
    void DeleteEmployee(long empid);


    
} 

