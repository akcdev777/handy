package com.main;

import com.main.model.BusinessStore;
import com.main.model.Service;
import com.main.model.ServiceProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HandyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandyApplication.class, args);
        BusinessStore businessStore = new BusinessStore();
        ServiceProvider serviceProvider = new ServiceProvider("John Doe", "Plumber", businessStore);
        System.out.println(serviceProvider);
        Service service  = new Service("Plumbing", "Fixing pipes", 100.00, "Plumbing", "1 hour");
        businessStore.addService(service);

    }



}
