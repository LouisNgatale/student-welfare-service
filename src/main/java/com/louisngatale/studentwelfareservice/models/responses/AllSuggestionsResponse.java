package com.louisngatale.studentwelfareservice.models.responses;

import java.util.ArrayList;
import java.util.List;

public class AllSuggestionsResponse {
    List<SuggestionsResponse> suggestionsResponses = new ArrayList<>();

    public AllSuggestionsResponse() {
    }

    public AllSuggestionsResponse(List<SuggestionsResponse> suggestionsResponses) {
        this.suggestionsResponses = suggestionsResponses;
    }

    public List<SuggestionsResponse> getSuggestionsResponses() {
        return suggestionsResponses;
    }

    public void setSuggestionsResponses(List<SuggestionsResponse> suggestionsResponses) {
        this.suggestionsResponses = suggestionsResponses;
    }
}
