FROM openjdk:17
WORKDIR /app
COPY ${JAR_FILE} app.jar
RUN mvn install
FROM openjdk:17-jdk-alpine
COPY --from=build /opt/app/target/*.jar SB-MTestAssessment-0.0.1-SNAPSHOT.jar
ENV PORT 8081
EXPOSE $PORT
ENTRYPOINT ["java","-jar","-Xmx1024M","-Dserver.port=${PORT}","SB-MTestAssessment-0.0.1-SNAPSHOT.jar"]
