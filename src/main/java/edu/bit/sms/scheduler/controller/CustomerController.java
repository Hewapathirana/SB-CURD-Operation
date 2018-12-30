package edu.bit.sms.scheduler.controller;

import edu.bit.sms.scheduler.model.Customer;
import edu.bit.sms.scheduler.service.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author dasitha
 * @since 2018-12-30
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> allCustomers(){
        return customerService.findAllCustomers();

    }



    @PostMapping(value = "/customers/create")
    public String saveCustomer(@RequestBody Customer customer){

        return customerService.saveCustomer(customer);
    }


    @DeleteMapping("/customers/{id}")
    public void deleteCustomerById(@PathVariable Long id){

        customerService.deleteCustomerById(id);
    }

    @DeleteMapping("/customers/delete")
    public void deleteAllCustomers(){

        customerService.deleteAllCustomers();
    }

    @GetMapping(value = "customers/age/{age}")
    public List<Customer> findByAge(@PathVariable Integer age) {

        List<Customer> customers = customerService.findByAgeOfCustomer(age);
        return customers;
    }

    @PutMapping("/customers/{id}")
    public Customer updateUserone(@PathVariable(value = "id") Long customerId,
                                   @RequestBody Customer customerIn){
        Customer customer=customerService.findCustomerById(customerId);
        customer.setName(customerIn.getName());
        customer.setAge(customerIn.getAge());
        customer.setActive(customerIn.isActive());
        customerService.saveCustomer(customer);
        return customer;
    }
}
