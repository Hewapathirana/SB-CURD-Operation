package edu.bit.sms.scheduler.service.interfaces;

import edu.bit.sms.scheduler.model.UserModel;

import java.util.List;

public interface NewUserService {
    //we should provide methods here for crud

    //to get values from the databse
    List<UserModel> findAllUsers();

    //to save values for the database
    String saveUserr(UserModel userdata);

    //to update user
    String updateUser(UserModel newusermodel);


    //find a user by id
    UserModel findById(Long id);


    void deleteUser(Long id);
}
