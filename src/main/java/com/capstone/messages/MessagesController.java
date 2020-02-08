package com.capstone.messages;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessagesController {

    @Autowired
    private final MessagesService messagesService;

    public MessagesController (MessagesService messagesService) {
        this.messagesService = messagesService;
    }

    @GetMapping
    public List<Message> getAllMessages(){
        return this.messagesService.getAllMessages();
    }

}
