package com.main.controller;

import com.main.model.ServiceProvider;
import com.main.service.ServiceProviderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/service-providers")
public class ServiceProviderController {

    @Autowired
    private ServiceProviderService serviceProviderService;

    @PostMapping("/register")
    public ResponseEntity<ServiceProvider> registerServiceProvider(@Valid @RequestBody ServiceProvider serviceProvider) {
        ServiceProvider createdServiceProvider = serviceProviderService.createServiceProvider(serviceProvider);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdServiceProvider);
    }
}
