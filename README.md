# Kafka Producer and Consumer applications
---
# Setup
## Start Zookeeper
C:\kafka_2.13-2.6.1>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
## Start Kafka Server
C:\kafka_2.13-2.6.1>.\bin\windows\kafka-server-start.bat .\config\server.properties
# Run applications
Run both applications: KafkaProducer and KafkaConsumer
# Publish message
`http://localhost:8080/kafka/publish?message=This is a message`
---
Consumed message will be shown in KafkaConsumer app in log
