package edu.bit.sms.scheduler.controller;

import edu.bit.sms.scheduler.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/emaployee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService = new EmployeeService();


}
