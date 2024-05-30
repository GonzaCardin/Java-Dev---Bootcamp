package com.educacionit.db.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.educacionit.db.DataBaseConnection;

import com.educacionit.model.User;

public class UserServiceTest2 {
    private static final int ID = 1212;
    private static final String NOMBRE = "Gonza";

    @Test
    void testGetUserFullName() {

        DataBaseConnection dbConnectionImpl = mock(DataBaseConnection.class);
        User mockUser = new User(ID, NOMBRE);
        when(dbConnectionImpl.getUserById(ID)).thenReturn(mockUser);

        UserService userService = new UserService(dbConnectionImpl);
        String userName = userService.getUserFullName(ID);

        assertNotNull(userName);
        assertEquals(NOMBRE, userName);
    }

    @Test
    void testGetUserFullNameUserNull() {

        DataBaseConnection dbConnectionImpl = mock(DataBaseConnection.class);
        // User mockUser = new User(ID,NOMBRE);
        when(dbConnectionImpl.getUserById(ID)).thenReturn(null);

        UserService userService = new UserService(dbConnectionImpl);
        String userName = userService.getUserFullName(ID);

        assertNull(userName);
    }
}
