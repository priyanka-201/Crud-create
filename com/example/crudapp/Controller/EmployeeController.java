package com.example.crudapp.Controller;

import com.example.crudapp.Model.EmployeeEntity;
import com.example.crudapp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @PostMapping("/employee")
    public String createEmployee(@RequestBody EmployeeEntity employee){
        service.createEmployee(employee);
        return "Employee record created with id : "+employee.getId();
    }
    @GetMapping("/employee")
    public List<EmployeeEntity> getEmployees(){
        return service.getEmployees();
    }
}
