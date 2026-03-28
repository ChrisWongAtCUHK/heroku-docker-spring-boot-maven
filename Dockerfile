# Use a maintained OpenJDK distribution
FROM eclipse-temurin:23-jdk

# Copy the pre-built JAR file from your local target directory
ADD ./target/demo-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE $PORT

# Run the application
CMD ["java", "-jar", "app.jar"]