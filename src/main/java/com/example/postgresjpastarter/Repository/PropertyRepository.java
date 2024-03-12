package com.example.postgresjpastarter.Repository;

import com.example.postgresjpastarter.models.SingleFamilyProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// Spring Data JPA creates CRUD implementation at runtime automatically.
public interface PropertyRepository extends JpaRepository<SingleFamilyProperty, Long> {

    SingleFamilyProperty findByName(String name);

    // Custom query
//    @Query("SELECT p FROM properties p WHERE p.name= ':name'")
//    List<SingleFamilyProperty> findByPublishedDateAfter(@Param("name") String name);

}

