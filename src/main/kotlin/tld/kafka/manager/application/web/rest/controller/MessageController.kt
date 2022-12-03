package tld.kafka.manager.application.web.rest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import tld.kafka.manager.domain.message.entity.Message
import tld.kafka.manager.domain.message.repository.MessageRepository

@RestController
@RequestMapping("/message")
class MessageController(val kafkaMessageRepository: MessageRepository) {

    @GetMapping
    fun getAll(): List<Message> {
        return kafkaMessageRepository.findAll()
    }

}
