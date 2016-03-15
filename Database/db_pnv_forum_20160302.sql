-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_pnv_forum
-- ------------------------------------------------------
-- Server version	5.6.20

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
-- Table structure for table `bai_dang_hoac_trao_doi`
--

DROP TABLE IF EXISTS `bai_dang_hoac_trao_doi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bai_dang_hoac_trao_doi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_chu_de` int(11) DEFAULT NULL,
  `tieu_de` varchar(255) DEFAULT NULL,
  `the_loai_bai` int(11) DEFAULT NULL,
  `noi_dung` varchar(20000) DEFAULT NULL,
  `luot_thich` int(11) DEFAULT NULL,
  `ngay_dang_bai` datetime DEFAULT NULL,
  `spam` int(11) DEFAULT NULL,
  `is_active` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `chu_de_bai_dang_hoac_trao_doi_id_chu_de_pk_idx` (`id_chu_de`),
  CONSTRAINT `chu_de_bai_dang_hoac_trao_doi_id_chu_de_pk` FOREIGN KEY (`id_chu_de`) REFERENCES `chu_de` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bai_dang_hoac_trao_doi`
--

LOCK TABLES `bai_dang_hoac_trao_doi` WRITE;
/*!40000 ALTER TABLE `bai_dang_hoac_trao_doi` DISABLE KEYS */;
/*!40000 ALTER TABLE `bai_dang_hoac_trao_doi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `binh_luan`
--

DROP TABLE IF EXISTS `binh_luan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `binh_luan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_reference` int(11) DEFAULT NULL,
  `id_thong_tin_ca_nhan` int(11) NOT NULL,
  `id_bai_dang_hoac_trao_doi` int(11) NOT NULL,
  `noi_dung` varchar(1000) NOT NULL,
  `ten_nguoi_binh_luan` varchar(45) NOT NULL,
  `binh_luan_con` int(11) DEFAULT NULL,
  `ngay` datetime DEFAULT NULL,
  `spam` int(11) DEFAULT NULL,
  `is_active` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bai_dang_hoac_trao_doi_binh_luan_id_bai_dang_hoac_trao_doi__idx` (`id_bai_dang_hoac_trao_doi`),
  KEY `binh_luan_binh_luan_id_reference_pk_idx` (`id_reference`),
  KEY `thong_tin_ca_nhan_binh_luan_id_thong_tin_ca_nhan_pk_idx` (`id_thong_tin_ca_nhan`),
  CONSTRAINT `bai_dang_hoac_trao_doi_binh_luan_id_bai_dang_hoac_trao_doi_pk` FOREIGN KEY (`id_bai_dang_hoac_trao_doi`) REFERENCES `bai_dang_hoac_trao_doi` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `binh_luan_binh_luan_id_reference_pk` FOREIGN KEY (`id_reference`) REFERENCES `binh_luan` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `thong_tin_ca_nhan_binh_luan_id_thong_tin_ca_nhan_pk` FOREIGN KEY (`id_thong_tin_ca_nhan`) REFERENCES `thong_tin_ca_nhan` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `binh_luan`
--

LOCK TABLES `binh_luan` WRITE;
/*!40000 ALTER TABLE `binh_luan` DISABLE KEYS */;
/*!40000 ALTER TABLE `binh_luan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chu_de`
--

DROP TABLE IF EXISTS `chu_de`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chu_de` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `chu_de` varchar(55) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chu_de`
--

LOCK TABLES `chu_de` WRITE;
/*!40000 ALTER TABLE `chu_de` DISABLE KEYS */;
/*!40000 ALTER TABLE `chu_de` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dinh_kem`
--

DROP TABLE IF EXISTS `dinh_kem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dinh_kem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_bai_dang_hoac_trao_doi` int(11) DEFAULT NULL,
  `id_loai_tep_tin` int(11) DEFAULT NULL,
  `tep_tin` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bai_dang_hoac_trao_doi_dinh_kem_id_bai_dang_hoac_trao_doi_p_idx` (`id_bai_dang_hoac_trao_doi`),
  KEY `loai_tep_tin_dinh_kem_id_loai_tep_tin_pk_idx` (`id_loai_tep_tin`),
  CONSTRAINT `bai_dang_hoac_trao_doi_dinh_kem_id_bai_dang_hoac_trao_doi_pk` FOREIGN KEY (`id_bai_dang_hoac_trao_doi`) REFERENCES `bai_dang_hoac_trao_doi` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `loai_tep_tin_dinh_kem_id_loai_tep_tin_pk` FOREIGN KEY (`id_loai_tep_tin`) REFERENCES `loai_tep_tin` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dinh_kem`
--

LOCK TABLES `dinh_kem` WRITE;
/*!40000 ALTER TABLE `dinh_kem` DISABLE KEYS */;
/*!40000 ALTER TABLE `dinh_kem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loai_tep_tin`
--

DROP TABLE IF EXISTS `loai_tep_tin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loai_tep_tin` (
  `id` int(11) NOT NULL,
  `ten_loai_tep` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loai_tep_tin`
--

LOCK TABLES `loai_tep_tin` WRITE;
/*!40000 ALTER TABLE `loai_tep_tin` DISABLE KEYS */;
/*!40000 ALTER TABLE `loai_tep_tin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tai_khoan`
--

DROP TABLE IF EXISTS `tai_khoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tai_khoan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `quyen` int(11) NOT NULL,
  `is_active` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tai_khoan`
--

LOCK TABLES `tai_khoan` WRITE;
/*!40000 ALTER TABLE `tai_khoan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tai_khoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thong_tin_ca_nhan`
--

DROP TABLE IF EXISTS `thong_tin_ca_nhan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `thong_tin_ca_nhan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ten` varchar(45) NOT NULL,
  `tuoi` int(11) DEFAULT NULL,
  `lop` varchar(45) NOT NULL,
  `dia_chi` varchar(80) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `avatar` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `account_profile_id_pk` FOREIGN KEY (`id`) REFERENCES `tai_khoan` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thong_tin_ca_nhan`
--

LOCK TABLES `thong_tin_ca_nhan` WRITE;
/*!40000 ALTER TABLE `thong_tin_ca_nhan` DISABLE KEYS */;
/*!40000 ALTER TABLE `thong_tin_ca_nhan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-11  9:45:11
