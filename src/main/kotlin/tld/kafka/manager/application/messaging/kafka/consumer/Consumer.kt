package tld.kafka.manager.application.messaging.kafka.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import tld.kafka.manager.domain.message.service.EventLogMessageRegistrar
import tld.kafka.manager.domain.message.dto.MessageDto

@Component
class Consumer(val eventLogMessageRegistrar: EventLogMessageRegistrar) {

    @KafkaListener(topics = ["quickstart-events"], groupId = "#kafkaProperty.group",
            containerFactory = "defaultFactory")
    fun consume(messageDto: MessageDto) {
        println("Consumed message: $messageDto")
        eventLogMessageRegistrar.registerMessage(messageDto)
    }

}
