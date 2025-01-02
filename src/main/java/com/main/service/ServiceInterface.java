package com.main.service;

import com.main.model.Service;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServiceInterface extends MongoRepository<Service, String> {
    // Create a new Service
    Service createService(Service service);

    // Find a Service by ID
    Service getServiceById(String id);

    // Get all Services by type
    List<Service> getServicesByType(String type);

    // Get all Services within a price range
    List<Service> getServicesByPriceRange(double minPrice, double maxPrice);

    // Delete a Service by ID
    void deleteServiceById(String id);
}
