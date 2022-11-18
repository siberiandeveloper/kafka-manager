package tld.kafka.manager.presentation.kafka.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import tld.kafka.manager.application.message.service.KafkaMessageService
import tld.kafka.manager.domain.message.dto.MessageDto

@Component
class Consumer(val kafkaMessageService: KafkaMessageService) {

    @KafkaListener(topics = ["quickstart-events"], groupId = "#kafkaProperty.group",
            containerFactory = "defaultFactory")
    fun consume(messageDto: MessageDto) {
        val message = kafkaMessageService.registerMessage(messageDto)
        println(message)
    }

}
