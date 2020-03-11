package com.capstone.payments;

//import com.capstone.messages.Message;
//import com.capstone.messages.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")

public class PaymentsController {

    @Autowired
    private final PaymentsService paymentsService;

    public PaymentsController (PaymentsService paymentsService) {
        this.paymentsService = paymentsService;
    }

    @GetMapping
    public List<Payment> getAllPayments(){
        return this.paymentsService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Payment getOnePayment(@PathVariable int id) {
        Payment payment = paymentsService.getOnePayment(id).orElseThrow(IllegalArgumentException::new);
        return payment;
    }

    @PostMapping
    public Payment addOnePayment(@RequestBody Payment newPayment) {
//        if (newPayment.getPaymentAmount() == null) {
//            throw new IllegalArgumentException("Error");
//        }
        return paymentsService.addOnePayment(newPayment);
    }
}
