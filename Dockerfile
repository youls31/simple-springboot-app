
FROM maven:3.8.2-eclipse-temurin-17 as builder
WORKDIR /app
COPY . .
RUN mvn clean install package

FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --FROM=builder /app/target/spring-boot-docker.jar /app/spring-app.jar
EXPOSE 5000

ENTRYPOINT ["java","-jar","spring-app.jar"]