package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repositoty.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


    //@Aotowired
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    //@Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("setter injection");
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }


}
