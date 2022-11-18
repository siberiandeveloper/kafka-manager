package tld.kafka.manager.infrastructure.kafka.config

import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.StringDeserializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.DefaultKafkaConsumerFactory
import org.springframework.kafka.support.converter.StringJsonMessageConverter
import tld.kafka.manager.infrastructure.kafka.KafkaProperty

@Configuration
class KafkaConsumerConfig(val kafkaProperty: KafkaProperty) {

    @Bean
    fun defaultFactory(): ConcurrentKafkaListenerContainerFactory<String, String> {
        val factory = ConcurrentKafkaListenerContainerFactory<String, String>()
        factory.consumerFactory = consumerFactory()
        factory.isBatchListener = false
        factory.setMessageConverter(converter())
        return factory
    }

    @Bean
    fun consumerFactory(): ConsumerFactory<String, String> = DefaultKafkaConsumerFactory(consumerConfigs())

    fun consumerConfigs(): Map<String, Any> {
        val properties = HashMap<String, Any>()
        properties[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = kafkaProperty.server
        properties[ConsumerConfig.GROUP_ID_CONFIG] = kafkaProperty.group
        properties[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
        properties[ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
        properties[ConsumerConfig.GROUP_ID_CONFIG] = kafkaProperty.group
        return properties
    }

    @Bean
    fun converter(): StringJsonMessageConverter {
        return StringJsonMessageConverter()
    }

}
