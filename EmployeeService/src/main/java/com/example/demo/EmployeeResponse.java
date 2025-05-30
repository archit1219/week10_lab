package com.example.demo;

public class EmployeeResponse {
    private int empId;
    private String name;
    private Address address;

    public EmployeeResponse(int empId, String name, Address address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    // Getters & Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
