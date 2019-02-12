FROM openjdk:8
MAINTAINER Caspar
LABEL app="organization-service" version="0.0.1" by="caspar"
COPY ./build/libs/organization-service-0.0.1-SNAPSHOT.jar organization-service.jar
CMD java -jar organization-service.jar --spring.profiles.active=${env}
