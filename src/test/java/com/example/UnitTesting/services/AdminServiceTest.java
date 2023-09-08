package com.example.UnitTesting.services;

import com.example.UnitTesting.Repository.AdminRepo;
import com.example.UnitTesting.Repository.PersonRepo;
import com.example.UnitTesting.Services.AdminService;
import com.example.UnitTesting.Services.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
class AdminServiceTest {

    @Mock // Creating fake data
    private AdminRepo adminRepo;

    private AdminService adminService;

    @BeforeEach
    void setUp() {

        this.adminService = new AdminService(this.adminRepo);
    }
    @Test
    void getAllAdmin() {

        adminService.getAllAdmin();

        verify(adminRepo).findAll();
    }
}