package com.louisngatale.studentwelfareservice.services.AppUser;

import com.louisngatale.studentwelfareservice.entities.AppUser.Roles;

public interface RoleService {
    Roles findByName(String name);
}