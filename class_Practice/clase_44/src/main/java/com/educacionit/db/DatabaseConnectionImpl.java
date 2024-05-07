package com.educacionit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.educacionit.db.model.User;

public class DatabaseConnectionImpl implements DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost/clase_44";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Jaques";

    @Override
    public User getUserById(int userId) throws SQLException{
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM user WHERE id=?")) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new User(rs.getInt("id"), rs.getString("fullname"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}