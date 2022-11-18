package tld.kafka.manager.application.kafka.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import tld.kafka.manager.domain.message.dto.Message

@Component
class Consumer {

    @KafkaListener(topics = ["quickstart-events"], groupId = "#kafkaProperty.group",
            containerFactory = "defaultFactory")
    fun consume(message: Message) {
        println(message)
        println(message.id)
        println(message.name)
    }

}
