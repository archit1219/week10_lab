package com.example.demo;
import org.springframework.web.client.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{empId}")
    public EmployeeResponse getEmployeeDetails(@PathVariable int empId) {
        Address address = restTemplate.getForObject("http://address-service/address/" + empId, Address.class);
        return new EmployeeResponse(empId, "John Doe", address);
    }
}
