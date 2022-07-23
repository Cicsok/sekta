FROM alpine:20220715 AS builder

WORKDIR /app

COPY ./pom.xml pom.xml
COPY ./src src/
COPY ./build build/

RUN apk update
RUN apk add openjdk17-jdk
RUN apk add maven
RUN apk add firefox

RUN mvn clean package

FROM eclipse-temurin:17-jre-alpine

COPY --from=builder app/target/sekta-1.0-SNAPSHOT.jar sekta-1.0-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "-Dspring.profiles.active=on-render", "sekta-1.0-SNAPSHOT.jar"]