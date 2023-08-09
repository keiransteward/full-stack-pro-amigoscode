package com.keiran;


import com.keiran.customer.Customer;
import com.keiran.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

       SpringApplication.run(Main.class, args);

    }
    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository) {
        return args -> {
            Customer Alex = new Customer("Alex", "alex@gmail.com", 25);
            Customer James = new Customer("James", "james@gmail.com", 19);

            List<Customer> customers = List.of(Alex, James);
            customerRepository.saveAll(customers);
        };
    }



}

