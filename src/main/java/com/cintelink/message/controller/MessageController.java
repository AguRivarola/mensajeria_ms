package com.cintelink.message.controller;

import com.cintelink.message.model.Message;
import com.cintelink.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api")
public class MessageController {

    private MessageService service;
    @Autowired
    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping(value = "/messages")
    public ResponseEntity<Iterable<Message>> getMessageByUser(@RequestParam String user, @RequestParam String password ){

        Iterable<Message> mensajes =  service.getMessageByUser(user,password);

        ResponseEntity<Iterable<Message>> response;
        if (mensajes == null) {
            response = ResponseEntity.notFound().build();
        }else {
            response = ResponseEntity.ok().body(mensajes);
        }

        return response;
    }
}
