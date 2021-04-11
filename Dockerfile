FROM openjdk:8
MAINTAINER Tushar Shaily tusharshaily@gmail.com
COPY ./target/Calculator_DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator_DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar"]