package com.cintelink.message.service;

import com.cintelink.message.model.Message;
import com.cintelink.message.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private MessageRepository repository;

    @Autowired
    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Iterable<Message> getMessageByUser(String user, String password){


        return repository.findAll();
    }
}
