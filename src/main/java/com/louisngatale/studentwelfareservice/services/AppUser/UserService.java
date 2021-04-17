package com.louisngatale.studentwelfareservice.services.AppUser;

import com.louisngatale.studentwelfareservice.entities.AppUser.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findOne(String username);
}
