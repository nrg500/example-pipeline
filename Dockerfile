FROM adoptopenjdk/openjdk11
COPY target/example-pipeline-0.0.1-SNAPSHOT.jar /app.jar
CMD ["java", "-jar", "-Dspring.profiles.active=default", "/app.jar"]