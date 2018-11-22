package edu.bit.sms.scheduler.controller;

import edu.bit.sms.scheduler.model.AddresBookEntity;
import edu.bit.sms.scheduler.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sathya Molagoda
 * @since 2018-11-13
 */
@Controller
@RequestMapping(path="/address")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService = new AddressBookService();

    /**
     * get all undeleted addresses
     * @param deleteStatus
     * @return
     */
    @GetMapping(path="/getAllAddressed")
    public  @ResponseBody List<AddresBookEntity> getAllAddresses(@RequestParam Integer deleteStatus){
        return addressBookService.getAllAddreses(deleteStatus);
    }

    /**
     * save address
     * @param addresBookEntity
     */
    @PostMapping(path="/saveAddress")
    public @ResponseBody String saveAddressBook(@RequestParam AddresBookEntity addresBookEntity){
        addressBookService.saveAddresBook(addresBookEntity);
         return "Saved";
    }


    /**
     * search un deleted addresses using email
     * @param status
     * @param email
     * @return
     */
    @GetMapping(path="/getAddressByEmail")
    public @ResponseBody List<AddresBookEntity> getallUndeletedAddressByEmail(@RequestParam int status, @RequestParam String email){
        return addressBookService.getallUndeletedAddressByEmail(status, email);
    }

    /**
     * search un deleted addresses using first name
     * @param status
     * @param firstname
     * @return
     */
    @GetMapping(path="/getAddressByFirstName")
    public @ResponseBody List<AddresBookEntity> getallUndeletedAddressByFirstName(@RequestParam int status,@RequestParam String firstname){
        return addressBookService.getallUndeletedAddressByFirstName(status,firstname);
    }

    /**
     * search un deleted addresses last name
     * @param status
     * @param lastname
     * @return
     */
    @GetMapping(path="/getAddressByLastName")
    public @ResponseBody List<AddresBookEntity> getallUndeletedAddressByLastName(@RequestParam int status,@RequestParam String lastname){
        return addressBookService.getallUndeletedAddressByLastName(status,lastname);
    }

    /**
     * search un deleted addresses using user Id
     * @param status
     * @param userId
     * @return
     */
    @GetMapping(path="/getAddressByUserID")
    public @ResponseBody AddresBookEntity getallUndeletedAddressByUserId(@RequestParam int status,@RequestParam Long userId){
        return addressBookService.getallUndeletedAddressByUserId(status,userId);
    }

}
