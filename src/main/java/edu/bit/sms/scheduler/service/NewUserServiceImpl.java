package edu.bit.sms.scheduler.service;

import edu.bit.sms.scheduler.model.UserModel;
import edu.bit.sms.scheduler.repository.NewUserRepository;
import edu.bit.sms.scheduler.service.interfaces.NewUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewUserServiceImpl implements NewUserService {
    @Autowired
    private NewUserRepository newUserRepository;

    @Override
    public List<UserModel> findAllUsers() {
        //here findAllUsers returen type is usermodel list
        //database search
        //return all users
        List<UserModel> allusershere= newUserRepository.findAll();
        //return  userRepository.findAll();
        return allusershere;
    }

    @Override
    public String saveUserr(UserModel userdata) {
        newUserRepository.save(userdata);

        return "data saved";
    }

    @Override
    public String updateUser(UserModel newusermodel) {
        String msg=null;
        if(newusermodel.getId() !=null){
            newUserRepository.save(newusermodel);
            msg="Data Updated";
        }

        else {msg ="error update";}

        return msg;

    }

    @Override
    public UserModel findById(Long id) {
        return newUserRepository.getOne(id);
    }

    @Override
    public void deleteUser(Long id) {
        newUserRepository.deleteById(id);
    }
}
