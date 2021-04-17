package com.louisngatale.studentwelfareservice.repositories.Welfare;


import com.louisngatale.studentwelfareservice.entities.Welfare.Rules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RulesDao extends JpaRepository<Rules,Integer> {
}
