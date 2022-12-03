package tld.kafka.manager.domain.message.service

import tld.kafka.manager.domain.message.dto.MessageDto
import tld.kafka.manager.domain.message.entity.Message
import tld.kafka.manager.domain.message.repository.MessageRepository

class EventLogMessageRegistrar(private val messageRepository: MessageRepository) : MessageRegistrar {

    override fun registerMessage(messageDto: MessageDto) {
        val message = Message(messageDto.sender, messageDto.recipient, messageDto.text, null)
        messageRepository.save(message)
    }
}
