/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.jsd.orderservice.controller;

import com.jsd.orderservice.classes.TransactionRequest;
import com.jsd.orderservice.classes.TransactionResponse;
import com.jsd.orderservice.entity.Order;
import com.jsd.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author JSD
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    
    @Autowired
    OrderService orderService;
    
    @GetMapping()
    public List<Order> list() {
        return orderService.get();
    }
    
    @GetMapping("/{id}")
    public Optional<Order> get(@PathVariable int id) {
        return orderService.get(id);
    }
    
    
    
    @PostMapping("/placeorder")
    public TransactionResponse post(@RequestBody TransactionRequest request) {
        return orderService.placeOrder(request);
    }
    
    
}
