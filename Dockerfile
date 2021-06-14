FROM openjdk:11
ADD target/student-welfare-service-0.0.1-SNAPSHOT.jar student-welfare-service.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","student-welfare-service.jar"]
