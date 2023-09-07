package com.example.UnitTesting.Repository;

import com.example.UnitTesting.Models.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AdminRepoTest {

    @Autowired
    AdminRepo adminRepo;

    @Test
    void isAdminExitsById() {

        Admin admin = new Admin(1, "Nazir Ahmad", "Handwara");

        adminRepo.save(admin);

        Boolean actual = adminRepo.isAdminExitsById(1);

        assertThat(actual).isTrue();
    }
}