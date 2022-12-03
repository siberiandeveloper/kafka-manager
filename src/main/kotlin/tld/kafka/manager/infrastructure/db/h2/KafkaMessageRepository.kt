package tld.kafka.manager.infrastructure.db.h2

import org.springframework.data.repository.CrudRepository
import tld.kafka.manager.domain.message.entity.Message
import tld.kafka.manager.domain.message.repository.MessageRepository

interface KafkaMessageRepository: MessageRepository, CrudRepository<Message, Long> {
}
