package com.educacionit.db.service;

import com.educacionit.db.DatabaseConnection;
import com.educacionit.db.model.User;

public class UserService {
    private DatabaseConnection dbConnection;

    public UserService(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public String getUserFullName(Integer id) {
        User user = dbConnection.getUserById(id);
        if (user != null)
            return user.getFullname();
        return null;
    }
}
