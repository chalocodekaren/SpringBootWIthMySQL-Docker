FROM openjdk:17-alpine
ADD /target/PlayWithJavaDemo-0.0.1-SNAPSHOT.jar //

ENTRYPOINT ["java", "-jar", "/PlayWithJavaDemo-0.0.1-SNAPSHOT.jar"]


