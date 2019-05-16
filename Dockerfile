FROM adoptopenjdk/openjdk11
ADD target/example-pipeline-0.0.1-SNAPSHOT.jar /app.jar
CMD ["java", "-jar", "/app.jar"]

