FROM openjdk:19-ea-5-jdk-alpine3.15
WORKDIR application
COPY ./pom.xml ./pom.xml
COPY mvnw .
COPY .mvn .mvn
COPY ./src ./src
RUN ["chmod", "+x", "mvnw"]
RUN ./mvnw dependency:go-offline -B
RUN ./mvnw clean package && cp target/mcm-0.0.1-SNAPSHOT.jar mcm-0.0.1-SNAPSHOT.jar
RUN java -Djarmode=layertools -jar mcm-0.0.1-SNAPSHOT.jar extract
ENTRYPOINT ["java","-jar", "mcm-0.0.1-SNAPSHOT.jar"]