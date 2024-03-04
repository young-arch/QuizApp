# Build Stage
FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# Final Stage
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/quizapp-0.0.1-SNAPSHOT.jar quizapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "quizapp.jar"]
