package com.capstone.claims;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="claims")
@Data

public class Claim {
    public Claim(){}

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String messages;

    @Column
    private int payments;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessages() {
        return messages;
    }

    public int getPayments() {
        return payments;
    }
}
