FROM openjdk
WORKDIR /app
COPY ./target/SPEMiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar /app
CMD ["java", "-jar", "SPEMiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]