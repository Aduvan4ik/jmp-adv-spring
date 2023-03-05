To run app:   
mvn clean install  
java -jar .\target\jmp-adv-spring-0.0.1-SNAPSHOT.jar

next endpoints are available for all requests:  
http://localhost:8080/actuator/info  
http://localhost:8080/actuator/health  
http://localhost:8080/actuator/customEndpoint  

all other endpoints are secured.
