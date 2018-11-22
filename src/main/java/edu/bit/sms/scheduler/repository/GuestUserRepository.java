package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.GuestDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestUserRepository extends JpaRepository<GuestDetailsEntity,Long> {



}
