FROM openjdk
MAINTAINER lgomezs lmgomez.saavedra@gmail.com
ADD target/gateway-service.jar gateway-service.jar
ENTRYPOINT ["java", "-jar", "/gateway-service.jar"]
EXPOSE 8765