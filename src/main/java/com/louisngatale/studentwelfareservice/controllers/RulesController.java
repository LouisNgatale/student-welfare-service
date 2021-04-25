package com.louisngatale.studentwelfareservice.controllers;

import com.louisngatale.studentwelfareservice.models.requests.RulesRequest;
import com.louisngatale.studentwelfareservice.services.RulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/welfare/rules")
public class RulesController {

    @Autowired
    RulesService rulesService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(rulesService.getAll());
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody RulesRequest request){
        return ResponseEntity.ok(rulesService.create(request));
    }



}
