FROM eclipse-temurin:17-jdk-alpine

# # アプリケーションのビルド
# RUN ./gradlew build

WORKDIR /app

COPY ./demo-0.0.1-SNAPSHOT.jar /app/demo.jar

ENTRYPOINT ["java","-jar","/app/demo.jar"]




