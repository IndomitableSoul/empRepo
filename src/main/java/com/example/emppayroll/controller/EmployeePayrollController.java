package com.example.emppayroll.controller;


import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/empPayroll")
public class EmployeePayrollController {
    //Get
    @GetMapping("/get")
    public String getEmployee(){
        return "Emp data fetched successfully";
    }

    //Post
    @PostMapping("/postEmpData")
    public String postEmployeeData(){
        return "Emp data stored successfully";
    }

    //Put
    @PutMapping("/updateEmpData")
    public String updateEmployeeData(){
        return "Emp data updated successfully";
    }

    //Delete
    @DeleteMapping("/deleteEmpData")
    public String deleteEmployeeData(){
        return "Emp data deleted successfully";
    }
}
