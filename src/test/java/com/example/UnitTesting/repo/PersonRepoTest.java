package com.example.UnitTesting.repo;

import com.example.UnitTesting.Models.Person;
import com.example.UnitTesting.Repository.PersonRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PersonRepoTest {

    @Autowired
    PersonRepo personRepo;

    @Test
    void isPersonExitsById() {

        Person person = new Person(12, "Nazir", "Handwara");

        personRepo.save(person);

        Boolean actual = personRepo.isPersonExitsById(12);

        assertThat(actual).isTrue();

//        assertThat(actual).isFalse();
    }



    @AfterEach
    void tearDown() {
        System.out.println("This method is getting executed after each method testing...");
    }

    @BeforeEach
    void setUp() {
        System.out.println("This method is getting executed before each method testing...");

    }
}