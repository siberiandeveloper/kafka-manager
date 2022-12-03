package tld.kafka.manager.application.messaging.kafka.config

import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.core.ProducerFactory
import tld.kafka.manager.application.messaging.kafka.KafkaProperty

@Configuration
class KafkaProducerConfig(val kafkaProperty: KafkaProperty) {

    @Bean
    fun producerFactory(): ProducerFactory<String, String> {
        val configProperties = HashMap<String, Any>()
        configProperties[ProducerConfig.BOOTSTRAP_SERVERS_CONFIG] = kafkaProperty.server
        configProperties[ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG] = StringSerializer::class
        configProperties[ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG] = StringSerializer::class
        return DefaultKafkaProducerFactory(configProperties)
    }

    @Bean
    fun kafkaTemplate(): KafkaTemplate<String, String> = KafkaTemplate(producerFactory())

}
