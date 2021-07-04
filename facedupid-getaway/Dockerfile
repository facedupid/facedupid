FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
MAINTAINER tardis
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN nvm package
# && mvn sonar:sonar && mvn cobertura:cobertura 用于单元测试的plugin 暂时不用

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/facedupid-gateway.jar /app/
ENTRYPOINT java -jar facedupid-gateway.jar