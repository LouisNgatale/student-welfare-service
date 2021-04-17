package com.louisngatale.studentwelfareservice.repositories.AppUser;

import com.louisngatale.studentwelfareservice.entities.AppUser.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    Optional<User> findByLoginId(String loginId);
}
