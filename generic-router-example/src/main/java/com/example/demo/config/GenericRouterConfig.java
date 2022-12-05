package com.example.demo.config;

import com.example.demo.model.PurchaseOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Router;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.router.AbstractMessageRouter;
import org.springframework.integration.router.MessageRouter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Configuration
@EnableIntegration
public class GenericRouterConfig {

    @Bean
    public MessageChannel routerChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel standardPaymentChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel highCostPaymentChannel() {
        return new DirectChannel();
    }

    @Bean
    @Router(inputChannel = "routerChannel")
    public MessageRouter myCustomRouter() {
        return new AbstractMessageRouter() {
            @Override
            protected Collection<MessageChannel> determineTargetChannels(Message<?> message) {
                PurchaseOrder purchaseOrder = (PurchaseOrder)message.getPayload();
                if (purchaseOrder.getAmount() > 10000.0) {
                    return List.of(highCostPaymentChannel());
                }
                return List.of(standardPaymentChannel());
            }
        };
    }
}