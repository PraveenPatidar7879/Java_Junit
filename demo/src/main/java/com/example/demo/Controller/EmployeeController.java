package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getALLEmployee();
    }

    @GetMapping("/{empId}")
    public Employee getEmployeeById(@PathVariable long empId) {
        return employeeService.getEmployeeById(empId);
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping("/{empId}")
    public void updateEmployee(@PathVariable long empId, @RequestBody Employee updatedEmployee) {
        employeeService.UpdateEmployees(empId, updatedEmployee);
    }

    @DeleteMapping("/{empId}")
    public void deleteEmployee(@PathVariable Employee empId) {
        employeeService.addEmployee(empId);
    }
}
