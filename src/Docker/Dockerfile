#FROM openjdk:8
#VOLUME /tmp
#ADD target/springboot-docker-compose.jar springboot-docker-compose.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","springboot-docker-compose.jar"]

#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#COPY target/spring-boot-docker-*.jar app.jar
#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]

#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

## Start with a base image containing Java runtime
#FROM openjdk:8-jdk-alpine
#
## Add Maintainer Info
#LABEL maintainer="callicoder@gmail.com"
#
## Add a volume pointing to /tmp
#VOLUME /tmp
#
## Make port 8080 available to the world outside this container
#EXPOSE 8080
#
## The application's jar file
#ARG JAR_FILE=target/spring-boot-docker-0.0.1-SNAPSHOT.jar
#
## Add the application's jar to the container
#ADD ${JAR_FILE} spring-boot-docker.jar
#
## Run the jar file
#ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]


#Incrementando pesquisa Leandro 
#FROM maven:3.6.0-jdk-8-alpine AS build_eu
#COPY src /usr/src/app/src
#COPY pom.xml /usr/src/app
#RUN mvn -f /usr/src/app/pom.xml clean package -DskipTests


FROM openjdk:8
ADD scaffold-spring-0.0.1-SNAPSHOT.jar app.jar
VOLUME /tmp
EXPOSE 8080
RUN bash -c 'touch /app.jar'
#Incremento pesquisa
#COPY --from=build_eu /usr/src/app/target/scaffold-spring-0.0.1-SNAPSHOT.jar /app/agenda-eureka.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container","-jar","/app.jar"]
