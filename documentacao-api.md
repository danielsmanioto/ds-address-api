# Documentação da API

## Endpoints Disponíveis

### AddressController

- **Descrição:** Busca endereço a partir de um CEP brasileiro.
  - **Endpoint:** `/address/protected/cep/{cep}`
  - **Método HTTP:** GET
  - **Respostas:**
    - 200: OK

### JWTAuthenticationController

- **Descrição:** Geração do token JWT.
  - **Endpoint:** `/authentication/public`
  - **Método HTTP:** POST
  - **Respostas:**
    - 200: OK
