-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2015 at 11:13 AM
-- Server version: 5.5.32
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `pnv`
--
CREATE DATABASE IF NOT EXISTS `pnv_erp` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `pnv_erp`;

-- --------------------------------------------------------

--
-- Table structure for table `departments`
--

CREATE TABLE IF NOT EXISTS `departments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dep_code` varchar(45) DEFAULT NULL,
  `dep_name` varchar(45) DEFAULT NULL,
  `description` text,
  `image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `departments`
--

INSERT INTO `departments` (`id`, `dep_code`, `dep_name`, `description`, `image`) VALUES
(1, 'HR', 'Human resource', 'THis is human resource  department', NULL),
(2, 'IT', 'Information Technology', 'this is Information Technology department', NULL),
(3, 'PROD', 'Production', 'this is production', NULL),
(4, 'SEC', 'Security', 'this is HardwareSecurity', NULL),
(5, 'fgh', 'hgfd', 'gfdj', NULL),
(6, 'sda', 'asd', 'asd', 'HABA-avatar.jpg'),
(7, 'sda', 'asd', 'asd', 'HABA-avatar.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE IF NOT EXISTS `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(255) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  `title_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `employees_title_id_fk` (`title_id`),
  KEY `employees_department_id_fk` (`department_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `emp_name`, `address`, `department_id`, `title_id`) VALUES
(1, 'LE LAI', 'male', 1, 2),
(2, 'Ngoc Anh', 'Da Nang', 1, 3),
(3, 'Hoa', 'Quang Binh', 2, 2),
(13, 'test', '', 2, 2),
(14, 'test', 'ssss', 2, 4),
(15, 'ssdas', 'daswas', 2, 5);

-- --------------------------------------------------------

--
-- Table structure for table `titles`
--

CREATE TABLE IF NOT EXISTS `titles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` longtext,
  `title_code` varchar(45) NOT NULL,
  `title_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `titles`
--

INSERT INTO `titles` (`id`, `description`, `title_code`, `title_name`) VALUES
(1, 'this is assistant', 'AS', 'Assistant'),
(2, 'this is programer', 'PR', 'Programer'),
(3, 'this is manager', 'MN', 'Manager'),
(4, 'this is Hardware', 'HW', 'Hardware'),
(5, 'this is assistant', 'AS', 'assistant');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employees`
--
ALTER TABLE `employees`
  ADD CONSTRAINT `employees_department_id_fk` FOREIGN KEY (`department_id`) REFERENCES `departments` (`id`),
  ADD CONSTRAINT `employees_title_id_fk` FOREIGN KEY (`title_id`) REFERENCES `titles` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
