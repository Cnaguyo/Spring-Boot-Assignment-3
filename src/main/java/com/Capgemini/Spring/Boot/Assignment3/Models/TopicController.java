package com.Capgemini.Spring.Boot.Assignment3.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topic")
public class TopicController {


        @Autowired
        private TopicRepository topicRepository;

        @GetMapping
        public List<Topic> getAllTopic() {
            return topicRepository.findAll();
        }

        @PostMapping
        public void postTopic(@RequestBody Topic topic) {
            topicRepository.save(topic);
        }

        @DeleteMapping("/{id}")
        public void deleteTopic(@PathVariable Long id) {
            topicRepository.deleteById(id);
        }

    }

