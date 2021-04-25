package com.louisngatale.studentwelfareservice.services;

import com.louisngatale.studentwelfareservice.entities.Welfare.Rules;
import com.louisngatale.studentwelfareservice.models.requests.RulesRequest;
import com.louisngatale.studentwelfareservice.models.responses.AllRulesResponse;
import com.louisngatale.studentwelfareservice.repositories.Welfare.RulesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RulesService {
    @Autowired
    RulesDao rulesDao;

    public AllRulesResponse getAll(){
        List<Rules> rules = rulesDao.findAll();

        return new AllRulesResponse(rules);
    }

    public String create(RulesRequest request) {
        Rules rule = new Rules(request.getTitle(),request.getCategory(),request.getBody());

        rulesDao.save(rule);

        return "Success";
    }
}
