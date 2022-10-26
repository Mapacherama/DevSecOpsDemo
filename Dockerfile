FROM maven:latest

RUN mkdir /app
COPY ./target/User-Login-0.0.1-SNAPSHOT.jar /app
WORKDIR /app

ADD /pom.xml /code/

EXPOSE 8080

CMD ["java","-jar","User-Login-0.0.1-SNAPSHOT.jar"]