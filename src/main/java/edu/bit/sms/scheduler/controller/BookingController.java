package edu.bit.sms.scheduler.controller;

import edu.bit.sms.scheduler.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/booking")
public class BookingController {

    @Autowired
    BookingService bookingService = new BookingService();
}
