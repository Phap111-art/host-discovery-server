FROM amazoncorretto:17
COPY jar/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8761
