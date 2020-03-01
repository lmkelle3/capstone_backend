package com.capstone.payments;

import com.capstone.payments.Payment;
import com.capstone.payments.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentsService {

    @Autowired
    private final PaymentsRepository paymentsRepository;

    public PaymentsService (PaymentsRepository messagesRepository){
        this.paymentsRepository = messagesRepository;
    }

    public List<Payment> getAllPayments(){
        return paymentsRepository.findAll();
    }

    public Optional<Payment> getOnePayment(int id){
        return paymentsRepository.findById(id);
    }

    public Payment addOnePayment(Payment newPayment) {
        return paymentsRepository.save(newPayment);
    }

}
