package com.UserManagementSystem.GeeksterAssignment.repository;

import com.UserManagementSystem.GeeksterAssignment.service.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

   private List<User> userList;
    public UserDao(){
         userList = new ArrayList<>();
    }
    public List<User> getAllUsersFromRepo(){
        return userList;
    }
    public User getUserFromRepo(String User_Id){
        for(User ele : userList){
            String str = ele.User_Id;
            if(str.equals(User_Id)){
                return ele ;
            }
        }
        return null;
    }
    public Boolean addUserInRepo(User user){
       return userList.add(user);
    }
    public Boolean UpdateUserInRepo(User user,String User_Id){
        for(User ele: userList){
            String str= ele.User_Id;
            if(str.equals(User_Id)){
                ele.User_Id=user.User_Id;
                ele.Name = user.Name;
                ele.User_Name = user.User_Name;
                ele.Address =user.Address;
                ele.Phone_number =user.Phone_number;
                return true;
            }
        }
        return false;
    }
    public Boolean deleteUSerInRepo(String User_Id){
        for(User ele: userList){
            String str= ele.User_Id;
            if(str.equals(User_Id)){
                userList.remove(ele);
                return true;
            }
        }
        return false;
    }
}
