package tld.kafka.manager.domain.message.service

import tld.kafka.manager.domain.message.dto.MessageDto

interface MessageRegistrar {

    fun registerMessage(messageDto: MessageDto)

}
