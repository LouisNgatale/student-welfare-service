package com.louisngatale.studentwelfareservice.repositories.AppUser;

import com.louisngatale.studentwelfareservice.entities.AppUser.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailsDao extends JpaRepository<StudentDetails,Integer> {

}
