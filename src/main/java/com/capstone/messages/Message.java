package com.capstone.messages;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "messages")
@Data

public class Message {
    public Message() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String senderName;

    @Column
    private int claimId;

    @Column
    private String messageBody;

    @Column
    private String createdAt;

    public int getId() {
        return id;
    }

    public String getSenderName() {
        return senderName;
    }

    public int getClaimId(){

        return claimId;
    }

    public String getMessageBody() {

        return messageBody;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
