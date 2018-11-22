package edu.bit.sms.scheduler.controller;

import edu.bit.sms.scheduler.model.UserEntity;
import edu.bit.sms.scheduler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author Sathya Molagoda
 * @since 2018-11-13
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * save new users and update existing users
     * @param userEntity
     * @return
     */
    @PostMapping(path="/saveUser")
    public @ResponseBody UserEntity saveUser( @RequestParam UserEntity userEntity) {
        return userService.saveUser(userEntity);
    }

    /**
     * get all un-deleted users
     * @param status
     * @return
     */
    @GetMapping(path="/undeletedusers/{status}")
    public @ResponseBody List<UserEntity> getUndeletedUsers( @PathVariable("status") int status){
        return userService.getUndeletedUsers(status);
    }
    //for test
    @GetMapping(path="/test")
    public String test(){
        return "Hello dev dasith";
    }



    /**
     * retrieve user by unique number
     * @param userId
     * @return
     */
    @GetMapping(path="/userbyid")
    public @ResponseBody UserEntity getUserbyUserId(@RequestParam Long userId){
        return userService.getUserByUserId(userId);
    }

}
