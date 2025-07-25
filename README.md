# 📚 BookNow - Biblioteca  de Livros online

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

## 📖 Descrição

Um microserviço desenvolvido em Spring Boot que gerencia um catálogo de livros. Ele faz parte de um sistema maior que permite a busca, cadastro, e gerenciamento de livros. O microserviço foi projetado para ser escalável, modular e fácil de integrar com outros serviços.

## 🛠️ Tecnologias

- **Java 17**: Linguagem de programação usada no desenvolvimento.
- **Spring Boot 3.3.3**: Framework para a criação de microserviços em Java.
- **Spring Data JPA**: Para persistência e acesso aos dados no banco de dados.
- **MySQL**: Banco de dados relacional utilizado para armazenar as informações dos livros.
  
## Dependências Usadas
<ul>
    <li><strong>Spring Boot Starter Data JDBC</strong></li>
    <li><strong>Spring Boot Starter Data JPA</strong></li>
    <li><strong>Spring Boot Starter Data REST</strong></li>
    <li><strong>Spring Boot Starter JDBC</strong></li>
    <li><strong>Spring Boot Starter Validation</strong></li>
    <li><strong>Spring Boot Starter Web</strong></li>
    <li><strong>Flyway Core</strong></li>
    <li><strong>Flyway MySQL</strong></li>
    <li><strong>Springdoc OpenAPI Starter WebMVC UI (springdoc-openapi-starter-webmvc-ui)</strong></li>
    <li><strong>Swagger Annotations (swagger-annotations)</strong></li>
    <li><strong>Spring Cloud Netflix Eureka Client</strong></li>
    <li><strong>MySQL Connector/J</strong></li>
    <li><strong>Lombok</strong></li>
    <li><strong>Spring Boot Starter Test</strong></li>
    <li><strong>Spring Cloud Dependencies</strong></li>
</ul>

## 🚀 Funcionalidades

- **Cadastro de Livros**: Adicione novos livros ao catálogo.
- **Consulta de Livros**: Pesquise livros no catálogo por título, autor ou gênero.
- **Atualização de Livros**: Atualize informações de livros existentes.
- **Exclusão de Livros**: Remova livros do catálogo.

## 📦 Estrutura do Projeto

```bash
src/
├── main/
│   ├── java/com/booknow/
│   │   ├── config/   # Configuração do cors
│   │   ├── controller/    # Controladores REST
│   │   ├── DTO/         # DATA Transfrer Object
│   │   ├── model/   #  Modelos de classes 
│   │   ├── Livro/    # Clase do livro e arquivos de imagem e do livro
│   │   ├── Repository/     # Repository JPA
│   │   ├── Service/     #  lógica de negócios da aplicação
│   │   └── BookNowServiceApplication.java  # Classe principal do Spring Boot
│   └── resources/
│       ├── application.properties  # Configurações da aplicação
│       └── db/migration/           # Migrations do Flyway
└── test/
    └── java/com/booknow/           # Testes unitários e de integração
```
## 🛠️ Configuração do Ambiente
<ul>
    <li>JDK 17 ou superior</li>
    <li> Maven 3.8+</Li>
   <li>  MySQL 8.0+ </li>
</ul>
<h3>Configurações do Banco de Dados</h3>
<p>Certifique-se de ter um banco de dados MySQL configurado com as seguintes credenciais:</p>

```bash
spring.application.name=BookNow-service-Livro
spring.config.import=optional:configserver:
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:${PORT_DB_BOOK}/${LIVRO_DATABASE}
spring.datasource.username=root
spring.datasource.password=${BOOK_DB_PASSWORD}
spring.flyway.baseline-on-migrate=false
spring.jpa.hibernate.ddl-auto=none
server.port=${BOOK_SERVER_PORT}
spring.flyway.enabled=false
eureka.client.serviceUrl.defaultZone=http://localhost:${BOOK_SERVER_EUREKA}/eureka
eureka.instance.preferIpAddress=true
springdoc.api-docs.path=/api-docs
springdoc.swagger-ui.path=/swagger-ui.html
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
#### Descrição: Configurações de conexão com o banco de dados MySQL.
- **spring.datasource.driver-class-name**: Define o driver JDBC para MySQL.
- **spring.datasource.url**: URL de conexão com o banco de dados. Use variáveis de ambiente ${PORT_DB_BOOK} para a porta e ${LIVRO_DATABASE} para o nome do banco de dados.
- **spring.datasource.username**: Nome de usuário para a conexão com o banco de dados.
- **spring.datasource.password**: Senha para a conexão com o banco de dados.
## Executando o projeto
<p>CLonar projeto</p>

```bash
git clone https://github.com/seu-usuario/booknow-livro-service.git
cd BookNow-Service
```
<p>Configure as propriedades da aplicação no application.properties.</p>
<p>Execute as migrations do banco de dados:</p>

```bash
mvn flyway:migrate
```
<p>Inicie a aplicação:</p>

```bash
mvn spring-boot:run
```
- **Para acessar o swagger da API** <code>http://localhost:${Sua_Server_port}/swagger-ui.html</code>
 
