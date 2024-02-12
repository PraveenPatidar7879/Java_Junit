package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.example.demo.Entity.Employee;
@Service
public class EmployeeServiceImp implements EmployeeService {
    private List<Employee> employeeList =new ArrayList<>();

    @Override
    public List<Employee> getALLEmployee() {

        return employeeList;
        
    }

    @Override
    public Employee getEmployeeById(long empId) {
        return employeeList.stream().filter(e->e.getEmpId()==empId).findFirst().orElse(null);
        
    }

    @Override
    public void UpdateEmployees(long empId, Employee updatedEmployee) {
        employeeList.removeIf(e->e.getEmpId()==empId);
        employeeList.add(updatedEmployee);
    }

    @Override
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    @Override
    public void DeleteEmployee(long empid) {
        
        employeeList.removeIf(e->e.getEmpId()==empid);
    }


}
