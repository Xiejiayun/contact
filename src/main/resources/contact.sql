-- phpMyAdmin SQL Dump
-- version 4.4.13.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 16, 2016 at 01:17 PM
-- Server version: 5.6.27-0ubuntu1
-- PHP Version: 5.6.11-1ubuntu3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `contact`
--
CREATE DATABASE IF NOT EXISTS `contact` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `contact`;

-- --------------------------------------------------------

--
-- Table structure for table `Class`
--

DROP TABLE IF EXISTS `Class`;
CREATE TABLE IF NOT EXISTS `Class` (
  `classid` int(11) NOT NULL,
  `classroom` varchar(20) NOT NULL,
  `description` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='Classroom Info';

--
-- Dumping data for table `Class`
--

INSERT INTO `Class` (`classid`, `classroom`, `description`) VALUES
(1, 'Room1', 'This is a classroom for chinese learning'),
(2, 'Room2', 'This is a room for math learning'),
(3, 'Room3', 'This is a room for English learning'),
(4, 'Room4', 'This is a room for Computer learning'),
(5, 'Room4', 'This is a room for Nature learning'),
(6, 'Room6', 'This is a room for Science learning');

-- --------------------------------------------------------

--
-- Table structure for table `ClaStuRelation`
--

DROP TABLE IF EXISTS `ClaStuRelation`;
CREATE TABLE IF NOT EXISTS `ClaStuRelation` (
  `classid` int(11) DEFAULT NULL,
  `stuid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Class Student Relationship';

--
-- Dumping data for table `ClaStuRelation`
--

INSERT INTO `ClaStuRelation` (`classid`, `stuid`) VALUES
(1, 1),
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `Student`
--

DROP TABLE IF EXISTS `Student`;
CREATE TABLE IF NOT EXISTS `Student` (
  `stuid` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `grade` varchar(20) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='Student Info';

--
-- Dumping data for table `Student`
--

INSERT INTO `Student` (`stuid`, `name`, `gender`, `grade`, `phone`) VALUES
(1, 'Jack', 'male', '9', 100),
(2, 'Tom', 'male', '8', 200),
(3, 'Lucy', 'female', '8', 200),
(4, 'Hellen', 'female', '6', 200),
(5, 'Jeremy', 'male', '10', 200),
(6, 'James', 'male', '8', 200),
(7, 'Amy', 'female', '8', 200),
(8, 'Jennifer', 'female', '8', 200),
(9, 'Allen', 'female', '8', 200),
(10, 'Hank', 'male', '8', 200),
(11, 'John', 'male', '8', 200),
(12, 'Bob', 'male', '6', 200),
(13, 'Jenny', 'female', '8', 200);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Class`
--
ALTER TABLE `Class`
  ADD PRIMARY KEY (`classid`);

--
-- Indexes for table `ClaStuRelation`
--
ALTER TABLE `ClaStuRelation`
  ADD KEY `classid` (`classid`),
  ADD KEY `classid_2` (`classid`),
  ADD KEY `classid_3` (`classid`),
  ADD KEY `stuid` (`stuid`);

--
-- Indexes for table `Student`
--
ALTER TABLE `Student`
  ADD PRIMARY KEY (`stuid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Class`
--
ALTER TABLE `Class`
  MODIFY `classid` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `Student`
--
ALTER TABLE `Student`
  MODIFY `stuid` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `ClaStuRelation`
--
ALTER TABLE `ClaStuRelation`
  ADD CONSTRAINT `class` FOREIGN KEY (`classid`) REFERENCES `Class` (`classid`),
  ADD CONSTRAINT `stu` FOREIGN KEY (`stuid`) REFERENCES `Student` (`stuid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
