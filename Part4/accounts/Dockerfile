#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

#Information about who maintains the image
LABEL maintainer="jvmitenas.com"

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT [ "java", "-jar", "accounts-0.0.1-SNAPSHOT.jar" ]