FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
MAINTAINER tardis
COPY . /build/
WORKDIR /build/facedupid-example
RUN mvn clean package -Dmaven.test.skip=true
# && mvn sonar:sonar && mvn cobertura:cobertura 用于单元测试的plugin 暂时不用

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/facedupid-example/consumer/target/producer.jar /app/
ENTRYPOINT java -jar consumer.jar