package edu.bit.sms.scheduler.controller;
import edu.bit.sms.scheduler.model.UserModel;
import edu.bit.sms.scheduler.service.interfaces.NewUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author dasitha
 * @since 2018-11-21
 */
@RestController
@RequestMapping(path = "/usernew")
@CrossOrigin(origins = "http://localhost:4200")
public class User {

    //@AUtowired tells that userService is a dependancy injection
    @Autowired
    private NewUserService newUserService;

    @GetMapping("/allUsers")
    public List<UserModel> allusers(){
        return newUserService.findAllUsers();

    }

    //model should be wrapped here
    @PostMapping("/allUsers/saveUser")
    public String saveUser(@RequestBody UserModel Userdata){

        return newUserService.saveUserr(Userdata);

    }

    @PutMapping("/allUsers/update")
    public String updateUser(@RequestBody  UserModel newusermodel){
        return newUserService.updateUser(newusermodel);
    }

    @PutMapping("/allUsers/updateone/{id}")
    public UserModel updateUserone(@PathVariable(value = "id") Long noteId,
                                @RequestBody UserModel newusermodel){
        UserModel userModel=newUserService.findById(noteId);
          userModel.setEmail(newusermodel.getEmail());
          userModel.setName(newusermodel.getName());
          newUserService.saveUserr(userModel);
          return userModel;
    }



    @GetMapping("/allUsers/finduser/{id}")
    public UserModel getUserById(@PathVariable(value = "id") Long noteId){//@PathVariable Long id

        return newUserService.findById(noteId);
    }

    @DeleteMapping("/allUsers/delete/{id}")
    public void deleteUserById(@PathVariable Long id){

        newUserService.deleteUser(id);
    }

}
