package com.louisngatale.studentwelfareservice.controllers;


import com.louisngatale.studentwelfareservice.models.requests.NewSuggestionRequest;
import com.louisngatale.studentwelfareservice.services.SuggestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/welfare/suggestions")
public class SuggestionsController {

    @Autowired
    SuggestionsService suggestionsService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "Test";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody NewSuggestionRequest request){
        return  ResponseEntity.ok(suggestionsService.create(request));
    }

    @RequestMapping(value = "/student/all", method = RequestMethod.GET)
    public ResponseEntity<?> getStudentPersonalSuggestions(){
        return  ResponseEntity.ok(suggestionsService.getStudentsSuggestions());
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteSuggestion(@PathVariable Integer id){
        return  ResponseEntity.ok(suggestionsService.deleteSuggestion(id));
    }
}
