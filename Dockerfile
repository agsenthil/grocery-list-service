FROM quay.io/ibmgaragecloud/gradle:jdk11 AS builder

COPY . .
RUN mvn clean install

FROM registry.access.redhat.com/ubi8/ubi:8.2

RUN dnf install -y java-11-openjdk.x86_64

COPY --from=builder target/grocery-list-service-0.0.1-SNAPSHOT.jar grocery-list-service.jar

EXPOSE 9080/tcp

ENTRYPOINT ["java","-jar","/grocery-list-service.jar"]