package tld.kafka.manager.application.message.service

import org.springframework.stereotype.Service
import tld.kafka.manager.domain.message.dto.MessageDto
import tld.kafka.manager.domain.message.entity.Message
import tld.kafka.manager.domain.message.service.MessageRegistrar
import tld.kafka.manager.infrastructure.db.h2.KafkaMessageRepository

@Service
class KafkaMessageService(
    val kafkaMessageRepository: KafkaMessageRepository
) : MessageRegistrar {

    override fun registerMessage(messageDto: MessageDto): Iterable<Message> {
        val message = Message(messageDto.sender, messageDto.recipient, messageDto.text, null)
        kafkaMessageRepository.save(message)
        return kafkaMessageRepository.findAll()
    }
}