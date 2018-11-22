package edu.bit.sms.scheduler.repository;

import edu.bit.sms.scheduler.model.BookingEntity;
import edu.bit.sms.scheduler.model.BookingItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingItemRepository extends JpaRepository<BookingItemEntity,Long> {


}
