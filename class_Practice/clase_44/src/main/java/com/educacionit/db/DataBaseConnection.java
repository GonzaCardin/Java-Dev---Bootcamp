package com.educacionit.db;

import java.util.List;

import com.educacionit.model.User;

public interface DataBaseConnection {
    User getUserById(Integer userId);

    List<User> getAllUsers();

}
