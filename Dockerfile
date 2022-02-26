FROM openjdk:11-jre-slim
ADD ./target/mcm-0.0.1-SNAPSHOT.jar /usr/src/mcm-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "mcm-0.0.1-SNAPSHOT.jar"]