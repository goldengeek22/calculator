FROM openjdk:17
WORKDIR workspace
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jargi
ENTRYPOINT ["java", "-jar", "app.jar"]
