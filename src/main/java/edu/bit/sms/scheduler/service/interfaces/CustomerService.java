package edu.bit.sms.scheduler.service.interfaces;

import edu.bit.sms.scheduler.model.Customer;

import java.util.List;

public interface CustomerService {

    //to get values from the databse
    List<Customer> findAllCustomers();

    //to save values for the database
    String saveCustomer(Customer customer);

    //to update user
    String updateCustomer(Customer updatecustomer);


    //find a user by id
     List<Customer> findByAgeOfCustomer(Integer age);


    void deleteAllCustomers();

    void deleteCustomerById(Long id);

    //find a post by id
    Customer findCustomerById(Long id);
}
