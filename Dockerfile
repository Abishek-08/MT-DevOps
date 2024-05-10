FROM openjdk:17
WORKDIR /app
COPY ${JAR_FILE} app.jar
RUN mvn install
FROM openjdk:17-jdk-alpine
COPY --from=build /opt/app/target/*.jar app.jar
ENV PORT 8081
EXPOSE $PORT
ENTRYPOINT ["java","-jar","-Xmx1024M","-Dserver.port=${PORT}","app.jar"]
