# ds-address-api
API for centralize Address rules and CEP search 

# Steps

1. Install JDK 11
2. Compile and generate jar artefectory `./mvn clean install`
3. java -jar target/ds-address-api-0.0.1-SNAPSHOT.jar

#Enviroments

<ul>
  <li>local</li>
  <li>production</li>
</ul>

### Compilar e subir com Docker
`./mvnw clean install && ./build.sh` <br>
`./run`

### Documentation - Swagger 

http://localhost:8080/swagger-ui.html

### Buscar endereco por CEP
`http://localhost:8080/address/protected/cep/<CEP>`

### APIs integration
https://viacep.com.br

<img src="/docs/via_cep_integration.png"/>

## Tecnologias
Java 11+ <br>
SpringBoot 2<br>
Maven<br>
