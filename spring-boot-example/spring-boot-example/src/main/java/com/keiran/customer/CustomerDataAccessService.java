package com.keiran.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessService implements CustomerDao{
    //db
    private static final List<Customer> customers;
    static {
        customers = new ArrayList<>();
        Customer Alex = new Customer(1, "Alex", "alex@gmail.com", 25);
        Customer James = new Customer(2, "James", "james@gmail.com", 19);
        customers.add(Alex);
        customers.add(James);

    }
    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream().filter(c -> c.getId().equals(id))
                .findFirst();

    }
}
