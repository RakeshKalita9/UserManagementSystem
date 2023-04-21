package com.UserManagementSystem.GeeksterAssignment.controlers;

import com.UserManagementSystem.GeeksterAssignment.service.Model.User;
import com.UserManagementSystem.GeeksterAssignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserControler {
     @Autowired
     UserService userService;
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
      return userService.addUserFromService(user);

    }
    @GetMapping ("/getUser")
    public User getUser(@RequestParam String User_Id) {
    return userService.getUserFromService(User_Id) ;
    }
    @GetMapping("/getAllUser")
    public List<User> getAllUser() {

    return userService.getAllUsers();
    }
    @PutMapping("/updateUser")
    public String updateUser(@RequestBody User user,@RequestParam String User_Id){
    return userService.UpdateUserInService(user,User_Id);
}
 @DeleteMapping("/deleteUser")
 public String deleteUser(@RequestParam String User_Id){
     return  userService.deleteUSerInSerVice( User_Id);
}
}