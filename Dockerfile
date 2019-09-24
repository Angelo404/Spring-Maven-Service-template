FROM openjdk:12.0-jdk-oracle

#RUN apt-get update && apt-get install -y openjdk-8-jdk

WORKDIR usr/local/bin

EXPOSE 8080

#RUN rm -rf /usr/local/tomcat/webapps/*

COPY target/service-0.0.1-SNAPSHOT.jar main.jar

CMD ["java","-Dspring.profiles.active=docker-demo","-jar","main.jar"]

