package com.main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "service_providers")
public class ServiceProvider {

    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private String description;
    private String type; // Type of service provider (e.g., hairdresser, tattoo artist)
    private double rating; // Updated to double for better calculations
    private String imageUrl;
    private String website;
    private String socialMedia;
    private BusinessStore businessStore; // Embedded relationship

    public ServiceProvider(String name, String type, BusinessStore businessStore) {
        this.name = name;
        this.type = type;
        this.businessStore = businessStore;

    }

    // Parameterized constructor
    public ServiceProvider(String name, String email, String phone, String address, String city, String state,
                           String zip, String country, String description, String type, double rating,
                           String imageUrl, String website, String socialMedia, BusinessStore businessStore) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postcode = zip;
        this.country = country;
        this.description = description;
        this.type = type;
        this.rating = rating;
        this.imageUrl = imageUrl;
        this.website = website;
        this.socialMedia = socialMedia;
        this.businessStore = businessStore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return postcode;
    }

    public void setZip(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    public BusinessStore getBusinessStore() {
        return businessStore;
    }

    public void setBusinessStore(BusinessStore businessStore) {
        this.businessStore = businessStore;
    }


}
