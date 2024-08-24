# 📚 BookNow - Biblioteca  de Livros online

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Development](https://img.shields.io/badge/Development-In%20Progress-yellow?style=for-the-badge)

## 📖 Descrição

Um microserviço desenvolvido em Spring Boot que gerencia um catálogo de livros. Ele faz parte de um sistema maior que permite a busca, cadastro, e gerenciamento de livros. O microserviço foi projetado para ser escalável, modular e fácil de integrar com outros serviços.

## 🛠️ Tecnologias

- **Java 17**: Linguagem de programação usada no desenvolvimento.
- **Spring Boot 3.3.3**: Framework para a criação de microserviços em Java.
- **Spring Data JPA**: Para persistência e acesso aos dados no banco de dados.
- **MySQL**: Banco de dados relacional utilizado para armazenar as informações dos livros.
- **Flyway**: Controle de versionamento do banco de dados.
- **HikariCP**: Pool de conexões para melhorar o desempenho de acesso ao banco de dados.

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
│   │   ├── controller/    # Controladores REST
│   │   ├── model/         # Modelos e entidades JPA
│   │   ├── repository/    # Repositórios JPA
│   │   ├── service/       # Serviços de negócio
│   │   └── BookNowServiceApplication.java  # Classe principal do Spring Boot
│   └── resources/
│       ├── application.properties  # Configurações da aplicação
│       └── db/migration/           # Migrations do Flyway
└── test/
    └── java/com/booknow/           # Testes unitários e de integração
