package com.demo.testdemo.model;

public class UserDetailsModel {

    private int PersonID;
    private String Passwords;
    private String LastName;
    private String FirstName;
    public int getPersonID() {
        return PersonID;
    }
    public void setPersonID(int personID) {
        PersonID = personID;
    }
    private String Address;
    private int age;
    public String getPasswords() {
        return Passwords;
    }
    public void setPasswords(String passwords) {
        Passwords = passwords;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}