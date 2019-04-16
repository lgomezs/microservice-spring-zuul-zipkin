# README

MIcroservice using Spring cloud, Eureka, Zuul, Feign and Zipkin

 Zuul    – gateway service that provides dynamic routing, monitoring, resiliency, security, and more
 Ribbon  – client side load balancer
 Feign   – declarative REST client
 Eureka  – service registration and discovery
 Sleuth  – distributed tracing via logs
 Zipkin  – distributed tracing system with request visualization.


 Eureka:
 	http://localhost:8761/
 	
 	get products: Ribbon ->
 	
 	http://lim-gj7s9h2.usersad.everis.int:8765/api/product/getAllProducts
 	
 	http://lim-gj7s9h2.usersad.everis.int:8765/api/product/product/2
 	
 ruta zipkin:
 	http://localhost:9411
 	
 		 
 ![Screenshot from running application](images/zipkin.png?raw=true "Screenshot zipkin")
 
 ![Screenshot from running application](images/zipkin2.png?raw=true "Screenshot zipkin")
 
## Requisitos
   
  Requisitos:
   - JDK 1.8
   - Apache maven 3
      
# Generate artfecatos con maven
   	mvn clean install
   	   	
   	   	
   	   	
   	   	
       
  
