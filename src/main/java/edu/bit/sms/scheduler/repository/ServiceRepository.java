package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.ServicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServicesEntity,Long> {



}
