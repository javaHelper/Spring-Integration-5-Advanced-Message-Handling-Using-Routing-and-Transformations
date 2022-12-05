package com.example.demo.service;

import com.example.demo.model.PurchaseOrder;
import org.springframework.messaging.Message;

public interface HighCostPurchaseOrderService {
    void handlePayment(Message<PurchaseOrder> purchaseOrderMessage);
}