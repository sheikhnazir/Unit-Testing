package com.example.UnitTesting.services;

import com.example.UnitTesting.Repository.PersonRepo;
import com.example.UnitTesting.Services.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class) // it means that the Mockito extension will be applied to
                                    // that test class. This allows you to use Mockito's mocking
                                    //capabilities within your test methods, making it easier to
                                    // create and work with mock objects when testing your code.
class PersonServiceTest {

    @Mock
    private PersonRepo personRepo;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        this.personService = new PersonService(this.personRepo);
    }

    @Test
    void getAllPerson() {

        personService.getAllPerson();

        verify(personRepo).findAll();
    }
}