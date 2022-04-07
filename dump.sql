-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 07-Abr-2022 às 18:52
-- Versão do servidor: 10.4.19-MariaDB
-- versão do PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `cadastro_march_2022`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `id` int(11) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `sobrenome` varchar(20) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `fone` varchar(20) NOT NULL,
  `logradouro` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`id`, `cpf`, `nome`, `sobrenome`, `email`, `fone`, `logradouro`) VALUES
(1, '000.553.555-74', 'Sérgio Felipe', 'Starke', 'sergiostarke@gmail.com', '47-99917.93.29', 'Regente Feijó nº198. Vila Nova. Blumenau SC.'),
(2, '111.444.333-55', 'Tavares', 'Araujo', 'TA@outlook.com', '47-3333.33.33', 'Tardales Tribes n333 Centro'),
(3, '666.444.222.55', 'Magnólia Catarina', 'Soares', '', '47-44444.44.44', 'Lugar Qualquer nº 001 Fideles São Bento do Sul SC'),
(4, '222.888.888.55', 'Abigail Cristina', 'Mesquita', 'ACM@gmail.com', '47-3333.33.33', 'Arthuro Toscanini nº10 Centro São Paulo SP'),
(5, '000.222.555.77', 'Daize', 'Hofmann', 'dh@outlook.com', '47-99999.99.99', 'Para Teste'),
(6, '999.999.999-88', 'Aluarte', 'Alurez', 'aa@outlook.com', '33.33.33.33', 'Teste'),
(7, '333.333.333.55', 'Sabrina', 'Sardez', '', '47-33344.33.33', 'Teste'),
(8, '111.222.333.44', 'Katia', 'Angioletti', 'ka@ual.com', '47-88888.99.77', 'Augusta n 123 Agua Verde Blumenau SC'),
(9, '444.444.444.44', 'Madalena', 'Starke', '', '47-3333.33.66', 'Teste'),
(10, '002.999.333.22', 'Beatriz Cristina', 'Bublitz', '', '47-3333.33.55', 'Teste');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
