FROM openjdk:8-jdk

COPY / /backend
WORKDIR /backend

CMD ["./gradlew", "bootRun"]
