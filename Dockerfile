FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY ./build/libs/demo.jar /app/demo.jar

ENTRYPOINT ["java","-jar","/app/demo.jar"]




