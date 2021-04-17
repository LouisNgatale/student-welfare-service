package com.louisngatale.studentwelfareservice.repositories.Welfare;


import com.louisngatale.studentwelfareservice.entities.Welfare.Advices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvicesDao extends JpaRepository<Advices,Integer> {
}
