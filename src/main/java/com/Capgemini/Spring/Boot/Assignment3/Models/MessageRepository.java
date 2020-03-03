package com.Capgemini.Spring.Boot.Assignment3.Models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
