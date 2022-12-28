-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2022 at 07:43 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbcatering`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `idadmin` int(11) NOT NULL,
  `namaadmin` varchar(100) NOT NULL,
  `telepon` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`idadmin`, `namaadmin`, `telepon`) VALUES
(1, 'yugy', '5687'),
(2, 'Zein', '087676989'),
(3, 'Pambudi', '0865757808');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `idcustomer` int(11) NOT NULL,
  `namacustomer` varchar(100) NOT NULL,
  `telepon` varchar(25) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`idcustomer`, `namacustomer`, `telepon`, `alamat`) VALUES
(3, 'Zein1', '08123455678', 'Blitar'),
(76, 'Pandu', '0876542123', 'Blitar'),
(77, 'Budi', '0867534525', 'Malang'),
(78, 'Imam', '0858798971', 'Papua'),
(79, 'Cahyadi', '085768799', 'Solo'),
(80, 'r', '1', 'e');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `idmenu` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `harga` int(11) NOT NULL,
  `tambahan` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`idmenu`, `nama`, `harga`, `tambahan`) VALUES
(1, 'Ikan Bakar', 15000, 'tidak pedas\n'),
(2, 'Ayam Bakar', 20000, 'Pakai Serondeng'),
(3, 'Nasi Goreng', 15000, 'Summer dengan sedikit caos'),
(5, 'CapJay', 15000, 'Tidak Pedas + sedikit kuah');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `idtransaksi` int(11) NOT NULL,
  `tanggaltransaksi` datetime DEFAULT NULL,
  `totaltransaksi` int(30) NOT NULL,
  `idadmin` int(11) NOT NULL,
  `idmenu` int(11) NOT NULL,
  `idcustomer` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`idtransaksi`, `tanggaltransaksi`, `totaltransaksi`, `idadmin`, `idmenu`, `idcustomer`) VALUES
(2, '2022-12-12 12:12:12', 13, 1, 1, 3),
(3, '2022-12-12 13:01:02', 200000, 1, 1, 3),
(5, '2022-12-17 00:00:00', 8, 1, 3, 77),
(6, '2022-12-17 00:00:00', 8, 1, 3, 77);

-- --------------------------------------------------------

--
-- Table structure for table `transaksimenu`
--

CREATE TABLE `transaksimenu` (
  `idtransaksimenu` int(11) NOT NULL,
  `idtransaksi` int(11) NOT NULL,
  `idmenu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idadmin`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`idcustomer`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`idmenu`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`idtransaksi`),
  ADD KEY `idadmin` (`idadmin`),
  ADD KEY `idmenu` (`idmenu`),
  ADD KEY `idcustomer` (`idcustomer`);

--
-- Indexes for table `transaksimenu`
--
ALTER TABLE `transaksimenu`
  ADD PRIMARY KEY (`idtransaksimenu`),
  ADD KEY `idtransaksi` (`idtransaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `idadmin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `idcustomer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=81;

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `idmenu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `idtransaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `transaksimenu`
--
ALTER TABLE `transaksimenu`
  MODIFY `idtransaksimenu` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`idadmin`) REFERENCES `admin` (`idadmin`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`idmenu`) REFERENCES `menu` (`idmenu`),
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`idcustomer`) REFERENCES `customer` (`idcustomer`);

--
-- Constraints for table `transaksimenu`
--
ALTER TABLE `transaksimenu`
  ADD CONSTRAINT `transaksimenu_ibfk_1` FOREIGN KEY (`idtransaksi`) REFERENCES `transaksi` (`idtransaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
