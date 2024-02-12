package com.example.demo.Controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

import java.util.Arrays;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeController employeeController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetAllEmployees() throws Exception {
        Mockito.when(employeeService.getALLEmployee()).thenReturn(Arrays.asList(
                new Employee(1, "John Doe", 30, 50000),
                new Employee(2, "Jane Smith", 25, 60000)
        ));

        mockMvc.perform(MockMvcRequestBuilders.get("/employees"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.jsonPath("$[0].empName").value("John Doe"))
               .andExpect(MockMvcResultMatchers.jsonPath("$[1].empName").value("Jane Smith"));
    }

    // Similar tests for other CRUD operations
}
