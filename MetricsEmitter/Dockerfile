FROM maven:3.8.2-openjdk-16-slim as build
RUN mkdir -pv /build/MetricsEmitter && cd /build/MetricsEmitter
WORKDIR /build/MetricsEmitter
COPY . .
RUN mvn clean install

FROM openjdk:16
RUN mkdir -pv /app && \
   cd /app
WORKDIR /usr/src/myapp
COPY --from=build /build/MetricsEmitter/target/*.jar app.jar 
EXPOSE 7777
CMD ["java", "-jar", "app.jar"]