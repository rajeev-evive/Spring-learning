package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repositoty.CustomerRepository;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){

    }

    public CustomerServiceImpl(CustomerRepository customerRepository){//constructor

        this.customerRepository=customerRepository;

    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {//setter
        this.customerRepository = customerRepository;
    }


}







