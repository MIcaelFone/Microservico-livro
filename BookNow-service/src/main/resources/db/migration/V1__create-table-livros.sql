 DROP TABLE IF EXISTS `livros`;
 /*!40101 SET @saved_cs_client     = @@character_set_client */;
 /*!50503 SET character_set_client = utf8mb4 */;
 CREATE TABLE `livros` (
   `idLivros` int NOT NULL AUTO_INCREMENT,
   `NomeLivro` varchar(100) NOT NULL,
   `descricao` varchar(250) DEFAULT NULL,
   `Autor` varchar(50) NOT NULL,
   `dataPublicacao` date NOT NULL,
   `classificacaoLivro` varchar(50) NOT NULL,
   `imagem` varchar(250) DEFAULT NULL,
   `ebook` varchar(1000) NOT NULL,
   `pontos` int NOT NULL,
   PRIMARY KEY (`idLivros`),
   UNIQUE KEY `idLivros_UNIQUE` (`idLivros`),
   UNIQUE KEY `NomeLivro_UNIQUE` (`NomeLivro`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 /*!40101 SET character_set_client = @saved_cs_client */;

 --
 -- Dumping data for table `livros`
 --

 LOCK TABLES `livros` WRITE;
 /*!40000 ALTER TABLE `livros` DISABLE KEYS */;
 /*!40000 ALTER TABLE `livros` ENABLE KEYS */;
 UNLOCK TABLES;
 /*!40103 SET TIME_