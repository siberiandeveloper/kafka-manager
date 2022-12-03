package tld.kafka.manager.domain.message.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Message(
    val sender: String,
    val recipient: String,
    val text: String,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null
    ) {
}
