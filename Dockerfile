FROM openjdk:19-ea-5-jdk-alpine3.15
WORKDIR /opt
ENV SPRING_APPLICATION_NAME mcm-service
ENV SPRING_PROFILES_ACTIVE production
ENV SERVER_PORT 8080
ENV MONGO_HOST mcm-service-mongo
ENV MONGO_PORT 27017
ENV MONGO_DATABASE mcm
ENV MONGO_USER devMongoRootUser
ENV MONGO_PASSWORD devMongoRootPassword
EXPOSE 8080
COPY ./pom.xml ./pom.xml
COPY mvnw .
COPY .mvn .mvn
COPY ./src ./src
RUN ["chmod", "+x", "mvnw"]
#RUN ./mvnw dependency:go-offline -B
#RUN ./mvnw clean package && cp target/*.jar /opt/app.jar
#RUN java -Djarmode=layertools -jar app.jar extract
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar