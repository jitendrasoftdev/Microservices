/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.jsd.orderservice.service;

import com.jsd.orderservice.classes.Payment;
import com.jsd.orderservice.classes.TransactionRequest;
import com.jsd.orderservice.classes.TransactionResponse;
import com.jsd.orderservice.entity.Order;
import com.jsd.orderservice.repository.OrderRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author JSD
 */
@Service
public class OrderService {
    
    @Autowired
    OrderRepository orderRepository;
    
    @Autowired
    RestTemplate template;
    
    
    public TransactionResponse placeOrder(TransactionRequest request) {
        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderid(order.getId());
        payment.setOrderAmount(order.getPrice());
        Payment pr = template.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class); 
        
        String message = pr.getStatus().equalsIgnoreCase("success") ? "Payment processing successful and order place" : "There is a faliuare in payment and order added to the cart";
        orderRepository.save(order);
        return new TransactionResponse(order, pr.getOrderAmount(), pr.getTransactionId(), message);
    }
    
    public List<Order> get() {
        return orderRepository.findAll();
    }
    
    public Optional<Order> get(int id) {
        return orderRepository.findById(id);
    }
}