package com.educacionit.db.model;

public class User {
    private Integer id;
    private String fullname;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public User(Integer id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }
    public User() {
    }
}
