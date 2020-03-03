package com.Capgemini.Spring.Boot.Assignment3.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    private MessageRepository  messageRepository;


    @GetMapping
    public List<Message> getAllMessage() {
        return messageRepository.findAll();
    }

    @PostMapping
    public void postMessage(@RequestBody Message message) {
        messageRepository.save(message);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id) {
     messageRepository.deleteById(id);
    }

}

