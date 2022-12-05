package com.example.demo.config;

import com.example.demo.model.GroupReservation;
import com.example.demo.model.PartyReservation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Splitter;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

import java.util.List;

@Configuration
@EnableIntegration
public class SplitterConfig {

    @Bean
    public MessageChannel groupReservationChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel partyReservationChannel() {
        return new DirectChannel();
    }

//    @Splitter(inputChannel = "groupReservationChannel", outputChannel = "partyReservationChannel")
//    public List<Message<PartyReservation>> splitter(Message<GroupReservation> groupReservationMessage) {
//        GroupReservation groupReservation = groupReservationMessage.getPayload();
//        return groupReservation.getParties().stream()
//                .map(partyReservation -> MessageBuilder.withPayload(partyReservation).build())
//                .collect(Collectors.toList());
//    }

    @Splitter(inputChannel = "groupReservationChannel", outputChannel = "partyReservationChannel")
    public List<PartyReservation> splitter(GroupReservation groupReservation) {
        return groupReservation.getParties();
    }
}