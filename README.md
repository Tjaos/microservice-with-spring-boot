# 🛒 Catalog Service - Microserviço de Produtos

Este projeto é um **microserviço de Catálogo de Produtos** construído com **Java 21**, **Spring Boot** e boas práticas modernas de desenvolvimento. Ele faz parte de uma arquitetura de microserviços, que inclui:

- ✅ `catalog-service` (você está aqui)
- ✅ `order-service` (em desenvolvimento)
- ✅ `eureka-server` (Service Discovery)
- ✅ `api-gateway` (roteamento entre serviços)

---

## 🔧 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Validation (Jakarta)
- Spring Cloud Netflix Eureka
- Spring Cloud Gateway
- Lombok
- H2 Database (persistência em memória)
- Maven

---

## 📌 Funcionalidades do catalog-service

- ✅ Criar, listar, editar e excluir produtos (CRUD)
- ✅ Validações com `@Valid` nos campos
- ✅ Boas práticas com uso de DTO (Data Transfer Object)
- ✅ Tratamento global de exceções (com mensagens personalizadas)
- ✅ Integração com Eureka e roteamento via API Gateway

---

## 📦 Endpoints da API

| Método | Endpoint            | Descrição                  |
|--------|---------------------|----------------------------|
| GET    | `/products`         | Lista todos os produtos    |
| GET    | `/products/{id}`    | Busca produto por ID       |
| POST   | `/products`         | Cria um novo produto       |
| PUT    | `/products/{id}`    | Atualiza um produto        |
| DELETE | `/products/{id}`    | Exclui um produto          |

---

## ✅ Validações aplicadas

- **`name`**: obrigatório, não pode estar em branco
- **`description`**: obrigatório, no máximo 500 caracteres
- **`price`**: obrigatório, valor positivo

---

## 📥 Exemplo de Requisição (POST)

```http
POST /products
Content-Type: application/json

{
  "name": "Notebook Lenovo",
  "description": "Notebook com 16GB RAM e SSD",
  "price": 3999.90
}
```

---

## ⚠️ Exemplo de erro de validação

```json
{
  "name": "O Nome não pode estar em branco",
  "price": "O Preço deve ser um valor positivo"
}
```

---

## 🔌 Como rodar o projeto localmente com Gateway e Eureka

> ⚠️ Certifique-se de ter o Java 21 e o Maven instalados.

### 🪜 Ordem para iniciar os microserviços:

1. **Clonar todos os projetos da arquitetura**:
   - `eureka-server`
   - `catalog-service`
   - `api-gateway`
   - (futuramente: `order-service`)

2. **Rodar o Eureka Server**:
   - Porta padrão: `8761`
   - Acesse em: [http://localhost:8761](http://localhost:8761)

3. **Rodar o catalog-service**:
   - Porta: `8100`
   - Ele se registra no Eureka automaticamente.

4. **Rodar o api-gateway**:
   - Porta: `8700`
   - O gateway usará Eureka para encaminhar requisições.

---
💡 Exemplo de acesso via Gateway:
```http
GET http://localhost:8700/catalog/products
```
---

## 🧪 Teste no Postman

Use a URL com `/catalog` prefixado ao invés de `/products` diretamente:

```http
GET http://localhost:8700/catalog/products
```
---

## 📚 Próximos passos

- [ ] Adicionar Swagger para documentação da API
- [ ] Implementar testes com JUnit
- [ ] Cache com Spring Cache
- [ ] Segurança com Spring Security + JWT
---

## 🧑‍💻 Autor

Desenvolvido por **Thiago Amaral**  
🔗 [LinkedIn](https://www.linkedin.com/in/thiagoamaraldev/) • [GitHub](https://github.com/Tjaos)

---
