FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM  openjdk:17.0.1-jdk-slim
COPY --from=build /target/user-0.0.1-SNAPSHOT.war userdetails_shree1.war
EXPOSE 8080 
ENTRYPOINT [ "java","-war","userdetails_shree1.war"]
