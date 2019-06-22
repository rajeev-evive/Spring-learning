package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repositoty.CustomerRepository;
import com.pluralsight.repositoty.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("customerService")
@Scope("singleton")
public class CustomerServiceImpl implements CustomerService {


   // @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){

    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {

        System.out.println("we are using cons injection");
        this.customerRepository = customerRepository;
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {

        System.out.println("we are using getter injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }


}
