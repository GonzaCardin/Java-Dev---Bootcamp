package com.educacionit.model;

public class User {
    private Integer id;
    private String full_name;
    public User(Integer id, String full_name) {
        this.id = id;
        this.full_name = full_name;
    }
    public User() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFullName() {
        return full_name;
    }
    public void setFullName(String full_name) {
        this.full_name = full_name;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", full_name=" + full_name + "]";
    }
    
}
