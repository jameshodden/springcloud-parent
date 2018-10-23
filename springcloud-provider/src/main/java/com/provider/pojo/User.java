package com.provider.pojo;

public class User {
 
    private String username;
    private int age;
 
    public User() {
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public User(String username, int age) {
        super();
        this.username = username;
        this.age = age;
    }
 
 
}