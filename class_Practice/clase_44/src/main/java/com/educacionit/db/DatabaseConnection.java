package com.educacionit.db;

import java.sql.SQLException;

import com.educacionit.db.model.User;

public interface DatabaseConnection {
    User getUserById(int userId) throws SQLException;
}
