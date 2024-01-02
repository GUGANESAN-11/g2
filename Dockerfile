



FROM openjdk:17-jdk
COPY target/springprog.war .

EXPOSE 8080

ENTRYPOINT["java", "-war", "springprog.war"]

