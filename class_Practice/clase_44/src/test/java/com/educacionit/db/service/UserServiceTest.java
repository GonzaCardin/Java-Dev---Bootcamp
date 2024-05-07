package com.educacionit.db.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.educacionit.db.DatabaseConnectionImpl;
import com.educacionit.db.DatabaseConnection;
import com.educacionit.db.service.UserService;

public class UserServiceTest {
    private static final String URL = "jdbc:mysql://localhost/clase_44";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Jaques";
    private static final Integer ID = 1;
    private static final String NOMBRE = "Gonzalo";
    private Connection connection;
    @BeforeEach
    void setup() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    private void createTestData() throws SQLException {
        String query = "insert into user(id,fullname) values (?, ?)";
        try (PreparedStatement s = connection.prepareStatement(query)) {
            s.setInt(1, ID);
            s.setString(2, NOMBRE);
            s.executeUpdate();
        }
    }
    @Test
    void testGetUserFullName() {
        DatabaseConnection ds = new DatabaseConnectionImpl();
        UserService u = new UserService(ds);
        String username = u.getUserFullName(ID);

        Assertions.assertNotNull(username);
        Assertions.assertEquals(NOMBRE, username);
        
    }
}
