/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsd.orderservice.classes;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




/**
 *
 * @author JSD
 */



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private int Id;
    private String status;
    private UUID transactionId;
    private int orderid;
    private double orderAmount;
}
