package com.inspectionmanager.services.impl;

import com.inspectionmanager.entities.Customer;
import com.inspectionmanager.repositories.CustomerRepository;
import com.inspectionmanager.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        Optional<Customer> estimateDb = customerRepository.findById(id);
        return estimateDb.get();
    }

    @Override
    public void insert(Customer orcamento) {
        customerRepository.save(orcamento);
    }

    @Override
    public void update(Long id, Customer estimate) {
        Optional<Customer> estimateDb = customerRepository.findById(id);
        if(estimateDb.isPresent()){
            customerRepository.save(estimate);
        }
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
