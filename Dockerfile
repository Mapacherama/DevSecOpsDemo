FROM maven:3.8.6 AS build

WORKDIR /root/

ADD /pom.xml /code/

RUN mvn package -DskipTests && \
    mv target/demo-0.0.1-SNAPSHOT.jar /run/demo.jar

EXPOSE 8080

CMD ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]