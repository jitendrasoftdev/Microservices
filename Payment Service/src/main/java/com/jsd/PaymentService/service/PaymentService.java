/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsd.PaymentService.service;

import com.jsd.PaymentService.dao.PaymentRepository;
import com.jsd.PaymentService.model.Payment;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JSD
 */
@Service
public class PaymentService {
    
    @Autowired
    PaymentRepository paymentRepository;
    
    public Payment doPayment(Payment payment) {
        payment.setStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID());
        return paymentRepository.save(payment);
    }
    
    public List<Payment> getAllPayment() {
        return paymentRepository.findAll();
    }
    
    public Optional<Payment> get(int id) {
        return paymentRepository.findById(id);
    }
    
    public String paymentProcessing() {
        return new Random().nextBoolean() ? "success" : "failed";
    }
    
    
}
