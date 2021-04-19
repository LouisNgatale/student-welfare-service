package com.louisngatale.studentwelfareservice.controllers;

import com.louisngatale.studentwelfareservice.services.AdvicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/welfare/advices")
public class AdvicesController {

    @Autowired
    AdvicesService advicesService;
//    Get all messages for student
    @RequestMapping(value = "/conversations/messages", method = RequestMethod.GET)
    public ResponseEntity<?> getMessages(){
        return ResponseEntity.ok(advicesService.getMessagesForStudent());
    }

//    Create new message for student

//    Get all conversations for dean

//    Get messages for conversation for admin
}
