package com.louisngatale.studentwelfareservice.controllers;

import com.louisngatale.studentwelfareservice.models.requests.Advices.AdvicesRequest;
import com.louisngatale.studentwelfareservice.services.AdvicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/welfare/advices")
public class AdvicesController {

    @Autowired
    AdvicesService advicesService;

//    Get all messages for student
    @RequestMapping(value = "/conversations/messages/all", method = RequestMethod.GET)
    public ResponseEntity<?> getMessages(){
        return ResponseEntity.ok(advicesService.getMessagesForStudent());
    }

//    Create new message for student
    @RequestMapping(value = "/conversations/messages/new", method = RequestMethod.POST)
    public ResponseEntity<?> createMessage(@RequestBody AdvicesRequest advicesRequest){
        return ResponseEntity.ok(advicesService.createNewMessage(advicesRequest));
    }

//    Get all conversations for dean
    @RequestMapping(value = "/conversations/all", method = RequestMethod.GET)
    public ResponseEntity<?> getConversations(){
        return ResponseEntity.ok(advicesService.getConversations());
    }
//    Get all conversations for dean
    @RequestMapping(value = "/conversations/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getConversation(@PathVariable Integer id){
        return ResponseEntity.ok(advicesService.getMessageById(id));
    }

//    Get messages for conversation for admin
}
