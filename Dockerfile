FROM openjdk:11-jdk-slim as build
WORKDIR /workspace/app

COPY gradlew .
COPY gradle gradle
COPY build.gradle.kts .
COPY src src

RUN ./gradlew build -x test

FROM openjdk:11-jre-slim
VOLUME /tmp
COPY --from=build /workspace/app/build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]