package com.educacionit.db.service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.educacionit.db.impl.DataBaseConnectionImpl;
import com.educacionit.db.*;

public class UserServiceTest {
    private Connection connection;
    private static final String URL = "";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";
    private static final int ID = 1212;
    private static final String NOMBRE = "Gonza";

    @BeforeEach
    void setUp() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        createTestData();
    }

    private void createTestData() throws SQLException {
        String query = "insert into users (id,ful_name) values(?,?)";
        try (PreparedStatement s = connection.prepareStatement(query);) {
            s.setInt(1, ID);
            s.setString(2, NOMBRE);
            s.executeUpdate();
        }
    }

    @Test
    void testGetUserFullName() {
        DataBaseConnection dbConnectionImpl = new DataBaseConnectionImpl();
        UserService userService = new UserService(dbConnectionImpl);

        String userName = userService.getUserFullName(ID);
        assertNotNull(userName);
        assertEquals(NOMBRE, userName);
    }

    @Test
    void testGetUserFullNameError() {
        DataBaseConnection dbConnectionImpl = new DataBaseConnectionImpl();
        UserService userService = new UserService(dbConnectionImpl);

        String userName = userService.getUserFullName(null);
        assertNull(userName);
    }

    private void cleanData() throws SQLException {
        String query = "delete from users where id = ?";
        try (PreparedStatement s = connection.prepareStatement(query)) {
            s.setInt(1, ID);
            s.executeUpdate();
        }
    }

    @AfterEach
    void tearDown() throws SQLException {
        if (connection != null) {
            cleanData();
            connection.close();
        }
    }
}
