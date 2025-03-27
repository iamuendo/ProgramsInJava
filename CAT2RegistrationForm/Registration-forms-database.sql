/*M!999999\- enable the sandbox mode */ 
-- MariaDB dump 10.19-11.7.2-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: CAT2registration
-- ------------------------------------------------------
-- Server version	11.7.2-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*M!100616 SET @OLD_NOTE_VERBOSITY=@@NOTE_VERBOSITY, NOTE_VERBOSITY=0 */;

--
-- Table structure for table `form1`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `form1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `mobile` int(11) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `address` text DEFAULT NULL,
  `terms` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `form1`
--

LOCK TABLES `form1` WRITE;
/*!40000 ALTER TABLE `form1` DISABLE KEYS */;
INSERT INTO `form1` VALUES
(3,'Isaac Muendo',715552889,'Male','30-August-2000','Ruiru, Kiambu',1),
(4,'Michael Samson',115552889,'Male','3-May-2001','Juja, Kiambu',1),
(5,'Jane Wanjiku',78398239,'Female','5-February-2003','Nairobi, Kenya',1);
/*!40000 ALTER TABLE `form1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `form2`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `form2` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `contact` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `form2`
--

LOCK TABLES `form2` WRITE;
/*!40000 ALTER TABLE `form2` DISABLE KEYS */;
INSERT INTO `form2` VALUES
('BBIT-01-0024/2025','Jane Doe','Female',437589345,'Nairobi, Kenya'),
('BCS-01-0024/2025','Mary','Female',110489489,'Mombasa'),
('BIT-04-0024/2025','Michael','Male',980980080,'Juja, Kiambu'),
('BSE-01-0024/2025','Muendo Isaac Maingi','Male',715552889,'Ruiru, Kiambu'),
('BSE-02-0024/2025','John Doe','Male',232343242,'Nairobi, Kenya');
/*!40000 ALTER TABLE `form2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'CAT2registration'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*M!100616 SET NOTE_VERBOSITY=@OLD_NOTE_VERBOSITY */;

-- Dump completed on 2025-03-27 11:05:02
