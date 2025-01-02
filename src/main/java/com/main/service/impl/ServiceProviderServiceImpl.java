package com.main.service.impl;

import com.main.model.BusinessStore;
import com.main.model.ServiceProvider;
import com.main.repository.BusinessStoreRepository;
import com.main.repository.ServiceProviderRepository;
import com.main.service.ServiceProviderService;
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

@Service
public class ServiceProviderServiceImpl implements ServiceProviderService {

    @Autowired
    private ServiceProviderRepository serviceProviderRepository;

    @Autowired
    private BusinessStoreRepository businessStoreRepository;

    @Override
    public ServiceProvider createServiceProvider(ServiceProvider serviceProvider) {
        return serviceProviderRepository.save(serviceProvider);
    }

    @Override
    public ServiceProvider getServiceProviderById(String id) {
        return serviceProviderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ServiceProvider not found with ID: " + id));
    }

    @Override
    public BusinessStore assignBusinessStoreToServiceProvider(String serviceProviderId, BusinessStore businessStore) {
        ServiceProvider serviceProvider = getServiceProviderById(serviceProviderId);
        BusinessStore savedStore = businessStoreRepository.save(businessStore);
        serviceProvider.setBusinessStore(savedStore);
        serviceProviderRepository.save(serviceProvider);
        return savedStore;
    }

    @Override
    public List<ServiceProvider> getServiceProvidersByCity(String city) {
        return serviceProviderRepository.findByCity(city);
    }

    @Override
    public List<ServiceProvider> getServiceProvidersByType(String type) {
        return serviceProviderRepository.findByType(type);
    }

    @Override
    public <S extends ServiceProvider> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends ServiceProvider> List<S> insert(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public <S extends ServiceProvider> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ServiceProvider> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends ServiceProvider> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends ServiceProvider> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ServiceProvider> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ServiceProvider> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ServiceProvider, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends ServiceProvider> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ServiceProvider> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<ServiceProvider> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<ServiceProvider> findAll() {
        return List.of();
    }

    @Override
    public List<ServiceProvider> findAllById(Iterable<String> strings) {
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
    public void delete(ServiceProvider entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends ServiceProvider> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<ServiceProvider> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<ServiceProvider> findAll(Pageable pageable) {
        return null;
    }
}
