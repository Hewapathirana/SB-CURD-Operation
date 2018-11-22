package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingEntity,Long> {



}
