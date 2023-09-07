package com.example.UnitTesting.Services;

import com.example.UnitTesting.Models.Admin;
import com.example.UnitTesting.Models.Person;
import com.example.UnitTesting.Repository.AdminRepo;
import com.example.UnitTesting.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminRepo;

    public List<Admin> getAllPerson() {

        return this.adminRepo.findAll();
    }

    public AdminService(AdminRepo adminRepo) {

        this.adminRepo = adminRepo;
    }
}
