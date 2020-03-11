//package com.capstone.messages;
//
//import com.capstone.claims.Claim;
//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "messages")
//@Data
//
//public class Message {
//    public Message() {}
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column
//    private String senderName;
//
//
//    @Column
//    private String messageBody;
//
//    @Column
//    private String createdAt;
//
////    //Many Messages per Claim
////    @OneToMany(mappedBy = "message_id", cascade = CascadeType.ALL)
////    private List<Claim> claim;
//
//
//    public int getId() {
//        return id;
//    }
//
//    public String getSenderName() {
//        return senderName;
//    }
//
//    public String getMessageBody() {
//
//        return messageBody;
//    }
//
//    public String getCreatedAt() {
//        return createdAt;
//    }
//
////    public List<Claim> getClaim() {
////        return claim;
////    }
////
////    public void setClaim(List<Claim> claim) {
////        this.claim = claim;
////    }
//}
