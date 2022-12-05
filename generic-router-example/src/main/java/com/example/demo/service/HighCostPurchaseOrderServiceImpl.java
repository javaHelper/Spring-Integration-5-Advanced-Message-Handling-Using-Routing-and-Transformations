package com.example.demo.service;

import com.example.demo.model.PurchaseOrder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class HighCostPurchaseOrderServiceImpl implements HighCostPurchaseOrderService {
    private static final Logger logger = LogManager.getLogger(HighCostPurchaseOrderServiceImpl.class);

    @ServiceActivator(inputChannel = "highCostPaymentChannel")
    @Override
    public void handlePayment(Message<PurchaseOrder> purchaseOrderMessage) {
        PurchaseOrder purchaseOrder = purchaseOrderMessage.getPayload();
        logger.info("## High Cost Purchase Order: Customer: {}, Amount: {}",
                purchaseOrder.getCustomerId(), purchaseOrder.getAmount());
    }
}