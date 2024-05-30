package com.educacionit.db.service;

import com.educacionit.db.DataBaseConnection;
import com.educacionit.model.User;

public class UserService {
    private DataBaseConnection databaseConnection;

    public UserService(DataBaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public String getUserFullName(Integer id) {
        User user = databaseConnection.getUserById(id);
        if(user != null)return user.getFullName();
        return null;
    }
}
