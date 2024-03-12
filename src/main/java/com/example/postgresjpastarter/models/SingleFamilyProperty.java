package com.example.postgresjpastarter.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "single_family_property")
public class SingleFamilyProperty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private int beds;

    // for JPA only, no use
    public SingleFamilyProperty() {
    }

    // getters, setters and constructor
}
