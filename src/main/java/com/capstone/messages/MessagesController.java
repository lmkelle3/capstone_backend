package com.capstone.messages;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Message getOneMessage(@PathVariable int id) {
        Message message = messagesService.getOneMessage(id).orElseThrow(IllegalArgumentException::new);
        return message;
    }

    @PostMapping
    public Message addOneMessage(@RequestBody Message newMessage) {
        if(newMessage.getMessageBody() == null) {
            throw new IllegalArgumentException("Please type a message before sending");
        }
        return messagesService.addOneMessage(newMessage);
    }

    @PatchMapping
    public Message updateOneMessage(@RequestBody Message updatedMessage) {
        Message message = messagesService.getOneMessage(updatedMessage.getId()).orElseThrow(IllegalArgumentException::new);
        return messagesService.updateOneMessage(updatedMessage);
    }

    @DeleteMapping("/{id}")
    public String removeOneMessage(@PathVariable int id) {
        Message message = messagesService.getOneMessage(id).orElseThrow(IllegalArgumentException::new);
        return messagesService.removeOneMessage(id);
    }

}
