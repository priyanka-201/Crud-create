package com.example.crudapp.Service;

import com.example.crudapp.Model.EmployeeEntity;
import com.example.crudapp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository respository;
    public String createEmployee(EmployeeEntity employee){
        respository.save(employee);
        return "Record created with employee id "+employee.getId();
    }
    public List<EmployeeEntity> getEmployees(){
        return respository.findAll();
    }
}
