package com.louisngatale.studentwelfareservice.repositories.Welfare;

import com.louisngatale.studentwelfareservice.entities.Welfare.Conversations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConversationsDao extends JpaRepository<Conversations,Integer> {
    Optional<Conversations> findByStudentId(Integer  id);
}