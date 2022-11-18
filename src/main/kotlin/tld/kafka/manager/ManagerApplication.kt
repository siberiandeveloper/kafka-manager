package tld.kafka.manager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka
import tld.kafka.manager.infrastructure.events.kafka.KafkaProperty

@EnableKafka
@SpringBootApplication
@EnableConfigurationProperties(KafkaProperty::class)
class ManagerApplication

fun main(args: Array<String>) {
	runApplication<ManagerApplication>(*args)
}
