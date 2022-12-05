package com.example.demo.service;

import com.example.demo.config.RouterChannelGateway;
import com.example.demo.model.PurchaseOrder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    private static final Logger logger = LogManager.getLogger(PaymentServiceImpl.class);

    @Autowired
    private RouterChannelGateway routerChannelGateway;

    @Override
    public void submitPurchaseOrder(PurchaseOrder purchaseOrder) {
        logger.info(">> Submitting purchase order for customer {} with amount {}",
                purchaseOrder.getCustomerId(), purchaseOrder.getAmount());
        routerChannelGateway.routeMessage(MessageBuilder.withPayload(purchaseOrder).build());
    }
}