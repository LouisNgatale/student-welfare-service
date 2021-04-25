package com.louisngatale.studentwelfareservice.repositories.Welfare;

import com.louisngatale.studentwelfareservice.entities.Welfare.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessagesDao extends JpaRepository<Messages,Integer> {
    List<Messages> findByConversationsId(Integer id);
}
