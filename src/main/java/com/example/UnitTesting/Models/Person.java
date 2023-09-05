package com.example.UnitTesting.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    private Integer personId;
    private String personName;
    private String personCity;
}
