FROM eclipse-temurin:17-jre
WORKDIR /application
COPY target/*.jar inventaire.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","inventaire.jar"]
