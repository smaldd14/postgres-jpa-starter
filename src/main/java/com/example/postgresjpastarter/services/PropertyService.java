package com.example.postgresjpastarter.services;

import com.example.postgresjpastarter.Repository.PropertyRepository;
import com.example.postgresjpastarter.models.SingleFamilyProperty;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {
    private final PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public String getPropertyByName(String name) {
        return propertyRepository.findByName(name).toString();
    }

    // Add a new property
    public void addProperty(SingleFamilyProperty property) {
        // TODO: Make sure the property does not exist in the db already
        propertyRepository.save(property);
    }

}
