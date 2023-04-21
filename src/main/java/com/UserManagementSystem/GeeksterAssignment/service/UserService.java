package com.UserManagementSystem.GeeksterAssignment.service;

import com.UserManagementSystem.GeeksterAssignment.repository.UserDao;
import com.UserManagementSystem.GeeksterAssignment.service.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<User> getAllUsers(){
        return userDao.getAllUsersFromRepo();
    }
    public User getUserFromService(String User_Id){
       return  userDao.getUserFromRepo(User_Id);
    }
    public String addUserFromService(User user){
       Boolean status= userDao.addUserInRepo(user);
       return "Status "+status;
    }
    public String UpdateUserInService(User user,String User_Id){
        return "Status "+userDao.UpdateUserInRepo(user,User_Id);
    }
    public String deleteUSerInSerVice(String User_Id){
        return "Status "+userDao.deleteUSerInRepo(User_Id);
    }

}
