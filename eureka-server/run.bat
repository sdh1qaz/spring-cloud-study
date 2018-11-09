rem ����������� :����ע�͵�start
@echo off
start "eureka-server2" java -jar eureka-server-0.0.1-SNAPSHOT.jar
start "eureka-server1" java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1

start "HELLO-SERVICE1" java -jar hello-service-0.0.1-SNAPSHOT.jar --server.port=8081
start "HELLO-SERVICE2" java -jar hello-service-0.0.1-SNAPSHOT.jar --server.port=8082

start "ribbon-consumer" java -jar ribbon-consumer-0.0.1-SNAPSHOT.jar 