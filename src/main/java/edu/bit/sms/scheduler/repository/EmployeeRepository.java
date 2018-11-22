package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {



}
