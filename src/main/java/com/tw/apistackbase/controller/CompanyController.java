package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.Company;
import com.tw.apistackbase.model.CompanyModel;
import com.tw.apistackbase.service.CompanyService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping(value = "/all", produces = {"application/json"})
    public Iterable<Company> list(@RequestParam Integer page, @RequestParam Integer pageSize) {
        return companyService.findAll(PageRequest.of(page, pageSize));
    }

    @PostMapping(produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    public Company add(@RequestBody Company company) {
        return companyService.save(company);
    }

    @GetMapping(produces = {"application/json"})
    public CompanyModel getCompanyByName(@RequestParam(required = false) String name) {
        return companyService.findOneByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable Long id) throws NotFoundException {
        companyService.deleteCompany(id);
    }
}
