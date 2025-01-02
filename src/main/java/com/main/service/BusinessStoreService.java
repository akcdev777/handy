package com.main.service;

import com.main.model.BusinessStore;
import com.main.model.Service;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BusinessStoreService extends MongoRepository<BusinessStore, String> {
    // Create a new BusinessStore
    BusinessStore createBusinessStore(BusinessStore businessStore);

    // Find a BusinessStore by ID
    BusinessStore getBusinessStoreById(String id);

    // Add a service to a BusinessStore
    BusinessStore addServiceToBusinessStore(String businessStoreId, Service service);

    // Get all services for a specific BusinessStore
    List<Service> getAllServicesForBusinessStore(String businessStoreId);

    // Delete a service from a BusinessStore
    BusinessStore removeServiceFromBusinessStore(String businessStoreId, String serviceId);
}
