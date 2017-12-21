-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 21, 2017 at 10:29 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bioregendb`
--

-- --------------------------------------------------------

--
-- Table structure for table `btitbl`
--

CREATE TABLE IF NOT EXISTS `btitbl` (
  `Serial_Number` varchar(50) NOT NULL,
  `Client` varchar(50) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `Date_Install` date NOT NULL,
  `Date_Visit` date NOT NULL,
  `Number_Visit` int(30) NOT NULL,
  `Action_Taken` varchar(50) NOT NULL,
  PRIMARY KEY (`Serial_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `btitbl`
--

INSERT INTO `btitbl` (`Serial_Number`, `Client`, `Address`, `Date_Install`, `Date_Visit`, `Number_Visit`, `Action_Taken`) VALUES
('0000', 'Roj', 'taguig', '2016-11-21', '2016-11-21', 1, 'done');

-- --------------------------------------------------------

--
-- Table structure for table `finaltbl`
--

CREATE TABLE IF NOT EXISTS `finaltbl` (
  `Serial_Number` varchar(50) NOT NULL,
  `Client` varchar(200) NOT NULL,
  `Place_Installed` varchar(200) NOT NULL,
  `Number_of_Visit` int(255) NOT NULL,
  `Date_of_Visit` date NOT NULL,
  `Action_Taken` varchar(200) NOT NULL,
  PRIMARY KEY (`Serial_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `finaltbl`
--

INSERT INTO `finaltbl` (`Serial_Number`, `Client`, `Place_Installed`, `Number_of_Visit`, `Date_of_Visit`, `Action_Taken`) VALUES
('12345', 'OSMAK', 'Makati', 1, '2016-11-30', 'Done');

-- --------------------------------------------------------

--
-- Table structure for table `freseniustbl`
--

CREATE TABLE IF NOT EXISTS `freseniustbl` (
  `Part_Number` varchar(30) NOT NULL,
  `Description` varchar(50) NOT NULL,
  `Price_Dollars` double NOT NULL,
  `UM` varchar(30) NOT NULL,
  `Peso_Equivalent` double NOT NULL,
  PRIMARY KEY (`Part_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `freseniustbl`
--

INSERT INTO `freseniustbl` (`Part_Number`, `Description`, `Price_Dollars`, `UM`, `Peso_Equivalent`) VALUES
('1023', 'kjhjkgjkjvhnv', 1, 'EA', 50),
('1024', 'milk', 10, 'EA', 20),
('105', 'sffs', 20, 'gfsj', 120),
('1053', 'jgjsgdjsag', 20.57, 'gfsj', 120),
('112', 'ok', 2, 'ok', 2),
('114', 'okey', 20, 'ok', 2),
('123', 'apsre', 90, 'not yet', 0),
('156', 'Spare', 450, 'EA', 0),
('200', 'sffs', 89, 'gfsj', 91);

-- --------------------------------------------------------

--
-- Table structure for table `newtbl`
--

CREATE TABLE IF NOT EXISTS `newtbl` (
  `Serial_Number` varchar(50) NOT NULL,
  `Client` varchar(50) NOT NULL,
  `Date_Install` date NOT NULL,
  `Parts_Replaced` varchar(50) NOT NULL,
  `Date_Parts_Replaced` date NOT NULL,
  `Cost_Parts` double NOT NULL,
  PRIMARY KEY (`Serial_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `newtbl`
--

INSERT INTO `newtbl` (`Serial_Number`, `Client`, `Date_Install`, `Parts_Replaced`, `Date_Parts_Replaced`, `Cost_Parts`) VALUES
('121212', 'Makti Med', '2016-11-12', 'bone', '2016-11-12', 2000),
('1313', 'Taguig Med', '2016-11-12', 'bone', '2016-11-12', 2000),
('141414', 'Pasig Med', '2016-11-12', 'bone', '2016-11-12', 2000),
('151515', 'Pasig Med', '2016-11-12', 'bone', '2016-11-12', 30000),
('161616', 'Pasig Med', '2016-11-12', 'bone', '2016-11-12', 30000),
('20202', 'Taguig Med', '2016-11-12', 'bone', '2016-11-12', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `userstbl`
--

CREATE TABLE IF NOT EXISTS `userstbl` (
  `Employee_ID` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Complete_Name` varchar(50) NOT NULL,
  `Position` varchar(50) NOT NULL,
  PRIMARY KEY (`Employee_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userstbl`
--

INSERT INTO `userstbl` (`Employee_ID`, `Password`, `Complete_Name`, `Position`) VALUES
('1122', 'lalai12', 'Rojiely', 'Admin'),
('1333', 'roijiely12', 'admin2', 'Roji palma');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
