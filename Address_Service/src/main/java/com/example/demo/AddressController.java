package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/{empId}")
    public Address getAddressByEmpId(@PathVariable int empId) {
        return new Address(empId, "100 University Ave", "Toronto");
    }
}
