package tld.kafka.manager.infrastructure.db.h2

import org.springframework.data.repository.CrudRepository
import tld.kafka.manager.domain.message.entity.Message

interface KafkaMessageRepository: CrudRepository<Message, Long> {
}