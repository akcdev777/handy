package com.main.repository;

import com.main.model.BusinessStore;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BusinessStoreRepository extends MongoRepository<BusinessStore, String> {
    // Custom query to find stores by business name
    List<BusinessStore> findByBusinessName(String businessName);
}
