package com.main.repository;

import com.main.model.Service;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServiceRepository extends MongoRepository<Service, String> {
    // Custom query to find services by type
    List<Service> findByType(String type);

    // Custom query to find services within a price range
    List<Service> findByPriceBetween(double minPrice, double maxPrice);

    // Find Services by name
    List<Service> findByName(String name);
}
