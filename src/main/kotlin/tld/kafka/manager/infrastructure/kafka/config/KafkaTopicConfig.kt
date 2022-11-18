package tld.kafka.manager.infrastructure.kafka.config

import org.apache.kafka.clients.admin.AdminClientConfig
import org.apache.kafka.clients.admin.NewTopic
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.KafkaAdmin
import tld.kafka.manager.infrastructure.kafka.KafkaProperty

@Configuration
@EnableConfigurationProperties(KafkaProperty::class)
class KafkaTopicConfig(val kafkaProperty: KafkaProperty) {

    @Bean
    fun kafkaAdmin(): KafkaAdmin {
        val config = HashMap<String, Any>()
        config[AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG] = kafkaProperty.server
        return KafkaAdmin(config)
    }

    @Bean
    fun mainTopic(): NewTopic = NewTopic("main", 1, 1)

}
