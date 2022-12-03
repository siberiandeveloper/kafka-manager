package tld.kafka.manager.application.service

import org.springframework.stereotype.Service
import tld.kafka.manager.domain.message.dto.MessageDto
import tld.kafka.manager.domain.message.service.EventLogMessageRegistrar

@Service
class MessageService(val eventLogMessageRegistrar: EventLogMessageRegistrar) {

    fun registerMessage(messageDto: MessageDto) {
        eventLogMessageRegistrar.registerMessage(messageDto)
        println("Message ($messageDto) has been registered.")
    }

}
