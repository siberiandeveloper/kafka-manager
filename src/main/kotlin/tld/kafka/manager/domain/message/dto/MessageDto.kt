package tld.kafka.manager.domain.message.dto

data class MessageDto(val sender: String, val recipient: String, val text: String)
