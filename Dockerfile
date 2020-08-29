FROM openjdk:11
## Note the name change to underscore separtor
COPY ./target/user-service-0.0.1-SNAPSHOT.jar user_service.jar
EXPOSE 8080
EXPOSE 3306
ENTRYPOINT ["java","-jar","user_service.jar"]