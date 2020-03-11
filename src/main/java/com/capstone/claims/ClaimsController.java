package com.capstone.claims;

//import com.capstone.messages.Message;
//import com.capstone.messages.MessagesService;
//import com.capstone.payments.Payment;
//import com.capstone.payments.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/claims")

public class ClaimsController {

    @Autowired
    private final ClaimsService claimsService;
    
//    @Autowired final MessagesService messagesService;
//
//    @Autowired final PaymentsService paymentsService;

    public ClaimsController (ClaimsService claimsService) {
        this.claimsService = claimsService;
//        this.messagesService = messagesService;
//        this.paymentsService = paymentsService;
    }

    @GetMapping
    public List<Claim> getAllClaims() {
        return this.claimsService.getAllClaims();
    }

    @GetMapping("/{id}")
    public Optional<Claim> getOneClaim(@PathVariable int id) {
        return this.claimsService.getOneClaim(id);
    }

    @PostMapping
    public Claim addOneClaim(@RequestBody Claim newClaim) {

//        Message message = messagesService.getOneMessage(messageId).orElseThrow(IllegalArgumentException::new);
//        newClaim.setMessage(message);

//        Payment payment = paymentsService.getOnePayment(paymentId).orElseThrow(IllegalArgumentException::new);
//        newClaim.setPayment(payment);

        if(newClaim.getLossCategory() == null) {
            throw new IllegalArgumentException("Please select loss category");
        }
        return claimsService.addOneClaim(newClaim);
    }

    @PatchMapping
    public Claim updateClaim(@RequestBody Claim updatedClaim) {
        Claim claim = claimsService.getOneClaim(updatedClaim.getId()).orElseThrow(IllegalArgumentException::new);
        return this.claimsService.updateClaim(updatedClaim);
    }

    @DeleteMapping("/{id}")
    public String removeOneClaim(@PathVariable int id) {
        return claimsService.removeOneClaim(id);
    }

}
