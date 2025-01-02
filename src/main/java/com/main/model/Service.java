package com.main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "services") // MongoDB collection annotation
public class Service {

    @Id
    private String id; // Unique identifier for MongoDB
    private String name;
    private String description;
    private double price;
    private String type; // E.g., haircut, plumbing, etc.
    private String estimatedTime; // E.g., "1 hour", "30 minutes"

    // Default constructor for MongoDB
    public Service() {
    }

    // Parameterized constructor
    public Service(String name, String description, double price, String type, String estimatedTime) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.type = type;
        this.estimatedTime = estimatedTime;
    }

    // Getters and setters
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }
}
