package com.example.postgresjpastarter.controllers;

import com.example.postgresjpastarter.models.SingleFamilyProperty;
import com.example.postgresjpastarter.services.PropertyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {
    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/properties")
    public String getProperties() {
        return "All properties";
    }

    @GetMapping("/property/{name}")
    public String getPropertyByName(@PathVariable String name) {
        return propertyService.getPropertyByName(name);
    }

    /**
     * Add a new property
     * @param property
     */
    @PostMapping("/property")
    public void addProperty(@RequestBody SingleFamilyProperty property) {
        // Add a new property
        propertyService.addProperty(property);
    }

}
