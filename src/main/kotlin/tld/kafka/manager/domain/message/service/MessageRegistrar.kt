package tld.kafka.manager.domain.message.service

import tld.kafka.manager.domain.message.dto.MessageDto
import tld.kafka.manager.domain.message.entity.Message

interface MessageRegistrar {

    fun registerMessage(messageDto: MessageDto): Iterable<Message>

}