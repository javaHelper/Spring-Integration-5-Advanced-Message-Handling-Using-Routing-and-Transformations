package com.example.demo.service;

import com.example.demo.config.RouterChannelGateway;
import com.example.demo.model.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private RouterChannelGateway routerChannelGateway;

    @Override
    public void submitPurchaseOrder(PurchaseOrder purchaseOrder) {
        routerChannelGateway.routeMessage(MessageBuilder.withPayload(purchaseOrder).build());
    }
}