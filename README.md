# ds-address-api

Uma API Rest para centralizar regras e buscas de endereço (CEP).

## Tecnologias

Este projeto utiliza as seguintes tecnologias e ferramentas:

- **Java:** Versão 11+
- **Spring Boot:** Versão 2+
- **Gerenciamento de Dependências:** Maven
- **Autenticação e Segurança:**
  - JWT
  - Spring Security
  - Spring Data
- **Integração Contínua e Entrega Contínua (CI/CD):** TravisCI

## Funcionalidades

- Busca de endereço por CEP utilizando integração com o serviço [ViaCEP](https://viacep.com.br).
- Autenticação JWT.
- Documentação interativa através do Swagger.

## Configuração e Execução

### Pré-requisitos

1. Instale o **Java 11+**.
2. Verifique se **Maven** está configurado em sua máquina.

### Compilação e Execução

1. Compile o projeto e gere o arquivo `.jar` com o comando:
   ```bash
   ./mvn clean install
   ```

2. Para executar a aplicação:
   ```bash
   java -jar target/ds-address-api-0.0.1-SNAPSHOT.jar
   ```

### Docker

Também é possível executar a aplicação através do Docker. Use os comandos abaixo:

1. Compile e crie a imagem Docker:
   ```bash
   ./mvnw clean install && ./build.sh
   ```

2. Execute a imagem gerada:
   ```bash
   ./run
   ```

## Ambientes

O sistema permite a configuração de múltiplos ambientes. Exemplo:

- **local**
- **produção**

## Documentação da API

- Acesse o Swagger para visualizar e testar as rotas disponíveis:
  ```text
  http://localhost:8080/swagger-ui.html
  ```

- Arquivo de coleção do Postman disponível na pasta: `docs/postman`.

## Integrações

- A API utiliza o serviço do [ViaCEP](https://viacep.com.br) para buscar informações de endereço.

## Contribuindo

Contribuições são bem-vindas! Para começar:

1. Faça um fork do repositório.
2. Crie uma nova branch com sua feature ou correção:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça as alterações e commit:
   ```bash
   git commit -m "Minha contribuição"
   ```
4. Envie para sua branch:
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request para análise!

---

> **Nota:** Para mais informações, consulte o arquivo `CONTRIBUTING.md` (caso exista) ou entre em contato com o mantenedor.

---