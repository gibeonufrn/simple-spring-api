# Simple Spring API

API simples criada com Java 17, Spring Boot e Maven.

## Executar localmente

```bash
mvn spring-boot:run
```

## Endpoints

```http
GET http://localhost:8080/api/hello
GET http://localhost:8080/api/health
```

## Build

```bash
mvn clean package
```

## CI/CD

O workflow em `.github/workflows/ci-cd.yml` executa build e testes automaticamente em `push` e `pull_request` para a branch `main`.

Em push para `main`, o `.jar` gerado é publicado como artifact do GitHub Actions.
