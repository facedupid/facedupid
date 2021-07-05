FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
MAINTAINER tardis
COPY . /build/
WORKDIR /build/facedupid-getaway/
RUN mvn package
# && mvn sonar:sonar && mvn cobertura:cobertura 用于单元测试的plugin 暂时不用

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/facedupid-getaway/target/facedupid-getaway.jar /app/
ENTRYPOINT java -jar facedupid-gateway.jar