package com.example.demo.service;


import com.example.demo.model.PurchaseOrder;

public interface PaymentService {
    void submitPurchaseOrder(PurchaseOrder purchaseOrder);
}