/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jsd.orderservice.repository;

import com.jsd.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author JSD
 */
public interface OrderRepository extends JpaRepository<Order, Integer> {
    
}
