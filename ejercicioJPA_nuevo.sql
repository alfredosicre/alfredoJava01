CREATE DATABASE  IF NOT EXISTS `13_ejercicio_jpa` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `13_ejercicio_jpa`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: ejercicio_jpa
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `idCategoria` int NOT NULL AUTO_INCREMENT,
  `categoria` varchar(255) DEFAULT NULL,
  `salarioConvenio` double NOT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` VALUES (1,'ADMINISTRATIVO',1035.5),(2,'JEFE SERVICIO',2000),(3,'ADMINISTRATIVO',1035.5),(4,'ADMINISTRATIVO',1035.5);
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `categoria` varchar(255) DEFAULT NULL,
  `nroCliente` int NOT NULL,
  `idRol` int NOT NULL,
  PRIMARY KEY (`idRol`),
  UNIQUE KEY `nroCliente_UNIQUE` (`nroCliente`),
  CONSTRAINT `FK_d6ch4icoq4kp9alhj8ckj3mko` FOREIGN KEY (`idRol`) REFERENCES `roles` (`idRol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES ('ESPORADICO',135,1),('VIP',12,4),('GRAN EMPRESA',29,6),('ESPORADICO',33,12),('ESPORADICO',1890,17);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes_productos`
--

DROP TABLE IF EXISTS `clientes_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes_productos` (
  `idrol` int NOT NULL,
  `idProducto` int NOT NULL,
  KEY `FK_fo288cseoqwqdivy6n0h0n9qa` (`idrol`),
  KEY `FL_cliprod_productos` (`idProducto`),
  CONSTRAINT `FK_fo288cseoqwqdivy6n0h0n9qa` FOREIGN KEY (`idrol`) REFERENCES `clientes` (`idRol`),
  CONSTRAINT `FL_cliprod_productos` FOREIGN KEY (`idProducto`) REFERENCES `productos` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes_productos`
--

LOCK TABLES `clientes_productos` WRITE;
/*!40000 ALTER TABLE `clientes_productos` DISABLE KEYS */;
INSERT INTO `clientes_productos` VALUES (4,1),(1,1),(1,2),(6,3),(6,4),(12,5),(12,6),(17,7),(17,8);
/*!40000 ALTER TABLE `clientes_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `colaboradores`
--

DROP TABLE IF EXISTS `colaboradores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `colaboradores` (
  `nroProveedor` int unsigned NOT NULL,
  `servicio` varchar(255) DEFAULT NULL,
  `idRol` int NOT NULL,
  PRIMARY KEY (`idRol`),
  CONSTRAINT `FK_gtat517fmia08peer5kmf9uru` FOREIGN KEY (`idRol`) REFERENCES `roles` (`idRol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colaboradores`
--

LOCK TABLES `colaboradores` WRITE;
/*!40000 ALTER TABLE `colaboradores` DISABLE KEYS */;
INSERT INTO `colaboradores` VALUES (123456,'Servicio Medico',2),(765,'Informatica',3),(333,'Servicio Medico',7),(121,'Informatica',8),(9876,'Mantenimiento',11),(65443,'Informatica',14),(1111,'Limpieza',18),(890,'Informatica',19),(1120,'Mantenimiento',22);
/*!40000 ALTER TABLE `colaboradores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `nroEmpleado` int NOT NULL,
  `idRol` int NOT NULL,
  `idcategoria` int DEFAULT NULL,
  PRIMARY KEY (`idRol`),
  KEY `FK_hb2ckqvwo1x8cwe6vsixqxo9x` (`idcategoria`),
  CONSTRAINT `FK_4d4cvmb7dkv2399wy0gnm90e5` FOREIGN KEY (`idRol`) REFERENCES `roles` (`idRol`),
  CONSTRAINT `FK_hb2ckqvwo1x8cwe6vsixqxo9x` FOREIGN KEY (`idcategoria`) REFERENCES `categorias` (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (12345,5,1),(54321,10,2),(879,16,3),(1567,21,4);
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personas` (
  `idPersona` int NOT NULL AUTO_INCREMENT,
  `apellidos` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES (1,'Marcos'),(2,'Lopez'),(3,'Ramirez'),(4,'Bustamante'),(5,'Juarez'),(6,'Otro Lopez'),(7,'Perez'),(8,'Pedrito'),(9,'Jimenez'),(10,'Gomez'),(11,'Zapata'),(12,'Bartolo'),(13,'Villafranca'),(14,'Vacis'),(15,'Ortega'),(16,'Clavero');
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `precio` double NOT NULL,
  `producto` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idProducto`),
  UNIQUE KEY `producto_UNIQUE` (`producto`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,155.8,'disco externo usb 2Tb'),(2,12,'cable hdmi 1.5m.'),(3,100,'PC X3456'),(4,22,'teclado USB'),(5,200,'disco externo usb 1Tb'),(6,9.99,'cable hdmi 1m.'),(7,7.5,'Memoria USB 64Gb'),(8,19,'cable hdmi 3m.'),(9,55,'Nuevo producto');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `idRol` int NOT NULL AUTO_INCREMENT,
  `rol` varchar(255) DEFAULT NULL,
  `idPersona` int DEFAULT NULL,
  PRIMARY KEY (`idRol`),
  UNIQUE KEY `uq_rol_persona` (`rol`,`idPersona`),
  KEY `FK_roles_personas` (`idPersona`),
  CONSTRAINT `FK_roles_personas` FOREIGN KEY (`idPersona`) REFERENCES `personas` (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (4,'CLIENTE',2),(1,'CLIENTE',3),(6,'CLIENTE',7),(12,'CLIENTE',11),(17,'CLIENTE',15),(2,'COLABORADOR',1),(3,'COLABORADOR',2),(7,'COLABORADOR',5),(8,'COLABORADOR',6),(11,'COLABORADOR',8),(14,'COLABORADOR',10),(18,'COLABORADOR',13),(19,'COLABORADOR',14),(22,'COLABORADOR',16),(5,'EMPLEADO',4),(10,'EMPLEADO',8),(16,'EMPLEADO',12),(21,'EMPLEADO',16);
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-07-22 22:04:44
