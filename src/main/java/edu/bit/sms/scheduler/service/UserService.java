package edu.bit.sms.scheduler.service;


import edu.bit.sms.scheduler.model.UserEntity;
import edu.bit.sms.scheduler.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sathya Molagoda
 * @since 2018-11-13
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * save new users and update existing users
     * @param user
     */
    public UserEntity saveUser(UserEntity user){
        userRepository.save(user);
        return user;
    }

    /**
     * get all un-deleted users
     * @param status
     * @return
     */
    public List<UserEntity> getUndeletedUsers(int status){
        return userRepository.getUserEntitiesByDeleteStatusIsNot(status);
    }

    /**
     * retrieve the user by unique identification number
     * @param id
     * @return
     */
    public UserEntity getUserByUserId(Long id){
        return userRepository.getUserEntityByIdEquals(id);
    }
}
