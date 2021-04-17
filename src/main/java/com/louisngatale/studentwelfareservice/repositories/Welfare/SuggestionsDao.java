package com.louisngatale.studentwelfareservice.repositories.Welfare;

import com.louisngatale.studentwelfareservice.entities.Welfare.Suggestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuggestionsDao extends JpaRepository<Suggestions,Integer> {

    List<Suggestions> findByPlacedBy(Integer id);
}
