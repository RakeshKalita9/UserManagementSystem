package com.UserManagementSystem.GeeksterAssignment.service.Model;

public class User {
    public String User_Id;
    public String Name;
    public String User_Name;
    public String Address;
    public String Phone_number;
    public User(){
        System.out.println("Defalut Const Is Called");
    }
    public User(String User_Id, String Name, String User_Name, String address, String Phone_number) {
        this.User_Id = User_Id;
        this.Name = Name;
        this.User_Name = User_Name;
        this.Address = address;
        this.Phone_number = Phone_number;
        System.out.println("Student class ob is Created");
    }


}
