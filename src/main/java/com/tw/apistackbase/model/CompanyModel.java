package com.tw.apistackbase.model;

import com.tw.apistackbase.entity.CompanyProfile;
import com.tw.apistackbase.entity.Employee;

import java.util.List;

public class CompanyModel {
    private Long id;

    private String name;

    private String location;

    private CompanyProfile profile;

    private List<Employee> employees;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyModel() {
    }

    public CompanyModel(String name) {
        this.name = name;
    }

    public CompanyProfile getProfile() {
        return profile;
    }

    public void setProfile(CompanyProfile profile) {
        this.profile = profile;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
