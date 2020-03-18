FROM openjdk:8u201-jdk-alpine3.9
LABEL maintainer="semprebono@gmail.com"

ENV LANG C.UTF-8

RUN apk add --update bash

ADD build/libs/*.jar /app/app.jar

CMD java -jar /app/app.jar '--spring.datasource.url=jdbc:postgresql://beerdb:5432/beerstore'
