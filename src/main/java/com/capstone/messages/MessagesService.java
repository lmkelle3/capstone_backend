package com.capstone.messages;


import com.capstone.claims.ClaimsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagesService {

    @Autowired
    private final MessagesRepository messagesRepository;

    public MessagesService (MessagesRepository messagesRepository){
        this.messagesRepository = messagesRepository;
    }

    public List <Message> getAllMessages(){
        return messagesRepository.findAll();
    }

    public Optional <Message> getOneMessage(int id){
        return messagesRepository.findAllById(id);
    }

}
