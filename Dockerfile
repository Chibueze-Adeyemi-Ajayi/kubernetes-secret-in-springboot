FROM openjdk:17

EXPOSE 8080

COPY target/kubernetes-secret.jar app.jar

CMD [ "java", "-jar", "-Dspring.profiles.active=production", "app.jar"]