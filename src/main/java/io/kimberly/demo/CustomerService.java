package io.kimberly.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers ;
    }

    public Customer getCustomer(Long customer_Id) {

        return customerRepository.findOne(customer_Id);
    }

    public void addCustomer(Customer account) {

        customerRepository.save(account);
    }

    public void updateCustomer(Long customer_Id, Customer customer) {

        customerRepository.save(customer);
    }

    public Customer getCustomerWhoOwnsAccount(Long customer_Id) {

        return customerRepository.findOne(customer_Id);
    }


}
