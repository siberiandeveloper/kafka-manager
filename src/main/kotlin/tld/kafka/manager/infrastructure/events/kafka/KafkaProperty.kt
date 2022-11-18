package tld.kafka.manager.infrastructure.events.kafka

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "spring.kafka")
data class KafkaProperty(
        var host: String = "localhost",
        var port: Int = 9093,
        var group: String = "test"
) {

    val server: String
        get() {
            return "$host:$port"
        }

}
