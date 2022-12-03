# Kafka Manager

###### Simple app to try Kotlin + Spring + Kafka

### Requirements

- Java 17
- Kotlin support
- Docker
- Docker Compose

### Message examples

Use docker to produce messages:
```
$ docker exec -it kafka /opt/bitnami/kafka/bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
```
> quickstart-events - should be replaced with the actual topic name

When producer is ready, use message samples below:
```
>{"sender": "rick", "recipient": "morty", "text": "5 mins.. just in and out..."}
>{"sender": "rick", "recipient": "morty", "text": "Wubba Lubba Dub Dub!"}
```
