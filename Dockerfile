FROM openjdk: 17
VOLUME /tmp
EXPOSE 8084
ARG JAR_FILE=target/gym-partner-0.0.1-SNAPSHOT.jar
ADD ${1JAR_FILE} gym-partner.jar
ENTRYPOINT ["java", "-jar", "/gym-partner.jar"]