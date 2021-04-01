FROM openjdk:11
COPY target/grocery-list-service-0.0.1-SNAPSHOT.jar grocery-list-service.jar
ENTRYPOINT ["java","-jar","/grocery-list-service.jar"]