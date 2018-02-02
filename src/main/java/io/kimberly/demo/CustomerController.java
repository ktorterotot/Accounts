package io.kimberly.demo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping("/customers/{customer_Id}")
    public Customer getCustomer(@PathVariable Long customer_Id){
        return customerService.getCustomer(customer_Id);
    }



    @RequestMapping(method = RequestMethod.POST, value = "/customers")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/customers/{customer_Id}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable Long customer_Id){
        customerService.updateCustomer(customer_Id, customer);
    }
}
