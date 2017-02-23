-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 16, 2017 at 04:25 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `everydayart`
--

-- --------------------------------------------------------

--
-- Table structure for table `adj`
--

CREATE TABLE `adj` (
  `adj_id` decimal(10,0) NOT NULL,
  `aresult` varchar(128) DEFAULT NULL,
  `atag` varchar(128) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adj`
--

INSERT INTO `adj` (`adj_id`, `aresult`, `atag`) VALUES
('0', 'A young', 'human'),
('1', 'A tough', 'human'),
('2', 'An obese', 'human'),
('3', 'A goblin', 'fantasy'),
('4', 'A muscular', 'human'),
('5', 'A reptilian', 'animal'),
('6', 'A tree-cursed', 'nature'),
('7', 'A burning', 'nature'),
('8', 'A chained down', 'fantasy'),
('9', 'A cursed and bound', 'fantasy');

-- --------------------------------------------------------

--
-- Table structure for table `noun`
--

CREATE TABLE `noun` (
  `noun_id` decimal(10,0) NOT NULL,
  `nresult` varchar(128) DEFAULT NULL,
  `ntag` varchar(128) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `noun`
--

INSERT INTO `noun` (`noun_id`, `nresult`, `ntag`) VALUES
('0', 'archer', 'fantasy'),
('1', 'wizard', 'fantasy'),
('2', 'dragon', 'fantasy'),
('3', 'knight', 'fantasy'),
('4', 'helpless queen', 'human'),
('5', 'underground miner', 'human'),
('6', 'business executive', 'human'),
('7', 'mermaid', 'fantasy'),
('8', 'president', 'human'),
('9', 'man with wings', 'fantasy');

-- --------------------------------------------------------

--
-- Table structure for table `verb`
--

CREATE TABLE `verb` (
  `verb_id` decimal(10,0) NOT NULL,
  `vresult` varchar(128) DEFAULT NULL,
  `vtag` varchar(128) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `verb`
--

INSERT INTO `verb` (`verb_id`, `vresult`, `vtag`) VALUES
('0', 'struggles to get his morning coffee', 'human'),
('1', 'obliterates crowd in line waiting for black friday deals', 'human'),
('2', 'soothes a pack of lions with their saxophone playing', 'human'),
('3', 'dropping the hottest mixtape', 'human'),
('4', 'fights with bigger version of themselves over a mate', 'human'),
('5', 'flies through the rainforest using only their tongue', 'animal'),
('6', 'uproots all the foiliage using only their psychic powers', 'nature'),
('7', 'jumps out a scryscraper as its blowing up', 'action'),
('8', 'hacking into the United States government', 'human'),
('9', 'saving the wrong princess', 'fantasy');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adj`
--
ALTER TABLE `adj`
  ADD PRIMARY KEY (`adj_id`);

--
-- Indexes for table `noun`
--
ALTER TABLE `noun`
  ADD PRIMARY KEY (`noun_id`);

--
-- Indexes for table `verb`
--
ALTER TABLE `verb`
  ADD PRIMARY KEY (`verb_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
