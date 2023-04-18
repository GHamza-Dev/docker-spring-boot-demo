FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
COPY target/recipe-management-0.0.1-SNAPSHOT.jar recipe.jar
ENTRYPOINT ["java","-jar","/recipe.jar"]