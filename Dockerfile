# First stage: complete build environment
#FROM maven:3.8.1-openjdk-17-slim AS builder
#FROM docker:20.10.17-alpine3.16 AS builder

FROM alpine:20220715 AS builder

WORKDIR /app

# add pom.xml and source code
COPY ./pom.xml pom.xml
ADD ./src src/
ADD ./build build/

RUN apk update
RUN apk add openjdk17-jdk
RUN apk add maven
RUN apk add firefox


# package jar
RUN mvn clean package

# Second stage: minimal runtime environment
From eclipse-temurin:17-jre-alpine

# copy jar from the first stage
COPY --from=builder app/target/sekta-1.0-SNAPSHOT.jar sekta-1.0-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "sekta-1.0-SNAPSHOT.jar"]