package com.tw.apistackbase.service;

import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.repository.CompanyRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public void deleteCompany(Long id) throws NotFoundException {
        Optional<Company> optionalCompany = companyRepository.findById(id);
        optionalCompany.ifPresent(company -> companyRepository.delete(company));
        throw new NotFoundException("Not found");
    }

    public Company findOneByName(String name) {
        return companyRepository.findOneByName(name);
    }

    public Company save(Company company) {
        return companyRepository.save(company);
    }

    public Iterable<Company> findAll(PageRequest pageRequest) {
        return companyRepository.findAll(pageRequest);
    }
}
