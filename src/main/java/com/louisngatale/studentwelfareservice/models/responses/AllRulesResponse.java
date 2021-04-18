package com.louisngatale.studentwelfareservice.models.responses;

import com.louisngatale.studentwelfareservice.entities.Welfare.Rules;

import java.util.ArrayList;
import java.util.List;

public class AllRulesResponse {
    List<Rules> suggestionsResponses = new ArrayList<>();

    public AllRulesResponse() {
    }

    public AllRulesResponse(List<Rules> suggestionsResponses) {
        this.suggestionsResponses = suggestionsResponses;
    }

    public List<Rules> getSuggestionsResponses() {
        return suggestionsResponses;
    }

    public void setSuggestionsResponses(List<Rules> suggestionsResponses) {
        this.suggestionsResponses = suggestionsResponses;
    }
}
