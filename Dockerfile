FROM openjdk:17
EXPOSE 8080
COPY target/spring-boot-k8s-crud.jar spring-boot-k8s-crud.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-k8s-crud.jar"]