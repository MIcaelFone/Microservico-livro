CREATE TABLE Livros(
     id BIGINT NOT NULL AUTO_INCREMENT NOT NULL,
     nome VARCHAR(50)  UNIQUE NOT NULL,
     descricao VARCHAR(250) NOT NULL,
     autor VARCHAR(50) NOT NULL,
     datapublicacao DATE NOT NULL,
     classificacao_livro VARCHAR(50) NOT NULL,
     primary key (id)
)