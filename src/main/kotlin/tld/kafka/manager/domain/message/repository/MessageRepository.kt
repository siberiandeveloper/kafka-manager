package tld.kafka.manager.domain.message.repository

import tld.kafka.manager.domain.message.entity.Message

interface MessageRepository {

    fun save(message: Message)

    fun findAll(): List<Message>

    fun findById(id: Int): Message?
}
