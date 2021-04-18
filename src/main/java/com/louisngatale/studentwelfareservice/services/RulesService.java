package com.louisngatale.studentwelfareservice.services;


import com.louisngatale.studentwelfareservice.entities.Welfare.Rules;
import com.louisngatale.studentwelfareservice.models.responses.AllRulesResponse;
import com.louisngatale.studentwelfareservice.models.responses.RulesResponse;
import com.louisngatale.studentwelfareservice.repositories.Welfare.RulesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RulesService {
    @Autowired
    RulesDao rulesDao;

    public AllRulesResponse getAll(){
        List<Rules> rules = rulesDao.findAll();

        rules.forEach(rules1 -> {
            System.out.println(rules1);
        });
        return new AllRulesResponse(rules);
    }
}
