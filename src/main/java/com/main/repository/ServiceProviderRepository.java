package com.main.repository;

import com.main.model.ServiceProvider;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServiceProviderRepository extends MongoRepository<ServiceProvider, String> {
    // Custom query to find service providers by city
    List<ServiceProvider> findByCity(String city);

    // Custom query to find by email (for login or uniqueness checks)
    ServiceProvider findByEmail(String email);

    // Find Service Providers by type (e.g., "hairdresser")
    List<ServiceProvider> findByType(String type);
}
