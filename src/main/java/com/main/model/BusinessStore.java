package com.main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "business_stores") // MongoDB collection annotation
public class BusinessStore {

    @Id
    private String id; // Unique identifier for MongoDB
    private String businessName;
    private String businessDescription;
    private String businessAddress;
    private String businessPhone;
    private String businessEmail;
    private String businessWebsite;
    private String businessImageUrl;

    @DBRef
    private List<Service> services; // List of services offered by the business

    // Default constructor for MongoDB
    public BusinessStore() {
        this.services = new ArrayList<>();
    }

    // Parameterized constructor
    public BusinessStore(String businessName, String businessDescription, String businessAddress,
                         String businessPhone, String businessEmail, String businessWebsite,
                         String businessImageUrl) {
        this.businessName = businessName;
        this.businessDescription = businessDescription;
        this.businessAddress = businessAddress;
        this.businessPhone = businessPhone;
        this.businessEmail = businessEmail;
        this.businessWebsite = businessWebsite;
        this.businessImageUrl = businessImageUrl;
        this.services = new ArrayList<>();
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessDescription() {
        return businessDescription;
    }

    public void setBusinessDescription(String businessDescription) {
        this.businessDescription = businessDescription;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    public String getBusinessWebsite() {
        return businessWebsite;
    }

    public void setBusinessWebsite(String businessWebsite) {
        this.businessWebsite = businessWebsite;
    }

    public String getBusinessImageUrl() {
        return businessImageUrl;
    }

    public void setBusinessImageUrl(String businessImageUrl) {
        this.businessImageUrl = businessImageUrl;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    // Methods to manage services
    public void addService(Service service) {
        this.services.add(service);
    }

    public void removeService(Service service) {
        this.services.remove(service);
    }
}
