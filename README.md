# ds-address-api
Rest API for centralize Address rules and CEP search 

## Tecnologias
Java 11+ <br>
SpringBoot 2<br>
Maven<br>
JWT / Sring boot / Spring data / Spring Security<br>
CI/CD with TravisCI

# Steps

1. Install JDK 11
2. Compile and generate jar artefectory `./mvn clean install`
3. java -jar target/ds-address-api-0.0.1-SNAPSHOT.jar

# Enviroments

<ul>
  <li>local</li>
  <li>production</li>
</ul>

### Compile and Run with Docker
`./mvnw clean install && ./build.sh` <br>
`./run`

### Documentation - Swagger 

http://localhost:8080/swagger-ui.html

There you will find how you have authentication.
You can import the more latest collection postman in docs/postman

### APIs integration
https://viacep.com.br

<img src="/docs/via_cep_integration.png"/>

