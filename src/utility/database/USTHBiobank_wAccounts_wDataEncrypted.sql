DROP DATABASE  IF EXISTS `usthbiobank`;
CREATE DATABASE  IF NOT EXISTS `usthbiobank` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `usthbiobank`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: usthbiobank
-- ------------------------------------------------------
-- Server version	5.6.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accounttable`
--

DROP TABLE IF EXISTS `accounttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accounttable` (
  `AccountID` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(750) NOT NULL,
  `Password` varchar(750) NOT NULL,
  `LastName` varchar(500) NOT NULL,
  `FirstName` varchar(500) NOT NULL,
  `MiddleName` varchar(500) DEFAULT NULL,
  `RoleID` int(11) NOT NULL,
  `Active` int(11) NOT NULL,
  PRIMARY KEY (`AccountID`),
  KEY `AccountTable_fk0` (`RoleID`),
  CONSTRAINT `AccountTable_fk0` FOREIGN KEY (`RoleID`) REFERENCES `roletable` (`RoleID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounttable`
--

LOCK TABLES `accounttable` WRITE;
/*!40000 ALTER TABLE `accounttable` DISABLE KEYS */;
INSERT INTO `accounttable` VALUES (1,'jaszespi@gmail.com','1','ESPINOSA','JASIEL','Z.',1,1),(2,'matthewbayabusm@gmail.com','1','BAYABUS','MATTHEW','D.',2,1),(3,'carleslabon@gmail.com','1','ESLABON','CARL ONIEL','P.',1,1),(4,'charleshandsome@yahoo.com','1','ZALAMEDA','CHARLES','R.',2,1);
/*!40000 ALTER TABLE `accounttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `addresstable`
--

DROP TABLE IF EXISTS `addresstable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `addresstable` (
  `AddressID` int(11) NOT NULL AUTO_INCREMENT,
  `StreetAddress` varchar(500) NOT NULL,
  `City` varchar(200) NOT NULL,
  `ZIPCode` varchar(200) NOT NULL,
  PRIMARY KEY (`AddressID`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addresstable`
--

LOCK TABLES `addresstable` WRITE;
/*!40000 ALTER TABLE `addresstable` DISABLE KEYS */;
INSERT INTO `addresstable` VALUES (1,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(2,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(3,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(4,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(5,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(6,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(7,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(8,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(9,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(10,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(11,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(12,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(13,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(14,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(15,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(16,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(17,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(18,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(19,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(20,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(21,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(22,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(23,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(24,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(25,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(26,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(27,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(28,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(29,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(30,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(31,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(32,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(33,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(34,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(35,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(36,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(37,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(38,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(39,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(40,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(41,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(42,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(43,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(44,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(45,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(46,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(47,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(48,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(49,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(50,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(51,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(52,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(53,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(54,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(55,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(56,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(57,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(58,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(59,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(60,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(61,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew=='),(62,'R9PQHzzQmMZ3flzk6sJ87g==','WTWct/N2weeIl81YyLTW+A==','TO5PrAJoeKB7znK+nsRaew==');
/*!40000 ALTER TABLE `addresstable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `audittable`
--

DROP TABLE IF EXISTS `audittable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `audittable` (
  `AuditID` int(11) NOT NULL AUTO_INCREMENT,
  `Action` varchar(300) DEFAULT NULL,
  `PerformedOn` varchar(300) DEFAULT NULL,
  `PerformedBy` varchar(300) DEFAULT NULL,
  `Date` varchar(100) DEFAULT NULL,
  `Time` varchar(100) DEFAULT NULL,
  `UserID` int(11) NOT NULL,
  PRIMARY KEY (`AuditID`)
) ENGINE=InnoDB AUTO_INCREMENT=480 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audittable`
--

LOCK TABLES `audittable` WRITE;
/*!40000 ALTER TABLE `audittable` DISABLE KEYS */;
/*!40000 ALTER TABLE `audittable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bloodchemistrytable`
--

DROP TABLE IF EXISTS `bloodchemistrytable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bloodchemistrytable` (
  `BloodChemistryID` int(11) NOT NULL AUTO_INCREMENT,
  `BloodUreaNitrogen` double DEFAULT NULL,
  `Creatinine` double DEFAULT NULL,
  `UricAcid` double DEFAULT NULL,
  `SGOT` double DEFAULT NULL,
  `SGPT` double DEFAULT NULL,
  `LDH` double DEFAULT NULL,
  `EPOLevel` double DEFAULT NULL,
  `Na` double DEFAULT NULL,
  `K` double DEFAULT NULL,
  `BilirubinTotal` double DEFAULT NULL,
  `BilirubinDirect` double DEFAULT NULL,
  `BilirubinIndirect` double DEFAULT NULL,
  `Beta2Microglobulin` double DEFAULT NULL,
  `HepatitisBTesting` double DEFAULT NULL,
  `ESR` double DEFAULT NULL,
  `iCa` double DEFAULT NULL,
  `TotalProtein` double DEFAULT NULL,
  `Albumin` double DEFAULT NULL,
  `Globulin` double DEFAULT NULL,
  `ANATiter` double DEFAULT NULL,
  `HepatitisCRna` double DEFAULT NULL,
  PRIMARY KEY (`BloodChemistryID`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bloodchemistrytable`
--

LOCK TABLES `bloodchemistrytable` WRITE;
/*!40000 ALTER TABLE `bloodchemistrytable` DISABLE KEYS */;
INSERT INTO `bloodchemistrytable` VALUES (1,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(12,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(13,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(14,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(15,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(16,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(17,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(18,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(19,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(20,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(21,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(22,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(23,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(24,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(25,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(26,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(27,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(28,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(29,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(30,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(31,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(32,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(33,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(34,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(35,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(36,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(37,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(38,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(39,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(40,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(41,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(42,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(43,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(44,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(45,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `bloodchemistrytable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bonemarrowaspiratetable`
--

DROP TABLE IF EXISTS `bonemarrowaspiratetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bonemarrowaspiratetable` (
  `BoneMarrowAspirateID` int(11) NOT NULL AUTO_INCREMENT,
  `DatePerformed` blob,
  `Result` blob,
  PRIMARY KEY (`BoneMarrowAspirateID`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bonemarrowaspiratetable`
--

LOCK TABLES `bonemarrowaspiratetable` WRITE;
/*!40000 ALTER TABLE `bonemarrowaspiratetable` DISABLE KEYS */;
INSERT INTO `bonemarrowaspiratetable` VALUES (1,'2010-01-01','Bone Marrow Aspirate and Biopsy result'),(2,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(3,'',''),(4,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(5,'2014-05-05','Bone Marrow Aspirate and Biopsy result'),(6,'2010-01-06','Bone Marrow Aspirate and Biopsy result'),(7,'',''),(8,'2012-03-08','Bone Marrow Aspirate and Biopsy result'),(9,'2013-04-09','Bone Marrow Aspirate and Biopsy result'),(10,'2014-05-10','Bone Marrow Aspirate and Biopsy result'),(11,'2010-01-01','Bone Marrow Aspirate and Biopsy result'),(12,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(13,'',''),(14,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(15,'2014-05-05','Bone Marrow Aspirate and Biopsy result'),(16,'',''),(17,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(18,'2012-03-03','Bone Marrow Aspirate and Biopsy result'),(19,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(20,'',''),(21,'2010-01-01','Bone Marrow Aspirate and Biopsy result'),(22,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(23,'',''),(24,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(25,'2014-05-05','Bone Marrow Aspirate and Biopsy result'),(26,'',''),(27,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(28,'2012-03-03','Bone Marrow Aspirate and Biopsy result'),(29,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(30,'',''),(31,'2010-01-01','Bone Marrow Aspirate and Biopsy result'),(32,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(33,'',''),(34,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(35,'2014-05-05','Bone Marrow Aspirate and Biopsy result'),(36,'2018-03-03','Bone Marrow Aspirate'),(37,'',''),(38,'2018-03-05','Bone Marrow Aspirate'),(39,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(40,'',''),(41,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(42,'2014-05-05','Bone Marrow Aspirate and Biopsy result'),(43,'2010-01-06','Bone Marrow Aspirate and Biopsy result'),(44,'',''),(45,'2012-03-08','Bone Marrow Aspirate and Biopsy result'),(46,'2010-01-01','Bone Marrow Aspirate and Biopsy result'),(47,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(48,'',''),(49,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(50,'2014-05-05','Bone Marrow Aspirate and Biopsy result'),(51,'2010-01-06','Bone Marrow Aspirate and Biopsy result'),(52,'',''),(53,'2012-03-08','Bone Marrow Aspirate and Biopsy result'),(54,'2013-04-09','Bone Marrow Aspirate and Biopsy result'),(55,'2014-05-10','Bone Marrow Aspirate and Biopsy result'),(56,'2010-01-01','Bone Marrow Aspirate and Biopsy result'),(57,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(58,'',''),(59,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(60,'2014-05-05','Bone Marrow Aspirate and Biopsy result'),(61,'2018-03-03','Bone Marrow Aspirate');
/*!40000 ALTER TABLE `bonemarrowaspiratetable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chemomedicationstable`
--

DROP TABLE IF EXISTS `chemomedicationstable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chemomedicationstable` (
  `ChemoMedicationID` int(11) NOT NULL AUTO_INCREMENT,
  `MedicationName` blob NOT NULL,
  PRIMARY KEY (`ChemoMedicationID`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chemomedicationstable`
--

LOCK TABLES `chemomedicationstable` WRITE;
/*!40000 ALTER TABLE `chemomedicationstable` DISABLE KEYS */;
INSERT INTO `chemomedicationstable` VALUES (1,'Medications'),(2,'Medications'),(3,'Medications'),(4,'Medications'),(5,'Medications'),(6,'Medications'),(7,'Medications'),(8,'Medications'),(9,'Medications'),(10,'Medications'),(11,'Chemotherapy Medications'),(12,'Chemotherapy Medications'),(13,'Chemotherapy Medications'),(14,'Chemotherapy Medications'),(15,'Chemotherapy Medications'),(16,'Chemotherapy Medications'),(17,'Chemotherapy Medications'),(18,'Chemotherapy Medications'),(19,'Chemotherapy Medications'),(20,'Chemotherapy Medications'),(21,'Medications'),(22,'Medications'),(23,'Medications'),(24,'Medications'),(25,'Medications'),(26,'Medications'),(27,'Medications'),(28,'Medications'),(29,'Medications'),(30,'Medications'),(31,'Medications'),(32,'Medications'),(33,'Chemotherapy Medications'),(34,'Chemotherapy Medications'),(35,'Chemotherapy Medications'),(36,'Chemotherapy Medications'),(37,'Chemotherapy Medications'),(38,'Chemotherapy Medications'),(39,'Chemotherapy Medications'),(40,'Chemotherapy Medications'),(41,'Chemotherapy Medications'),(42,'Chemotherapy Medications'),(43,'Chemotherapy Medications'),(44,'Chemotherapy Medications'),(45,'Chemotherapy Medications'),(46,'Chemotherapy Medications'),(47,'Chemotherapy Medications');
/*!40000 ALTER TABLE `chemomedicationstable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classificationtable`
--

DROP TABLE IF EXISTS `classificationtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classificationtable` (
  `ClassificationID` int(11) NOT NULL AUTO_INCREMENT,
  `ClassificationName` varchar(100) NOT NULL,
  PRIMARY KEY (`ClassificationID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classificationtable`
--

LOCK TABLES `classificationtable` WRITE;
/*!40000 ALTER TABLE `classificationtable` DISABLE KEYS */;
INSERT INTO `classificationtable` VALUES (1,'MDS Very Low'),(2,'MDS Very Low'),(3,'MDS Very Low'),(4,'MDS Very Low'),(5,'MDS Very Low'),(6,'MDS Very Low'),(7,'MDS Very Low'),(8,'MDS Very Low'),(9,'MDS Very Low'),(10,'MDS Very Low'),(11,'MDS Very Low'),(12,'MDS Very Low'),(13,'MDS Very Low'),(14,'MDS Very Low'),(15,'MDS Very Low'),(16,'MDS Very Low'),(17,'MDS Very Low');
/*!40000 ALTER TABLE `classificationtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clinicaldatatable`
--

DROP TABLE IF EXISTS `clinicaldatatable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clinicaldatatable` (
  `ClinicalDataID` int(11) NOT NULL AUTO_INCREMENT,
  `DateOfVisit` varchar(500) DEFAULT NULL,
  `Diagnosis` blob,
  `OtherDiagnosis` blob,
  `PrognosticRiskScoringID` int(11) DEFAULT NULL,
  `RiskScoreID` int(11) DEFAULT NULL,
  `ClassificationID` int(11) DEFAULT NULL,
  `ISSStagingID` int(11) DEFAULT NULL,
  `SeverityID` int(11) DEFAULT NULL,
  `StageOfDisease` blob,
  `ChiefComplaint` blob,
  `CurrentSymptoms` blob,
  `ConstitutionalSymptoms` blob,
  `OtherSymptoms` blob,
  `Comorbidities` blob,
  `SmokingHistory` blob,
  `AlcoholIntakeHistory` blob,
  `ChemicalExposure` blob,
  `PreviousInfection` blob,
  `PreviousHematologicDisorder` blob,
  `PhysicalExamID` int(11) DEFAULT NULL,
  `OtherFindings` blob,
  PRIMARY KEY (`ClinicalDataID`),
  KEY `ClinicalDataTable_fk0` (`PrognosticRiskScoringID`),
  KEY `ClinicalDataTable_fk1` (`RiskScoreID`),
  KEY `ClinicalDataTable_fk2` (`ClassificationID`),
  KEY `ClinicalDataTable_fk3` (`ISSStagingID`),
  KEY `ClinicalDataTable_fk4` (`SeverityID`),
  KEY `ClinicalDataTable_fk5` (`PhysicalExamID`),
  CONSTRAINT `ClinicalDataTable_fk0` FOREIGN KEY (`PrognosticRiskScoringID`) REFERENCES `prognosticriskscoringtable` (`PrognosticRiskScoringID`),
  CONSTRAINT `ClinicalDataTable_fk1` FOREIGN KEY (`RiskScoreID`) REFERENCES `riskscoretable` (`RiskScoreID`),
  CONSTRAINT `ClinicalDataTable_fk2` FOREIGN KEY (`ClassificationID`) REFERENCES `classificationtable` (`ClassificationID`),
  CONSTRAINT `ClinicalDataTable_fk3` FOREIGN KEY (`ISSStagingID`) REFERENCES `issstagingtable` (`ISSStagingID`),
  CONSTRAINT `ClinicalDataTable_fk4` FOREIGN KEY (`SeverityID`) REFERENCES `severitytable` (`SeverityID`),
  CONSTRAINT `ClinicalDataTable_fk5` FOREIGN KEY (`PhysicalExamID`) REFERENCES `physicalexamtable` (`PhysicalExamID`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clinicaldatatable`
--

LOCK TABLES `clinicaldatatable` WRITE;
/*!40000 ALTER TABLE `clinicaldatatable` DISABLE KEYS */;
INSERT INTO `clinicaldatatable` VALUES (1,'ABFAB0F29CE1F719347D9A829E9D66DA','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,1,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',1,NULL),(2,'0374BBA5CF093077F3930310B1B6418E','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,2,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',2,NULL),(3,'1D0104740FFEBAE301D7D3CE159B95D2','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,3,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','','','','','',3,NULL),(4,'121E72A67D2B49040981E23E97BA32F0','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,4,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',4,NULL),(5,'8526D83DC01731A0B4754212116C8F3F','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,5,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',5,NULL),(6,'FF535DC5E13BA9048283D567ECD5BB53','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,6,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',6,NULL),(7,'579FF4FF7DE04374955E17BB3FE19D21','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,7,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','','','','','',7,NULL),(8,'65CC1E5C381E75891A816309F0F23D38','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,8,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',8,NULL),(9,'4822CD68E6144C496EB83296F44052F5','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,9,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',9,NULL),(10,'277D319E25E10D20640A5673A1687151','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,10,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',10,NULL),(11,'0D8DF0AF118333E0186C6FE96573EA5D','Others','Diagnosis Others',NULL,NULL,NULL,NULL,1,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','','','',NULL,NULL,11,'Other findings'),(12,'696E8C37A7680311D454F11D166B7453','Others','Diagnosis Others',NULL,NULL,NULL,NULL,2,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,12,'Other findings'),(13,'6DBEBAC08863F736806F7BA0C334B7D9','Others','Diagnosis Others',NULL,NULL,NULL,NULL,3,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,13,'Other findings'),(14,'056FC5B7F621961FE0AFF595CA05E3DE','Others','Diagnosis Others',NULL,NULL,NULL,NULL,4,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,14,'Other findings'),(15,'4CE1AF8E96449592F2CED25F70B2E9AC','Others','Diagnosis Others',NULL,NULL,NULL,NULL,5,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','','','',NULL,NULL,15,'Other findings'),(16,'E7C06FB957646A91F2B1C27E2661304A','C92.Z Other myeloid leukemia',NULL,NULL,1,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',16,NULL),(17,'A8569AACBC9CE8CB2EE3F079FED72BF1','C92.Z Other myeloid leukemia',NULL,NULL,2,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',17,NULL),(18,'3AB14A2A57845C480D660B8CABC79A27','C92.Z Other myeloid leukemia',NULL,NULL,3,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','','','','','',18,NULL),(19,'15EC4768F2828529B93981AAEAC1F50D','C92.Z Other myeloid leukemia',NULL,NULL,4,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',19,NULL),(20,'0C978AB1068A79D587370CEC9F775F89','C92.Z Other myeloid leukemia',NULL,NULL,5,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',20,NULL),(21,'E7C06FB957646A91F2B1C27E2661304A','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','','','',NULL,NULL,21,'Other findings'),(22,'A8569AACBC9CE8CB2EE3F079FED72BF1','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,22,'Other findings'),(23,'3AB14A2A57845C480D660B8CABC79A27','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,23,'Other findings'),(24,'15EC4768F2828529B93981AAEAC1F50D','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,24,'Other findings'),(25,'0C978AB1068A79D587370CEC9F775F89','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','','','',NULL,NULL,25,'Other findings'),(26,'E7C06FB957646A91F2B1C27E2661304A','Others','Diagnosis Others',1,6,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,26,'Other findings'),(27,'A8569AACBC9CE8CB2EE3F079FED72BF1','Others','Diagnosis Others',2,7,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,27,'Other findings'),(28,'3AB14A2A57845C480D660B8CABC79A27','Others','Diagnosis Others',3,8,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','','','',NULL,NULL,28,'Other findings'),(29,'15EC4768F2828529B93981AAEAC1F50D','Others','Diagnosis Others',4,9,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,29,'Other findings'),(30,'0C978AB1068A79D587370CEC9F775F89','Others','Diagnosis Others',5,10,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,30,'Other findings'),(31,'E7C06FB957646A91F2B1C27E2661304A','C90.32 ... in relapse',NULL,NULL,NULL,NULL,1,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,31,'Other pertinent findings'),(32,'A8569AACBC9CE8CB2EE3F079FED72BF1','C90.32 ... in relapse',NULL,NULL,NULL,NULL,2,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,32,'Other pertinent findings'),(33,'3AB14A2A57845C480D660B8CABC79A27','C90.32 ... in relapse',NULL,NULL,NULL,NULL,3,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,33,'Other pertinent findings'),(34,'15EC4768F2828529B93981AAEAC1F50D','C90.32 ... in relapse',NULL,NULL,NULL,NULL,4,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,34,'Other pertinent findings'),(35,'0C978AB1068A79D587370CEC9F775F89','C90.32 ... in relapse',NULL,NULL,NULL,NULL,5,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,35,'Other pertinent findings'),(36,'94A9CA1B71E50ED44439AF65B8AD3712','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,36,'Other findings'),(37,'76A9441A8F5C717B225ADE1D73C7C463','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,37,'Other findings'),(38,'12E70B9DDAEB93593CD112570E2C7512','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','','','',NULL,NULL,38,'Other findings'),(39,'860248E08339639E882A9565E4C6F72E','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,39,'Other findings'),(40,'EF7319107BFD7BA85FC8E0087B55D5A3','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,40,'Other findings'),(41,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,41,NULL),(42,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,42,NULL),(43,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,43,NULL),(44,'0374BBA5CF093077F3930310B1B6418E','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,11,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',44,NULL),(45,'1D0104740FFEBAE301D7D3CE159B95D2','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,12,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','','','','','',45,NULL),(46,'121E72A67D2B49040981E23E97BA32F0','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,13,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',46,NULL),(47,'8526D83DC01731A0B4754212116C8F3F','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,14,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',47,NULL),(48,'FF535DC5E13BA9048283D567ECD5BB53','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,15,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',48,NULL),(49,'579FF4FF7DE04374955E17BB3FE19D21','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,16,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','','','','','',49,NULL),(50,'65CC1E5C381E75891A816309F0F23D38','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,17,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',50,NULL),(51,'E7C06FB957646A91F2B1C27E2661304A','C92.Z Other myeloid leukemia',NULL,NULL,11,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',51,NULL),(52,'A8569AACBC9CE8CB2EE3F079FED72BF1','C92.Z Other myeloid leukemia',NULL,NULL,12,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',52,NULL),(53,'3AB14A2A57845C480D660B8CABC79A27','C92.Z Other myeloid leukemia',NULL,NULL,13,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','','','','','',53,NULL),(54,'15EC4768F2828529B93981AAEAC1F50D','C92.Z Other myeloid leukemia',NULL,NULL,14,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',54,NULL),(55,'0C978AB1068A79D587370CEC9F775F89','C92.Z Other myeloid leukemia',NULL,NULL,15,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',55,NULL),(56,'E9C3D77645D4C4FE53C6973D23626E88','C92.Z Other myeloid leukemia',NULL,NULL,16,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',56,NULL),(57,'6A12491244EAC0B5A022F57325D44315','C92.Z Other myeloid leukemia',NULL,NULL,17,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','','','','','',57,NULL),(58,'201F654B307982ED25D8C33D989F9146','C92.Z Other myeloid leukemia',NULL,NULL,18,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',58,NULL),(59,'DF629529E8B7C978BC9D363A854DD0D4','C92.Z Other myeloid leukemia',NULL,NULL,19,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',59,NULL),(60,'34E9E4E015025E2EBE03271EC7DC3C01','C92.Z Other myeloid leukemia',NULL,NULL,20,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',60,NULL),(61,'E7C06FB957646A91F2B1C27E2661304A','C92.Z Other myeloid leukemia',NULL,NULL,21,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',61,NULL),(62,'A8569AACBC9CE8CB2EE3F079FED72BF1','C92.Z Other myeloid leukemia',NULL,NULL,22,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',62,NULL),(63,'3AB14A2A57845C480D660B8CABC79A27','C92.Z Other myeloid leukemia',NULL,NULL,23,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','','','','','',63,NULL),(64,'15EC4768F2828529B93981AAEAC1F50D','C92.Z Other myeloid leukemia',NULL,NULL,24,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',64,NULL),(65,'0C978AB1068A79D587370CEC9F775F89','C92.Z Other myeloid leukemia',NULL,NULL,25,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',65,NULL),(66,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,66,NULL);
/*!40000 ALTER TABLE `clinicaldatatable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coagulationtestingtable`
--

DROP TABLE IF EXISTS `coagulationtestingtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coagulationtestingtable` (
  `CoagulationTestingID` int(11) NOT NULL AUTO_INCREMENT,
  `FactorVIIILevel` double NOT NULL,
  `FactorIXLevel` double NOT NULL,
  `InhibitorAssay` double NOT NULL,
  `BethesdaUnits` double NOT NULL,
  PRIMARY KEY (`CoagulationTestingID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coagulationtestingtable`
--

LOCK TABLES `coagulationtestingtable` WRITE;
/*!40000 ALTER TABLE `coagulationtestingtable` DISABLE KEYS */;
INSERT INTO `coagulationtestingtable` VALUES (1,1.3,1.4,1.5,1.6),(2,1.3,1.4,1.5,1.6),(3,1.3,1.4,1.5,1.6),(4,1.3,1.4,1.5,1.6),(5,1.3,1.4,1.5,1.6);
/*!40000 ALTER TABLE `coagulationtestingtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cytogeneticmolecularaapnhtable`
--

DROP TABLE IF EXISTS `cytogeneticmolecularaapnhtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cytogeneticmolecularaapnhtable` (
  `CytogeneticMolecularAAPNHID` int(11) NOT NULL AUTO_INCREMENT,
  `Result` blob,
  PRIMARY KEY (`CytogeneticMolecularAAPNHID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cytogeneticmolecularaapnhtable`
--

LOCK TABLES `cytogeneticmolecularaapnhtable` WRITE;
/*!40000 ALTER TABLE `cytogeneticmolecularaapnhtable` DISABLE KEYS */;
INSERT INTO `cytogeneticmolecularaapnhtable` VALUES (1,'ok'),(2,'ok'),(3,''),(4,'ok'),(5,'ok'),(6,'ok'),(7,''),(8,'ok'),(9,'ok'),(10,'ok'),(11,'ok'),(12,''),(13,'ok'),(14,'ok'),(15,'ok'),(16,''),(17,'ok');
/*!40000 ALTER TABLE `cytogeneticmolecularaapnhtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cytogeneticmolecularmdstable`
--

DROP TABLE IF EXISTS `cytogeneticmolecularmdstable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cytogeneticmolecularmdstable` (
  `CytogeneticMolecularMDSID` int(11) NOT NULL AUTO_INCREMENT,
  `Result` blob,
  PRIMARY KEY (`CytogeneticMolecularMDSID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cytogeneticmolecularmdstable`
--

LOCK TABLES `cytogeneticmolecularmdstable` WRITE;
/*!40000 ALTER TABLE `cytogeneticmolecularmdstable` DISABLE KEYS */;
INSERT INTO `cytogeneticmolecularmdstable` VALUES (1,'ok'),(2,'ok'),(3,''),(4,'ok'),(5,'ok'),(6,'ok'),(7,''),(8,'ok'),(9,'ok'),(10,'ok'),(11,'ok'),(12,''),(13,'ok'),(14,'ok'),(15,'ok'),(16,''),(17,'ok');
/*!40000 ALTER TABLE `cytogeneticmolecularmdstable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cytogeneticmoleculartable`
--

DROP TABLE IF EXISTS `cytogeneticmoleculartable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cytogeneticmoleculartable` (
  `CytogeneticMolecularID` int(11) NOT NULL AUTO_INCREMENT,
  `Result` blob,
  PRIMARY KEY (`CytogeneticMolecularID`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cytogeneticmoleculartable`
--

LOCK TABLES `cytogeneticmoleculartable` WRITE;
/*!40000 ALTER TABLE `cytogeneticmoleculartable` DISABLE KEYS */;
INSERT INTO `cytogeneticmoleculartable` VALUES (1,'ok'),(2,'ok'),(3,''),(4,'ok'),(5,'ok'),(6,'ok'),(7,'ok'),(8,''),(9,'ok'),(10,'ok'),(11,''),(12,'ok'),(13,'ok'),(14,'ok'),(15,''),(16,'Ok'),(17,''),(18,'Ok'),(19,'ok'),(20,'ok'),(21,''),(22,'ok'),(23,'ok'),(24,'ok'),(25,''),(26,'ok'),(27,'ok'),(28,'ok'),(29,'ok'),(30,'ok'),(31,''),(32,'ok'),(33,'ok'),(34,'Ok');
/*!40000 ALTER TABLE `cytogeneticmoleculartable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diseasestatustable`
--

DROP TABLE IF EXISTS `diseasestatustable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diseasestatustable` (
  `DiseaseStatusID` int(11) NOT NULL AUTO_INCREMENT,
  `DiseaseStatus` blob NOT NULL,
  `RelapseDisease` blob,
  `OtherDisease` blob,
  PRIMARY KEY (`DiseaseStatusID`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diseasestatustable`
--

LOCK TABLES `diseasestatustable` WRITE;
/*!40000 ALTER TABLE `diseasestatustable` DISABLE KEYS */;
INSERT INTO `diseasestatustable` VALUES (1,'Others','','Disease Status'),(2,'Others','','Disease Status'),(3,'Others','','Disease Status'),(4,'Others','','Disease Status'),(5,'Others','','Disease Status'),(6,'Others','','Disease Status'),(7,'Others','','Disease Status'),(8,'Others','','Disease Status'),(9,'Others','','Disease Status'),(10,'Others','','Disease Status'),(11,'Stable','',''),(12,'Stable','',''),(13,'Stable','',''),(14,'Stable','',''),(15,'Stable','',''),(16,'Others','','Disease Status'),(17,'Others','','Disease Status'),(18,'Others','','Disease Status'),(19,'Others','','Disease Status'),(20,'Others','','Disease Status'),(21,'PR (Partial Response)','',''),(22,'PR (Partial Response)','',''),(23,'PR (Partial Response)','',''),(24,'PR (Partial Response)','',''),(25,'PR (Partial Response)','',''),(26,'SD (Stable Disease)','',''),(27,'SD (Stable Disease)','',''),(28,'SD (Stable Disease)','',''),(29,'SD (Stable Disease)','',''),(30,'SD (Stable Disease)','',''),(31,'Others','','Disease Status'),(32,'Others','','Disease Status'),(33,'Others','','Disease Status'),(34,'Others','','Disease Status'),(35,'Others','','Disease Status'),(36,'Persistent ITP &#40;between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy&#41;','',''),(37,'Persistent ITP &#40;between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy&#41;','',''),(38,'Persistent ITP &#40;between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy&#41;','',''),(39,'Persistent ITP &#40;between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy&#41;','',''),(40,'Persistent ITP &#40;between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy&#41;','',''),(41,'Others',NULL,'Other Disease'),(42,'Others',NULL,'Other Disease'),(43,'Others',NULL,'Other Disease'),(44,'Others','','Disease Status'),(45,'Others','','Disease Status'),(46,'Others','','Disease Status'),(47,'Others','','Disease Status'),(48,'Others','','Disease Status'),(49,'Others','','Disease Status'),(50,'Others','','Disease Status'),(51,'Newly Diagnosed','',''),(52,'Newly Diagnosed','',''),(53,'Newly Diagnosed','',''),(54,'CR (Complete Remission)','',''),(55,'CR (Complete Remission)','',''),(56,'nCR (near CR)','',''),(57,'nCR (near CR)','',''),(58,'nCR (near CR)','',''),(59,'nCR (near CR)','',''),(60,'nCR (near CR)','',''),(61,'PR (Partial Response)','',''),(62,'PR (Partial Response)','',''),(63,'PR (Partial Response)','',''),(64,'PR (Partial Response)','',''),(65,'PD (Progressive Disease)','',''),(66,'Others',NULL,'Other Disease');
/*!40000 ALTER TABLE `diseasestatustable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diseasetable`
--

DROP TABLE IF EXISTS `diseasetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diseasetable` (
  `DiseaseID` int(11) NOT NULL,
  `DiseaseName` varchar(100) NOT NULL,
  PRIMARY KEY (`DiseaseID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diseasetable`
--

LOCK TABLES `diseasetable` WRITE;
/*!40000 ALTER TABLE `diseasetable` DISABLE KEYS */;
INSERT INTO `diseasetable` VALUES (1,'AAPHSMDS'),(2,'COAGULATION DISEASE'),(3,'LEUKEMIA'),(4,'LYPHOMA'),(5,'MYELOPROLIFERATIVE NEOPLASM'),(6,'PLASMA CELL DISORDER'),(7,'PLATELET DISORDER');
/*!40000 ALTER TABLE `diseasetable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `familycancertable`
--

DROP TABLE IF EXISTS `familycancertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `familycancertable` (
  `FamilyCancerID` int(11) NOT NULL AUTO_INCREMENT,
  `ClinicalDataID` int(11) NOT NULL,
  `RelationshipToPatient` blob,
  `CancerName` blob,
  PRIMARY KEY (`FamilyCancerID`),
  KEY `FamilyCancerTable_fk0` (`ClinicalDataID`),
  CONSTRAINT `FamilyCancerTable_fk0` FOREIGN KEY (`ClinicalDataID`) REFERENCES `clinicaldatatable` (`ClinicalDataID`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `familycancertable`
--

LOCK TABLES `familycancertable` WRITE;
/*!40000 ALTER TABLE `familycancertable` DISABLE KEYS */;
INSERT INTO `familycancertable` VALUES (1,1,'Relationship to Patient','Specify Cancer'),(2,2,'Relationship to Patient','Specify Cancer'),(3,3,'',''),(4,4,'Relationship to Patient','Specify Cancer'),(5,5,'Relationship to Patient','Specify Cancer'),(6,6,'Relationship to Patient','Specify Cancer'),(7,7,'',''),(8,8,'Relationship to Patient','Specify Cancer'),(9,9,'Relationship to Patient','Specify Cancer'),(10,10,'Relationship to Patient','Specify Cancer'),(11,11,'',''),(12,12,'Relationship to Patient','Specify Cancer'),(13,13,'Relationship to Patient','Specify Cancer'),(14,14,'Relationship to Patient','Specify Cancer'),(15,15,'',''),(16,16,'Relationship to Patient','Specify Cancer'),(17,17,'Relationship to Patient','Specify Cancer'),(18,18,'',''),(19,19,'Relationship to Patient','Specify Cancer'),(20,20,'Relationship to Patient','Specify Cancer'),(21,21,'',''),(22,22,'Relationship to Patient','Specify Cancer'),(23,23,'Relationship to Patient','Specify Cancer'),(24,24,'Relationship to Patient','Specify Cancer'),(25,25,'',''),(26,26,'Relationship to Patient','Specify Cancer'),(27,27,'Relationship to Patient','Specify Cancer'),(28,28,'',''),(29,29,'Relationship to Patient','Specify Cancer'),(30,30,'Relationship to Patient','Specify Cancer'),(31,31,'',''),(32,32,'Relationship to Patient','Specify Cancer'),(33,33,'Relationship to Patient','Specify Cancer'),(34,34,'Relationship to Patient','Specify Cancer'),(35,35,'',''),(36,36,'Relationship to Patient','Specify Cancer'),(37,37,'Relationship to Patient','Specify Cancer'),(38,38,'',''),(39,39,'Relationship to Patient','Specify Cancer'),(40,40,'Relationship to Patient','Specify Cancer'),(41,44,'Relationship to Patient','Specify Cancer'),(42,45,'',''),(43,46,'Relationship to Patient','Specify Cancer'),(44,47,'Relationship to Patient','Specify Cancer'),(45,48,'Relationship to Patient','Specify Cancer'),(46,49,'',''),(47,50,'Relationship to Patient','Specify Cancer'),(48,51,'Relationship to Patient','Specify Cancer'),(49,52,'Relationship to Patient','Specify Cancer'),(50,53,'',''),(51,54,'Relationship to Patient','Specify Cancer'),(52,55,'Relationship to Patient','Specify Cancer'),(53,56,'Relationship to Patient','Specify Cancer'),(54,57,'',''),(55,58,'Relationship to Patient','Specify Cancer'),(56,59,'Relationship to Patient','Specify Cancer'),(57,60,'Relationship to Patient','Specify Cancer'),(58,61,'Relationship to Patient','Specify Cancer'),(59,62,'Relationship to Patient','Specify Cancer'),(60,63,'',''),(61,64,'Relationship to Patient','Specify Cancer'),(62,65,'Relationship to Patient','Specify Cancer');
/*!40000 ALTER TABLE `familycancertable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flowcytometrytable`
--

DROP TABLE IF EXISTS `flowcytometrytable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flowcytometrytable` (
  `FlowCytometryID` int(11) NOT NULL AUTO_INCREMENT,
  `Result` blob,
  PRIMARY KEY (`FlowCytometryID`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flowcytometrytable`
--

LOCK TABLES `flowcytometrytable` WRITE;
/*!40000 ALTER TABLE `flowcytometrytable` DISABLE KEYS */;
INSERT INTO `flowcytometrytable` VALUES (1,'ok'),(2,'ok'),(3,''),(4,'ok'),(5,'ok'),(6,'ok'),(7,''),(8,'ok'),(9,'ok'),(10,'ok'),(11,'ok'),(12,'ok'),(13,''),(14,'ok'),(15,'ok'),(16,''),(17,'ok'),(18,'ok'),(19,'ok'),(20,''),(21,'Ok'),(22,''),(23,'Ok'),(24,'ok'),(25,''),(26,'ok'),(27,'ok'),(28,'ok'),(29,''),(30,'ok'),(31,'ok'),(32,'ok'),(33,''),(34,'ok'),(35,'ok'),(36,'ok'),(37,''),(38,'ok'),(39,'ok'),(40,'ok'),(41,'ok'),(42,'ok'),(43,''),(44,'ok'),(45,'ok'),(46,'Ok');
/*!40000 ALTER TABLE `flowcytometrytable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `followuptable`
--

DROP TABLE IF EXISTS `followuptable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `followuptable` (
  `FollowUpID` int(11) NOT NULL AUTO_INCREMENT,
  `PatientID` int(11) DEFAULT NULL,
  `DateOfEntry` varchar(500) NOT NULL,
  `DateOfVisit` varchar(500) NOT NULL,
  `MedicalEventsID` int(11) DEFAULT NULL,
  `ClinicalDataID` int(11) DEFAULT NULL,
  `LaboratoryID` int(11) DEFAULT NULL,
  `DiseaseStatusID` int(11) DEFAULT NULL,
  `Notes` blob NOT NULL,
  PRIMARY KEY (`FollowUpID`),
  KEY `FollowUpTable_fk0` (`PatientID`),
  KEY `FollowUpTable_fk1` (`MedicalEventsID`),
  KEY `FollowUpTable_fk2` (`ClinicalDataID`),
  KEY `FollowUpTable_fk3` (`LaboratoryID`),
  KEY `FollowUpTable_fk4` (`DiseaseStatusID`),
  CONSTRAINT `FollowUpTable_fk0` FOREIGN KEY (`PatientID`) REFERENCES `patienttable` (`PatientID`),
  CONSTRAINT `FollowUpTable_fk1` FOREIGN KEY (`MedicalEventsID`) REFERENCES `medicaleventstable` (`MedicalEventsID`),
  CONSTRAINT `FollowUpTable_fk2` FOREIGN KEY (`ClinicalDataID`) REFERENCES `clinicaldatatable` (`ClinicalDataID`),
  CONSTRAINT `FollowUpTable_fk3` FOREIGN KEY (`LaboratoryID`) REFERENCES `laboratoryprofiletable` (`LaboratoryID`),
  CONSTRAINT `FollowUpTable_fk4` FOREIGN KEY (`DiseaseStatusID`) REFERENCES `diseasestatustable` (`DiseaseStatusID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `followuptable`
--

LOCK TABLES `followuptable` WRITE;
/*!40000 ALTER TABLE `followuptable` DISABLE KEYS */;
INSERT INTO `followuptable` VALUES (1,1,'697A044095ACC66DA86AB136B4AB0230','697A044095ACC66DA86AB136B4AB0230',1,41,41,41,'Special'),(2,1,'94A9CA1B71E50ED44439AF65B8AD3712','94A9CA1B71E50ED44439AF65B8AD3712',2,42,42,42,'Special'),(3,1,'76A9441A8F5C717B225ADE1D73C7C463','76A9441A8F5C717B225ADE1D73C7C463',3,43,43,43,'Special'),(4,1,'697A044095ACC66DA86AB136B4AB0230','697A044095ACC66DA86AB136B4AB0230',4,66,66,66,'Special');
/*!40000 ALTER TABLE `followuptable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generaldatatable`
--

DROP TABLE IF EXISTS `generaldatatable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `generaldatatable` (
  `GeneralDataID` int(11) NOT NULL AUTO_INCREMENT,
  `LastName` varchar(500) NOT NULL,
  `FirstName` varchar(500) NOT NULL,
  `MiddleName` varchar(500) DEFAULT NULL,
  `Gender` int(11) NOT NULL,
  `DateOfBirth` varchar(500) DEFAULT NULL,
  `DateOfEntry` varchar(500) NOT NULL,
  `AddressID` int(11) NOT NULL,
  `TissueSpecimenID` int(11) DEFAULT NULL,
  PRIMARY KEY (`GeneralDataID`),
  KEY `GeneralDataTable_fk0` (`AddressID`),
  KEY `GeneralDataTable_fk1` (`TissueSpecimenID`),
  CONSTRAINT `GeneralDataTable_fk0` FOREIGN KEY (`AddressID`) REFERENCES `addresstable` (`AddressID`),
  CONSTRAINT `GeneralDataTable_fk1` FOREIGN KEY (`TissueSpecimenID`) REFERENCES `tissuespecimentable` (`TissueSpecimenID`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generaldatatable`
--

LOCK TABLES `generaldatatable` WRITE;
/*!40000 ALTER TABLE `generaldatatable` DISABLE KEYS */;
INSERT INTO `generaldatatable` VALUES (1,'D90EA9A185882FFBFAFC349F67B632F4','5FF019A258E7611C838C0C1FD551CC48','27E283A626EC8D4297FAC657866AC20E',1,'A0DF190B9F140041CBF87E75FF732BE7','E7C06FB957646A91F2B1C27E2661304A',1,1),(2,'CD2FCD433FBD14D80B3F5FD7E97C777D','59BF8BDB0914DB7ECE6F4C9DE532FEA9','5DDDDA60A16D63E543E5A97C47F1F507',1,'48967B1D230FD6A37F671E9B24E66813','A8569AACBC9CE8CB2EE3F079FED72BF1',2,2),(3,'4165CEEA4D1FEBDF971DA483DE0D37DA','E61FA3E774D62832FF9BA23B441B49FF','2DA4B42FEFDC494E8AC32EC10145AB35',1,'50FA0526E3F2ECDF70178768F57030C7','3AB14A2A57845C480D660B8CABC79A27',3,3),(4,'38FDC8A2C62A9FB15C2AA93F94587BCF','A18D7BD7946D18D9BC3FF2419A7D2E6C','C7CA707E83B31EB72EAB419695C62AED',1,'90A290CC51D9FED2B542A2F79B6887BC','15EC4768F2828529B93981AAEAC1F50D',4,4),(5,'71EA5F644276992502AA7C3FE325DA20','C9F589DAF6903BB38CF043AB94C18408','8A62B5A3F9375DEA9DD2011C67144C9C',1,'59764123B7B98CD835A9E4404EAC9E5F','0C978AB1068A79D587370CEC9F775F89',5,5),(6,'900011C213693C3FCE0B1A78EF9534C2','8423710E47908B1517BCEEFD7B090873','542B1967F8F239CFBC21E90DA53BB8D5',1,'38D768F5384CD9BF0514CE811B6D48F9','E9C3D77645D4C4FE53C6973D23626E88',6,6),(7,'C1FB1854F74DEC60ED3456754F993EDB','E23F4B1BF49DEE2785944D62306EBF7D','D04BACB343C150ACE5DC48FF3D90A8CF',1,'352CB1132930AE1FAA3E95FFAD92448A','6A12491244EAC0B5A022F57325D44315',7,7),(8,'5A5AAEDAA28A1595A7CD6A9310D17023','78B9917416B06A2AC24E7FB65C291638','9254EC196E9B56A6A3F0A3B9D9B1471F',1,'1CE3D352E98FE7D0AA1700436E933E1A','201F654B307982ED25D8C33D989F9146',8,8),(9,'DDBB7E616FF72A436434A96FECF3ABEF','36D94C2FE9A7D98FD925FA60A3BEABAB','D04BACB343C150ACE5DC48FF3D90A8CF',1,'EA53FE511BD11EBACB0843C88D4300C2','DF629529E8B7C978BC9D363A854DD0D4',9,9),(10,'AB4BA01A15CBCCDF4E54A88C8E81B6C7','7752AC8577BA7AFA380D461C3F37811B','94A55855FBD589399E7EB73458E221F0',1,'C3C94B62B373C911D7A6D688AEC9BED0','34E9E4E015025E2EBE03271EC7DC3C01',10,10),(11,'00CDF366ED8276C35863955DD2E8C7D6','AF942C25DD1B19086534036E8A5E3245','94A55855FBD589399E7EB73458E221F0',1,'6659376EC9BD04F1E89F31ED90604EFD','E7C06FB957646A91F2B1C27E2661304A',11,NULL),(12,'E521C3FD3E25787407701DC653B20EC5','4C1529F773EB508DA6D673C6F4D849E0','542B1967F8F239CFBC21E90DA53BB8D5',1,'CA0178280762CA2B60F108A11CADAF58','A8569AACBC9CE8CB2EE3F079FED72BF1',12,NULL),(13,'2BFCAEC4EBA2422C8BB7BBB6C17604DB','C402BCAFFE98C4CC0D7922B7E6C2F9C3','D04BACB343C150ACE5DC48FF3D90A8CF',1,'F2C2EC02C71D5A67D96FD6B6390CE0D0','3AB14A2A57845C480D660B8CABC79A27',13,NULL),(14,'A38D933A73B1D5AF7C8C01D1440CBD75','18A0DAF6587E8224CEAC6704B73331FB','40F194421198082B5344EC2AAD35BA26',1,'FC26792CF909808C650B2AB31B43258E','15EC4768F2828529B93981AAEAC1F50D',14,NULL),(15,'B85F68DC473F2DAEEA53F296874C1B2D','262A209E9158746A06D5E66C79A0CE3D','D04BACB343C150ACE5DC48FF3D90A8CF',1,'347F9825A834FEF92DB3D387FE8F6D2F','0C978AB1068A79D587370CEC9F775F89',15,NULL),(16,'B1295BA548707FD7C43B77AE14E960AE','9282ABCE9DA0A4D3FBE1F42D335D47A6','D04BACB343C150ACE5DC48FF3D90A8CF',1,'69AB3A51C565FEF2ED51245E896CB37E','E7C06FB957646A91F2B1C27E2661304A',16,16),(17,'BE3D55346CDFFE8255C22A3EA1E32916','AA7911BEDD4E90655F81DC27DA486A2C','C7CA707E83B31EB72EAB419695C62AED',1,'8908483912EF33572025D91CFAD13A89','A8569AACBC9CE8CB2EE3F079FED72BF1',17,17),(18,'37EC805A28D5E23D564A1080DEFCDF69','DB9934F49C40CD3E1B963193CC0ABEBB','BF0F55AFD8C5DAEF97197BE14C42F67E',1,'7F885BB87A4EBF7FC16B8E0BA1DB3340','3AB14A2A57845C480D660B8CABC79A27',18,18),(19,'4159561456FE12F54F018B14F57E2F6F','A96D090F74668F3BEC0C4F883FBC927F','651E44CE92998780E8F945643EF6EC8F',1,'7FF5FB8688C1D428BC455C93BD44F54E','15EC4768F2828529B93981AAEAC1F50D',19,19),(20,'9AD8C8477A8C05EAA13E80EED172B0D4','A9A91CF1422563C07E48268915C88530','EE622E2D2907FFAB9801B9289DC727E7',1,'FC4948F8577631DCD1999D7120594EC6','0C978AB1068A79D587370CEC9F775F89',20,20),(21,'6E011107E7EE90186B6AE612E07BFB23','5E57B43D7D4ABAEE721C77682BEBEA8B','D04BACB343C150ACE5DC48FF3D90A8CF',1,'96B6E1F4FE9FB73B7201D5DFD31967C9','E7C06FB957646A91F2B1C27E2661304A',21,21),(22,'71F01137AB7AF3CCAC623D90A9F9ED7B','33F9AB14216AD9AC20C4E2CDF6DF3857','F8E30AB9D4F3F1C33996E147F1BA913B',1,'7D4AB9772E1397D02B3446419E14AF8F','A8569AACBC9CE8CB2EE3F079FED72BF1',22,22),(23,'84E2BBA7E130D4BD793C2CF488FFC502','A32E45FD90E163C960BB3EC1AE3D72FA','9254EC196E9B56A6A3F0A3B9D9B1471F',1,'58B0B9DD5B02B142DCAB2C65A4629412','3AB14A2A57845C480D660B8CABC79A27',23,23),(24,'7B39EB18AFEAA7BA919D405C7FC3E361','A33B7E8BFA98FE768CE13B6C75D3D886','2DA4B42FEFDC494E8AC32EC10145AB35',1,'FB4A3E08AEE18D83FA02A2E31D1C12E6','15EC4768F2828529B93981AAEAC1F50D',24,24),(25,'AA7911BEDD4E90655F81DC27DA486A2C','962E611F3199F79E19FA5F287B8E2547','2A0091B0A485744B59A2345DB0321344',1,'1B45B375174A99B28779B37FE2AC0A78','0C978AB1068A79D587370CEC9F775F89',25,25),(26,'999F15EFF4FD58DD0F64386C4BE7FBA9','A0E84B0F0F8BE285A245805F15C9991C','40F194421198082B5344EC2AAD35BA26',1,'E77C8609E9F867C3D61910DBF59FD16A','E7C06FB957646A91F2B1C27E2661304A',26,26),(27,'D19BF0E10D583946127DFE4406A2BFB2','83D394F2CCAEF826F15D1FAC504DA361','651E44CE92998780E8F945643EF6EC8F',1,'F5292918CE56DEF28E58365628C0BBF0','A8569AACBC9CE8CB2EE3F079FED72BF1',27,27),(28,'08D887870C4E1DAD47AB73FE908D1596','E81B20D327A2A692AC7486004D5EBB94','D04BACB343C150ACE5DC48FF3D90A8CF',1,'A28112917EF53A274B952EDBB4119CFA','3AB14A2A57845C480D660B8CABC79A27',28,28),(29,'D01D7F019530401F64EC26EF81CA1E68','65BC5BAB61E57ED2A41664BC4B9F939C','B697A8216D6AA1AC85B5BD0287BABB6D',1,'56855F777F062EA01E19EE8E64F7283D','15EC4768F2828529B93981AAEAC1F50D',29,29),(30,'B92EB0AC7C7C9BA9244B3B1A37737794','F727A71D3788270159D3FE33CB6E611C','94A55855FBD589399E7EB73458E221F0',1,'EE942863D1CC950093C90433E6CC285F','0C978AB1068A79D587370CEC9F775F89',30,30),(31,'59C36091DAD28771B7BF619411B6AA8C','E715C484F30FE3F897E02F14B0406042','EE622E2D2907FFAB9801B9289DC727E7',1,'879057FA92B08006574126E61DAD075D','E7C06FB957646A91F2B1C27E2661304A',31,31),(32,'D61C5DE35EF42D081296767EB8149E25','AD66A1EDC797F3BE98C3D5174ECFC4A5','2A0091B0A485744B59A2345DB0321344',1,'583ABCDE78BAAA9AA02BD8CBC3C7A36E','A8569AACBC9CE8CB2EE3F079FED72BF1',32,32),(33,'6CF5F4D1A2B4635DC16569693EF21F8D','BBEAF6A581874338EBD8E914D287C1CC','2DA4B42FEFDC494E8AC32EC10145AB35',1,'E1B0ABC5EE7963F16A1DFC19B0AD7A20','3AB14A2A57845C480D660B8CABC79A27',33,33),(34,'E8A99F8C2BB949B0DB5009C8683DC8CC','889D934670D36409CC4CAE64691AB441','D04BACB343C150ACE5DC48FF3D90A8CF',1,'6F0AB28EF35ADBB818C4112A23FF0981','15EC4768F2828529B93981AAEAC1F50D',34,34),(35,'EB93A33712B5BADA0500E6EBFBF7A300','0C7E8943013913118D6CE38B86FEC57D','5DDDDA60A16D63E543E5A97C47F1F507',2,'211D1162F3E800CCA350DA49CED81EBB','0C978AB1068A79D587370CEC9F775F89',35,35),(36,'D611F96DC35DB167FBBBAA2601765414','EC8EA9157F2C4692708643EDE1DD9B0C','5DDDDA60A16D63E543E5A97C47F1F507',2,'E5EBB10B5FAA42036B8C89C14BAEB0B3','E7C06FB957646A91F2B1C27E2661304A',36,NULL),(37,'B028E675C9900C3F6CFB3317428343F3','06BD02D4DB2D650EF9B8B0C0A17DDA47','C7CA707E83B31EB72EAB419695C62AED',2,'3716F5A4A50FC18EBFAC7463A5F17D0D','A8569AACBC9CE8CB2EE3F079FED72BF1',37,NULL),(38,'421B2B44EDA94B90F7C161CF18C7C3C0','45BBDF9EF220D6061593AA789A79F7E1','C7CA707E83B31EB72EAB419695C62AED',2,'3EE7964A0ECAE7AA012405BF11260E35','3AB14A2A57845C480D660B8CABC79A27',38,NULL),(39,'A88A402EA362E541983A5A0BA57D5A08','40E8FDB2EEC7E0C3A398340293A9B676','E59F6660DBBD9B33983C9963E7093FAF',2,'6E86B234FD996A4205A76CC04AC75C09','15EC4768F2828529B93981AAEAC1F50D',39,NULL),(40,'C9AA19C758847044D46D33645D3C51A8','4CDC4FEC9A44FCEA1DF077D62C97A86B','4AD22DA90B4E8AB219859A6D80B9221F',2,'898F540869E88CDC3E67B89BD68F872F','0C978AB1068A79D587370CEC9F775F89',40,NULL),(41,'CD2FCD433FBD14D80B3F5FD7E97C777D','59BF8BDB0914DB7ECE6F4C9DE532FEA9','5DDDDA60A16D63E543E5A97C47F1F507',1,'280BF2FCDD122328268D514985574A16','A8569AACBC9CE8CB2EE3F079FED72BF1',41,41),(42,'4165CEEA4D1FEBDF971DA483DE0D37DA','E61FA3E774D62832FF9BA23B441B49FF','2DA4B42FEFDC494E8AC32EC10145AB35',1,'1B9C0333A7F1A087357D75E0F637CDD7','3AB14A2A57845C480D660B8CABC79A27',42,42),(43,'38FDC8A2C62A9FB15C2AA93F94587BCF','A18D7BD7946D18D9BC3FF2419A7D2E6C','C7CA707E83B31EB72EAB419695C62AED',1,'179F914E0F95D1C36B2CD3945C9BE8C2','15EC4768F2828529B93981AAEAC1F50D',43,43),(44,'71EA5F644276992502AA7C3FE325DA20','C9F589DAF6903BB38CF043AB94C18408','8A62B5A3F9375DEA9DD2011C67144C9C',1,'FB636F22B8719A1B30B62C8CD8D41931','0C978AB1068A79D587370CEC9F775F89',44,44),(45,'900011C213693C3FCE0B1A78EF9534C2','8423710E47908B1517BCEEFD7B090873','542B1967F8F239CFBC21E90DA53BB8D5',1,'8EE666CFFB669FFA71B7C61D9B1FF28E','E9C3D77645D4C4FE53C6973D23626E88',45,45),(46,'C1FB1854F74DEC60ED3456754F993EDB','E23F4B1BF49DEE2785944D62306EBF7D','D04BACB343C150ACE5DC48FF3D90A8CF',1,'ADD54F6E555374462AEAAA3FF3B0DC75','6A12491244EAC0B5A022F57325D44315',46,46),(47,'5A5AAEDAA28A1595A7CD6A9310D17023','78B9917416B06A2AC24E7FB65C291638','9254EC196E9B56A6A3F0A3B9D9B1471F',1,'8A913E78DE2B9890E9289C1056456612','201F654B307982ED25D8C33D989F9146',47,47),(48,'3BB608A05F6AF96770C3825B4480255B','CBF4BFD963B7E43F4F33DCC852CC697A','D04BACB343C150ACE5DC48FF3D90A8CF',2,'0A4259524AF678E2F9A48BCEF3FD646C','E7C06FB957646A91F2B1C27E2661304A',48,48),(49,'D9B5BAA0A0701E04189CB9AD5046D324','F0E1CDAE97A5470517D17CD993386387','9254EC196E9B56A6A3F0A3B9D9B1471F',2,'6B1E3CC2C82DFC7E28D5FB679E0D6506','A8569AACBC9CE8CB2EE3F079FED72BF1',49,49),(50,'69DD0A25A4890872D757D06B7D60445C','4B655F1BA3B8C047BE8BA6453AA5655E','C7CA707E83B31EB72EAB419695C62AED',2,'76BEEC8958CACA8849FFB6D739139DF1','3AB14A2A57845C480D660B8CABC79A27',50,50),(51,'1F84E1ADB11C2CBF91B15CA48E4D77CA','14AB80A746F3A147800394368987CFFC','F8E30AB9D4F3F1C33996E147F1BA913B',2,'C958E49E72B886D91A08245DD83D75F8','15EC4768F2828529B93981AAEAC1F50D',51,51),(52,'B572B757265FB927D2990A5994D97700','6A834F5A32B2D8E5AEE74E1D95B4A8FB','4AD22DA90B4E8AB219859A6D80B9221F',2,'7D243AA01051B4F9414E583664370F5D','0C978AB1068A79D587370CEC9F775F89',52,52),(53,'C1CA01E441B805589E984D9F12892F8F','85013322D8CFA1420DCB892D996D0895','4AD22DA90B4E8AB219859A6D80B9221F',2,'844E43555BB22E187F5E6D40C2B165B4','E9C3D77645D4C4FE53C6973D23626E88',53,53),(54,'63F62532375FDDF6A879562B0CDFCD95','AE86E6AF014181E843AA4C3CA5403093','ABD8C547A461EDF853B1D0C2507A7420',2,'8637AED09041E44D6D87AF990BE5666C','6A12491244EAC0B5A022F57325D44315',54,54),(55,'CC002B1A8B816F8E029FAEC027A2A0D9','94A5C19AE2F5AAD31F74F19022A13BB8','B697A8216D6AA1AC85B5BD0287BABB6D',2,'2DB422BA9385FB6139790BA0EF35822B','201F654B307982ED25D8C33D989F9146',55,55),(56,'5F3213999916B0E1697B6207EDB644B8','1A35A9A5C5EB2A1D7DB78B4D3045E15B','40F194421198082B5344EC2AAD35BA26',2,'7C7BA9F053F5EF88259FA1644ACF6D36','DF629529E8B7C978BC9D363A854DD0D4',56,56),(57,'1F656B5868699ED9DA6FB59F2E490A53','918CA7EC9BA08E458CA7696F3D10A183','C7CA707E83B31EB72EAB419695C62AED',2,'C1EE5A01C2D955B08E5A120293DB2D23','34E9E4E015025E2EBE03271EC7DC3C01',57,57),(58,'0B3F322A1169830E7405A90DA34CD638','D123BC7DEE1C2138B89AFB55184A4B57','8A62B5A3F9375DEA9DD2011C67144C9C',2,'47C57D5D7D0753117F3EF7154AA567DA','E7C06FB957646A91F2B1C27E2661304A',58,58),(59,'F09734B052DCEF754A4E284D0644BD4C','4B563C9DFEB4E0B6033C3B788C6F383C','C7CA707E83B31EB72EAB419695C62AED',2,'65EF2976622CF04335A728D2EC444327','A8569AACBC9CE8CB2EE3F079FED72BF1',59,59),(60,'1E85F11540456496FBB71C0ADFB5543D','7127FE68E43FCCB17465BF2B84D310D4','84208254C6EA76E61E0FCF5EFD35CE72',2,'06817C4E9B3D2322B1BBFC0D2781F686','3AB14A2A57845C480D660B8CABC79A27',60,60),(61,'B43F03FCE5C5037DFCABA1CC44AA3474','BF86FBE7185E5FF2CDE3C78732702F05','EE622E2D2907FFAB9801B9289DC727E7',2,'9909B468698E96F25A33D713D02EE36F','15EC4768F2828529B93981AAEAC1F50D',61,61),(62,'95870D95B5F811371C925B111D3E77EF','A86D8354BC72430356FB17D81F264114','8A62B5A3F9375DEA9DD2011C67144C9C',2,'B98B209B6DF999D4522998750C921614','0C978AB1068A79D587370CEC9F775F89',62,62);
/*!40000 ALTER TABLE `generaldatatable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hematologytable`
--

DROP TABLE IF EXISTS `hematologytable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hematologytable` (
  `HematologyID` int(11) NOT NULL AUTO_INCREMENT,
  `Hemoglobin` double DEFAULT NULL,
  `Hematocrit` double DEFAULT NULL,
  `WhiteBloodCells` double DEFAULT NULL,
  `Neutrophils` double DEFAULT NULL,
  `Lymphocytes` double DEFAULT NULL,
  `Monocytes` double DEFAULT NULL,
  `Eosinophils` double DEFAULT NULL,
  `Basophils` double DEFAULT NULL,
  `Myelocytes` double DEFAULT NULL,
  `Metamyelocytes` double DEFAULT NULL,
  `Blasts` double DEFAULT NULL,
  `PlateletCount` double DEFAULT NULL,
  PRIMARY KEY (`HematologyID`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hematologytable`
--

LOCK TABLES `hematologytable` WRITE;
/*!40000 ALTER TABLE `hematologytable` DISABLE KEYS */;
INSERT INTO `hematologytable` VALUES (1,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(2,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(3,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(4,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(5,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(6,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(7,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(8,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(9,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(10,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(11,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(12,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(13,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(14,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(15,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(16,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(17,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(18,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(19,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(20,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(21,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(22,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(23,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(24,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(25,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(26,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(27,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(28,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(29,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(30,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(31,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(32,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(33,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(34,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(35,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(36,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(37,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(38,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(39,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(40,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(41,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(42,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(43,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(44,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(45,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(46,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(47,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(48,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(49,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(50,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(51,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(52,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(53,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(54,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(55,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(56,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(57,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(58,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(59,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(60,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(61,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(62,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(63,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(64,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(65,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(66,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2);
/*!40000 ALTER TABLE `hematologytable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hematopathologytable`
--

DROP TABLE IF EXISTS `hematopathologytable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hematopathologytable` (
  `HematopathologyID` int(11) NOT NULL AUTO_INCREMENT,
  `DatePerformed` blob,
  `Result` blob,
  PRIMARY KEY (`HematopathologyID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hematopathologytable`
--

LOCK TABLES `hematopathologytable` WRITE;
/*!40000 ALTER TABLE `hematopathologytable` DISABLE KEYS */;
INSERT INTO `hematopathologytable` VALUES (1,'',''),(2,'2011-02-02','Hematopathology review of slides'),(3,'2012-03-03','Hematopathology review of slides'),(4,'2013-04-04','Hematopathology review of slides'),(5,'','');
/*!40000 ALTER TABLE `hematopathologytable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `imagingstudiestable`
--

DROP TABLE IF EXISTS `imagingstudiestable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `imagingstudiestable` (
  `ImagingStudiesID` int(11) NOT NULL AUTO_INCREMENT,
  `Result` blob,
  PRIMARY KEY (`ImagingStudiesID`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `imagingstudiestable`
--

LOCK TABLES `imagingstudiestable` WRITE;
/*!40000 ALTER TABLE `imagingstudiestable` DISABLE KEYS */;
INSERT INTO `imagingstudiestable` VALUES (1,''),(2,'ok'),(3,'ok'),(4,'ok'),(5,''),(6,'ok'),(7,'ok'),(8,''),(9,'ok'),(10,'ok'),(11,''),(12,'ok'),(13,'ok'),(14,'ok'),(15,''),(16,''),(17,'ok'),(18,'ok'),(19,'ok'),(20,''),(21,'ok'),(22,'ok'),(23,''),(24,'ok'),(25,'ok'),(26,'ok'),(27,'ok'),(28,''),(29,'ok'),(30,'ok'),(31,'ok'),(32,''),(33,'ok'),(34,'ok'),(35,'ok'),(36,'ok'),(37,'ok'),(38,''),(39,'ok'),(40,'ok');
/*!40000 ALTER TABLE `imagingstudiestable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `immunohistochemistrytable`
--

DROP TABLE IF EXISTS `immunohistochemistrytable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `immunohistochemistrytable` (
  `ImmunohistochemistryID` int(11) NOT NULL AUTO_INCREMENT,
  `DatePerformed` blob,
  `Result` blob,
  PRIMARY KEY (`ImmunohistochemistryID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `immunohistochemistrytable`
--

LOCK TABLES `immunohistochemistrytable` WRITE;
/*!40000 ALTER TABLE `immunohistochemistrytable` DISABLE KEYS */;
INSERT INTO `immunohistochemistrytable` VALUES (1,'',''),(2,'2011-02-02','Immunohistochemistry of tissue'),(3,'2012-03-03','Immunohistochemistry of tissue'),(4,'2013-04-04','Immunohistochemistry of tissue'),(5,'','');
/*!40000 ALTER TABLE `immunohistochemistrytable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `issstagingtable`
--

DROP TABLE IF EXISTS `issstagingtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `issstagingtable` (
  `ISSStagingID` int(11) NOT NULL AUTO_INCREMENT,
  `ISSStagingName` varchar(100) NOT NULL,
  PRIMARY KEY (`ISSStagingID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issstagingtable`
--

LOCK TABLES `issstagingtable` WRITE;
/*!40000 ALTER TABLE `issstagingtable` DISABLE KEYS */;
INSERT INTO `issstagingtable` VALUES (1,'Stage II'),(2,'Stage II'),(3,'Stage II'),(4,'Stage II'),(5,'Stage II');
/*!40000 ALTER TABLE `issstagingtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laboratoryprofiletable`
--

DROP TABLE IF EXISTS `laboratoryprofiletable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laboratoryprofiletable` (
  `LaboratoryID` int(11) NOT NULL AUTO_INCREMENT,
  `DateOfBloodCollection` date NOT NULL,
  `HematologyID` int(11) DEFAULT NULL,
  `CoagulationTestingID` int(11) DEFAULT NULL,
  `BloodChemistryID` int(11) DEFAULT NULL,
  `OtherLaboratoriesID` int(11) DEFAULT NULL,
  `BoneMarrowAspirateID` int(11) DEFAULT NULL,
  `FlowCytometryID` int(11) DEFAULT NULL,
  `CytogeneticMolecularID` int(11) DEFAULT NULL,
  `CytogeneticMolecularAAPNHID` int(11) DEFAULT NULL,
  `CytogeneticMolecularMDSID` int(11) DEFAULT NULL,
  `ImagingStudiesID` int(11) DEFAULT NULL,
  `UpperGIEndoscopyID` int(11) DEFAULT NULL,
  `MolecularAnalysisID` int(11) DEFAULT NULL,
  `HematopathologyID` int(11) DEFAULT NULL,
  `ImmunohistochemistryID` int(11) DEFAULT NULL,
  `SerumFreeID` int(11) DEFAULT NULL,
  `SerumProteinID` int(11) DEFAULT NULL,
  `SerumImmunofixationID` int(11) DEFAULT NULL,
  `UrineProteinID` int(11) DEFAULT NULL,
  `ITP` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`LaboratoryID`),
  KEY `LaboratoryProfileTable_fk0` (`HematologyID`),
  KEY `LaboratoryProfileTable_fk1` (`BloodChemistryID`),
  KEY `LaboratoryProfileTable_fk2` (`OtherLaboratoriesID`),
  KEY `LaboratoryProfileTable_fk3` (`BoneMarrowAspirateID`),
  KEY `LaboratoryProfileTable_fk4` (`FlowCytometryID`),
  KEY `LaboratoryProfileTable_fk5` (`CytogeneticMolecularID`),
  KEY `LaboratoryProfileTable_fk6` (`CytogeneticMolecularAAPNHID`),
  KEY `LaboratoryProfileTable_fk7` (`CytogeneticMolecularMDSID`),
  KEY `LaboratoryProfileTable_fk8` (`ImagingStudiesID`),
  KEY `LaboratoryProfileTable_fk9` (`UpperGIEndoscopyID`),
  KEY `LaboratoryProfileTable_fk10` (`HematopathologyID`),
  KEY `LaboratoryProfileTable_fk11` (`ImmunohistochemistryID`),
  KEY `LaboratoryProfileTable_fk12` (`SerumFreeID`),
  KEY `LaboratoryProfileTable_fk13` (`SerumProteinID`),
  KEY `LaboratoryProfileTable_fk14` (`SerumImmunofixationID`),
  CONSTRAINT `LaboratoryProfileTable_fk0` FOREIGN KEY (`HematologyID`) REFERENCES `hematologytable` (`HematologyID`),
  CONSTRAINT `LaboratoryProfileTable_fk1` FOREIGN KEY (`BloodChemistryID`) REFERENCES `bloodchemistrytable` (`BloodChemistryID`),
  CONSTRAINT `LaboratoryProfileTable_fk10` FOREIGN KEY (`HematopathologyID`) REFERENCES `hematopathologytable` (`HematopathologyID`),
  CONSTRAINT `LaboratoryProfileTable_fk11` FOREIGN KEY (`ImmunohistochemistryID`) REFERENCES `immunohistochemistrytable` (`ImmunohistochemistryID`),
  CONSTRAINT `LaboratoryProfileTable_fk12` FOREIGN KEY (`SerumFreeID`) REFERENCES `serumfreetable` (`SerumFreeID`),
  CONSTRAINT `LaboratoryProfileTable_fk13` FOREIGN KEY (`SerumProteinID`) REFERENCES `serumproteintable` (`SerumProteinID`),
  CONSTRAINT `LaboratoryProfileTable_fk14` FOREIGN KEY (`SerumImmunofixationID`) REFERENCES `serumimmunofixationtable` (`SerumImmunofixationID`),
  CONSTRAINT `LaboratoryProfileTable_fk2` FOREIGN KEY (`OtherLaboratoriesID`) REFERENCES `otherlaboratoriestable` (`OtherLaboratoriesID`),
  CONSTRAINT `LaboratoryProfileTable_fk3` FOREIGN KEY (`BoneMarrowAspirateID`) REFERENCES `bonemarrowaspiratetable` (`BoneMarrowAspirateID`),
  CONSTRAINT `LaboratoryProfileTable_fk4` FOREIGN KEY (`FlowCytometryID`) REFERENCES `flowcytometrytable` (`FlowCytometryID`),
  CONSTRAINT `LaboratoryProfileTable_fk5` FOREIGN KEY (`CytogeneticMolecularID`) REFERENCES `cytogeneticmoleculartable` (`CytogeneticMolecularID`),
  CONSTRAINT `LaboratoryProfileTable_fk6` FOREIGN KEY (`CytogeneticMolecularAAPNHID`) REFERENCES `cytogeneticmolecularaapnhtable` (`CytogeneticMolecularAAPNHID`),
  CONSTRAINT `LaboratoryProfileTable_fk7` FOREIGN KEY (`CytogeneticMolecularMDSID`) REFERENCES `cytogeneticmolecularmdstable` (`CytogeneticMolecularMDSID`),
  CONSTRAINT `LaboratoryProfileTable_fk8` FOREIGN KEY (`ImagingStudiesID`) REFERENCES `imagingstudiestable` (`ImagingStudiesID`),
  CONSTRAINT `LaboratoryProfileTable_fk9` FOREIGN KEY (`UpperGIEndoscopyID`) REFERENCES `uppergiendoscopytable` (`UpperGIEndoscopyID`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboratoryprofiletable`
--

LOCK TABLES `laboratoryprofiletable` WRITE;
/*!40000 ALTER TABLE `laboratoryprofiletable` DISABLE KEYS */;
INSERT INTO `laboratoryprofiletable` VALUES (1,'2000-03-03',1,NULL,NULL,1,1,1,NULL,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'2000-03-03',2,NULL,NULL,2,2,2,NULL,2,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'2000-03-03',3,NULL,NULL,3,3,3,NULL,3,3,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'2000-03-03',4,NULL,NULL,4,4,4,NULL,4,4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'2000-03-03',5,NULL,NULL,5,5,5,NULL,5,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'2000-03-03',6,NULL,NULL,6,6,6,NULL,6,6,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'2000-03-03',7,NULL,NULL,7,7,7,NULL,7,7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'2000-03-03',8,NULL,NULL,8,8,8,NULL,8,8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'2000-03-03',9,NULL,NULL,9,9,9,NULL,9,9,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,'2000-03-03',10,NULL,NULL,10,10,10,NULL,10,10,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,'2000-03-03',11,1,1,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,'2000-03-03',12,2,2,NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,'2000-03-03',13,3,3,NULL,NULL,NULL,NULL,NULL,NULL,3,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,'2000-03-03',14,4,4,NULL,NULL,NULL,NULL,NULL,NULL,4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,'2000-03-03',15,5,5,NULL,NULL,NULL,NULL,NULL,NULL,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,'2000-03-03',16,NULL,6,NULL,11,11,1,NULL,NULL,6,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(17,'2000-03-03',17,NULL,7,NULL,12,12,2,NULL,NULL,7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(18,'2000-03-03',18,NULL,8,NULL,13,13,3,NULL,NULL,8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(19,'2000-03-03',19,NULL,9,NULL,14,14,4,NULL,NULL,9,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(20,'2000-03-03',20,NULL,10,NULL,15,15,5,NULL,NULL,10,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(21,'2000-03-03',21,NULL,11,NULL,16,16,NULL,10,NULL,11,NULL,NULL,1,1,NULL,NULL,NULL,NULL,NULL),(22,'2000-03-03',22,NULL,12,NULL,17,17,NULL,10,NULL,12,NULL,NULL,2,2,NULL,NULL,NULL,NULL,NULL),(23,'2000-03-03',23,NULL,13,NULL,18,18,NULL,10,NULL,13,NULL,NULL,3,3,NULL,NULL,NULL,NULL,NULL),(24,'2000-03-03',24,NULL,14,NULL,19,19,NULL,10,NULL,14,NULL,NULL,4,4,NULL,NULL,NULL,NULL,NULL),(25,'2000-03-03',25,NULL,15,NULL,20,20,NULL,10,NULL,15,NULL,NULL,5,5,NULL,NULL,NULL,NULL,NULL),(26,'2000-03-03',26,NULL,16,NULL,21,NULL,6,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(27,'2000-03-03',27,NULL,17,NULL,22,NULL,7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(28,'2000-03-03',28,NULL,18,NULL,23,NULL,8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(29,'2000-03-03',29,NULL,19,NULL,24,NULL,9,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(30,'2000-03-03',30,NULL,20,NULL,25,NULL,10,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(31,'2000-03-03',31,NULL,21,NULL,26,NULL,11,NULL,NULL,16,NULL,NULL,NULL,NULL,1,1,1,1,NULL),(32,'2000-03-03',32,NULL,22,NULL,27,NULL,12,NULL,NULL,17,NULL,NULL,NULL,NULL,2,2,2,2,NULL),(33,'2000-03-03',33,NULL,23,NULL,28,NULL,13,NULL,NULL,18,NULL,NULL,NULL,NULL,3,3,3,3,NULL),(34,'2000-03-03',34,NULL,24,NULL,29,NULL,14,NULL,NULL,19,NULL,NULL,NULL,NULL,4,4,4,4,NULL),(35,'2000-03-03',35,NULL,25,NULL,30,NULL,15,NULL,NULL,20,NULL,NULL,NULL,NULL,5,5,5,5,NULL),(36,'2000-03-03',36,NULL,26,NULL,31,NULL,NULL,NULL,NULL,21,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(37,'2000-03-03',37,NULL,27,NULL,32,NULL,NULL,NULL,NULL,22,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(38,'2000-03-03',38,NULL,28,NULL,33,NULL,NULL,NULL,NULL,23,3,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(39,'2000-03-03',39,NULL,29,NULL,34,NULL,NULL,NULL,NULL,24,4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(40,'2000-03-03',40,NULL,30,NULL,35,NULL,NULL,NULL,NULL,25,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(41,'2018-03-03',41,NULL,NULL,11,36,21,16,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(42,'2018-03-04',42,NULL,NULL,12,37,22,17,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(43,'2018-03-05',43,NULL,NULL,13,38,23,18,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(44,'2000-03-03',44,NULL,NULL,14,39,24,NULL,11,11,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(45,'2000-03-03',45,NULL,NULL,15,40,25,NULL,12,12,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(46,'2000-03-03',46,NULL,NULL,16,41,26,NULL,13,13,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(47,'2000-03-03',47,NULL,NULL,17,42,27,NULL,14,14,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(48,'2000-03-03',48,NULL,NULL,18,43,28,NULL,15,15,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(49,'2000-03-03',49,NULL,NULL,19,44,29,NULL,16,16,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(50,'2000-03-03',50,NULL,NULL,20,45,30,NULL,17,17,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51,'2000-03-03',51,NULL,31,NULL,46,31,19,NULL,NULL,26,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(52,'2000-03-03',52,NULL,32,NULL,47,32,20,NULL,NULL,27,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(53,'2000-03-03',53,NULL,33,NULL,48,33,21,NULL,NULL,28,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(54,'2000-03-03',54,NULL,34,NULL,49,34,22,NULL,NULL,29,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(55,'2000-03-03',55,NULL,35,NULL,50,35,23,NULL,NULL,30,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(56,'2000-03-03',56,NULL,36,NULL,51,36,24,NULL,NULL,31,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(57,'2000-03-03',57,NULL,37,NULL,52,37,25,NULL,NULL,32,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(58,'2000-03-03',58,NULL,38,NULL,53,38,26,NULL,NULL,33,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(59,'2000-03-03',59,NULL,39,NULL,54,39,27,NULL,NULL,34,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(60,'2000-03-03',60,NULL,40,NULL,55,40,28,NULL,NULL,35,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(61,'2000-03-03',61,NULL,41,NULL,56,41,29,NULL,NULL,36,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(62,'2000-03-03',62,NULL,42,NULL,57,42,30,NULL,NULL,37,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(63,'2000-03-03',63,NULL,43,NULL,58,43,31,NULL,NULL,38,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(64,'2000-03-03',64,NULL,44,NULL,59,44,32,NULL,NULL,39,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(65,'2000-03-03',65,NULL,45,NULL,60,45,33,NULL,NULL,40,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(66,'2018-03-03',66,NULL,NULL,21,61,46,34,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `laboratoryprofiletable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maintenancetherapytable`
--

DROP TABLE IF EXISTS `maintenancetherapytable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `maintenancetherapytable` (
  `MaintenanceTherapyID` int(11) NOT NULL AUTO_INCREMENT,
  `MaintenanceTherapyName` blob,
  `OtherMaintenanceTherapy` blob,
  PRIMARY KEY (`MaintenanceTherapyID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maintenancetherapytable`
--

LOCK TABLES `maintenancetherapytable` WRITE;
/*!40000 ALTER TABLE `maintenancetherapytable` DISABLE KEYS */;
INSERT INTO `maintenancetherapytable` VALUES (1,'Others','Other Regimens'),(2,'Others','Other Regimens'),(3,'Others','Other Regimens'),(4,'Others','Other Regimens'),(5,'Others','Other Regimens');
/*!40000 ALTER TABLE `maintenancetherapytable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicaleventstable`
--

DROP TABLE IF EXISTS `medicaleventstable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicaleventstable` (
  `MedicalEventsID` int(11) NOT NULL AUTO_INCREMENT,
  `HematologicMalignancy` blob,
  `OtherDiseaseMedication` blob,
  `FactorConcentrate` blob,
  `FactorConcentrateDates` blob,
  `FactorConcentrateDose` double DEFAULT NULL,
  `ProcedureIntervention` blob,
  `Chemotherapy` blob,
  PRIMARY KEY (`MedicalEventsID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicaleventstable`
--

LOCK TABLES `medicaleventstable` WRITE;
/*!40000 ALTER TABLE `medicaleventstable` DISABLE KEYS */;
INSERT INTO `medicaleventstable` VALUES (1,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(2,'','',NULL,NULL,NULL,'',''),(3,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(4,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy');
/*!40000 ALTER TABLE `medicaleventstable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicationstable`
--

DROP TABLE IF EXISTS `medicationstable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicationstable` (
  `MedicationsID` int(11) NOT NULL AUTO_INCREMENT,
  `ClinicalDataID` int(11) NOT NULL,
  `GenericName` varchar(300) DEFAULT NULL,
  `Dose` double DEFAULT NULL,
  `Frequency` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`MedicationsID`),
  KEY `MedicationsTable_fk0` (`ClinicalDataID`),
  CONSTRAINT `MedicationsTable_fk0` FOREIGN KEY (`ClinicalDataID`) REFERENCES `clinicaldatatable` (`ClinicalDataID`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicationstable`
--

LOCK TABLES `medicationstable` WRITE;
/*!40000 ALTER TABLE `medicationstable` DISABLE KEYS */;
INSERT INTO `medicationstable` VALUES (1,1,'Generic Name',0.1,'0.2'),(2,2,'Generic Name',0.1,'0.2'),(3,3,'',0,''),(4,4,'Generic Name',0.1,'0.2'),(5,5,'Generic Name',0.1,'0.2'),(6,6,'Generic Name',0.1,'0.2'),(7,7,'',0,''),(8,8,'Generic Name',0.1,'0.2'),(9,9,'Generic Name',0.1,'0.2'),(10,10,'Generic Name',0.1,'0.2'),(11,11,'',0,''),(12,12,'Generic Name',0.1,'0.2'),(13,13,'Generic Name',0.1,'0.2'),(14,14,'Generic Name',0.1,'0.2'),(15,15,'',0,''),(16,16,'Generic Name',0.1,'0.2'),(17,17,'Generic Name',0.1,'0.2'),(18,18,'',0,''),(19,19,'Generic Name',0.1,'0.2'),(20,20,'Generic Name',0.1,'0.2'),(21,21,'',0,''),(22,22,'Generic Name',0.1,'0.2'),(23,23,'Generic Name',0.1,'0.2'),(24,24,'Generic Name',0.1,'0.2'),(25,25,'',0,''),(26,26,'Generic Name',0.1,'0.2'),(27,27,'Generic Name',0.1,'0.2'),(28,28,'',0,''),(29,29,'Generic Name',0.1,'0.2'),(30,30,'Generic Name',0.1,'0.2'),(31,31,'',0,''),(32,32,'Generic Name',0.1,'0.2'),(33,33,'Generic Name',0.1,'0.2'),(34,34,'Generic Name',0.1,'0.2'),(35,35,'',0,''),(36,36,'Generic Name',0.1,'0.2'),(37,37,'Generic Name',0.1,'0.2'),(38,38,'',0,''),(39,39,'Generic Name',0.1,'0.2'),(40,40,'Generic Name',0.1,'0.2'),(41,44,'Generic Name',0.1,'0.2'),(42,45,'',0,''),(43,46,'Generic Name',0.1,'0.2'),(44,47,'Generic Name',0.1,'0.2'),(45,48,'Generic Name',0.1,'0.2'),(46,49,'',0,''),(47,50,'Generic Name',0.1,'0.2'),(48,51,'Generic Name',0.1,'0.2'),(49,52,'Generic Name',0.1,'0.2'),(50,53,'',0,''),(51,54,'Generic Name',0.1,'0.2'),(52,55,'Generic Name',0.1,'0.2'),(53,56,'Generic Name',0.1,'0.2'),(54,57,'',0,''),(55,58,'Generic Name',0.1,'0.2'),(56,59,'Generic Name',0.1,'0.2'),(57,60,'Generic Name',0.1,'0.2'),(58,61,'Generic Name',0.1,'0.2'),(59,62,'Generic Name',0.1,'0.2'),(60,63,'',0,''),(61,64,'Generic Name',0.1,'0.2'),(62,65,'Generic Name',0.1,'0.2');
/*!40000 ALTER TABLE `medicationstable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modeoftreatmenttable`
--

DROP TABLE IF EXISTS `modeoftreatmenttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modeoftreatmenttable` (
  `ModeOfTreatmentID` int(11) NOT NULL AUTO_INCREMENT,
  `ModeOfTreatment` varchar(100) DEFAULT NULL,
  `NameOfTreatment` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ModeOfTreatmentID`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modeoftreatmenttable`
--

LOCK TABLES `modeoftreatmenttable` WRITE;
/*!40000 ALTER TABLE `modeoftreatmenttable` DISABLE KEYS */;
INSERT INTO `modeoftreatmenttable` VALUES (1,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(2,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(3,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(4,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(5,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(6,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(7,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(8,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(9,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(10,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(11,'Others','Other Treatment 11'),(12,'Others','Other Treatment 12'),(13,'Others','Other Treatment 13'),(14,'Others','Other Treatment 14'),(15,'Others','Other Treatment 15'),(16,'Others','Others'),(17,'Others','Others'),(18,'Others','Others'),(19,'Others','Others'),(20,'Others','Others'),(21,'Supportive/Palliative','Supportive/Palliative'),(22,'Supportive/Palliative','Supportive/Palliative'),(23,'Supportive/Palliative','Supportive/Palliative'),(24,'Supportive/Palliative','Supportive/Palliative'),(25,'Supportive/Palliative','Supportive/Palliative'),(26,'Watch and Wait','Watch and Wait'),(27,'Watch and Wait','Watch and Wait'),(28,'Watch and Wait','Watch and Wait'),(29,'Watch and Wait','Watch and Wait'),(30,'Watch and Wait','Watch and Wait'),(31,'Others','Others'),(32,'Others','Others'),(33,'Others','Others'),(34,'Others','Others'),(35,'Others','Others'),(36,'Watch and Wait','Watch and Wait'),(37,'Watch and Wait','Watch and Wait'),(38,'Watch and Wait','Watch and Wait'),(39,'Watch and Wait','Watch and Wait'),(40,'Watch and Wait','Watch and Wait'),(41,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(42,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(43,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(44,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(45,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(46,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(47,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(48,'Pharmacologic 1st line','Pharmacologic 1st line'),(49,'Pharmacologic 1st line','Pharmacologic 1st line'),(50,'Pharmacologic 1st line','Pharmacologic 1st line'),(51,'Pharmacologic 1st line','Pharmacologic 1st line'),(52,'Pharmacologic 1st line','Pharmacologic 1st line'),(53,'Pharmacologic 1st line','Pharmacologic 1st line'),(54,'Pharmacologic 2nd line/Salvage','Pharmacologic 2nd line/Salvage'),(55,'Pharmacologic 2nd line/Salvage','Pharmacologic 2nd line/Salvage'),(56,'Pharmacologic 2nd line/Salvage','Pharmacologic 2nd line/Salvage'),(57,'Pharmacologic 2nd line/Salvage','Pharmacologic 2nd line/Salvage'),(58,'Pharmacologic 2nd line/Salvage','Pharmacologic 2nd line/Salvage'),(59,'Pharmacologic 2nd line/Salvage','Pharmacologic 2nd line/Salvage'),(60,'Pharmacologic 2nd line/Salvage','Pharmacologic 2nd line/Salvage'),(61,'Pharmacologic 2nd line/Salvage','Pharmacologic 2nd line/Salvage'),(62,'Pharmacologic 2nd line/Salvage','Pharmacologic 2nd line/Salvage');
/*!40000 ALTER TABLE `modeoftreatmenttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `otherdiseasestable`
--

DROP TABLE IF EXISTS `otherdiseasestable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `otherdiseasestable` (
  `OtherDiseasesID` int(11) NOT NULL AUTO_INCREMENT,
  `ClinicalDataID` int(11) NOT NULL,
  `OtherDiseases` blob,
  PRIMARY KEY (`OtherDiseasesID`),
  KEY `OtherDiseasesTable_fk0` (`ClinicalDataID`),
  CONSTRAINT `OtherDiseasesTable_fk0` FOREIGN KEY (`ClinicalDataID`) REFERENCES `clinicaldatatable` (`ClinicalDataID`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `otherdiseasestable`
--

LOCK TABLES `otherdiseasestable` WRITE;
/*!40000 ALTER TABLE `otherdiseasestable` DISABLE KEYS */;
INSERT INTO `otherdiseasestable` VALUES (1,1,'Other Diseases in the Family'),(2,2,'Other Diseases in the Family'),(3,3,''),(4,4,'Other Diseases in the Family'),(5,5,'Other Diseases in the Family'),(6,6,'Other Diseases in the Family'),(7,7,''),(8,8,'Other Diseases in the Family'),(9,9,'Other Diseases in the Family'),(10,10,'Other Diseases in the Family'),(11,11,''),(12,12,'Other Diseases in the Family'),(13,13,'Other Diseases in the Family'),(14,14,'Other Diseases in the Family'),(15,15,''),(16,16,'Other Diseases in the Family'),(17,17,'Other Diseases in the Family'),(18,18,''),(19,19,'Other Diseases in the Family'),(20,20,'Other Diseases in the Family'),(21,21,''),(22,22,'Other Diseases in the Family'),(23,23,'Other Diseases in the Family'),(24,24,'Other Diseases in the Family'),(25,25,''),(26,26,'Other Diseases in the Family'),(27,27,'Other Diseases in the Family'),(28,28,''),(29,29,'Other Diseases in the Family'),(30,30,'Other Diseases in the Family'),(31,31,''),(32,32,'Other Diseases in the Family'),(33,33,'Other Diseases in the Family'),(34,34,'Other Diseases in the Family'),(35,35,''),(36,36,'Other Diseases in the Family'),(37,37,'Other Diseases in the Family'),(38,38,''),(39,39,'Other Diseases in the Family'),(40,40,'Other Diseases in the Family'),(41,44,'Other Diseases in the Family'),(42,45,''),(43,46,'Other Diseases in the Family'),(44,47,'Other Diseases in the Family'),(45,48,'Other Diseases in the Family'),(46,49,''),(47,50,'Other Diseases in the Family'),(48,51,'Other Diseases in the Family'),(49,52,'Other Diseases in the Family'),(50,53,''),(51,54,'Other Diseases in the Family'),(52,55,'Other Diseases in the Family'),(53,56,'Other Diseases in the Family'),(54,57,''),(55,58,'Other Diseases in the Family'),(56,59,'Other Diseases in the Family'),(57,60,'Other Diseases in the Family'),(58,61,'Other Diseases in the Family'),(59,62,'Other Diseases in the Family'),(60,63,''),(61,64,'Other Diseases in the Family'),(62,65,'Other Diseases in the Family');
/*!40000 ALTER TABLE `otherdiseasestable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `otherlaboratoriestable`
--

DROP TABLE IF EXISTS `otherlaboratoriestable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `otherlaboratoriestable` (
  `OtherLaboratoriesID` int(11) NOT NULL AUTO_INCREMENT,
  `Creatinine` double DEFAULT NULL,
  `UricAcid` double DEFAULT NULL,
  `ReticulocyteCount` double DEFAULT NULL,
  `SerumIron` double DEFAULT NULL,
  `IronbindingCapacity` double DEFAULT NULL,
  `SerumFerritin` double DEFAULT NULL,
  `DirectAntiglobulin` varchar(10) DEFAULT NULL,
  `IndirectAntiglobulin` varchar(10) DEFAULT NULL,
  `SGOT` double DEFAULT NULL,
  `SGPT` double DEFAULT NULL,
  `LDH` double DEFAULT NULL,
  `ScreenTestHepatitis` varchar(10) DEFAULT NULL,
  `ScreenTestEBVCytomegalovirusHIV` varchar(10) DEFAULT NULL,
  `ErythropeitinLevel` double DEFAULT NULL,
  `SerumFolicAcid` double DEFAULT NULL,
  `SerumB12` double DEFAULT NULL,
  `TSH` double DEFAULT NULL,
  PRIMARY KEY (`OtherLaboratoriesID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `otherlaboratoriestable`
--

LOCK TABLES `otherlaboratoriestable` WRITE;
/*!40000 ALTER TABLE `otherlaboratoriestable` DISABLE KEYS */;
INSERT INTO `otherlaboratoriestable` VALUES (1,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(2,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(3,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(4,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(5,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(6,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(7,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(8,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(9,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(10,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(11,1.7,NULL,1.3,NULL,NULL,1.6,NULL,NULL,NULL,NULL,1.4,NULL,NULL,NULL,NULL,NULL,NULL),(12,1.7,NULL,1.3,NULL,NULL,1.6,NULL,NULL,NULL,NULL,1.4,NULL,NULL,NULL,NULL,NULL,NULL),(13,1.7,NULL,1.3,NULL,NULL,1.6,NULL,NULL,NULL,NULL,1.4,NULL,NULL,NULL,NULL,NULL,NULL),(14,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(15,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(16,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(17,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(18,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(19,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(20,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(21,1.7,NULL,1.3,NULL,NULL,1.6,NULL,NULL,NULL,NULL,1.4,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `otherlaboratoriestable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `othertreatmenttable`
--

DROP TABLE IF EXISTS `othertreatmenttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `othertreatmenttable` (
  `OtherTreatmentID` int(11) NOT NULL AUTO_INCREMENT,
  `Bisphosphonates` blob,
  `Radiotherapy` blob,
  `Dialysis` tinyint(1) DEFAULT NULL,
  `OtherMedications` blob,
  `Complications` blob,
  PRIMARY KEY (`OtherTreatmentID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `othertreatmenttable`
--

LOCK TABLES `othertreatmenttable` WRITE;
/*!40000 ALTER TABLE `othertreatmenttable` DISABLE KEYS */;
INSERT INTO `othertreatmenttable` VALUES (1,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(2,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(3,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(4,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(5,'Bisphosphonates','2',NULL,'Other Medications','Complications');
/*!40000 ALTER TABLE `othertreatmenttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patienttable`
--

DROP TABLE IF EXISTS `patienttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patienttable` (
  `PatientID` int(11) NOT NULL AUTO_INCREMENT,
  `DiseaseID` int(11) NOT NULL,
  `GeneralDataID` int(11) NOT NULL,
  `ClinicalDataID` int(11) NOT NULL,
  `LaboratoryID` int(11) NOT NULL,
  `TreatmentID` int(11) NOT NULL,
  `OtherTreatmentID` int(11) DEFAULT NULL,
  `Active` int(11) NOT NULL,
  `DiseaseStatusID` int(11) DEFAULT NULL,
  PRIMARY KEY (`PatientID`),
  KEY `PatientTable_fk0` (`DiseaseID`),
  KEY `PatientTable_fk1` (`GeneralDataID`),
  KEY `PatientTable_fk2` (`ClinicalDataID`),
  KEY `PatientTable_fk3` (`LaboratoryID`),
  KEY `PatientTable_fk4` (`TreatmentID`),
  KEY `PatientTable_fk5` (`OtherTreatmentID`),
  KEY `PatientTable_fk6` (`DiseaseStatusID`),
  CONSTRAINT `PatientTable_fk0` FOREIGN KEY (`DiseaseID`) REFERENCES `diseasetable` (`DiseaseID`),
  CONSTRAINT `PatientTable_fk1` FOREIGN KEY (`GeneralDataID`) REFERENCES `generaldatatable` (`GeneralDataID`),
  CONSTRAINT `PatientTable_fk2` FOREIGN KEY (`ClinicalDataID`) REFERENCES `clinicaldatatable` (`ClinicalDataID`),
  CONSTRAINT `PatientTable_fk3` FOREIGN KEY (`LaboratoryID`) REFERENCES `laboratoryprofiletable` (`LaboratoryID`),
  CONSTRAINT `PatientTable_fk4` FOREIGN KEY (`TreatmentID`) REFERENCES `treatmenttable` (`TreatmentID`),
  CONSTRAINT `PatientTable_fk5` FOREIGN KEY (`OtherTreatmentID`) REFERENCES `othertreatmenttable` (`OtherTreatmentID`),
  CONSTRAINT `PatientTable_fk6` FOREIGN KEY (`DiseaseStatusID`) REFERENCES `diseasestatustable` (`DiseaseStatusID`)
) ENGINE=InnoDB AUTO_INCREMENT=4732139 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patienttable`
--

LOCK TABLES `patienttable` WRITE;
/*!40000 ALTER TABLE `patienttable` DISABLE KEYS */;
INSERT INTO `patienttable` VALUES (1,1,1,1,1,1,NULL,1,1),(2,1,2,2,2,2,NULL,0,2),(3,1,3,3,3,3,NULL,1,3),(4,1,4,4,4,4,NULL,1,4),(5,1,5,5,5,5,NULL,0,5),(6,1,6,6,6,6,NULL,0,6),(7,1,7,7,7,7,NULL,1,7),(8,1,8,8,8,8,NULL,1,8),(9,1,9,9,9,9,NULL,1,9),(10,1,10,10,10,10,NULL,0,10),(11,2,11,11,11,11,NULL,1,NULL),(12,2,12,12,12,12,NULL,1,NULL),(13,2,13,13,13,13,NULL,0,NULL),(14,2,14,14,14,14,NULL,1,NULL),(15,2,15,15,15,15,NULL,1,NULL),(16,3,16,16,16,16,NULL,1,16),(17,3,17,17,17,17,NULL,1,17),(18,3,18,18,18,18,NULL,1,18),(19,3,19,19,19,19,NULL,1,19),(20,3,20,20,20,20,NULL,1,20),(21,4,21,21,21,21,NULL,1,21),(22,4,22,22,22,22,NULL,1,22),(23,4,23,23,23,23,NULL,1,23),(24,4,24,24,24,24,NULL,1,24),(25,4,25,25,25,25,NULL,1,25),(26,5,26,26,26,26,NULL,1,NULL),(27,5,27,27,27,27,NULL,1,NULL),(28,5,28,28,28,28,NULL,1,NULL),(29,5,29,29,29,29,NULL,1,NULL),(30,5,30,30,30,30,NULL,1,NULL),(31,6,31,31,31,31,1,1,31),(32,6,32,32,32,32,2,1,32),(33,6,33,33,33,33,3,1,33),(34,6,34,34,34,34,4,1,34),(35,6,35,35,35,35,5,1,35),(36,7,36,36,36,36,NULL,1,36),(37,7,37,37,37,37,NULL,1,37),(38,7,38,38,38,38,NULL,1,38),(39,7,39,39,39,39,NULL,1,39),(40,7,40,40,40,40,NULL,1,40),(41,1,41,44,44,41,NULL,1,44),(42,1,42,45,45,42,NULL,1,45),(43,1,43,46,46,43,NULL,1,46),(44,1,44,47,47,44,NULL,1,47),(45,1,45,48,48,45,NULL,1,48),(46,1,46,49,49,46,NULL,1,49),(4732123,1,47,50,50,47,NULL,1,50),(4732124,3,48,51,51,48,NULL,1,51),(4732125,3,49,52,52,49,NULL,1,52),(4732126,3,50,53,53,50,NULL,1,53),(4732127,3,51,54,54,51,NULL,1,54),(4732128,3,52,55,55,52,NULL,1,55),(4732129,3,53,56,56,53,NULL,1,56),(4732130,3,54,57,57,54,NULL,1,57),(4732131,3,55,58,58,55,NULL,1,58),(4732132,3,56,59,59,56,NULL,1,59),(4732133,3,57,60,60,57,NULL,1,60),(4732134,3,58,61,61,58,NULL,1,61),(4732135,3,59,62,62,59,NULL,1,62),(4732136,3,60,63,63,60,NULL,1,63),(4732137,3,61,64,64,61,NULL,1,64),(4732138,3,62,65,65,62,NULL,1,65);
/*!40000 ALTER TABLE `patienttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `physicalexamtable`
--

DROP TABLE IF EXISTS `physicalexamtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `physicalexamtable` (
  `PhysicalExamID` int(11) NOT NULL AUTO_INCREMENT,
  `Height` double DEFAULT NULL,
  `Weight` double DEFAULT NULL,
  `ECOG` double DEFAULT NULL,
  `Splenomegaly` double DEFAULT NULL,
  `Hepatomegaly` double DEFAULT NULL,
  `Lymphadenopathies` double DEFAULT NULL,
  `Hemarthroses` tinyint(1) DEFAULT NULL,
  `ContracturesAndMuscleAtrophy` tinyint(1) DEFAULT NULL,
  `ThrombosisHistory` blob,
  `Skin` blob,
  `PertinentFindings` tinyint(1) DEFAULT NULL,
  `OtherFindings` blob,
  PRIMARY KEY (`PhysicalExamID`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `physicalexamtable`
--

LOCK TABLES `physicalexamtable` WRITE;
/*!40000 ALTER TABLE `physicalexamtable` DISABLE KEYS */;
INSERT INTO `physicalexamtable` VALUES (1,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(2,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(3,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(4,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(5,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(6,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(7,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(8,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(9,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(10,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(11,50,50,NULL,NULL,NULL,NULL,0,0,NULL,NULL,NULL,'Other findings'),(12,50,50,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,'Other findings'),(13,50,50,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,'Other findings'),(14,50,50,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,'Other findings'),(15,50,50,NULL,NULL,NULL,NULL,0,0,NULL,NULL,NULL,'Other findings'),(16,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(17,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(18,50,50,50,0,0,0,NULL,NULL,NULL,NULL,NULL,'Other findings'),(19,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(20,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(21,50,50,50,0,0,0,NULL,NULL,NULL,NULL,NULL,'Other findings'),(22,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(23,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(24,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(25,50,50,50,0,0,0,NULL,NULL,NULL,NULL,NULL,'Other findings'),(26,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(27,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(28,50,50,50,0,0,0,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(29,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(30,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(31,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(32,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(33,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(34,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(35,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(36,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(37,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(38,50,50,NULL,0,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(39,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(40,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(41,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(42,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),(43,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(44,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(45,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(46,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(47,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(48,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(49,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(50,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(51,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(52,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(53,50,50,50,0,0,0,NULL,NULL,NULL,NULL,NULL,'Other findings'),(54,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(55,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(56,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(57,50,50,50,0,0,0,NULL,NULL,NULL,NULL,NULL,'Other findings'),(58,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(59,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(60,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(61,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(62,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(63,50,50,50,0,0,0,NULL,NULL,NULL,NULL,NULL,'Other findings'),(64,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(65,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(66,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL);
/*!40000 ALTER TABLE `physicalexamtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prognosticriskscoringtable`
--

DROP TABLE IF EXISTS `prognosticriskscoringtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prognosticriskscoringtable` (
  `PrognosticRiskScoringID` int(11) NOT NULL AUTO_INCREMENT,
  `PrognosticRiskScoringName` varchar(300) NOT NULL,
  `OtherPrognosticRiskScoring` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`PrognosticRiskScoringID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prognosticriskscoringtable`
--

LOCK TABLES `prognosticriskscoringtable` WRITE;
/*!40000 ALTER TABLE `prognosticriskscoringtable` DISABLE KEYS */;
INSERT INTO `prognosticriskscoringtable` VALUES (1,'Others',NULL),(2,'Others',NULL),(3,'Others',NULL),(4,'Others',NULL),(5,'Others',NULL);
/*!40000 ALTER TABLE `prognosticriskscoringtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regimennontransplanttable`
--

DROP TABLE IF EXISTS `regimennontransplanttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `regimennontransplanttable` (
  `RegimenNonTransplantID` int(11) NOT NULL AUTO_INCREMENT,
  `RegimenName` blob,
  `OtherRegimen` blob,
  PRIMARY KEY (`RegimenNonTransplantID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regimennontransplanttable`
--

LOCK TABLES `regimennontransplanttable` WRITE;
/*!40000 ALTER TABLE `regimennontransplanttable` DISABLE KEYS */;
INSERT INTO `regimennontransplanttable` VALUES (1,'Others','Other Regimens'),(2,'Others','Other Regimens'),(3,'Others','Other Regimens'),(4,'Others','Other Regimens'),(5,'Others','Other Regimens');
/*!40000 ALTER TABLE `regimennontransplanttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regimentable`
--

DROP TABLE IF EXISTS `regimentable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `regimentable` (
  `RegimenID` int(11) NOT NULL AUTO_INCREMENT,
  `RegimenName` blob,
  `OtherRegimen` blob,
  PRIMARY KEY (`RegimenID`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regimentable`
--

LOCK TABLES `regimentable` WRITE;
/*!40000 ALTER TABLE `regimentable` DISABLE KEYS */;
INSERT INTO `regimentable` VALUES (1,'Regimen/Protocol',''),(2,'Regimen/Protocol',''),(3,'Regimen/Protocol',''),(4,'Regimen/Protocol',''),(5,'Regimen/Protocol',''),(6,'Regimen/Protocol',''),(7,'Regimen/Protocol',''),(8,'Regimen/Protocol',''),(9,'Regimen/Protocol',''),(10,'Regimen/Protocol',''),(11,'Other Regimens','Other Regimens'),(12,'Other Regimens','Other Regimens'),(13,'Other Regimens','Other Regimens'),(14,'Other Regimens','Other Regimens'),(15,'Other Regimens','Other Regimens'),(16,'Regimen/Protocol',''),(17,'Regimen/Protocol',''),(18,'Regimen/Protocol',''),(19,'Regimen/Protocol',''),(20,'Regimen/Protocol',''),(21,'Regimen/Protocol',''),(22,'Regimen/Protocol',''),(23,'Regimen/Protocol',''),(24,'Regimen/Protocol',''),(25,'Regimen/Protocol',''),(26,'Regimen/Protocol',''),(27,'Regimen/Protocol',''),(28,'Regimen/Protocol',''),(29,'Regimen/Protocol',''),(30,'Regimen/Protocol',''),(31,'Regimen/Protocol',''),(32,'Regimen/Protocol',''),(33,'Regimen/Protocol',''),(34,'Regimen/Protocol',''),(35,'Regimen/Protocol','');
/*!40000 ALTER TABLE `regimentable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regimentransplanttable`
--

DROP TABLE IF EXISTS `regimentransplanttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `regimentransplanttable` (
  `RegimenTransplantID` int(11) NOT NULL AUTO_INCREMENT,
  `RegimenName` blob,
  `OtherRegimen` blob,
  PRIMARY KEY (`RegimenTransplantID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regimentransplanttable`
--

LOCK TABLES `regimentransplanttable` WRITE;
/*!40000 ALTER TABLE `regimentransplanttable` DISABLE KEYS */;
INSERT INTO `regimentransplanttable` VALUES (1,'Others','Other Regimens'),(2,'Others','Other Regimens'),(3,'Others','Other Regimens'),(4,'Others','Other Regimens'),(5,'Others','Other Regimens');
/*!40000 ALTER TABLE `regimentransplanttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riskscoretable`
--

DROP TABLE IF EXISTS `riskscoretable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `riskscoretable` (
  `RiskScoreID` int(11) NOT NULL AUTO_INCREMENT,
  `RiskScoreName` varchar(500) NOT NULL,
  `OtherRiskScore` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`RiskScoreID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riskscoretable`
--

LOCK TABLES `riskscoretable` WRITE;
/*!40000 ALTER TABLE `riskscoretable` DISABLE KEYS */;
INSERT INTO `riskscoretable` VALUES (1,'Intermediate Risk',''),(2,'Intermediate Risk',''),(3,'Intermediate Risk',''),(4,'Intermediate Risk',''),(5,'Intermediate Risk',''),(6,'Others','Risk Score Others'),(7,'Others','Risk Score Others'),(8,'Others','Risk Score Others'),(9,'Others','Risk Score Others'),(10,'Others','Risk Score Others'),(11,'Intermediate Risk',''),(12,'Intermediate Risk',''),(13,'Intermediate Risk',''),(14,'Intermediate Risk',''),(15,'Intermediate Risk',''),(16,'Intermediate Risk',''),(17,'Intermediate Risk',''),(18,'Intermediate Risk',''),(19,'Intermediate Risk',''),(20,'Intermediate Risk',''),(21,'Intermediate Risk',''),(22,'Intermediate Risk',''),(23,'Intermediate Risk',''),(24,'Intermediate Risk',''),(25,'Intermediate Risk','');
/*!40000 ALTER TABLE `riskscoretable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roletable`
--

DROP TABLE IF EXISTS `roletable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roletable` (
  `RoleID` int(11) NOT NULL,
  `RoleName` varchar(500) NOT NULL,
  PRIMARY KEY (`RoleID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roletable`
--

LOCK TABLES `roletable` WRITE;
/*!40000 ALTER TABLE `roletable` DISABLE KEYS */;
INSERT INTO `roletable` VALUES (1,'Admin'),(2,'Encoder');
/*!40000 ALTER TABLE `roletable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `serumfreetable`
--

DROP TABLE IF EXISTS `serumfreetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `serumfreetable` (
  `SerumFreeID` int(11) NOT NULL AUTO_INCREMENT,
  `Result` blob,
  PRIMARY KEY (`SerumFreeID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serumfreetable`
--

LOCK TABLES `serumfreetable` WRITE;
/*!40000 ALTER TABLE `serumfreetable` DISABLE KEYS */;
INSERT INTO `serumfreetable` VALUES (1,''),(2,'ok'),(3,'ok'),(4,'ok'),(5,'');
/*!40000 ALTER TABLE `serumfreetable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `serumimmunofixationtable`
--

DROP TABLE IF EXISTS `serumimmunofixationtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `serumimmunofixationtable` (
  `SerumImmunofixationID` int(11) NOT NULL AUTO_INCREMENT,
  `Result` blob,
  PRIMARY KEY (`SerumImmunofixationID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serumimmunofixationtable`
--

LOCK TABLES `serumimmunofixationtable` WRITE;
/*!40000 ALTER TABLE `serumimmunofixationtable` DISABLE KEYS */;
INSERT INTO `serumimmunofixationtable` VALUES (1,''),(2,'ok'),(3,'ok'),(4,'ok'),(5,'');
/*!40000 ALTER TABLE `serumimmunofixationtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `serumproteintable`
--

DROP TABLE IF EXISTS `serumproteintable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `serumproteintable` (
  `SerumProteinID` int(11) NOT NULL AUTO_INCREMENT,
  `Result` blob,
  PRIMARY KEY (`SerumProteinID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serumproteintable`
--

LOCK TABLES `serumproteintable` WRITE;
/*!40000 ALTER TABLE `serumproteintable` DISABLE KEYS */;
INSERT INTO `serumproteintable` VALUES (1,''),(2,'ok'),(3,'ok'),(4,'ok'),(5,'');
/*!40000 ALTER TABLE `serumproteintable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `severitytable`
--

DROP TABLE IF EXISTS `severitytable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `severitytable` (
  `SeverityID` int(11) NOT NULL AUTO_INCREMENT,
  `SeverityName` varchar(100) NOT NULL,
  PRIMARY KEY (`SeverityID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `severitytable`
--

LOCK TABLES `severitytable` WRITE;
/*!40000 ALTER TABLE `severitytable` DISABLE KEYS */;
INSERT INTO `severitytable` VALUES (1,'3'),(2,'3'),(3,'3'),(4,'3'),(5,'3');
/*!40000 ALTER TABLE `severitytable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tissuespecimentable`
--

DROP TABLE IF EXISTS `tissuespecimentable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tissuespecimentable` (
  `TissueSpecimenID` int(11) NOT NULL AUTO_INCREMENT,
  `TissueSpecimenName` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`TissueSpecimenID`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tissuespecimentable`
--

LOCK TABLES `tissuespecimentable` WRITE;
/*!40000 ALTER TABLE `tissuespecimentable` DISABLE KEYS */;
INSERT INTO `tissuespecimentable` VALUES (1,'BMA'),(2,'BB'),(3,''),(4,'BMA'),(5,'BB'),(6,'LN'),(7,''),(8,'BB'),(9,'LN'),(10,'LN'),(11,''),(12,''),(13,''),(14,''),(15,''),(16,'BMA'),(17,'BB'),(18,''),(19,'BMA'),(20,'BB'),(21,''),(22,'BB'),(23,'LN'),(24,'BMA'),(25,''),(26,'BMA'),(27,'BB'),(28,''),(29,'BMA'),(30,'BB'),(31,''),(32,'BB'),(33,'LN'),(34,'BMA'),(35,''),(36,''),(37,''),(38,''),(39,''),(40,''),(41,'BB'),(42,''),(43,'BMA'),(44,'BB'),(45,'LN'),(46,''),(47,'BB'),(48,'BMA'),(49,'BB'),(50,''),(51,'BMA'),(52,'BB'),(53,'LN'),(54,''),(55,'BB'),(56,'LN'),(57,'LN'),(58,'BMA'),(59,'BB'),(60,''),(61,'BMA'),(62,'BB');
/*!40000 ALTER TABLE `tissuespecimentable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tokentable`
--

DROP TABLE IF EXISTS `tokentable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tokentable` (
  `AccountID` int(11) NOT NULL,
  `Token` varchar(500) NOT NULL,
  `Expiration` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tokentable`
--

LOCK TABLES `tokentable` WRITE;
/*!40000 ALTER TABLE `tokentable` DISABLE KEYS */;
INSERT INTO `tokentable` VALUES (3,'3:4a4dd386f3b2dc1e','2018-04-05 12:42:55'),(3,'3:420d39382784f300','2018-04-05 12:43:13'),(3,'3:1f60706c23eec457','2018-04-05 12:43:21');
/*!40000 ALTER TABLE `tokentable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `treatmenttable`
--

DROP TABLE IF EXISTS `treatmenttable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `treatmenttable` (
  `TreatmentID` int(11) NOT NULL AUTO_INCREMENT,
  `Transplant` tinyint(1) DEFAULT NULL,
  `ModeOfTreatmentID` int(11) DEFAULT NULL,
  `ChemoMedicationID` int(11) DEFAULT NULL,
  `MaintenanceTherapyID` int(11) DEFAULT NULL,
  `RegimenID` int(11) DEFAULT NULL,
  `RegimenTransplantID` int(11) DEFAULT NULL,
  `RegimenNonTransplantID` int(11) DEFAULT NULL,
  `RegimenText` blob,
  `CycleNumber` int(11) DEFAULT NULL,
  `DateStarted` date DEFAULT NULL,
  `Complications` blob,
  PRIMARY KEY (`TreatmentID`),
  KEY `TreatmentTable_fk0` (`ModeOfTreatmentID`),
  KEY `TreatmentTable_fk1` (`ChemoMedicationID`),
  KEY `TreatmentTable_fk2` (`RegimenID`),
  KEY `TreatmentTable_fk3` (`RegimenTransplantID`),
  KEY `TreatmentTable_fk4` (`RegimenNonTransplantID`),
  KEY `TreatmentTable_fk5` (`MaintenanceTherapyID`),
  CONSTRAINT `TreatmentTable_fk0` FOREIGN KEY (`ModeOfTreatmentID`) REFERENCES `modeoftreatmenttable` (`ModeOfTreatmentID`),
  CONSTRAINT `TreatmentTable_fk1` FOREIGN KEY (`ChemoMedicationID`) REFERENCES `chemomedicationstable` (`ChemoMedicationID`),
  CONSTRAINT `TreatmentTable_fk2` FOREIGN KEY (`RegimenID`) REFERENCES `regimentable` (`RegimenID`),
  CONSTRAINT `TreatmentTable_fk3` FOREIGN KEY (`RegimenTransplantID`) REFERENCES `regimentransplanttable` (`RegimenTransplantID`),
  CONSTRAINT `TreatmentTable_fk4` FOREIGN KEY (`RegimenNonTransplantID`) REFERENCES `regimennontransplanttable` (`RegimenNonTransplantID`),
  CONSTRAINT `TreatmentTable_fk5` FOREIGN KEY (`MaintenanceTherapyID`) REFERENCES `maintenancetherapytable` (`MaintenanceTherapyID`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `treatmenttable`
--

LOCK TABLES `treatmenttable` WRITE;
/*!40000 ALTER TABLE `treatmenttable` DISABLE KEYS */;
INSERT INTO `treatmenttable` VALUES (1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,'2010-01-01',NULL),(2,1,2,2,NULL,NULL,NULL,NULL,NULL,NULL,'2011-02-02',NULL),(3,0,3,3,NULL,NULL,NULL,NULL,NULL,NULL,'2012-03-03',NULL),(4,1,4,4,NULL,NULL,NULL,NULL,NULL,NULL,'2013-04-04',NULL),(5,1,5,5,NULL,NULL,NULL,NULL,NULL,NULL,'2014-05-05',NULL),(6,1,6,6,NULL,NULL,NULL,NULL,NULL,NULL,'2010-01-06',NULL),(7,0,7,7,NULL,NULL,NULL,NULL,NULL,NULL,'2011-02-07',NULL),(8,1,8,8,NULL,NULL,NULL,NULL,NULL,NULL,'2012-03-08',NULL),(9,1,9,9,NULL,NULL,NULL,NULL,NULL,NULL,'2013-04-09',NULL),(10,1,10,10,NULL,NULL,NULL,NULL,NULL,NULL,'2014-05-10',NULL),(11,NULL,11,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,NULL,12,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,NULL,13,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,NULL,14,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,NULL,15,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,NULL,16,11,NULL,1,NULL,NULL,NULL,21,'2010-01-01',NULL),(17,NULL,17,12,NULL,2,NULL,NULL,NULL,22,'2011-02-02',NULL),(18,NULL,18,13,NULL,3,NULL,NULL,NULL,23,'2012-03-03',NULL),(19,NULL,19,14,NULL,4,NULL,NULL,NULL,24,'2013-04-04',NULL),(20,NULL,20,15,NULL,5,NULL,NULL,NULL,25,'2014-05-05',NULL),(21,NULL,21,16,NULL,6,NULL,NULL,NULL,31,'2010-01-01','Complications'),(22,NULL,22,17,NULL,7,NULL,NULL,NULL,32,'2011-02-02','Complications'),(23,NULL,23,18,NULL,8,NULL,NULL,NULL,33,'2012-03-03','Complications'),(24,NULL,24,19,NULL,9,NULL,NULL,NULL,34,'2013-04-04','Complications'),(25,NULL,25,20,NULL,10,NULL,NULL,NULL,35,'2014-05-05','Complications'),(26,NULL,26,21,NULL,NULL,NULL,NULL,NULL,NULL,'2010-01-01',NULL),(27,NULL,27,22,NULL,NULL,NULL,NULL,NULL,NULL,'2011-02-02',NULL),(28,NULL,28,23,NULL,NULL,NULL,NULL,NULL,NULL,'2012-03-03',NULL),(29,NULL,29,24,NULL,NULL,NULL,NULL,NULL,NULL,'2013-04-04',NULL),(30,NULL,30,25,NULL,NULL,NULL,NULL,NULL,NULL,'2014-05-05',NULL),(31,0,31,NULL,1,11,1,1,NULL,51,'2010-01-01','Complications'),(32,1,32,NULL,2,12,2,2,NULL,52,'2011-02-02','Complications'),(33,1,33,NULL,3,13,3,3,NULL,53,'2012-03-03','Complications'),(34,1,34,NULL,4,14,4,4,NULL,54,'2013-04-04','Complications'),(35,0,35,NULL,5,15,5,5,NULL,55,'2014-05-05','Complications'),(36,NULL,36,NULL,NULL,16,NULL,NULL,NULL,NULL,'2010-01-01','Complications'),(37,NULL,37,NULL,NULL,17,NULL,NULL,NULL,NULL,'2011-02-02','Complications'),(38,NULL,38,NULL,NULL,18,NULL,NULL,NULL,NULL,'2012-03-03','Complications'),(39,NULL,39,NULL,NULL,19,NULL,NULL,NULL,NULL,'2013-04-04','Complications'),(40,NULL,40,NULL,NULL,20,NULL,NULL,NULL,NULL,'2014-05-05','Complications'),(41,1,41,26,NULL,NULL,NULL,NULL,NULL,NULL,'2011-02-02',NULL),(42,0,42,27,NULL,NULL,NULL,NULL,NULL,NULL,'2012-03-03',NULL),(43,1,43,28,NULL,NULL,NULL,NULL,NULL,NULL,'2013-04-04',NULL),(44,1,44,29,NULL,NULL,NULL,NULL,NULL,NULL,'2014-05-05',NULL),(45,1,45,30,NULL,NULL,NULL,NULL,NULL,NULL,'2010-01-06',NULL),(46,0,46,31,NULL,NULL,NULL,NULL,NULL,NULL,'2011-02-07',NULL),(47,1,47,32,NULL,NULL,NULL,NULL,NULL,NULL,'2012-03-08',NULL),(48,NULL,48,33,NULL,21,NULL,NULL,NULL,1,'2010-01-01',NULL),(49,NULL,49,34,NULL,22,NULL,NULL,NULL,2,'2011-02-02',NULL),(50,NULL,50,35,NULL,23,NULL,NULL,NULL,3,'2012-03-03',NULL),(51,NULL,51,36,NULL,24,NULL,NULL,NULL,4,'2013-04-04',NULL),(52,NULL,52,37,NULL,25,NULL,NULL,NULL,5,'2014-05-05',NULL),(53,NULL,53,38,NULL,26,NULL,NULL,NULL,6,'2010-01-06',NULL),(54,NULL,54,39,NULL,27,NULL,NULL,NULL,7,'2011-02-07',NULL),(55,NULL,55,40,NULL,28,NULL,NULL,NULL,8,'2012-03-08',NULL),(56,NULL,56,41,NULL,29,NULL,NULL,NULL,9,'2013-04-09',NULL),(57,NULL,57,42,NULL,30,NULL,NULL,NULL,10,'2014-05-10',NULL),(58,NULL,58,43,NULL,31,NULL,NULL,NULL,1,'2010-01-01',NULL),(59,NULL,59,44,NULL,32,NULL,NULL,NULL,2,'2011-02-02',NULL),(60,NULL,60,45,NULL,33,NULL,NULL,NULL,3,'2012-03-03',NULL),(61,NULL,61,46,NULL,34,NULL,NULL,NULL,4,'2013-04-04',NULL),(62,NULL,62,47,NULL,35,NULL,NULL,NULL,5,'2014-05-05',NULL);
/*!40000 ALTER TABLE `treatmenttable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `uppergiendoscopytable`
--

DROP TABLE IF EXISTS `uppergiendoscopytable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `uppergiendoscopytable` (
  `UpperGIEndoscopyID` int(11) NOT NULL AUTO_INCREMENT,
  `DatePerformed` blob,
  `Description` blob,
  `HPylori` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`UpperGIEndoscopyID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uppergiendoscopytable`
--

LOCK TABLES `uppergiendoscopytable` WRITE;
/*!40000 ALTER TABLE `uppergiendoscopytable` DISABLE KEYS */;
INSERT INTO `uppergiendoscopytable` VALUES (1,'2010-01-01','Upper GI Endoscopy',1),(2,'2011-02-02','Upper GI Endoscopy',1),(3,'','',0),(4,'2013-04-04','Upper GI Endoscopy',1),(5,'2014-05-05','Upper GI Endoscopy',1);
/*!40000 ALTER TABLE `uppergiendoscopytable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `urineproteintable`
--

DROP TABLE IF EXISTS `urineproteintable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `urineproteintable` (
  `UrineProteinID` int(11) NOT NULL AUTO_INCREMENT,
  `Result` blob,
  PRIMARY KEY (`UrineProteinID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `urineproteintable`
--

LOCK TABLES `urineproteintable` WRITE;
/*!40000 ALTER TABLE `urineproteintable` DISABLE KEYS */;
INSERT INTO `urineproteintable` VALUES (1,''),(2,'ok'),(3,'ok'),(4,'ok'),(5,'');
/*!40000 ALTER TABLE `urineproteintable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-25 15:17:35
