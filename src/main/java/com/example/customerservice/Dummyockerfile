# Use a base image with Gradle and JDK
FROM gradle:7.3.3-jdk17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the Gradle build files
COPY build.gradle .
COPY settings.gradle .
COPY gradlew .
COPY gradle gradle

# Download the Gradle wrapper and dependencies
RUN ./gradlew --version
RUN ./gradlew dependencies

# Copy the source code
COPY src src

# Build the application
RUN ./gradlew build --no-daemon

# Use a different OpenJDK image as the runtime environment
FROM adoptopenjdk:17-jre-hotspot AS runtime

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file from the build environment to the runtime environment
COPY --from=build /app/build/libs/customer-service.jar .

# Expose the port on which the application will run (change it if necessary)
EXPOSE 8081

# Set the command to run the application
CMD ["java", "-jar", "customer-service.jar"]
