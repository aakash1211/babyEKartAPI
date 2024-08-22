FROM openjdk:11
EXPOSE 8080
ARG JAR_FILE=target/ecommerce-3.3.2.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]