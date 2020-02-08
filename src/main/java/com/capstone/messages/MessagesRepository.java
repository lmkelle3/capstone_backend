package com.capstone.messages;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository <Message, Integer> {
}
