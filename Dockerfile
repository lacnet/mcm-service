FROM openjdk:19-ea-5-jdk-alpine3.15
WORKDIR /opt
EXPOSE 8080
COPY ./pom.xml ./pom.xml
COPY mvnw .
COPY .mvn .mvn
COPY ./src ./src
RUN ["chmod", "+x", "mvnw"]
RUN ./mvnw dependency:go-offline -B
RUN ./mvnw clean package && cp target/*.jar /opt/app.jar
RUN java -Djarmode=layertools -jar app.jar extract
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar