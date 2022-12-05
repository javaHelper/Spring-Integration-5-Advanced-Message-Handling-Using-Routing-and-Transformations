package com.example.demo.config;

import com.example.demo.model.FamilyReservation;
import com.example.demo.model.PartyReservation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.json.JsonToObjectTransformer;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableIntegration
public class TransformerConfig {
    private static final Logger logger = LogManager.getLogger(TransformerConfig.class);

    @Bean
    public MessageChannel familyReservationChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel familyReservationJsonChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel partyReservationChannel() {
        return new DirectChannel();
    }

    @Transformer(inputChannel = "familyReservationChannel", outputChannel = "partyReservationChannel")
    public PartyReservation transform(FamilyReservation familyReservation) {
        logger.info("Transforming family message with ID {} to a party reservation",
                familyReservation.getFamilyId());
        return new PartyReservation(familyReservation.getFamilyId(),
                familyReservation.getRoomType(),
                familyReservation.getName());
    }

    @Bean
    @Transformer(inputChannel = "familyReservationJsonChannel", outputChannel = "familyReservationChannel")
    public JsonToObjectTransformer jsonToObjectTransformer() {
        return new JsonToObjectTransformer(FamilyReservation.class);
    }
}