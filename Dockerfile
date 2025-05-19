FROM eclipse-temurin:17-jdk-alpine

LABEL authors="foxxist"

MAINTAINER FoxXist

RUN mkdir -p /foxXist/resource/logs \
    /foxXist/resource/temp \
    /foxXist/skywalking/agent

WORKDIR /foxXist/resource

ENV SERVER_PORT=8147 \
    LANG=C.UTF-8 \
    LC_ALL=C.UTF-8 \
    JAVA_OPTS="" \
    NACOS_SERVER_ADDR=""

EXPOSE ${SERVER_PORT}

ADD target/firefox-center-1.0.0-DEV-SNAPSHOT.jar ./app.jar

ENTRYPOINT exec java \
  -Djava.security.egd=file:/dev/./urandom \
  -Dserver.port=$SERVER_PORT \
  -XX:+HeapDumpOnOutOfMemoryError \
  -XX:+UseZGC \
  $JAVA_OPTS \
  -jar app.jar