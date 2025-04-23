# Stage 1: Build the WAR
FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Deploy to Tomcat
FROM tomcat:9.0-jdk21

# Clean default webapps
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy built WAR from previous stage
COPY --from=builder /app/target/telesko.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
