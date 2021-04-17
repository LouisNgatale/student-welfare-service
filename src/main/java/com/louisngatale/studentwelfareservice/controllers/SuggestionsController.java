package com.louisngatale.studentwelfareservice.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/welfare/suggestions")
public class SuggestionsController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "Test";
    }
}
