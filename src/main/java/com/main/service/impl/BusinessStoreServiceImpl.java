package com.main.service.impl;

import com.main.model.BusinessStore;
import com.main.repository.BusinessStoreRepository;
import com.main.repository.ServiceRepository;
import com.main.service.BusinessStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service // Correctly using Spring's @Service annotation
public class BusinessStoreServiceImpl implements BusinessStoreService {

    private final BusinessStoreRepository businessStoreRepository;
    private final ServiceRepository serviceRepository;

    @Autowired
    public BusinessStoreServiceImpl(BusinessStoreRepository businessStoreRepository, ServiceRepository serviceRepository) {
        this.businessStoreRepository = businessStoreRepository;
        this.serviceRepository = serviceRepository;
    }

    @Override
    public BusinessStore createBusinessStore(BusinessStore businessStore) {
        return businessStoreRepository.save(businessStore);
    }

    @Override
    public BusinessStore getBusinessStoreById(String id) {
        return businessStoreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("BusinessStore not found with ID: " + id));
    }

    @Override
    public BusinessStore addServiceToBusinessStore(String businessStoreId, com.main.model.Service service) {
        BusinessStore businessStore = getBusinessStoreById(businessStoreId);
        com.main.model.Service savedService = serviceRepository.save(service); // Save the service first
        businessStore.addService(savedService); // Add the saved service to the business store
        return businessStoreRepository.save(businessStore); // Save the updated business store
    }

    @Override
    public List<com.main.model.Service> getAllServicesForBusinessStore(String businessStoreId) {
        BusinessStore businessStore = getBusinessStoreById(businessStoreId);
        return businessStore.getServices();
    }

    @Override
    public BusinessStore removeServiceFromBusinessStore(String businessStoreId, String serviceId) {
        BusinessStore businessStore = getBusinessStoreById(businessStoreId);
        businessStore.getServices().removeIf(service -> service.getId().equals(serviceId));
        return businessStoreRepository.save(businessStore);
    }

    @Override
    public <S extends BusinessStore> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends BusinessStore> List<S> insert(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public <S extends BusinessStore> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends BusinessStore> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends BusinessStore> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends BusinessStore> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends BusinessStore> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends BusinessStore> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends BusinessStore, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends BusinessStore> S save(S entity) {
        return null;
    }

    @Override
    public <S extends BusinessStore> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<BusinessStore> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<BusinessStore> findAll() {
        return List.of();
    }

    @Override
    public List<BusinessStore> findAllById(Iterable<String> strings) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(BusinessStore entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends BusinessStore> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<BusinessStore> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<BusinessStore> findAll(Pageable pageable) {
        return null;
    }
}