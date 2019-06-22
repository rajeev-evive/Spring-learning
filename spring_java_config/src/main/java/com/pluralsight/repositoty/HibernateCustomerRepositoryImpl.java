package com.pluralsight.repositoty;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll() {

        List<Customer> customers = new ArrayList<Customer>();

        Customer customer = new Customer();

        customer.setFirstname("Bryan");
        customer.setLastname("Hansen");

        customers.add(customer);

        return customers;

    }

}
