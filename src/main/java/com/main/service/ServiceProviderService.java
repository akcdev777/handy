package com.main.service;

import com.main.model.BusinessStore;
import com.main.model.ServiceProvider;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServiceProviderService extends MongoRepository<ServiceProvider, String> {
    // Create a new ServiceProvider
    ServiceProvider createServiceProvider(ServiceProvider serviceProvider);

    // Find a ServiceProvider by ID
    ServiceProvider getServiceProviderById(String id);

    // Assign a BusinessStore to a ServiceProvider
    BusinessStore assignBusinessStoreToServiceProvider(String serviceProviderId, BusinessStore businessStore);

    // Get all ServiceProviders in a specific city
    List<ServiceProvider> getServiceProvidersByCity(String city);

    // Get all ServiceProviders by type
    List<ServiceProvider> getServiceProvidersByType(String type);
}
