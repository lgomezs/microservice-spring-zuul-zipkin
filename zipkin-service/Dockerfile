FROM openjdk
MAINTAINER lgomezs lmgomez.saavedra@gmail.com
ADD target/zipkin-service.jar zipkin-service.jar
ENTRYPOINT ["java", "-jar", "/zipkin-service.jar"]
EXPOSE 9411