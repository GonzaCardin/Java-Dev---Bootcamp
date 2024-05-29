FROM eclipse-temurin:17-alpine

RUN mkdir /app

WORKDIR /app

COPY target/clase_41-0.0.1-SNAPSHOT.jar /app/clase_41-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "clase_41-0.0.1-SNAPSHOT.jar"]