package com.educacionit.db.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.educacionit.db.DataBaseConnection;
import com.educacionit.model.User;

public class DataBaseConnectionImpl implements DataBaseConnection {
    private static final String URL = "";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";

    @Override
    public List<User> getAllUsers() {

        return null;
    }

    @Override
    public User getUserById(Integer userId) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE id = ?")) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new User(rs.getInt("id"), rs.getString("full_name"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
