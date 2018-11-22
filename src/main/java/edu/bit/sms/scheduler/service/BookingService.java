package edu.bit.sms.scheduler.service;

import edu.bit.sms.scheduler.repository.BookingItemRepository;
import edu.bit.sms.scheduler.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {


    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    BookingItemRepository bookingItemRepository;

}
