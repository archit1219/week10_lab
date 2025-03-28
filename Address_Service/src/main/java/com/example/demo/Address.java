package com.example.demo;

public class Address {
    private int empId;
    private String street;
    private String city;

    public Address() {
    }

    public Address(int empId, String street, String city) {
        this.empId = empId;
        this.street = street;
        this.city = city;
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
