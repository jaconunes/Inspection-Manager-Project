package com.inspectionmanager.services;

import com.inspectionmanager.entities.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer findById(Long id);

    void insert(Customer customer);

    void update(Long id, Customer customer);

    void delete(Long id);
}
