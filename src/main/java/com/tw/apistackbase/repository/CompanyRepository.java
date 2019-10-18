package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    Company findOneByName(String name);
}
