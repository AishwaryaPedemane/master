FROM openjdk:8
ADD target/docker-spring-data-rest.jar docker-spring-data-rest.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","docker-spring-data-rest.jar"]