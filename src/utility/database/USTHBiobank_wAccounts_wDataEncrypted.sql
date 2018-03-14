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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounttable`
--

LOCK TABLES `accounttable` WRITE;
/*!40000 ALTER TABLE `accounttable` DISABLE KEYS */;
INSERT INTO `accounttable` VALUES (1,'1','1','NAME','ADMIN','A.',1,1),(2,'2','2','NAME','ENCODER','B.',2,1),(3,'3','3','NAME','ADMIN','C.',1,1);
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
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addresstable`
--

LOCK TABLES `addresstable` WRITE;
/*!40000 ALTER TABLE `addresstable` DISABLE KEYS */;
INSERT INTO `addresstable` VALUES (1,'UST','USTH','BCI'),(2,'UST','USTH','BCI'),(3,'UST','USTH','BCI'),(4,'UST','USTH','BCI'),(5,'UST','USTH','BCI'),(6,'UST','USTH','BCI'),(7,'UST','USTH','BCI'),(8,'UST','USTH','BCI'),(9,'UST','USTH','BCI'),(10,'UST','USTH','BCI'),(11,'UST','USTH','BCI'),(12,'UST','USTH','BCI'),(13,'UST','USTH','BCI'),(14,'UST','USTH','BCI'),(15,'UST','USTH','BCI'),(16,'UST','USTH','BCI'),(17,'UST','USTH','BCI'),(18,'UST','USTH','BCI'),(19,'UST','USTH','BCI'),(20,'UST','USTH','BCI'),(21,'UST','USTH','BCI'),(22,'UST','USTH','BCI'),(23,'UST','USTH','BCI'),(24,'UST','USTH','BCI'),(25,'UST','USTH','BCI'),(26,'UST','USTH','BCI'),(27,'UST','USTH','BCI'),(28,'UST','USTH','BCI'),(29,'UST','USTH','BCI'),(30,'UST','USTH','BCI'),(31,'UST','USTH','BCI'),(32,'UST','USTH','BCI'),(33,'UST','USTH','BCI'),(34,'UST','USTH','BCI'),(35,'UST','USTH','BCI'),(36,'UST','USTH','BCI'),(37,'UST','USTH','BCI'),(38,'UST','USTH','BCI'),(39,'UST','USTH','BCI'),(40,'UST','USTH','BCI'),(41,'UST','USTH','BCI'),(42,'UST','USTH','BCI'),(43,'UST','USTH','BCI'),(44,'UST','USTH','BCI'),(45,'UST','USTH','BCI'),(46,'UST','USTH','BCI'),(47,'UST','USTH','BCI'),(48,'UST','USTH','BCI'),(49,'UST','USTH','BCI'),(50,'UST','USTH','BCI'),(51,'UST','USTH','BCI'),(52,'UST','USTH','BCI'),(53,'UST','USTH','BCI'),(54,'UST','USTH','BCI'),(55,'UST','USTH','BCI'),(56,'UST','USTH','BCI'),(57,'UST','USTH','BCI'),(58,'UST','USTH','BCI'),(59,'UST','USTH','BCI'),(60,'UST','USTH','BCI'),(61,'UST','USTH','BCI'),(62,'UST','USTH','BCI'),(63,'UST','USTH','BCI'),(64,'UST','USTH','BCI'),(65,'UST','USTH','BCI'),(66,'UST','USTH','BCI'),(67,'UST','USTH','BCI'),(68,'UST','USTH','BCI'),(69,'UST','USTH','BCI'),(70,'UST','USTH','BCI');
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
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
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bloodchemistrytable`
--

LOCK TABLES `bloodchemistrytable` WRITE;
/*!40000 ALTER TABLE `bloodchemistrytable` DISABLE KEYS */;
INSERT INTO `bloodchemistrytable` VALUES (1,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(17,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(18,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(19,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(20,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(21,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(22,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(23,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(24,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(25,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(26,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(27,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(28,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(29,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(30,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,3,3.2,3.3,3.8,3.9,4.1,NULL,NULL,NULL,NULL,NULL,NULL),(31,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(32,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(33,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(34,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(35,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(36,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(37,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(38,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(39,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(40,NULL,1.8,1.9,3.4,3.5,4,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(41,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(42,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(43,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(44,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(45,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(46,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(47,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(48,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(49,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(50,1.7,1.8,1.9,NULL,NULL,4,NULL,2.7,2.8,NULL,NULL,NULL,3.8,NULL,NULL,2.6,3.1,3.6,3.7,NULL,NULL),(51,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(52,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(53,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(54,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(55,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(56,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(57,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(58,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(59,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(60,NULL,1.8,1.9,3.4,3.5,4,NULL,2.7,2.8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4.2,4.3),(61,NULL,NULL,NULL,NULL,NULL,1.4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1.5,NULL,NULL,NULL,NULL,NULL,NULL),(62,NULL,NULL,NULL,NULL,NULL,1.4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1.5,NULL,NULL,NULL,NULL,NULL,NULL),(63,NULL,NULL,NULL,NULL,NULL,1.4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1.5,NULL,NULL,NULL,NULL,NULL,NULL),(64,NULL,1.7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1.8,1.9,2,2.1,NULL,NULL),(65,NULL,1.7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1.8,1.9,2,2.1,NULL,NULL),(66,NULL,1.7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1.8,1.9,2,2.1,NULL,NULL),(67,NULL,1.7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1.8,1.9,2,2.1,NULL,NULL),(68,NULL,1.7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1.8,1.9,2,2.1,NULL,NULL),(69,NULL,1.7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1.8,1.9,2,2.1,NULL,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bonemarrowaspiratetable`
--

LOCK TABLES `bonemarrowaspiratetable` WRITE;
/*!40000 ALTER TABLE `bonemarrowaspiratetable` DISABLE KEYS */;
INSERT INTO `bonemarrowaspiratetable` VALUES (1,'2010-01-01','Bone Marrow Aspirate and Biopsy result'),(2,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(3,'',''),(4,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(5,'2014-05-05','Bone Marrow Aspirate and Biopsy result'),(6,'2010-01-06','Bone Marrow Aspirate and Biopsy result'),(7,'',''),(8,'2012-03-08','Bone Marrow Aspirate and Biopsy result'),(9,'2013-04-09','Bone Marrow Aspirate and Biopsy result'),(10,'2014-05-10','Bone Marrow Aspirate and Biopsy result'),(11,'2010-01-01','Bone Marrow Aspirate and Biopsy result'),(12,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(13,'',''),(14,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(15,'2014-05-05','Bone Marrow Aspirate and Biopsy result'),(16,'2010-01-06','Bone Marrow Aspirate and Biopsy result'),(17,'',''),(18,'2012-03-08','Bone Marrow Aspirate and Biopsy result'),(19,'2013-04-09','Bone Marrow Aspirate and Biopsy result'),(20,'2014-05-10','Bone Marrow Aspirate and Biopsy result'),(21,'',''),(22,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(23,'2012-03-03','Bone Marrow Aspirate and Biopsy result'),(24,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(25,'',''),(26,'2010-01-06','Bone Marrow Aspirate and Biopsy result'),(27,'2011-02-07','Bone Marrow Aspirate and Biopsy result'),(28,'2012-03-08','Bone Marrow Aspirate and Biopsy result'),(29,'',''),(30,'2014-05-10','Bone Marrow Aspirate and Biopsy result'),(31,'2010-01-01','Bone Marrow Aspirate and Biopsy result'),(32,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(33,'',''),(34,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(35,'2014-05-05','Bone Marrow Aspirate and Biopsy result'),(36,'2010-01-06','Bone Marrow Aspirate and Biopsy result'),(37,'',''),(38,'2012-03-08','Bone Marrow Aspirate and Biopsy result'),(39,'2013-04-09','Bone Marrow Aspirate and Biopsy result'),(40,'2014-05-10','Bone Marrow Aspirate and Biopsy result'),(41,'',''),(42,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(43,'2012-03-03','Bone Marrow Aspirate and Biopsy result'),(44,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(45,'',''),(46,'2010-01-06','Bone Marrow Aspirate and Biopsy result'),(47,'2011-02-07','Bone Marrow Aspirate and Biopsy result'),(48,'2012-03-08','Bone Marrow Aspirate and Biopsy result'),(49,'',''),(50,'2014-05-10','Bone Marrow Aspirate and Biopsy result'),(51,'2010-01-01','Bone Marrow Aspirate and Biopsy result'),(52,'2011-02-02','Bone Marrow Aspirate and Biopsy result'),(53,'',''),(54,'2013-04-04','Bone Marrow Aspirate and Biopsy result'),(55,'2014-05-05','Bone Marrow Aspirate and Biopsy result'),(56,'2010-01-06','Bone Marrow Aspirate and Biopsy result'),(57,'',''),(58,'2012-03-08','Bone Marrow Aspirate and Biopsy result'),(59,'2013-04-09','Bone Marrow Aspirate and Biopsy result'),(60,'2014-05-10','Bone Marrow Aspirate and Biopsy result'),(61,'2018-03-03','Bone Marrow Aspirate'),(62,'',''),(63,'2018-03-05','Bone Marrow Aspirate'),(64,'2018-03-09','Bone Marrow Aspirate'),(65,'2018-03-10','Bone Marrow Aspirate'),(66,'2018-03-11','Bone Marrow Aspirate'),(67,'2018-03-15','Bone Marrow Aspirate'),(68,'',''),(69,'2018-03-17','Bone Marrow Aspirate'),(70,'2018-03-18','Bone Marrow Aspirate'),(71,'2018-03-18','Bone Marrow Aspirate'),(72,'2018-03-19','Bone Marrow Aspirate'),(73,'2018-03-19','Bone Marrow Aspirate'),(74,'2018-03-20','Bone Marrow Aspirate'),(75,'2018-03-20','Bone Marrow Aspirate');
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
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chemomedicationstable`
--

LOCK TABLES `chemomedicationstable` WRITE;
/*!40000 ALTER TABLE `chemomedicationstable` DISABLE KEYS */;
INSERT INTO `chemomedicationstable` VALUES (1,'Medications'),(2,'Medications'),(3,'Medications'),(4,'Medications'),(5,'Medications'),(6,'Medications'),(7,'Medications'),(8,'Medications'),(9,'Medications'),(10,'Medications'),(11,'Chemotherapy Medications'),(12,'Chemotherapy Medications'),(13,'Chemotherapy Medications'),(14,'Chemotherapy Medications'),(15,'Chemotherapy Medications'),(16,'Chemotherapy Medications'),(17,'Chemotherapy Medications'),(18,'Chemotherapy Medications'),(19,'Chemotherapy Medications'),(20,'Chemotherapy Medications'),(21,'Chemotherapy Medications'),(22,'Chemotherapy Medications'),(23,'Chemotherapy Medications'),(24,'Chemotherapy Medications'),(25,'Chemotherapy Medications'),(26,'Chemotherapy Medications'),(27,'Chemotherapy Medications'),(28,'Chemotherapy Medications'),(29,'Chemotherapy Medications'),(30,'Chemotherapy Medications'),(31,'Medications'),(32,'Medications'),(33,'Medications'),(34,'Medications'),(35,'Medications'),(36,'Medications'),(37,'Medications'),(38,'Medications'),(39,'Medications'),(40,'Medications');
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classificationtable`
--

LOCK TABLES `classificationtable` WRITE;
/*!40000 ALTER TABLE `classificationtable` DISABLE KEYS */;
INSERT INTO `classificationtable` VALUES (1,'MDS Very Low'),(2,'MDS Very Low'),(3,'MDS Very Low'),(4,'MDS Very Low'),(5,'MDS Very Low'),(6,'MDS Very Low'),(7,'MDS Very Low'),(8,'MDS Very Low'),(9,'MDS Very Low'),(10,'MDS Very Low');
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
  `DateOfVisit` date DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clinicaldatatable`
--

LOCK TABLES `clinicaldatatable` WRITE;
/*!40000 ALTER TABLE `clinicaldatatable` DISABLE KEYS */;
INSERT INTO `clinicaldatatable` VALUES (1,'2010-01-01','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,1,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',1,NULL),(2,'2011-02-02','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,2,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',2,NULL),(3,'2012-03-03','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,3,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','','','','','',3,NULL),(4,'2013-04-04','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,4,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',4,NULL),(5,'2014-05-05','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,5,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',5,NULL),(6,'2010-01-06','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,6,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',6,NULL),(7,'2011-02-07','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,7,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','','','','','',7,NULL),(8,'2012-03-08','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,8,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',8,NULL),(9,'2013-04-09','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,9,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',9,NULL),(10,'2014-05-10','D46.1  Refractory anaemia with ring sideroblasts',NULL,NULL,NULL,10,NULL,NULL,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','Previous Infection','Previous Hematologic Disorder',10,NULL),(11,'2010-01-01','Others','Diagnosis Others',NULL,NULL,NULL,NULL,1,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','','','',NULL,NULL,11,'Other findings'),(12,'2011-02-02','Others','Diagnosis Others',NULL,NULL,NULL,NULL,2,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,12,'Other findings'),(13,'2012-03-03','Others','Diagnosis Others',NULL,NULL,NULL,NULL,3,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,13,'Other findings'),(14,'2013-04-04','Others','Diagnosis Others',NULL,NULL,NULL,NULL,4,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,14,'Other findings'),(15,'2014-05-05','Others','Diagnosis Others',NULL,NULL,NULL,NULL,5,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','','','',NULL,NULL,15,'Other findings'),(16,'2010-01-06','Others','Diagnosis Others',NULL,NULL,NULL,NULL,6,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,16,'Other findings'),(17,'2011-02-07','Others','Diagnosis Others',NULL,NULL,NULL,NULL,7,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,17,'Other findings'),(18,'2012-03-08','Others','Diagnosis Others',NULL,NULL,NULL,NULL,8,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,18,'Other findings'),(19,'2013-04-09','Others','Diagnosis Others',NULL,NULL,NULL,NULL,9,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','','','',NULL,NULL,19,'Other findings'),(20,'2014-05-10','Others','Diagnosis Others',NULL,NULL,NULL,NULL,10,NULL,'Chief Complaint',NULL,NULL,'Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,20,'Other findings'),(21,'2010-01-01','C92.Z Other myeloid leukemia',NULL,NULL,1,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',21,NULL),(22,'2011-02-02','C92.Z Other myeloid leukemia',NULL,NULL,2,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',22,NULL),(23,'2012-03-03','C92.Z Other myeloid leukemia',NULL,NULL,3,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','','','','','',23,NULL),(24,'2013-04-04','C92.Z Other myeloid leukemia',NULL,NULL,4,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',24,NULL),(25,'2014-05-05','C92.Z Other myeloid leukemia',NULL,NULL,5,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',25,NULL),(26,'2010-01-06','C92.Z Other myeloid leukemia',NULL,NULL,6,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',26,NULL),(27,'2011-02-07','C92.Z Other myeloid leukemia',NULL,NULL,7,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','','','','','',27,NULL),(28,'2012-03-08','C92.Z Other myeloid leukemia',NULL,NULL,8,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',28,NULL),(29,'2013-04-09','C92.Z Other myeloid leukemia',NULL,NULL,9,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',29,NULL),(30,'2014-05-10','C92.Z Other myeloid leukemia',NULL,NULL,10,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Fever','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure','','',30,NULL),(31,'2010-01-01','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','','','',NULL,NULL,31,'Other findings'),(32,'2011-02-02','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,32,'Other findings'),(33,'2012-03-03','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,33,'Other findings'),(34,'2013-04-04','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,34,'Other findings'),(35,'2014-05-05','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','','','',NULL,NULL,35,'Other findings'),(36,'2010-01-06','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,36,'Other findings'),(37,'2011-02-07','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,37,'Other findings'),(38,'2012-03-08','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,38,'Other findings'),(39,'2013-04-09','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','','','',NULL,NULL,39,'Other findings'),(40,'2014-05-10','',NULL,NULL,NULL,NULL,NULL,NULL,'Stage of Disease','Chief Complaint',NULL,'','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,40,'Other findings'),(41,'2010-01-01','Others','Diagnosis Others',1,11,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,41,'Other findings'),(42,'2011-02-02','Others','Diagnosis Others',2,12,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,42,'Other findings'),(43,'2012-03-03','Others','Diagnosis Others',3,13,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','','','',NULL,NULL,43,'Other findings'),(44,'2013-04-04','Others','Diagnosis Others',4,14,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,44,'Other findings'),(45,'2014-05-05','Others','Diagnosis Others',5,15,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,45,'Other findings'),(46,'2010-01-06','Others','Diagnosis Others',6,16,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,46,'Other findings'),(47,'2011-02-07','Others','Diagnosis Others',7,17,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','','','',NULL,NULL,47,'Other findings'),(48,'2012-03-08','Others','Diagnosis Others',8,18,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,48,'Other findings'),(49,'2013-04-09','Others','Diagnosis Others',9,19,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,49,'Other findings'),(50,'2014-05-10','Others','Diagnosis Others',10,20,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Night Sweats','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,50,'Other findings'),(51,'2010-01-01','C90.32 ... in relapse',NULL,NULL,NULL,NULL,1,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,51,'Other pertinent findings'),(52,'2011-02-02','C90.32 ... in relapse',NULL,NULL,NULL,NULL,2,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,52,'Other pertinent findings'),(53,'2012-03-03','C90.32 ... in relapse',NULL,NULL,NULL,NULL,3,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,53,'Other pertinent findings'),(54,'2013-04-04','C90.32 ... in relapse',NULL,NULL,NULL,NULL,4,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,54,'Other pertinent findings'),(55,'2014-05-05','C90.32 ... in relapse',NULL,NULL,NULL,NULL,5,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,55,'Other pertinent findings'),(56,'2010-01-06','C90.32 ... in relapse',NULL,NULL,NULL,NULL,6,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,56,'Other pertinent findings'),(57,'2011-02-07','C90.32 ... in relapse',NULL,NULL,NULL,NULL,7,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,57,'Other pertinent findings'),(58,'2012-03-08','C90.32 ... in relapse',NULL,NULL,NULL,NULL,8,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,58,'Other pertinent findings'),(59,'2013-04-09','C90.32 ... in relapse',NULL,NULL,NULL,NULL,9,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,59,'Other pertinent findings'),(60,'2014-05-10','C90.32 ... in relapse',NULL,NULL,NULL,NULL,10,NULL,NULL,'Chief Complaint',NULL,'Weigh Loss','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,60,'Other pertinent findings'),(61,'2010-01-01','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,61,'Other findings'),(62,'2011-02-02','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,62,'Other findings'),(63,'2012-03-03','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','','','',NULL,NULL,63,'Other findings'),(64,'2013-04-04','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,64,'Other findings'),(65,'2014-05-05','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,65,'Other findings'),(66,'2010-01-06','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,66,'Other findings'),(67,'2011-02-07','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','','','',NULL,NULL,67,'Other findings'),(68,'2012-03-08','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,68,'Other findings'),(69,'2013-04-09','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,69,'Other findings'),(70,'2014-05-10','Others','Diagnosis Others',NULL,NULL,NULL,NULL,NULL,NULL,'Chief Complaint',NULL,'Bleeding','Other Symptoms','Comorbidities','Smoking History','Alcohol intake history','Chemical exposure',NULL,NULL,70,'Other findings'),(71,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,71,NULL),(72,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,72,NULL),(73,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,73,NULL),(74,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,74,NULL),(75,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,75,NULL),(76,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,76,NULL),(77,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,77,NULL),(78,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,78,NULL),(79,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,79,NULL),(80,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,80,NULL),(81,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,81,NULL),(82,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,82,NULL),(83,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,83,NULL),(84,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,84,NULL),(85,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,85,NULL),(86,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,86,NULL),(87,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,87,NULL),(88,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,88,NULL),(89,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,89,NULL),(90,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,90,NULL),(91,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Symptomas',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,91,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coagulationtestingtable`
--

LOCK TABLES `coagulationtestingtable` WRITE;
/*!40000 ALTER TABLE `coagulationtestingtable` DISABLE KEYS */;
INSERT INTO `coagulationtestingtable` VALUES (1,1.3,1.4,1.5,1.6),(2,1.3,1.4,1.5,1.6),(3,1.3,1.4,1.5,1.6),(4,1.3,1.4,1.5,1.6),(5,1.3,1.4,1.5,1.6),(6,1.3,1.4,1.5,1.6),(7,1.3,1.4,1.5,1.6),(8,1.3,1.4,1.5,1.6),(9,1.3,1.4,1.5,1.6),(10,1.3,1.4,1.5,1.6);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cytogeneticmolecularaapnhtable`
--

LOCK TABLES `cytogeneticmolecularaapnhtable` WRITE;
/*!40000 ALTER TABLE `cytogeneticmolecularaapnhtable` DISABLE KEYS */;
INSERT INTO `cytogeneticmolecularaapnhtable` VALUES (1,'ok'),(2,'ok'),(3,''),(4,'ok'),(5,'ok'),(6,'ok'),(7,''),(8,'ok'),(9,'ok'),(10,'ok');
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cytogeneticmolecularmdstable`
--

LOCK TABLES `cytogeneticmolecularmdstable` WRITE;
/*!40000 ALTER TABLE `cytogeneticmolecularmdstable` DISABLE KEYS */;
INSERT INTO `cytogeneticmolecularmdstable` VALUES (1,'ok'),(2,'ok'),(3,''),(4,'ok'),(5,'ok'),(6,'ok'),(7,''),(8,'ok'),(9,'ok'),(10,'ok');
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
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cytogeneticmoleculartable`
--

LOCK TABLES `cytogeneticmoleculartable` WRITE;
/*!40000 ALTER TABLE `cytogeneticmoleculartable` DISABLE KEYS */;
INSERT INTO `cytogeneticmoleculartable` VALUES (1,'ok'),(2,'ok'),(3,''),(4,'ok'),(5,'ok'),(6,'ok'),(7,''),(8,'ok'),(9,'ok'),(10,'ok'),(11,'ok'),(12,'ok'),(13,''),(14,'ok'),(15,'ok'),(16,'ok'),(17,''),(18,'ok'),(19,'ok'),(20,'ok'),(21,''),(22,'ok'),(23,'ok'),(24,'ok'),(25,''),(26,'ok'),(27,'ok'),(28,'ok'),(29,''),(30,'ok'),(31,'Ok'),(32,''),(33,'Ok'),(34,'Ok'),(35,'Ok'),(36,'Ok');
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
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diseasestatustable`
--

LOCK TABLES `diseasestatustable` WRITE;
/*!40000 ALTER TABLE `diseasestatustable` DISABLE KEYS */;
INSERT INTO `diseasestatustable` VALUES (1,'','',''),(2,'','',''),(3,'','',''),(4,'','',''),(5,'','',''),(6,'','',''),(7,'','',''),(8,'','',''),(9,'','',''),(10,'','',''),(11,'Stable','',''),(12,'Stable','',''),(13,'Stable','',''),(14,'Stable','',''),(15,'Stable','',''),(16,'Stable','',''),(17,'Stable','',''),(18,'Stable','',''),(19,'Stable','',''),(20,'Stable','',''),(21,'Others','','Disease Status'),(22,'Others','','Disease Status'),(23,'Others','','Disease Status'),(24,'Others','','Disease Status'),(25,'Others','','Disease Status'),(26,'Others','','Disease Status'),(27,'Others','','Disease Status'),(28,'Others','','Disease Status'),(29,'Others','','Disease Status'),(30,'Others','','Disease Status'),(31,'PR (Partial Response)','',''),(32,'PR (Partial Response)','',''),(33,'PR (Partial Response)','',''),(34,'PR (Partial Response)','',''),(35,'PR (Partial Response)','',''),(36,'PR (Partial Response)','',''),(37,'PR (Partial Response)','',''),(38,'PR (Partial Response)','',''),(39,'PR (Partial Response)','',''),(40,'PR (Partial Response)','',''),(41,'Stable','',''),(42,'Stable','',''),(43,'Stable','',''),(44,'Stable','',''),(45,'Stable','',''),(46,'Stable','',''),(47,'Stable','',''),(48,'Stable','',''),(49,'Stable','',''),(50,'Stable','',''),(51,'Stable','',''),(52,'Stable','',''),(53,'Stable','',''),(54,'Stable','',''),(55,'Stable','',''),(56,'Stable','',''),(57,'Stable','',''),(58,'Stable','',''),(59,'Stable','',''),(60,'Stable','',''),(61,'Persistent ITP (between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy)','',''),(62,'Persistent ITP (between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy)','',''),(63,'Persistent ITP (between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy)','',''),(64,'Persistent ITP (between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy)','',''),(65,'Persistent ITP (between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy)','',''),(66,'Persistent ITP (between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy)','',''),(67,'Persistent ITP (between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy)','',''),(68,'Persistent ITP (between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy)','',''),(69,'Persistent ITP (between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy)','',''),(70,'Persistent ITP (between 3-12 months from diagnosis. Includes patients not reaching spontaneous remission or not maintaining complete response off therapy)','',''),(71,'Others',NULL,'Other Disease'),(72,'Others',NULL,'Other Disease'),(73,'Others',NULL,'Other Disease'),(74,'nCR (near CR)',NULL,''),(75,'nCR (near CR)',NULL,''),(76,'nCR (near CR)',NULL,''),(77,'Others',NULL,'Other Disease'),(78,'Others',NULL,'Other Disease'),(79,'Others',NULL,'Other Disease'),(80,'Dead',NULL,''),(81,'Dead',NULL,''),(82,'Dead',NULL,''),(83,'Relapse','Clinical Relapse',''),(84,'Others','','Other Disease'),(85,'Relapse','Clinical Relapse',''),(86,'Others','','Other Disease'),(87,'Relapse','Clinical Relapse',''),(88,'Others','','Other Disease'),(89,'Others','','Other Disease'),(90,'Others','','Other Disease'),(91,'Others','','Other Disease');
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
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `familycancertable`
--

LOCK TABLES `familycancertable` WRITE;
/*!40000 ALTER TABLE `familycancertable` DISABLE KEYS */;
INSERT INTO `familycancertable` VALUES (1,1,'Relationship to Patient','Specify Cancer'),(2,2,'Relationship to Patient','Specify Cancer'),(3,3,'',''),(4,4,'Relationship to Patient','Specify Cancer'),(5,5,'Relationship to Patient','Specify Cancer'),(6,6,'Relationship to Patient','Specify Cancer'),(7,7,'',''),(8,8,'Relationship to Patient','Specify Cancer'),(9,9,'Relationship to Patient','Specify Cancer'),(10,10,'Relationship to Patient','Specify Cancer'),(11,11,'',''),(12,12,'Relationship to Patient','Specify Cancer'),(13,13,'Relationship to Patient','Specify Cancer'),(14,14,'Relationship to Patient','Specify Cancer'),(15,15,'',''),(16,16,'Relationship to Patient','Specify Cancer'),(17,17,'Relationship to Patient','Specify Cancer'),(18,18,'Relationship to Patient','Specify Cancer'),(19,19,'',''),(20,20,'Relationship to Patient','Specify Cancer'),(21,21,'Relationship to Patient','Specify Cancer'),(22,22,'Relationship to Patient','Specify Cancer'),(23,23,'',''),(24,24,'Relationship to Patient','Specify Cancer'),(25,25,'Relationship to Patient','Specify Cancer'),(26,26,'Relationship to Patient','Specify Cancer'),(27,27,'',''),(28,28,'Relationship to Patient','Specify Cancer'),(29,29,'Relationship to Patient','Specify Cancer'),(30,30,'Relationship to Patient','Specify Cancer'),(31,31,'',''),(32,32,'Relationship to Patient','Specify Cancer'),(33,33,'Relationship to Patient','Specify Cancer'),(34,34,'Relationship to Patient','Specify Cancer'),(35,35,'',''),(36,36,'Relationship to Patient','Specify Cancer'),(37,37,'Relationship to Patient','Specify Cancer'),(38,38,'Relationship to Patient','Specify Cancer'),(39,39,'',''),(40,40,'Relationship to Patient','Specify Cancer'),(41,41,'Relationship to Patient','Specify Cancer'),(42,42,'Relationship to Patient','Specify Cancer'),(43,43,'',''),(44,44,'Relationship to Patient','Specify Cancer'),(45,45,'Relationship to Patient','Specify Cancer'),(46,46,'Relationship to Patient','Specify Cancer'),(47,47,'',''),(48,48,'Relationship to Patient','Specify Cancer'),(49,49,'Relationship to Patient','Specify Cancer'),(50,50,'Relationship to Patient','Specify Cancer'),(51,51,'',''),(52,52,'Relationship to Patient','Specify Cancer'),(53,53,'Relationship to Patient','Specify Cancer'),(54,54,'Relationship to Patient','Specify Cancer'),(55,55,'',''),(56,56,'Relationship to Patient','Specify Cancer'),(57,57,'Relationship to Patient','Specify Cancer'),(58,58,'Relationship to Patient','Specify Cancer'),(59,59,'',''),(60,60,'Relationship to Patient','Specify Cancer'),(61,61,'Relationship to Patient','Specify Cancer'),(62,62,'Relationship to Patient','Specify Cancer'),(63,63,'',''),(64,64,'Relationship to Patient','Specify Cancer'),(65,65,'Relationship to Patient','Specify Cancer'),(66,66,'Relationship to Patient','Specify Cancer'),(67,67,'',''),(68,68,'Relationship to Patient','Specify Cancer'),(69,69,'Relationship to Patient','Specify Cancer'),(70,70,'Relationship to Patient','Specify Cancer');
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
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flowcytometrytable`
--

LOCK TABLES `flowcytometrytable` WRITE;
/*!40000 ALTER TABLE `flowcytometrytable` DISABLE KEYS */;
INSERT INTO `flowcytometrytable` VALUES (1,'ok'),(2,'ok'),(3,''),(4,'ok'),(5,'ok'),(6,'ok'),(7,''),(8,'ok'),(9,'ok'),(10,'ok'),(11,'ok'),(12,'ok'),(13,''),(14,'ok'),(15,'ok'),(16,'ok'),(17,''),(18,'ok'),(19,'ok'),(20,'ok'),(21,''),(22,'ok'),(23,'ok'),(24,'ok'),(25,''),(26,'ok'),(27,'ok'),(28,'ok'),(29,''),(30,'ok'),(31,'Ok'),(32,''),(33,'Ok'),(34,'Ok'),(35,'Ok'),(36,'Ok');
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
  `DateOfEntry` date NOT NULL,
  `DateOfVisit` date NOT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `followuptable`
--

LOCK TABLES `followuptable` WRITE;
/*!40000 ALTER TABLE `followuptable` DISABLE KEYS */;
INSERT INTO `followuptable` VALUES (1,1,'2018-03-01','2018-03-01',1,71,71,71,'Special'),(2,1,'2018-03-02','2018-03-02',2,72,72,72,'Special'),(3,1,'2018-03-03','2018-03-03',3,73,73,73,'Special'),(4,11,'2018-03-04','2018-03-04',4,NULL,NULL,NULL,'Special'),(5,11,'2018-03-05','2018-03-05',5,NULL,NULL,NULL,'Special'),(6,11,'2018-03-06','2018-03-06',6,NULL,NULL,NULL,'Special'),(7,21,'2018-03-07','2018-03-07',7,74,74,74,''),(8,21,'2018-03-08','2018-03-08',8,75,75,75,''),(9,21,'2018-03-09','2018-03-09',9,76,76,76,''),(10,31,'2018-03-10','2018-03-10',10,77,77,77,'Special'),(11,31,'2018-03-11','2018-03-11',11,78,78,78,'Special'),(12,31,'2018-03-12','2018-03-12',12,79,79,79,'Special'),(13,41,'2018-03-13','2018-03-13',13,80,80,80,'Special'),(14,41,'2018-03-14','2018-03-14',14,81,81,81,'Special'),(15,41,'2018-03-15','2018-03-15',15,82,82,82,'Special'),(16,51,'2018-03-16','2018-03-16',16,83,83,83,'Special'),(17,51,'2018-03-16','2018-03-16',17,84,84,84,'Special'),(18,51,'2018-03-17','2018-03-17',18,85,85,85,'Special'),(19,51,'2018-03-17','2018-03-17',19,86,86,86,'Special'),(20,51,'2018-03-18','2018-03-18',20,87,87,87,'Special'),(21,51,'2018-03-18','2018-03-18',21,88,88,88,'Special'),(22,61,'2018-03-19','2018-03-19',22,89,89,89,'Special'),(23,61,'2018-03-20','2018-03-20',23,90,90,90,'Special'),(24,61,'2018-03-21','2018-03-21',24,91,91,91,'Special');
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
  `DateOfBirth` date NOT NULL,
  `DateOfEntry` date NOT NULL,
  `AddressID` int(11) NOT NULL,
  `TissueSpecimenID` int(11) DEFAULT NULL,
  PRIMARY KEY (`GeneralDataID`),
  KEY `GeneralDataTable_fk0` (`AddressID`),
  KEY `GeneralDataTable_fk1` (`TissueSpecimenID`),
  CONSTRAINT `GeneralDataTable_fk0` FOREIGN KEY (`AddressID`) REFERENCES `addresstable` (`AddressID`),
  CONSTRAINT `GeneralDataTable_fk1` FOREIGN KEY (`TissueSpecimenID`) REFERENCES `tissuespecimentable` (`TissueSpecimenID`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generaldatatable`
--

LOCK TABLES `generaldatatable` WRITE;
/*!40000 ALTER TABLE `generaldatatable` DISABLE KEYS */;
INSERT INTO `generaldatatable` VALUES (1,'v24FpEfhMFfTG13CneiKOw==','yttPhoRwCNF960JiLkDkAA==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2010-01-01',1,1),(2,'SpEDgOUai2gEIbABmR1o1g==','Z5UFN2yRq+GmF7ZuvNGx/g==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2011-02-02',2,2),(3,'1zcFy8t85mer2g4mOEQKew==','P5RQcNKPT+NofJfiuiPxQA==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2012-03-03',3,3),(4,'C5/gyHmAfkVKdq0N68XD9w==','X4jTpU2m/F7St/Dyc3O8qA==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2013-04-04',4,4),(5,'v24FpEfhMFfTG13CneiKOw==','pfdNF2F4EmKpfQyV++oAmQ==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2014-05-05',5,5),(6,'SpEDgOUai2gEIbABmR1o1g==','c/IbGi01DCeFX3O7dM8riA==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2010-01-06',6,6),(7,'1zcFy8t85mer2g4mOEQKew==','AOnvrb7EgsZqVlLpfITWDw==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2011-02-07',7,7),(8,'C5/gyHmAfkVKdq0N68XD9w==','lshK0giWsCYtvA45WV6ZAg==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2012-03-08',8,8),(9,'v24FpEfhMFfTG13CneiKOw==','g3vXHLZ83BCAc6KDWYzEQQ==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2013-04-09',9,9),(10,'SpEDgOUai2gEIbABmR1o1g==','r2hjfq2Rcmdfoj0hRYc8Hw==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2014-05-10',10,10),(11,'1zcFy8t85mer2g4mOEQKew==','/R2SIjmjdxd1iFR7fkERKA==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2010-01-01',11,NULL),(12,'C5/gyHmAfkVKdq0N68XD9w==','lEYS7U2qzDChWMk5PyJp3Q==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2011-02-02',12,NULL),(13,'v24FpEfhMFfTG13CneiKOw==','M5tGv7P7GhZF9O9yWfxdIw==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2012-03-03',13,NULL),(14,'SpEDgOUai2gEIbABmR1o1g==','ed+qFjup13VvLLSKd85AgA==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2013-04-04',14,NULL),(15,'1zcFy8t85mer2g4mOEQKew==','yHhwBtBKkCzhiusdDmA3gw==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2014-05-05',15,NULL),(16,'C5/gyHmAfkVKdq0N68XD9w==','tW2PygVh8aqYMaweWwXxnQ==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2010-01-06',16,NULL),(17,'v24FpEfhMFfTG13CneiKOw==','8GHWSKhY3NWWRlx/lYjGkg==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2011-02-07',17,NULL),(18,'SpEDgOUai2gEIbABmR1o1g==','5117XQeOlzY9WS70UqD1ow==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2012-03-08',18,NULL),(19,'1zcFy8t85mer2g4mOEQKew==','eHN8o8Yl6TJEffuAqeIyiQ==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2013-04-09',19,NULL),(20,'C5/gyHmAfkVKdq0N68XD9w==','IS9kNMZKilmxPVIfrceyAg==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2014-05-10',20,NULL),(21,'v24FpEfhMFfTG13CneiKOw==','Jq05rKoTYyYuTK1QjaPOgg==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2010-01-01',21,21),(22,'SpEDgOUai2gEIbABmR1o1g==','u9WXeflwTKB9dvCvRbbwHA==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2011-02-02',22,22),(23,'1zcFy8t85mer2g4mOEQKew==','Aw9zNtW3VnrU1GqIJb5qTA==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2012-03-03',23,23),(24,'C5/gyHmAfkVKdq0N68XD9w==','e17EB71xnyWGhl/NFjTCEg==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2013-04-04',24,24),(25,'v24FpEfhMFfTG13CneiKOw==','Li6G6WyQPSRqeBBcdT6K3g==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2014-05-05',25,25),(26,'SpEDgOUai2gEIbABmR1o1g==','EvZEkkeFOUYxhF7jve72/w==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2010-01-06',26,26),(27,'1zcFy8t85mer2g4mOEQKew==','Xt4kVLeW5aC8dVaHTaB9LQ==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2011-02-07',27,27),(28,'C5/gyHmAfkVKdq0N68XD9w==','ofrnxQzYpdOZSJJwghFLmw==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2012-03-08',28,28),(29,'v24FpEfhMFfTG13CneiKOw==','TMrxhr7U4+eZ9cC4cMghKg==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2013-04-09',29,29),(30,'SpEDgOUai2gEIbABmR1o1g==','jHC2Xwf/Tn/6RXPbriy41Q==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2014-05-10',30,30),(31,'1zcFy8t85mer2g4mOEQKew==','pNRAiAjN3Asx50MaULAdyw==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2010-01-01',31,31),(32,'C5/gyHmAfkVKdq0N68XD9w==','bmQfAYFKYyH0DLb6s5p4AA==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2011-02-02',32,32),(33,'v24FpEfhMFfTG13CneiKOw==','uWHcFeYATleVD0J/tZrzlQ==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2012-03-03',33,33),(34,'SpEDgOUai2gEIbABmR1o1g==','J3OeqsZlZpYXhDZDJJx7Fw==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2013-04-04',34,34),(35,'1zcFy8t85mer2g4mOEQKew==','DVaYSQ9EdGi/pp/ZTm5Lhw==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2014-05-05',35,35),(36,'C5/gyHmAfkVKdq0N68XD9w==','6dOHrAReU9clpnbD4c/epg==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2010-01-06',36,36),(37,'v24FpEfhMFfTG13CneiKOw==','A6mlPYcZRAfXVSpqgZJh1g==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2011-02-07',37,37),(38,'SpEDgOUai2gEIbABmR1o1g==','XySGCDZutxnK9DdSk5OwwQ==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2012-03-08',38,38),(39,'1zcFy8t85mer2g4mOEQKew==','kk1HrBVP/lkr+jVzkOtlQg==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2013-04-09',39,39),(40,'C5/gyHmAfkVKdq0N68XD9w==','zPAMKd3qylPtk3U/CJ375g==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2014-05-10',40,40),(41,'v24FpEfhMFfTG13CneiKOw==','BIbhAVHkWCBx/hqlFHZ3Fg==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2010-01-01',41,41),(42,'SpEDgOUai2gEIbABmR1o1g==','I9vTJfuYJu6FQE4fQWXfqg==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2011-02-02',42,42),(43,'1zcFy8t85mer2g4mOEQKew==','kh8gFZm2GA3bjpc6BgmESA==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2012-03-03',43,43),(44,'C5/gyHmAfkVKdq0N68XD9w==','xZSGO98BDdekO2HvAoAQ8g==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2013-04-04',44,44),(45,'v24FpEfhMFfTG13CneiKOw==','xyDuhWjxU6KfQKVJYjSqvg==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2014-05-05',45,45),(46,'SpEDgOUai2gEIbABmR1o1g==','H+ldwQ4zJkqpSPzn/COcQA==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2010-01-06',46,46),(47,'1zcFy8t85mer2g4mOEQKew==','WtQQ+X+mnq4Fp9C9xcgRXA==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2011-02-07',47,47),(48,'C5/gyHmAfkVKdq0N68XD9w==','R0FuSGfay5Of7IedpLlS9w==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2012-03-08',48,48),(49,'v24FpEfhMFfTG13CneiKOw==','vQ3FfIHJODHS0wVr3FLKsg==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2013-04-09',49,49),(50,'SpEDgOUai2gEIbABmR1o1g==','DwGUVMLlicBws5wgQLkrTg==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2014-05-10',50,50),(51,'1zcFy8t85mer2g4mOEQKew==','AGWf39NfbVzjFnwnkukX2w==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2010-01-01',51,51),(52,'C5/gyHmAfkVKdq0N68XD9w==','ciD5GTTFOtfsBo3YaIDVaA==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2011-02-02',52,52),(53,'v24FpEfhMFfTG13CneiKOw==','Na5qZKOnKT0ZjaYeZZqihw==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2012-03-03',53,53),(54,'SpEDgOUai2gEIbABmR1o1g==','V+wvT/Rel3sUlerX/7U1lw==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2013-04-04',54,54),(55,'1zcFy8t85mer2g4mOEQKew==','YamJ0m8pGuqLdHY8ALJiZw==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2014-05-05',55,55),(56,'C5/gyHmAfkVKdq0N68XD9w==','uwUx18hHwZLRh/M2NkIJUQ==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2010-01-06',56,56),(57,'v24FpEfhMFfTG13CneiKOw==','0fjs+uzm1Nk5vA40XsOCow==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2011-02-07',57,57),(58,'SpEDgOUai2gEIbABmR1o1g==','2U176izCg+SoagrOCCJ6IA==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2012-03-08',58,58),(59,'1zcFy8t85mer2g4mOEQKew==','4KzEQs4g+MluHBVjOJ3HjA==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2013-04-09',59,59),(60,'C5/gyHmAfkVKdq0N68XD9w==','s+x1wFXv3x4Og9AVsJwUfA==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2014-05-10',60,60),(61,'v24FpEfhMFfTG13CneiKOw==','WLo8TdSr42reGvI519cJYQ==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2010-01-01',61,NULL),(62,'SpEDgOUai2gEIbABmR1o1g==','F5qgKRv2OVtr3gX5UhCukQ==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2011-02-02',62,NULL),(63,'1zcFy8t85mer2g4mOEQKew==','pGMF0uAEwlBY7SxWszUuHg==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2012-03-03',63,NULL),(64,'C5/gyHmAfkVKdq0N68XD9w==','+jTRaANzRp9/f8Y531HgsA==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2013-04-04',64,NULL),(65,'v24FpEfhMFfTG13CneiKOw==','zY/iMB51AVN23ILBi50TpQ==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2014-05-05',65,NULL),(66,'SpEDgOUai2gEIbABmR1o1g==','akSu+3J7tRdOz4VOJhCqag==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2010-01-06',66,NULL),(67,'1zcFy8t85mer2g4mOEQKew==','o72Ihbbn6Sd1618j5pGKrg==','7XBb4sEaTNUQ6fnYMzjiMw==',2,'1997-12-20','2011-02-07',67,NULL),(68,'C5/gyHmAfkVKdq0N68XD9w==','V4p78P+kraECDc9/mDyDOA==','MxaNI3fWVH7OBvmYkWXkpA==',1,'1995-09-15','2012-03-08',68,NULL),(69,'v24FpEfhMFfTG13CneiKOw==','yK0HGUIy9PRwoEhArkOMOw==','4o2dxdGCfBDiyzL324XhDA==',1,'1997-08-01','2013-04-09',69,NULL),(70,'SpEDgOUai2gEIbABmR1o1g==','T6MJgPeGwwaxRKqNo8uX9w==','4mqVzd7YDr58H5B1mnbA9A==',1,'1997-02-02','2014-05-10',70,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hematologytable`
--

LOCK TABLES `hematologytable` WRITE;
/*!40000 ALTER TABLE `hematologytable` DISABLE KEYS */;
INSERT INTO `hematologytable` VALUES (1,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(2,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(3,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(4,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(5,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(6,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(7,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(8,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(9,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(10,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(11,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(12,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(13,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(14,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(15,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(16,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(17,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(18,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(19,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(20,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(21,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(22,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(23,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(24,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(25,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(26,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(27,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(28,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(29,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(30,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(31,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(32,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(33,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(34,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(35,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(36,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(37,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(38,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(39,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(40,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(41,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(42,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(43,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(44,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(45,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(46,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(47,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(48,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(49,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(50,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(51,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(52,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(53,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(54,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(55,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(56,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(57,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(58,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(59,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(60,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(61,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(62,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(63,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(64,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(65,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(66,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(67,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(68,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(69,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(70,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,NULL,NULL,NULL,1.2),(71,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(72,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(73,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(74,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(75,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(76,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(77,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(78,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(79,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(80,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(81,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(82,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(83,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(84,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(85,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(86,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(87,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(88,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(89,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(90,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2),(91,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1,1,1.1,1.2);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hematopathologytable`
--

LOCK TABLES `hematopathologytable` WRITE;
/*!40000 ALTER TABLE `hematopathologytable` DISABLE KEYS */;
INSERT INTO `hematopathologytable` VALUES (1,'',''),(2,'2011-02-02','Hematopathology review of slides'),(3,'2012-03-03','Hematopathology review of slides'),(4,'2013-04-04','Hematopathology review of slides'),(5,'',''),(6,'2010-01-06','Hematopathology review of slides'),(7,'2011-02-07','Hematopathology review of slides'),(8,'2012-03-08','Hematopathology review of slides'),(9,'',''),(10,'2014-05-10','Hematopathology review of slides');
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
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `imagingstudiestable`
--

LOCK TABLES `imagingstudiestable` WRITE;
/*!40000 ALTER TABLE `imagingstudiestable` DISABLE KEYS */;
INSERT INTO `imagingstudiestable` VALUES (1,''),(2,'ok'),(3,'ok'),(4,'ok'),(5,''),(6,'ok'),(7,'ok'),(8,'ok'),(9,''),(10,'ok'),(11,'ok'),(12,'ok'),(13,''),(14,'ok'),(15,'ok'),(16,'ok'),(17,''),(18,'ok'),(19,'ok'),(20,'ok'),(21,''),(22,'ok'),(23,'ok'),(24,'ok'),(25,''),(26,'ok'),(27,'ok'),(28,'ok'),(29,''),(30,'ok'),(31,''),(32,'ok'),(33,'ok'),(34,'ok'),(35,''),(36,'ok'),(37,'ok'),(38,'ok'),(39,''),(40,'ok'),(41,'ok'),(42,'ok'),(43,''),(44,'ok'),(45,'ok'),(46,'ok'),(47,''),(48,'ok'),(49,'ok'),(50,'ok'),(51,''),(52,'Ok'),(53,''),(54,'Ok'),(55,'Ok'),(56,'Ok'),(57,'Ok'),(58,'Ok'),(59,'Ok'),(60,'Ok'),(61,'Ok'),(62,'Ok');
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `immunohistochemistrytable`
--

LOCK TABLES `immunohistochemistrytable` WRITE;
/*!40000 ALTER TABLE `immunohistochemistrytable` DISABLE KEYS */;
INSERT INTO `immunohistochemistrytable` VALUES (1,'',''),(2,'2011-02-02','Immunohistochemistry of tissue'),(3,'2012-03-03','Immunohistochemistry of tissue'),(4,'2013-04-04','Immunohistochemistry of tissue'),(5,'',''),(6,'2010-01-06','Immunohistochemistry of tissue'),(7,'2011-02-07','Immunohistochemistry of tissue'),(8,'2012-03-08','Immunohistochemistry of tissue'),(9,'',''),(10,'2014-05-10','Immunohistochemistry of tissue');
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issstagingtable`
--

LOCK TABLES `issstagingtable` WRITE;
/*!40000 ALTER TABLE `issstagingtable` DISABLE KEYS */;
INSERT INTO `issstagingtable` VALUES (1,'Stage II'),(2,'Stage II'),(3,'Stage II'),(4,'Stage II'),(5,'Stage II'),(6,'Stage II'),(7,'Stage II'),(8,'Stage II'),(9,'Stage II'),(10,'Stage II');
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
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboratoryprofiletable`
--

LOCK TABLES `laboratoryprofiletable` WRITE;
/*!40000 ALTER TABLE `laboratoryprofiletable` DISABLE KEYS */;
INSERT INTO `laboratoryprofiletable` VALUES (1,'2000-03-03',1,NULL,NULL,1,1,1,NULL,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'2000-03-03',2,NULL,NULL,2,2,2,NULL,2,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'2000-03-03',3,NULL,NULL,3,3,3,NULL,3,3,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'2000-03-03',4,NULL,NULL,4,4,4,NULL,4,4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'2000-03-03',5,NULL,NULL,5,5,5,NULL,5,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'2000-03-03',6,NULL,NULL,6,6,6,NULL,6,6,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'2000-03-03',7,NULL,NULL,7,7,7,NULL,7,7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'2000-03-03',8,NULL,NULL,8,8,8,NULL,8,8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'2000-03-03',9,NULL,NULL,9,9,9,NULL,9,9,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,'2000-03-03',10,NULL,NULL,10,10,10,NULL,10,10,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,'2000-03-03',11,1,1,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,'2000-03-03',12,2,2,NULL,NULL,NULL,NULL,NULL,NULL,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,'2000-03-03',13,3,3,NULL,NULL,NULL,NULL,NULL,NULL,3,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,'2000-03-03',14,4,4,NULL,NULL,NULL,NULL,NULL,NULL,4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,'2000-03-03',15,5,5,NULL,NULL,NULL,NULL,NULL,NULL,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,'2000-03-03',16,6,6,NULL,NULL,NULL,NULL,NULL,NULL,6,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(17,'2000-03-03',17,7,7,NULL,NULL,NULL,NULL,NULL,NULL,7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(18,'2000-03-03',18,8,8,NULL,NULL,NULL,NULL,NULL,NULL,8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(19,'2000-03-03',19,9,9,NULL,NULL,NULL,NULL,NULL,NULL,9,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(20,'2000-03-03',20,10,10,NULL,NULL,NULL,NULL,NULL,NULL,10,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(21,'2000-03-03',21,NULL,11,NULL,11,11,1,NULL,NULL,11,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(22,'2000-03-03',22,NULL,12,NULL,12,12,2,NULL,NULL,12,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(23,'2000-03-03',23,NULL,13,NULL,13,13,3,NULL,NULL,13,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(24,'2000-03-03',24,NULL,14,NULL,14,14,4,NULL,NULL,14,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(25,'2000-03-03',25,NULL,15,NULL,15,15,5,NULL,NULL,15,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(26,'2000-03-03',26,NULL,16,NULL,16,16,6,NULL,NULL,16,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(27,'2000-03-03',27,NULL,17,NULL,17,17,7,NULL,NULL,17,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(28,'2000-03-03',28,NULL,18,NULL,18,18,8,NULL,NULL,18,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(29,'2000-03-03',29,NULL,19,NULL,19,19,9,NULL,NULL,19,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(30,'2000-03-03',30,NULL,20,NULL,20,20,10,NULL,NULL,20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(31,'2000-03-03',31,NULL,21,NULL,21,21,NULL,10,NULL,21,NULL,NULL,1,1,NULL,NULL,NULL,NULL,NULL),(32,'2000-03-03',32,NULL,22,NULL,22,22,NULL,10,NULL,22,NULL,NULL,2,2,NULL,NULL,NULL,NULL,NULL),(33,'2000-03-03',33,NULL,23,NULL,23,23,NULL,10,NULL,23,NULL,NULL,3,3,NULL,NULL,NULL,NULL,NULL),(34,'2000-03-03',34,NULL,24,NULL,24,24,NULL,10,NULL,24,NULL,NULL,4,4,NULL,NULL,NULL,NULL,NULL),(35,'2000-03-03',35,NULL,25,NULL,25,25,NULL,10,NULL,25,NULL,NULL,5,5,NULL,NULL,NULL,NULL,NULL),(36,'2000-03-03',36,NULL,26,NULL,26,26,NULL,10,NULL,26,NULL,NULL,6,6,NULL,NULL,NULL,NULL,NULL),(37,'2000-03-03',37,NULL,27,NULL,27,27,NULL,10,NULL,27,NULL,NULL,7,7,NULL,NULL,NULL,NULL,NULL),(38,'2000-03-03',38,NULL,28,NULL,28,28,NULL,10,NULL,28,NULL,NULL,8,8,NULL,NULL,NULL,NULL,NULL),(39,'2000-03-03',39,NULL,29,NULL,29,29,NULL,10,NULL,29,NULL,NULL,9,9,NULL,NULL,NULL,NULL,NULL),(40,'2000-03-03',40,NULL,30,NULL,30,30,NULL,10,NULL,30,NULL,NULL,10,10,NULL,NULL,NULL,NULL,NULL),(41,'2000-03-03',41,NULL,31,NULL,31,NULL,11,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(42,'2000-03-03',42,NULL,32,NULL,32,NULL,12,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(43,'2000-03-03',43,NULL,33,NULL,33,NULL,13,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(44,'2000-03-03',44,NULL,34,NULL,34,NULL,14,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(45,'2000-03-03',45,NULL,35,NULL,35,NULL,15,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(46,'2000-03-03',46,NULL,36,NULL,36,NULL,16,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(47,'2000-03-03',47,NULL,37,NULL,37,NULL,17,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(48,'2000-03-03',48,NULL,38,NULL,38,NULL,18,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(49,'2000-03-03',49,NULL,39,NULL,39,NULL,19,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(50,'2000-03-03',50,NULL,40,NULL,40,NULL,20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(51,'2000-03-03',51,NULL,41,NULL,41,NULL,21,NULL,NULL,31,NULL,NULL,NULL,NULL,1,1,1,1,NULL),(52,'2000-03-03',52,NULL,42,NULL,42,NULL,22,NULL,NULL,32,NULL,NULL,NULL,NULL,2,2,2,2,NULL),(53,'2000-03-03',53,NULL,43,NULL,43,NULL,23,NULL,NULL,33,NULL,NULL,NULL,NULL,3,3,3,3,NULL),(54,'2000-03-03',54,NULL,44,NULL,44,NULL,24,NULL,NULL,34,NULL,NULL,NULL,NULL,4,4,4,4,NULL),(55,'2000-03-03',55,NULL,45,NULL,45,NULL,25,NULL,NULL,35,NULL,NULL,NULL,NULL,5,5,5,5,NULL),(56,'2000-03-03',56,NULL,46,NULL,46,NULL,26,NULL,NULL,36,NULL,NULL,NULL,NULL,6,6,6,6,NULL),(57,'2000-03-03',57,NULL,47,NULL,47,NULL,27,NULL,NULL,37,NULL,NULL,NULL,NULL,7,7,7,7,NULL),(58,'2000-03-03',58,NULL,48,NULL,48,NULL,28,NULL,NULL,38,NULL,NULL,NULL,NULL,8,8,8,8,NULL),(59,'2000-03-03',59,NULL,49,NULL,49,NULL,29,NULL,NULL,39,NULL,NULL,NULL,NULL,9,9,9,9,NULL),(60,'2000-03-03',60,NULL,50,NULL,50,NULL,30,NULL,NULL,40,NULL,NULL,NULL,NULL,10,10,10,10,NULL),(61,'2000-03-03',61,NULL,51,NULL,51,NULL,NULL,NULL,NULL,41,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(62,'2000-03-03',62,NULL,52,NULL,52,NULL,NULL,NULL,NULL,42,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(63,'2000-03-03',63,NULL,53,NULL,53,NULL,NULL,NULL,NULL,43,3,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(64,'2000-03-03',64,NULL,54,NULL,54,NULL,NULL,NULL,NULL,44,4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(65,'2000-03-03',65,NULL,55,NULL,55,NULL,NULL,NULL,NULL,45,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(66,'2000-03-03',66,NULL,56,NULL,56,NULL,NULL,NULL,NULL,46,6,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(67,'2000-03-03',67,NULL,57,NULL,57,NULL,NULL,NULL,NULL,47,7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(68,'2000-03-03',68,NULL,58,NULL,58,NULL,NULL,NULL,NULL,48,8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(69,'2000-03-03',69,NULL,59,NULL,59,NULL,NULL,NULL,NULL,49,9,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(70,'2000-03-03',70,NULL,60,NULL,60,NULL,NULL,NULL,NULL,50,10,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Secondary ITP'),(71,'2018-03-03',71,NULL,NULL,11,61,31,31,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(72,'2018-03-04',72,NULL,NULL,12,62,32,32,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(73,'2018-03-05',73,NULL,NULL,13,63,33,33,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(74,'2018-03-09',74,NULL,NULL,NULL,64,34,34,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(75,'2018-03-10',75,NULL,NULL,NULL,65,35,35,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(76,'2018-03-11',76,NULL,NULL,NULL,66,36,36,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(77,'2018-03-12',77,NULL,61,NULL,NULL,NULL,NULL,NULL,NULL,51,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(78,'2018-03-13',78,NULL,62,NULL,NULL,NULL,NULL,NULL,NULL,52,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(79,'2018-03-14',79,NULL,63,NULL,NULL,NULL,NULL,NULL,NULL,53,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(80,'2018-03-15',80,NULL,NULL,NULL,67,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(81,'2018-03-16',81,NULL,NULL,NULL,68,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(82,'2018-03-17',82,NULL,NULL,NULL,69,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(83,'2018-03-18',83,NULL,64,NULL,70,NULL,NULL,NULL,NULL,54,NULL,NULL,NULL,NULL,11,11,11,11,NULL),(84,'2018-03-18',84,NULL,65,NULL,71,NULL,NULL,NULL,NULL,55,NULL,NULL,NULL,NULL,12,12,12,12,NULL),(85,'2018-03-19',85,NULL,66,NULL,72,NULL,NULL,NULL,NULL,56,NULL,NULL,NULL,NULL,13,13,13,13,NULL),(86,'2018-03-19',86,NULL,67,NULL,73,NULL,NULL,NULL,NULL,57,NULL,NULL,NULL,NULL,14,14,14,14,NULL),(87,'2018-03-20',87,NULL,68,NULL,74,NULL,NULL,NULL,NULL,58,NULL,NULL,NULL,NULL,15,15,15,15,NULL),(88,'2018-03-20',88,NULL,69,NULL,75,NULL,NULL,NULL,NULL,59,NULL,NULL,NULL,NULL,16,16,16,16,NULL),(89,'2018-03-21',89,NULL,69,NULL,75,NULL,NULL,NULL,NULL,60,NULL,NULL,NULL,NULL,16,16,16,16,NULL),(90,'2018-03-22',90,NULL,69,NULL,75,NULL,NULL,NULL,NULL,61,NULL,NULL,NULL,NULL,16,16,16,16,NULL),(91,'2018-03-23',91,NULL,69,NULL,75,NULL,NULL,NULL,NULL,62,NULL,NULL,NULL,NULL,16,16,16,16,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maintenancetherapytable`
--

LOCK TABLES `maintenancetherapytable` WRITE;
/*!40000 ALTER TABLE `maintenancetherapytable` DISABLE KEYS */;
INSERT INTO `maintenancetherapytable` VALUES (1,'Others','Other Regimens'),(2,'Others','Other Regimens'),(3,'Others','Other Regimens'),(4,'Others','Other Regimens'),(5,'Others','Other Regimens'),(6,'Others','Other Regimens'),(7,'Others','Other Regimens'),(8,'Others','Other Regimens'),(9,'Others','Other Regimens'),(10,'Others','Other Regimens');
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
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicaleventstable`
--

LOCK TABLES `medicaleventstable` WRITE;
/*!40000 ALTER TABLE `medicaleventstable` DISABLE KEYS */;
INSERT INTO `medicaleventstable` VALUES (1,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(2,'','',NULL,NULL,NULL,'',''),(3,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(4,NULL,NULL,'','',0,'',NULL),(5,NULL,NULL,'Factor Concentrate','Jan 15, Feb 19',2,'Procedure',NULL),(6,NULL,NULL,'','',0,'',NULL),(7,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(8,'','',NULL,NULL,NULL,'',''),(9,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(10,'','',NULL,NULL,NULL,'',''),(11,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(12,'','',NULL,NULL,NULL,'',''),(13,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(14,'','',NULL,NULL,NULL,'',''),(15,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(16,'','',NULL,NULL,NULL,'',''),(17,'','',NULL,NULL,NULL,'',''),(18,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(19,'Hematologic Malignancy','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(20,'','',NULL,NULL,NULL,'',''),(21,'','',NULL,NULL,NULL,'',''),(22,'','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy'),(23,'','',NULL,NULL,NULL,'',''),(24,'','Other Disease Medication',NULL,NULL,NULL,'Procedure','Chemotherapy');
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
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicationstable`
--

LOCK TABLES `medicationstable` WRITE;
/*!40000 ALTER TABLE `medicationstable` DISABLE KEYS */;
INSERT INTO `medicationstable` VALUES (1,1,'Generic Name',0.1,'0.2'),(2,2,'Generic Name',0.1,'0.2'),(3,3,'',0,''),(4,4,'Generic Name',0.1,'0.2'),(5,5,'Generic Name',0.1,'0.2'),(6,6,'Generic Name',0.1,'0.2'),(7,7,'',0,''),(8,8,'Generic Name',0.1,'0.2'),(9,9,'Generic Name',0.1,'0.2'),(10,10,'Generic Name',0.1,'0.2'),(11,11,'',0,''),(12,12,'Generic Name',0.1,'0.2'),(13,13,'Generic Name',0.1,'0.2'),(14,14,'Generic Name',0.1,'0.2'),(15,15,'',0,''),(16,16,'Generic Name',0.1,'0.2'),(17,17,'Generic Name',0.1,'0.2'),(18,18,'Generic Name',0.1,'0.2'),(19,19,'',0,''),(20,20,'Generic Name',0.1,'0.2'),(21,21,'Generic Name',0.1,'0.2'),(22,22,'Generic Name',0.1,'0.2'),(23,23,'',0,''),(24,24,'Generic Name',0.1,'0.2'),(25,25,'Generic Name',0.1,'0.2'),(26,26,'Generic Name',0.1,'0.2'),(27,27,'',0,''),(28,28,'Generic Name',0.1,'0.2'),(29,29,'Generic Name',0.1,'0.2'),(30,30,'Generic Name',0.1,'0.2'),(31,31,'',0,''),(32,32,'Generic Name',0.1,'0.2'),(33,33,'Generic Name',0.1,'0.2'),(34,34,'Generic Name',0.1,'0.2'),(35,35,'',0,''),(36,36,'Generic Name',0.1,'0.2'),(37,37,'Generic Name',0.1,'0.2'),(38,38,'Generic Name',0.1,'0.2'),(39,39,'',0,''),(40,40,'Generic Name',0.1,'0.2'),(41,41,'Generic Name',0.1,'0.2'),(42,42,'Generic Name',0.1,'0.2'),(43,43,'',0,''),(44,44,'Generic Name',0.1,'0.2'),(45,45,'Generic Name',0.1,'0.2'),(46,46,'Generic Name',0.1,'0.2'),(47,47,'',0,''),(48,48,'Generic Name',0.1,'0.2'),(49,49,'Generic Name',0.1,'0.2'),(50,50,'Generic Name',0.1,'0.2'),(51,51,'',0,''),(52,52,'Generic Name',0.1,'0.2'),(53,53,'Generic Name',0.1,'0.2'),(54,54,'Generic Name',0.1,'0.2'),(55,55,'',0,''),(56,56,'Generic Name',0.1,'0.2'),(57,57,'Generic Name',0.1,'0.2'),(58,58,'Generic Name',0.1,'0.2'),(59,59,'',0,''),(60,60,'Generic Name',0.1,'0.2'),(61,61,'Generic Name',0.1,'0.2'),(62,62,'Generic Name',0.1,'0.2'),(63,63,'',0,''),(64,64,'Generic Name',0.1,'0.2'),(65,65,'Generic Name',0.1,'0.2'),(66,66,'Generic Name',0.1,'0.2'),(67,67,'',0,''),(68,68,'Generic Name',0.1,'0.2'),(69,69,'Generic Name',0.1,'0.2'),(70,70,'Generic Name',0.1,'0.2');
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
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modeoftreatmenttable`
--

LOCK TABLES `modeoftreatmenttable` WRITE;
/*!40000 ALTER TABLE `modeoftreatmenttable` DISABLE KEYS */;
INSERT INTO `modeoftreatmenttable` VALUES (1,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(2,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(3,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(4,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(5,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(6,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(7,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(8,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(9,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(10,'Both Pharmacologic and Supportive','Both Pharmacologic and Supportive'),(11,'Others','Other Treatment 11'),(12,'Others','Other Treatment 12'),(13,'Others','Other Treatment 13'),(14,'Others','Other Treatment 14'),(15,'Others','Other Treatment 15'),(16,'Others','Other Treatment 16'),(17,'Others','Other Treatment 17'),(18,'Others','Other Treatment 18'),(19,'Others','Other Treatment 19'),(20,'Others','Other Treatment 20'),(21,'Others','Others'),(22,'Others','Others'),(23,'Others','Others'),(24,'Others','Others'),(25,'Others','Others'),(26,'Others','Others'),(27,'Others','Others'),(28,'Others','Others'),(29,'Others','Others'),(30,'Others','Others'),(31,'Supportive/Palliative','Supportive/Palliative'),(32,'Supportive/Palliative','Supportive/Palliative'),(33,'Supportive/Palliative','Supportive/Palliative'),(34,'Supportive/Palliative','Supportive/Palliative'),(35,'Supportive/Palliative','Supportive/Palliative'),(36,'Supportive/Palliative','Supportive/Palliative'),(37,'Supportive/Palliative','Supportive/Palliative'),(38,'Supportive/Palliative','Supportive/Palliative'),(39,'Supportive/Palliative','Supportive/Palliative'),(40,'Supportive/Palliative','Supportive/Palliative'),(41,'Supportive','Supportive'),(42,'Supportive','Supportive'),(43,'Supportive','Supportive'),(44,'Supportive','Supportive'),(45,'Supportive','Supportive'),(46,'Supportive','Supportive'),(47,'Supportive','Supportive'),(48,'Supportive','Supportive'),(49,'Supportive','Supportive'),(50,'Supportive','Supportive'),(51,'Others','Others'),(52,'Others','Others'),(53,'Others','Others'),(54,'Others','Others'),(55,'Others','Others'),(56,'Others','Others'),(57,'Others','Others'),(58,'Others','Others'),(59,'Others','Others'),(60,'Others','Others'),(61,'Others','Other Treatment 61'),(62,'Others','Other Treatment 62'),(63,'Others','Other Treatment 63'),(64,'Others','Other Treatment 64'),(65,'Others','Other Treatment 65'),(66,'Others','Other Treatment 66'),(67,'Others','Other Treatment 67'),(68,'Others','Other Treatment 68'),(69,'Others','Other Treatment 69'),(70,'Others','Other Treatment 70');
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
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `otherdiseasestable`
--

LOCK TABLES `otherdiseasestable` WRITE;
/*!40000 ALTER TABLE `otherdiseasestable` DISABLE KEYS */;
INSERT INTO `otherdiseasestable` VALUES (1,1,'Other Diseases in the Family'),(2,2,'Other Diseases in the Family'),(3,3,''),(4,4,'Other Diseases in the Family'),(5,5,'Other Diseases in the Family'),(6,6,'Other Diseases in the Family'),(7,7,''),(8,8,'Other Diseases in the Family'),(9,9,'Other Diseases in the Family'),(10,10,'Other Diseases in the Family'),(11,11,''),(12,12,'Other Diseases in the Family'),(13,13,'Other Diseases in the Family'),(14,14,'Other Diseases in the Family'),(15,15,''),(16,16,'Other Diseases in the Family'),(17,17,'Other Diseases in the Family'),(18,18,'Other Diseases in the Family'),(19,19,''),(20,20,'Other Diseases in the Family'),(21,21,'Other Diseases in the Family'),(22,22,'Other Diseases in the Family'),(23,23,''),(24,24,'Other Diseases in the Family'),(25,25,'Other Diseases in the Family'),(26,26,'Other Diseases in the Family'),(27,27,''),(28,28,'Other Diseases in the Family'),(29,29,'Other Diseases in the Family'),(30,30,'Other Diseases in the Family'),(31,31,''),(32,32,'Other Diseases in the Family'),(33,33,'Other Diseases in the Family'),(34,34,'Other Diseases in the Family'),(35,35,''),(36,36,'Other Diseases in the Family'),(37,37,'Other Diseases in the Family'),(38,38,'Other Diseases in the Family'),(39,39,''),(40,40,'Other Diseases in the Family'),(41,41,'Other Diseases in the Family'),(42,42,'Other Diseases in the Family'),(43,43,''),(44,44,'Other Diseases in the Family'),(45,45,'Other Diseases in the Family'),(46,46,'Other Diseases in the Family'),(47,47,''),(48,48,'Other Diseases in the Family'),(49,49,'Other Diseases in the Family'),(50,50,'Other Diseases in the Family'),(51,51,''),(52,52,'Other Diseases in the Family'),(53,53,'Other Diseases in the Family'),(54,54,'Other Diseases in the Family'),(55,55,''),(56,56,'Other Diseases in the Family'),(57,57,'Other Diseases in the Family'),(58,58,'Other Diseases in the Family'),(59,59,''),(60,60,'Other Diseases in the Family'),(61,61,'Other Diseases in the Family'),(62,62,'Other Diseases in the Family'),(63,63,''),(64,64,'Other Diseases in the Family'),(65,65,'Other Diseases in the Family'),(66,66,'Other Diseases in the Family'),(67,67,''),(68,68,'Other Diseases in the Family'),(69,69,'Other Diseases in the Family'),(70,70,'Other Diseases in the Family');
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
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `otherlaboratoriestable`
--

LOCK TABLES `otherlaboratoriestable` WRITE;
/*!40000 ALTER TABLE `otherlaboratoriestable` DISABLE KEYS */;
INSERT INTO `otherlaboratoriestable` VALUES (1,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(2,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(3,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(4,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(5,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(6,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(7,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(8,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(9,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(10,1.8,1.9,2,2.1,2.2,2.3,'2.4','2.5',3.4,3.5,4,'4.4','4.5',4.6,4.7,4.8,4.9),(11,1.7,NULL,1.3,NULL,NULL,1.6,NULL,NULL,NULL,NULL,1.4,NULL,NULL,NULL,NULL,NULL,NULL),(12,1.7,NULL,1.3,NULL,NULL,1.6,NULL,NULL,NULL,NULL,1.4,NULL,NULL,NULL,NULL,NULL,NULL),(13,1.7,NULL,1.3,NULL,NULL,1.6,NULL,NULL,NULL,NULL,1.4,NULL,NULL,NULL,NULL,NULL,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `othertreatmenttable`
--

LOCK TABLES `othertreatmenttable` WRITE;
/*!40000 ALTER TABLE `othertreatmenttable` DISABLE KEYS */;
INSERT INTO `othertreatmenttable` VALUES (1,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(2,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(3,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(4,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(5,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(6,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(7,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(8,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(9,'Bisphosphonates','2',NULL,'Other Medications','Complications'),(10,'Bisphosphonates','2',NULL,'Other Medications','Complications');
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
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patienttable`
--

LOCK TABLES `patienttable` WRITE;
/*!40000 ALTER TABLE `patienttable` DISABLE KEYS */;
INSERT INTO `patienttable` VALUES (1,1,1,1,1,1,NULL,1,NULL),(2,1,2,2,2,2,NULL,1,NULL),(3,1,3,3,3,3,NULL,1,NULL),(4,1,4,4,4,4,NULL,1,NULL),(5,1,5,5,5,5,NULL,1,NULL),(6,1,6,6,6,6,NULL,1,NULL),(7,1,7,7,7,7,NULL,1,NULL),(8,1,8,8,8,8,NULL,1,NULL),(9,1,9,9,9,9,NULL,1,NULL),(10,1,10,10,10,10,NULL,1,NULL),(11,2,11,11,11,11,NULL,1,NULL),(12,2,12,12,12,12,NULL,1,NULL),(13,2,13,13,13,13,NULL,1,NULL),(14,2,14,14,14,14,NULL,1,NULL),(15,2,15,15,15,15,NULL,1,NULL),(16,2,16,16,16,16,NULL,1,NULL),(17,2,17,17,17,17,NULL,1,NULL),(18,2,18,18,18,18,NULL,1,NULL),(19,2,19,19,19,19,NULL,1,NULL),(20,2,20,20,20,20,NULL,1,NULL),(21,3,21,21,21,21,NULL,1,21),(22,3,22,22,22,22,NULL,1,22),(23,3,23,23,23,23,NULL,1,23),(24,3,24,24,24,24,NULL,1,24),(25,3,25,25,25,25,NULL,1,25),(26,3,26,26,26,26,NULL,1,26),(27,3,27,27,27,27,NULL,1,27),(28,3,28,28,28,28,NULL,1,28),(29,3,29,29,29,29,NULL,1,29),(30,3,30,30,30,30,NULL,1,30),(31,4,31,31,31,31,NULL,1,31),(32,4,32,32,32,32,NULL,1,32),(33,4,33,33,33,33,NULL,1,33),(34,4,34,34,34,34,NULL,1,34),(35,4,35,35,35,35,NULL,1,35),(36,4,36,36,36,36,NULL,1,36),(37,4,37,37,37,37,NULL,1,37),(38,4,38,38,38,38,NULL,1,38),(39,4,39,39,39,39,NULL,1,39),(40,4,40,40,40,40,NULL,1,40),(41,5,41,41,41,41,NULL,1,NULL),(42,5,42,42,42,42,NULL,1,NULL),(43,5,43,43,43,43,NULL,1,NULL),(44,5,44,44,44,44,NULL,1,NULL),(45,5,45,45,45,45,NULL,1,NULL),(46,5,46,46,46,46,NULL,1,NULL),(47,5,47,47,47,47,NULL,1,NULL),(48,5,48,48,48,48,NULL,1,NULL),(49,5,49,49,49,49,NULL,1,NULL),(50,5,50,50,50,50,NULL,1,NULL),(51,6,51,51,51,51,1,1,NULL),(52,6,52,52,52,52,2,1,NULL),(53,6,53,53,53,53,3,1,NULL),(54,6,54,54,54,54,4,1,NULL),(55,6,55,55,55,55,5,1,NULL),(56,6,56,56,56,56,6,1,NULL),(57,6,57,57,57,57,7,1,NULL),(58,6,58,58,58,58,8,1,NULL),(59,6,59,59,59,59,9,1,NULL),(60,6,60,60,60,60,10,1,NULL),(61,7,61,61,61,61,NULL,1,61),(62,7,62,62,62,62,NULL,1,62),(63,7,63,63,63,63,NULL,1,63),(64,7,64,64,64,64,NULL,1,64),(65,7,65,65,65,65,NULL,1,65),(66,7,66,66,66,66,NULL,1,66),(67,7,67,67,67,67,NULL,1,67),(68,7,68,68,68,68,NULL,1,68),(69,7,69,69,69,69,NULL,1,69),(70,7,70,70,70,70,NULL,1,70);
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
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `physicalexamtable`
--

LOCK TABLES `physicalexamtable` WRITE;
/*!40000 ALTER TABLE `physicalexamtable` DISABLE KEYS */;
INSERT INTO `physicalexamtable` VALUES (1,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(2,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(3,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(4,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(5,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(6,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(7,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(8,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(9,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(10,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other findings'),(11,50,50,NULL,NULL,NULL,NULL,0,0,NULL,NULL,NULL,'Other findings'),(12,50,50,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,'Other findings'),(13,50,50,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,'Other findings'),(14,50,50,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,'Other findings'),(15,50,50,NULL,NULL,NULL,NULL,0,0,NULL,NULL,NULL,'Other findings'),(16,50,50,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,'Other findings'),(17,50,50,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,'Other findings'),(18,50,50,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,'Other findings'),(19,50,50,NULL,NULL,NULL,NULL,0,0,NULL,NULL,NULL,'Other findings'),(20,50,50,NULL,NULL,NULL,NULL,1,1,NULL,NULL,NULL,'Other findings'),(21,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(22,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(23,50,50,50,0,0,0,NULL,NULL,NULL,NULL,NULL,'Other findings'),(24,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(25,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(26,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(27,50,50,50,0,0,0,NULL,NULL,NULL,NULL,NULL,'Other findings'),(28,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(29,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(30,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(31,50,50,50,0,0,0,NULL,NULL,NULL,NULL,NULL,'Other findings'),(32,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(33,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(34,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(35,50,50,50,0,0,0,NULL,NULL,NULL,NULL,NULL,'Other findings'),(36,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(37,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(38,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(39,50,50,50,0,0,0,NULL,NULL,NULL,NULL,NULL,'Other findings'),(40,50,50,50,1,1,1,NULL,NULL,NULL,NULL,NULL,'Other findings'),(41,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(42,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(43,50,50,50,0,0,0,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(44,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(45,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(46,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(47,50,50,50,0,0,0,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(48,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(49,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(50,50,50,50,1,1,1,NULL,NULL,'Thrombosis History',NULL,NULL,'Other findings'),(51,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(52,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(53,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(54,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(55,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(56,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(57,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(58,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(59,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(60,50,50,50,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'Other pertinent findings'),(61,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(62,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(63,50,50,NULL,0,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(64,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(65,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(66,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(67,50,50,NULL,0,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(68,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(69,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(70,50,50,NULL,1,NULL,NULL,NULL,NULL,NULL,'Balat',NULL,'Other findings'),(71,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(72,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),(73,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(74,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(75,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),(76,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(77,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),(78,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(79,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),(80,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(81,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),(82,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(83,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),(84,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),(85,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(86,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(87,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),(88,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),(89,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL),(90,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL),(91,NULL,50,25,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prognosticriskscoringtable`
--

LOCK TABLES `prognosticriskscoringtable` WRITE;
/*!40000 ALTER TABLE `prognosticriskscoringtable` DISABLE KEYS */;
INSERT INTO `prognosticriskscoringtable` VALUES (1,'Others',NULL),(2,'Others',NULL),(3,'Others',NULL),(4,'Others',NULL),(5,'Others',NULL),(6,'Others',NULL),(7,'Others',NULL),(8,'Others',NULL),(9,'Others',NULL),(10,'Others',NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regimennontransplanttable`
--

LOCK TABLES `regimennontransplanttable` WRITE;
/*!40000 ALTER TABLE `regimennontransplanttable` DISABLE KEYS */;
INSERT INTO `regimennontransplanttable` VALUES (1,'Others','Other Regimens'),(2,'Others','Other Regimens'),(3,'Others','Other Regimens'),(4,'Others','Other Regimens'),(5,'Others','Other Regimens'),(6,'Others','Other Regimens'),(7,'Others','Other Regimens'),(8,'Others','Other Regimens'),(9,'Others','Other Regimens'),(10,'Others','Other Regimens');
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
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regimentable`
--

LOCK TABLES `regimentable` WRITE;
/*!40000 ALTER TABLE `regimentable` DISABLE KEYS */;
INSERT INTO `regimentable` VALUES (1,'Regimen/Protocol',''),(2,'Regimen/Protocol',''),(3,'Regimen/Protocol',''),(4,'Regimen/Protocol',''),(5,'Regimen/Protocol',''),(6,'Regimen/Protocol',''),(7,'Regimen/Protocol',''),(8,'Regimen/Protocol',''),(9,'Regimen/Protocol',''),(10,'Regimen/Protocol',''),(11,'Regimen/Protocol',''),(12,'Regimen/Protocol',''),(13,'Regimen/Protocol',''),(14,'Regimen/Protocol',''),(15,'Regimen/Protocol',''),(16,'Regimen/Protocol',''),(17,'Regimen/Protocol',''),(18,'Regimen/Protocol',''),(19,'Regimen/Protocol',''),(20,'Regimen/Protocol',''),(21,'Other Regimens','Other Regimens'),(22,'Other Regimens','Other Regimens'),(23,'Other Regimens','Other Regimens'),(24,'Other Regimens','Other Regimens'),(25,'Other Regimens','Other Regimens'),(26,'Other Regimens','Other Regimens'),(27,'Other Regimens','Other Regimens'),(28,'Other Regimens','Other Regimens'),(29,'Other Regimens','Other Regimens'),(30,'Other Regimens','Other Regimens'),(31,'Regimen/Protocol',''),(32,'Regimen/Protocol',''),(33,'Regimen/Protocol',''),(34,'Regimen/Protocol',''),(35,'Regimen/Protocol',''),(36,'Regimen/Protocol',''),(37,'Regimen/Protocol',''),(38,'Regimen/Protocol',''),(39,'Regimen/Protocol',''),(40,'Regimen/Protocol','');
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regimentransplanttable`
--

LOCK TABLES `regimentransplanttable` WRITE;
/*!40000 ALTER TABLE `regimentransplanttable` DISABLE KEYS */;
INSERT INTO `regimentransplanttable` VALUES (1,'Others','Other Regimens'),(2,'Others','Other Regimens'),(3,'Others','Other Regimens'),(4,'Others','Other Regimens'),(5,'Others','Other Regimens'),(6,'Others','Other Regimens'),(7,'Others','Other Regimens'),(8,'Others','Other Regimens'),(9,'Others','Other Regimens'),(10,'Others','Other Regimens');
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
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riskscoretable`
--

LOCK TABLES `riskscoretable` WRITE;
/*!40000 ALTER TABLE `riskscoretable` DISABLE KEYS */;
INSERT INTO `riskscoretable` VALUES (1,'Intermediate Risk',''),(2,'Intermediate Risk',''),(3,'Intermediate Risk',''),(4,'Intermediate Risk',''),(5,'Intermediate Risk',''),(6,'Intermediate Risk',''),(7,'Intermediate Risk',''),(8,'Intermediate Risk',''),(9,'Intermediate Risk',''),(10,'Intermediate Risk',''),(11,'Others','Risk Score Others'),(12,'Others','Risk Score Others'),(13,'Others','Risk Score Others'),(14,'Others','Risk Score Others'),(15,'Others','Risk Score Others'),(16,'Others','Risk Score Others'),(17,'Others','Risk Score Others'),(18,'Others','Risk Score Others'),(19,'Others','Risk Score Others'),(20,'Others','Risk Score Others');
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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serumfreetable`
--

LOCK TABLES `serumfreetable` WRITE;
/*!40000 ALTER TABLE `serumfreetable` DISABLE KEYS */;
INSERT INTO `serumfreetable` VALUES (1,''),(2,'ok'),(3,'ok'),(4,'ok'),(5,''),(6,'ok'),(7,'ok'),(8,'ok'),(9,''),(10,'ok'),(11,'Ok'),(12,'Ok'),(13,'Ok'),(14,'Ok'),(15,'Ok'),(16,'Ok');
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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serumimmunofixationtable`
--

LOCK TABLES `serumimmunofixationtable` WRITE;
/*!40000 ALTER TABLE `serumimmunofixationtable` DISABLE KEYS */;
INSERT INTO `serumimmunofixationtable` VALUES (1,''),(2,'ok'),(3,'ok'),(4,'ok'),(5,''),(6,'ok'),(7,'ok'),(8,'ok'),(9,''),(10,'ok'),(11,'Ok'),(12,'Ok'),(13,'Ok'),(14,'Ok'),(15,'Ok'),(16,'Ok');
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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serumproteintable`
--

LOCK TABLES `serumproteintable` WRITE;
/*!40000 ALTER TABLE `serumproteintable` DISABLE KEYS */;
INSERT INTO `serumproteintable` VALUES (1,''),(2,'ok'),(3,'ok'),(4,'ok'),(5,''),(6,'ok'),(7,'ok'),(8,'ok'),(9,''),(10,'ok'),(11,'Ok'),(12,'Ok'),(13,'Ok'),(14,'Ok'),(15,'Ok'),(16,'Ok');
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `severitytable`
--

LOCK TABLES `severitytable` WRITE;
/*!40000 ALTER TABLE `severitytable` DISABLE KEYS */;
INSERT INTO `severitytable` VALUES (1,'3'),(2,'3'),(3,'3'),(4,'3'),(5,'3'),(6,'3'),(7,'3'),(8,'3'),(9,'3'),(10,'3');
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
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tissuespecimentable`
--

LOCK TABLES `tissuespecimentable` WRITE;
/*!40000 ALTER TABLE `tissuespecimentable` DISABLE KEYS */;
INSERT INTO `tissuespecimentable` VALUES (1,'BMA'),(2,'BB'),(3,''),(4,'BMA'),(5,'BB'),(6,'LN'),(7,''),(8,'BB'),(9,'LN'),(10,'LN'),(11,''),(12,''),(13,''),(14,''),(15,''),(16,''),(17,''),(18,''),(19,''),(20,''),(21,'BMA'),(22,'BB'),(23,''),(24,'BMA'),(25,'BB'),(26,'LN'),(27,''),(28,'BB'),(29,'LN'),(30,'LN'),(31,''),(32,'BB'),(33,'LN'),(34,'BMA'),(35,''),(36,'LN'),(37,'BMA'),(38,'BB'),(39,''),(40,'LN'),(41,'BMA'),(42,'BB'),(43,''),(44,'BMA'),(45,'BB'),(46,'LN'),(47,''),(48,'BB'),(49,'LN'),(50,'LN'),(51,''),(52,'BB'),(53,'LN'),(54,'BMA'),(55,''),(56,'LN'),(57,'BMA'),(58,'BB'),(59,''),(60,'LN'),(61,''),(62,''),(63,''),(64,''),(65,''),(66,''),(67,''),(68,''),(69,''),(70,'');
/*!40000 ALTER TABLE `tissuespecimentable` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `treatmenttable`
--

LOCK TABLES `treatmenttable` WRITE;
/*!40000 ALTER TABLE `treatmenttable` DISABLE KEYS */;
INSERT INTO `treatmenttable` VALUES (1,1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,'2010-01-01',NULL),(2,1,2,2,NULL,NULL,NULL,NULL,NULL,NULL,'2011-02-02',NULL),(3,0,3,3,NULL,NULL,NULL,NULL,NULL,NULL,'2012-03-03',NULL),(4,1,4,4,NULL,NULL,NULL,NULL,NULL,NULL,'2013-04-04',NULL),(5,1,5,5,NULL,NULL,NULL,NULL,NULL,NULL,'2014-05-05',NULL),(6,1,6,6,NULL,NULL,NULL,NULL,NULL,NULL,'2010-01-06',NULL),(7,0,7,7,NULL,NULL,NULL,NULL,NULL,NULL,'2011-02-07',NULL),(8,1,8,8,NULL,NULL,NULL,NULL,NULL,NULL,'2012-03-08',NULL),(9,1,9,9,NULL,NULL,NULL,NULL,NULL,NULL,'2013-04-09',NULL),(10,1,10,10,NULL,NULL,NULL,NULL,NULL,NULL,'2014-05-10',NULL),(11,NULL,11,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,NULL,12,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,NULL,13,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,NULL,14,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,NULL,15,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,NULL,16,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(17,NULL,17,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(18,NULL,18,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(19,NULL,19,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(20,NULL,20,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(21,NULL,21,11,NULL,1,NULL,NULL,NULL,21,'2010-01-01',NULL),(22,NULL,22,12,NULL,2,NULL,NULL,NULL,22,'2011-02-02',NULL),(23,NULL,23,13,NULL,3,NULL,NULL,NULL,23,'2012-03-03',NULL),(24,NULL,24,14,NULL,4,NULL,NULL,NULL,24,'2013-04-04',NULL),(25,NULL,25,15,NULL,5,NULL,NULL,NULL,25,'2014-05-05',NULL),(26,NULL,26,16,NULL,6,NULL,NULL,NULL,26,'2010-01-06',NULL),(27,NULL,27,17,NULL,7,NULL,NULL,NULL,27,'2011-02-07',NULL),(28,NULL,28,18,NULL,8,NULL,NULL,NULL,28,'2012-03-08',NULL),(29,NULL,29,19,NULL,9,NULL,NULL,NULL,29,'2013-04-09',NULL),(30,NULL,30,20,NULL,10,NULL,NULL,NULL,30,'2014-05-10',NULL),(31,NULL,31,21,NULL,11,NULL,NULL,NULL,31,'2010-01-01','Complications'),(32,NULL,32,22,NULL,12,NULL,NULL,NULL,32,'2011-02-02','Complications'),(33,NULL,33,23,NULL,13,NULL,NULL,NULL,33,'2012-03-03','Complications'),(34,NULL,34,24,NULL,14,NULL,NULL,NULL,34,'2013-04-04','Complications'),(35,NULL,35,25,NULL,15,NULL,NULL,NULL,35,'2014-05-05','Complications'),(36,NULL,36,26,NULL,16,NULL,NULL,NULL,36,'2010-01-06','Complications'),(37,NULL,37,27,NULL,17,NULL,NULL,NULL,37,'2011-02-07','Complications'),(38,NULL,38,28,NULL,18,NULL,NULL,NULL,38,'2012-03-08','Complications'),(39,NULL,39,29,NULL,19,NULL,NULL,NULL,39,'2013-04-09','Complications'),(40,NULL,40,30,NULL,20,NULL,NULL,NULL,40,'2014-05-10','Complications'),(41,NULL,41,31,NULL,NULL,NULL,NULL,NULL,NULL,'2010-01-01',NULL),(42,NULL,42,32,NULL,NULL,NULL,NULL,NULL,NULL,'2011-02-02',NULL),(43,NULL,43,33,NULL,NULL,NULL,NULL,NULL,NULL,'2012-03-03',NULL),(44,NULL,44,34,NULL,NULL,NULL,NULL,NULL,NULL,'2013-04-04',NULL),(45,NULL,45,35,NULL,NULL,NULL,NULL,NULL,NULL,'2014-05-05',NULL),(46,NULL,46,36,NULL,NULL,NULL,NULL,NULL,NULL,'2010-01-06',NULL),(47,NULL,47,37,NULL,NULL,NULL,NULL,NULL,NULL,'2011-02-07',NULL),(48,NULL,48,38,NULL,NULL,NULL,NULL,NULL,NULL,'2012-03-08',NULL),(49,NULL,49,39,NULL,NULL,NULL,NULL,NULL,NULL,'2013-04-09',NULL),(50,NULL,50,40,NULL,NULL,NULL,NULL,NULL,NULL,'2014-05-10',NULL),(51,0,51,NULL,1,21,1,1,NULL,51,'2010-01-01','Complications'),(52,1,52,NULL,2,22,2,2,NULL,52,'2011-02-02','Complications'),(53,1,53,NULL,3,23,3,3,NULL,53,'2012-03-03','Complications'),(54,1,54,NULL,4,24,4,4,NULL,54,'2013-04-04','Complications'),(55,0,55,NULL,5,25,5,5,NULL,55,'2014-05-05','Complications'),(56,1,56,NULL,6,26,6,6,NULL,56,'2010-01-06','Complications'),(57,1,57,NULL,7,27,7,7,NULL,57,'2011-02-07','Complications'),(58,1,58,NULL,8,28,8,8,NULL,58,'2012-03-08','Complications'),(59,0,59,NULL,9,29,9,9,NULL,59,'2013-04-09','Complications'),(60,1,60,NULL,10,30,10,10,NULL,60,'2014-05-10','Complications'),(61,NULL,61,NULL,NULL,31,NULL,NULL,NULL,NULL,'2010-01-01','Complications'),(62,NULL,62,NULL,NULL,32,NULL,NULL,NULL,NULL,'2011-02-02','Complications'),(63,NULL,63,NULL,NULL,33,NULL,NULL,NULL,NULL,'2012-03-03','Complications'),(64,NULL,64,NULL,NULL,34,NULL,NULL,NULL,NULL,'2013-04-04','Complications'),(65,NULL,65,NULL,NULL,35,NULL,NULL,NULL,NULL,'2014-05-05','Complications'),(66,NULL,66,NULL,NULL,36,NULL,NULL,NULL,NULL,'2010-01-06','Complications'),(67,NULL,67,NULL,NULL,37,NULL,NULL,NULL,NULL,'2011-02-07','Complications'),(68,NULL,68,NULL,NULL,38,NULL,NULL,NULL,NULL,'2012-03-08','Complications'),(69,NULL,69,NULL,NULL,39,NULL,NULL,NULL,NULL,'2013-04-09','Complications'),(70,NULL,70,NULL,NULL,40,NULL,NULL,NULL,NULL,'2014-05-10','Complications');
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uppergiendoscopytable`
--

LOCK TABLES `uppergiendoscopytable` WRITE;
/*!40000 ALTER TABLE `uppergiendoscopytable` DISABLE KEYS */;
INSERT INTO `uppergiendoscopytable` VALUES (1,'2010-01-01','Upper GI Endoscopy',1),(2,'2011-02-02','Upper GI Endoscopy',1),(3,'','',0),(4,'2013-04-04','Upper GI Endoscopy',1),(5,'2014-05-05','Upper GI Endoscopy',1),(6,'2010-01-06','Upper GI Endoscopy',1),(7,'','',0),(8,'2012-03-08','Upper GI Endoscopy',1),(9,'2013-04-09','Upper GI Endoscopy',1),(10,'2014-05-10','Upper GI Endoscopy',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `urineproteintable`
--

LOCK TABLES `urineproteintable` WRITE;
/*!40000 ALTER TABLE `urineproteintable` DISABLE KEYS */;
INSERT INTO `urineproteintable` VALUES (1,''),(2,'ok'),(3,'ok'),(4,'ok'),(5,''),(6,'ok'),(7,'ok'),(8,'ok'),(9,''),(10,'ok'),(11,'Ok'),(12,'Ok'),(13,'Ok'),(14,'Ok'),(15,'Ok'),(16,'Ok');
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

-- Dump completed on 2018-03-09 10:48:39
