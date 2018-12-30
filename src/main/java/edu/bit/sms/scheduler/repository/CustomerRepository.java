package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Long> {
    List<Customer> findByAge(int age);
}
