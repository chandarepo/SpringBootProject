# Spring Boot with Kafka Consumer Example

This Project covers how to use Spring Boot with Spring Kafka to Consume JSON/String message from Kafka topics

#Coding Challenge
===============


TO_DO: Develop a small [React app] (https://github.com/chandarepo/react-redux-demo)
       with Spring Boot backend doing a conversion from decimal numbers to roman numerals.

Used:

Algorithm used to convert a given positive Decimal number to Roman and Binary.

Factory patterns for Different types of Converter creation [ROMAN (default), BINARY, HEXADECIMAL, HINDI].

Used Strategy Pattern for Different types of Converter injection.

Design allows any formatter to convert, and API is extensible to use.

MockMvc for RestController Testcase,
SpringBootTest for Services Testcase,
Junit for unit Testcase,
Swagger for API info




Start Zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties
Start Kafka Server
bin/kafka-server-start.sh config/server.properties
Create Kafka Topic
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example_json
Publish to the Kafka Topic via Console
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic Kafka_Example
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic Kafka_Example_json

