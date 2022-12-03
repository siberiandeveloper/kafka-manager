package tld.kafka.manager.application.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import tld.kafka.manager.domain.message.service.EventLogMessageRegistrar
import tld.kafka.manager.infrastructure.db.h2.KafkaMessageRepository

@Configuration
class MessageServiceConfig(
    val kafkaMessageRepository: KafkaMessageRepository
) {

    @Bean
    fun kafkaMessageRegistrar(): EventLogMessageRegistrar {
        return EventLogMessageRegistrar(kafkaMessageRepository)
    }

}
