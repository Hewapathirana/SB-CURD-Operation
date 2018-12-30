package edu.bit.sms.scheduler.service;

import edu.bit.sms.scheduler.model.Customer;
import edu.bit.sms.scheduler.repository.CustomerRepository;
import edu.bit.sms.scheduler.service.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<Customer> findAllCustomers() {
        List<Customer> allCustomers=customerRepository.findAll();
        return allCustomers;
    }

    @Override
    public String saveCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Customers Saved";
    }

    @Override
    public String updateCustomer(Customer updatecustomer) {
        String msg=null;
        if(updatecustomer.getId() != null){
            customerRepository.save(updatecustomer);
            msg="Customer Updated";
        }

        else {msg ="customer error update";}

        return msg;
    }

    @Override
    public List<Customer> findByAgeOfCustomer(Integer age) {
        List<Customer> customers = customerRepository.findByAge(age);
               return customers;
    }

    @Override
    public void deleteAllCustomers() {
        customerRepository.deleteAll();
    }

    @Override
    public void deleteCustomerById(Long id) {
         customerRepository.deleteById(id);

        System.out.println("customer deleted" + id);
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.getOne(id);
    }
}
