FROM openjdk:19-ea-5-jdk-alpine3.15
LABEL maintainer="jonathan.lacroixx@hotmail.com"
WORKDIR /opt
EXPOSE 8080

# Copy maven executable to the image
COPY mvnw .
COPY .mvn .mvn

# Copy the pom.xml file
#COPY pom.xml .

# Copy the project source
COPY ./src ./src
COPY ./pom.xml ./pom.xml

RUN ["chmod", "+x", "./mvnw"]
#RUN chmod 755 /opt/mvnw

RUN ./mvnw dependency:go-offline -B
RUN ./mvnw clean package && cp target/*.jar ./app.jar
RUN ls -al && java -Djarmode=layertools -jar ./app.jar extract
ENTRYPOINT exec java $JAVA_OPTS -jar ./app.jar
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
