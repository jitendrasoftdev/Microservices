/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.jsd.PaymentService.controller;

import com.jsd.PaymentService.model.Payment;
import com.jsd.PaymentService.service.PaymentService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author JSD
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    
    @Autowired
    PaymentService paymentService;
    
    @GetMapping("/")
    public List<Payment> getAllPayment() {
        return paymentService.getAllPayment();
    }
    
    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) {
        return paymentService.doPayment(payment);
    }
    
    @GetMapping("/{id}")
    public Optional<Payment> get(@PathVariable int id) {
        return paymentService.get(id);
    }
    
}
