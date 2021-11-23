FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD ./target/springboot-0.0.1-SNAPSHOT.jar MALI.jar
ENTRYPOINT ["java","-jar","/nmakemagic.jar"]
