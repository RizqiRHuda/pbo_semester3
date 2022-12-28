-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2022 at 07:50 AM
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
-- Database: `dbperpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `idanggota` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `telepon` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`idanggota`, `nama`, `alamat`, `telepon`) VALUES
(1, 'Ari', 'Pemalang', '081526221813'),
(2, 'Boni', 'Rembang', '082872113212'),
(3, 'Cintya', 'Solo', '085119821023'),
(4, 'Ari', 'Pemalang', '081526221813'),
(5, 'Boni', 'Rembang', '082872113212'),
(6, 'Cintya', 'Solo', '085119821023'),
(7, 'Ari', 'Pemalang', '081526221813'),
(8, 'Boni', 'Rembang', '082872113212'),
(9, 'Cintya', 'Solo', '085119821023'),
(10, 'Ari', 'Pemalang', '081526221813'),
(11, 'Boni', 'Rembang', '082872113212'),
(12, 'Cintya', 'Solo', '085119821023'),
(13, 'Ari', 'Pemalang', '081526221813'),
(14, 'Boni', 'Rembang', '082872113212'),
(16, 'Ari', 'Pemalang', '081526221813'),
(17, 'Boni', 'Rembang', '082872113212'),
(19, 'Ari', 'Pemalang', '081526221813'),
(20, 'Boni', 'Rembang', '082872113212'),
(22, 'Ari', 'Pemalang', '081526221813'),
(23, 'Boni', 'Rembang', '082872113212'),
(25, 'Ari', 'Pemalang', '081526221813'),
(26, 'Boni', 'Rembang', '082872113212'),
(28, 'Ari', 'Pemalang', '081526221813'),
(29, 'Boni', 'Rembang', '082872113212'),
(31, 'Ari', 'Pemalang', '081526221813'),
(32, 'Boni', 'Rembang', '082872113212'),
(34, 'Ari', 'Pemalang', '081526221813'),
(35, 'Boni', 'Rembang', '082872113212'),
(37, 'Ari', 'Pemalang', '081526221813'),
(38, 'Boni', 'Rembang', '082872113212'),
(40, 'Ari', 'Pemalang', '081526221813'),
(41, 'Boni', 'Rembang', '082872113212'),
(43, 'Ari', 'Pemalang', '081526221813'),
(44, 'Boni', 'Rembang', '082872113212'),
(46, 'Ari', 'Pemalang', '081526221813'),
(47, 'Boni', 'Rembang', '082872113212'),
(49, 'Ari', 'Pemalang', '081526221813'),
(50, 'Boni', 'Rembang', '082872113212'),
(52, 'Ari', 'Pemalang', '081526221813'),
(53, 'Boni', 'Rembang', '082872113212'),
(55, 'Ari', 'Pemalang', '081526221813'),
(56, 'Boni', 'Rembang', '082872113212'),
(58, 'Ari', 'Pemalang', '081526221813'),
(59, 'Boni', 'Rembang', '082872113212'),
(61, 'Ari', 'Pemalang', '081526221813'),
(62, 'Boni', 'Rembang', '082872113212'),
(64, 'Ari', 'Pemalang', '081526221813'),
(65, 'Boni', 'Rembang', '082872113212'),
(67, 'Ari', 'Pemalang', '081526221813'),
(68, 'Boni', 'Rembang', '082872113212');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `idbuku` int(11) NOT NULL,
  `idkategori` int(11) DEFAULT NULL,
  `judul` varchar(255) DEFAULT NULL,
  `penerbit` varchar(255) DEFAULT NULL,
  `penulis` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`idbuku`, `idkategori`, `judul`, `penerbit`, `penulis`) VALUES
(1, 152, 'Timun Mas', 'Elex Media', 'Kentjana Berlian'),
(2, 153, 'Aljabar Linier', 'Springer', 'Alex Baldwin');

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `idkategori` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `keterangan` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`idkategori`, `nama`, `keterangan`) VALUES
(49, ' komik', ' kartun'),
(51, 'Referensi', ' Buku referensi ilmiah'),
(52, ' Komik', ' Komik anak-anak'),
(54, 'Referensi', ' Buku referensi ilmiah'),
(55, ' Komik', ' Komik anak-anak'),
(57, 'Referensi', ' Buku referensi ilmiah'),
(58, ' Komik', ' Komik anak-anak'),
(60, 'Referensi', ' Buku referensi ilmiah'),
(61, ' Komik', ' Komik anak-anak'),
(63, 'Referensi', ' Buku referensi ilmiah'),
(64, ' Komik', ' Komik anak-anak'),
(66, 'Referensi', ' Buku referensi ilmiah'),
(67, ' Komik', ' Komik anak-anak'),
(69, 'Referensi', ' Buku referensi ilmiah'),
(70, ' Komik', ' Komik anak-anak'),
(72, 'Referensi', ' Buku referensi ilmiah'),
(73, ' Komik', ' Komik anak-anak'),
(75, 'Referensi', ' Buku referensi ilmiah'),
(76, ' Komik', ' Komik anak-anak'),
(78, 'Referensi', ' Buku referensi ilmiah'),
(79, ' Komik', ' Komik anak-anak'),
(81, 'Referensi', ' Buku referensi ilmiah'),
(82, ' Komik', ' Komik anak-anak'),
(84, 'Referensi', ' Buku referensi ilmiah'),
(85, ' Komik', ' Komik anak-anak'),
(87, 'Referensi', ' Buku referensi ilmiah'),
(88, ' Komik', ' Komik anak-anak'),
(90, 'Referensi', ' Buku referensi ilmiah'),
(91, ' Komik', ' Komik anak-anak'),
(93, 'Referensi', ' Buku referensi ilmiah'),
(94, ' Komik', ' Komik anak-anak'),
(96, 'Referensi', ' Buku referensi ilmiah'),
(97, ' Komik', ' Komik anak-anak'),
(99, 'Referensi', ' Buku referensi ilmiah'),
(100, ' Komik', ' Komik anak-anak'),
(102, 'Referensi', ' Buku referensi ilmiah'),
(103, ' Komik', ' Komik anak-anak'),
(105, 'Referensi', ' Buku referensi ilmiah'),
(106, ' Komik', ' Komik anak-anak'),
(108, 'Referensi', ' Buku referensi ilmiah'),
(109, ' Komik', ' Komik anak-anak'),
(111, 'Referensi', ' Buku referensi ilmiah'),
(112, ' Komik', ' Komik anak-anak'),
(114, 'Referensi', ' Buku referensi ilmiah'),
(115, ' Komik', ' Komik anak-anak'),
(117, 'Referensi', ' Buku referensi ilmiah'),
(118, ' Komik', ' Komik anak-anak'),
(120, 'Referensi', ' Buku referensi ilmiah'),
(121, ' Komik', ' Komik anak-anak'),
(123, 'Referensi', ' Buku referensi ilmiah'),
(124, ' Komik', ' Komik anak-anak'),
(125, ' Novel', ' Koleksi buku novel'),
(126, ' Referensi', ' Buku referensi ilmiah'),
(127, ' Novel', ' Koleksi buku novel'),
(128, ' Referensi', ' Buku referensi ilmiah'),
(129, ' Novel', ' Koleksi buku novel'),
(130, ' Referensi', ' Buku referensi ilmiah'),
(131, ' Novel', ' Koleksi buku novel'),
(132, ' Referensi', ' Buku referensi ilmiah'),
(134, 'Referensi', ' Buku referensi ilmiah'),
(135, ' Komik', ' Komik anak-anak'),
(137, 'Referensi', ' Buku referensi ilmiah'),
(138, ' Komik', ' Komik anak-anak'),
(140, 'Referensi', ' Buku referensi ilmiah'),
(141, ' Komik', ' Komik anak-anak'),
(142, ' Novel', ' Koleksi buku novel'),
(143, ' Referensi', ' Buku referensi ilmiah'),
(144, ' Novel', ' Koleksi buku novel'),
(145, ' Referensi', ' Buku referensi ilmiah'),
(146, ' Novel', ' Koleksi buku novel'),
(147, ' Referensi', ' Buku referensi ilmiah'),
(148, ' Novel', ' Koleksi buku novel'),
(149, ' Referensi', ' Buku referensi ilmiah'),
(150, ' Novel', ' Koleksi buku novel'),
(151, ' Referensi', ' Buku referensi ilmiah'),
(152, ' Novel', ' Koleksi buku novel'),
(153, ' Referensi', ' Buku referensi ilmiah'),
(155, 'Referensi', ' Buku referensi ilmiah'),
(156, ' Komik', ' Komik anak-anak'),
(158, 'Referensi', ' Buku referensi ilmiah'),
(159, ' Komik', ' Komik anak-anak'),
(160, ' Novel', ' Koleksi buku novel'),
(161, ' Referensi', ' Buku referensi ilmiah');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `idpeminjaman` int(11) NOT NULL,
  `idanggota` int(11) DEFAULT NULL,
  `idbuku` int(11) DEFAULT NULL,
  `tanggalpinjam` date DEFAULT NULL,
  `tanggalkembali` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`idpeminjaman`, `idanggota`, `idbuku`, `tanggalpinjam`, `tanggalkembali`) VALUES
(2, 1, 1, '2022-12-01', '2022-12-08');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`idanggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`idbuku`),
  ADD KEY `idkategori` (`idkategori`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`idkategori`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`idpeminjaman`),
  ADD KEY `idanggota` (`idanggota`),
  ADD KEY `idbuku` (`idbuku`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `anggota`
--
ALTER TABLE `anggota`
  MODIFY `idanggota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `idbuku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `kategori`
--
ALTER TABLE `kategori`
  MODIFY `idkategori` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=162;

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `idpeminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `idkategori` FOREIGN KEY (`idkategori`) REFERENCES `kategori` (`idkategori`);

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `idanggota` FOREIGN KEY (`idanggota`) REFERENCES `anggota` (`idanggota`),
  ADD CONSTRAINT `idbuku` FOREIGN KEY (`idbuku`) REFERENCES `buku` (`idbuku`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
