-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 11-Jun-2023 às 17:39
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `banco_potencia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `banco`
--

CREATE TABLE `banco` (
  `id_banco` int(30) NOT NULL,
  `agencia` int(50) DEFAULT NULL,
  `localidade` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `banco`
--

INSERT INTO `banco` (`id_banco`, `agencia`, `localidade`) VALUES
(1, 1, 'VIRTUAL');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(50) NOT NULL,
  `id_banco` varchar(500) DEFAULT NULL,
  `cpf` varchar(500) DEFAULT NULL,
  `cnpj` varchar(500) DEFAULT NULL,
  `data_criacao` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `id_banco`, `cpf`, `cnpj`, `data_criacao`) VALUES
(24, '1', '05528832470', NULL, '2023-06-09 14:31:32'),
(25, '1', '5065406540', NULL, '2023-06-10 16:33:44');

-- --------------------------------------------------------

--
-- Estrutura da tabela `contacorrente`
--

CREATE TABLE `contacorrente` (
  `id_conta_corrente` int(50) NOT NULL,
  `id_cliente` int(50) DEFAULT NULL,
  `saldo` double DEFAULT NULL,
  `taxa` double DEFAULT NULL,
  `saldo_limite` double DEFAULT NULL,
  `senha` varchar(500) DEFAULT NULL,
  `data_criacao` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `contacorrente`
--

INSERT INTO `contacorrente` (`id_conta_corrente`, `id_cliente`, `saldo`, `taxa`, `saldo_limite`, `senha`, `data_criacao`) VALUES
(55800, 24, 2649, 0, 0, '123456', '2023-06-09 14:31:32'),
(55801, 25, 69914, 0, 0, '123456', '2023-06-10 16:33:44');

-- --------------------------------------------------------

--
-- Estrutura da tabela `contapoupanca`
--

CREATE TABLE `contapoupanca` (
  `id_conta_poupanca` int(50) NOT NULL,
  `id_conta_corrente` int(50) DEFAULT NULL,
  `rendimentos` double DEFAULT NULL,
  `data_criacao` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `contapoupanca`
--

INSERT INTO `contapoupanca` (`id_conta_poupanca`, `id_conta_corrente`, `rendimentos`, `data_criacao`) VALUES
(8, 55800, 639, '2023-06-09 14:31:32'),
(9, 55801, 87340, '2023-06-10 16:33:44');

-- --------------------------------------------------------

--
-- Estrutura da tabela `contato`
--

CREATE TABLE `contato` (
  `id_contato` int(50) NOT NULL,
  `id_conta_corrente` int(50) NOT NULL,
  `email` varchar(500) DEFAULT NULL,
  `contato1` varchar(500) DEFAULT NULL,
  `contato2` varchar(500) DEFAULT NULL,
  `data_criacao` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `contato`
--

INSERT INTO `contato` (`id_contato`, `id_conta_corrente`, `email`, `contato1`, `contato2`, `data_criacao`) VALUES
(6, 55800, '654654', '654', '654', '2023-06-09 14:31:32'),
(7, 55801, 'elder@email.com', '(83)986290077', '(83)698476546', '2023-06-10 16:33:44');

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

CREATE TABLE `endereco` (
  `id_endereco` int(50) NOT NULL,
  `id_conta_corrente` int(50) NOT NULL,
  `logradouro` varchar(500) DEFAULT NULL,
  `numero` varchar(500) DEFAULT NULL,
  `cep` varchar(50) DEFAULT NULL,
  `cidade` varchar(500) DEFAULT NULL,
  `estado` varchar(500) DEFAULT NULL,
  `data_criacao` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `endereco`
--

INSERT INTO `endereco` (`id_endereco`, `id_conta_corrente`, `logradouro`, `numero`, `cep`, `cidade`, `estado`, `data_criacao`) VALUES
(6, 55800, 'napoelao', '320', '505', '654654', '654654', '2023-06-09 14:31:32'),
(7, 55801, 'Napoleão', '320', '58071590', 'João pesso', 'Paraiba', '2023-06-10 16:33:44');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoafisica`
--

CREATE TABLE `pessoafisica` (
  `id_pessoafisica` int(50) NOT NULL,
  `id_conta_corrente` int(50) DEFAULT NULL,
  `cpf` varchar(500) DEFAULT NULL,
  `nome` varchar(500) DEFAULT NULL,
  `sobrenome` varchar(500) DEFAULT NULL,
  `data_nascimento` varchar(500) DEFAULT NULL,
  `renda` double DEFAULT NULL,
  `data_criacao` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `pessoafisica`
--

INSERT INTO `pessoafisica` (`id_pessoafisica`, `id_conta_corrente`, `cpf`, `nome`, `sobrenome`, `data_nascimento`, `renda`, `data_criacao`) VALUES
(3, 55800, '05528832470', 'Elder', 'Elder', '16/08/1990', 0, '2023-06-09 14:31:32'),
(4, 55801, '5065406540', 'Elder', 'Elder', '16/08/1990', 0, '2023-06-10 16:33:44');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoajuridica`
--

CREATE TABLE `pessoajuridica` (
  `id_pessoajuridica` int(50) NOT NULL,
  `id_conta_corrente` int(50) DEFAULT NULL,
  `cnpj` varchar(500) DEFAULT NULL,
  `razao_social` varchar(500) DEFAULT NULL,
  `nome_fantasia` varchar(500) DEFAULT NULL,
  `atividade_economica` varchar(500) DEFAULT NULL,
  `grupo_economico` varchar(500) DEFAULT NULL,
  `controle_acionario` varchar(500) DEFAULT NULL,
  `faturamento` double DEFAULT NULL,
  `data_criacao` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `saque`
--

CREATE TABLE `saque` (
  `destinatario` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `transacoes`
--

CREATE TABLE `transacoes` (
  `id_transferencia` int(50) NOT NULL,
  `id_conta_destinario` int(50) DEFAULT NULL,
  `id_conta_emissor` int(50) DEFAULT NULL,
  `id_conta_poupanca` int(50) DEFAULT NULL,
  `tipo_transacao` varchar(500) DEFAULT NULL,
  `credito_debito` varchar(500) DEFAULT NULL,
  `valor_transacao` double NOT NULL,
  `data_criacao` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `banco`
--
ALTER TABLE `banco`
  ADD PRIMARY KEY (`id_banco`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices para tabela `contacorrente`
--
ALTER TABLE `contacorrente`
  ADD PRIMARY KEY (`id_conta_corrente`);

--
-- Índices para tabela `contapoupanca`
--
ALTER TABLE `contapoupanca`
  ADD PRIMARY KEY (`id_conta_poupanca`);

--
-- Índices para tabela `contato`
--
ALTER TABLE `contato`
  ADD PRIMARY KEY (`id_contato`);

--
-- Índices para tabela `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`id_endereco`);

--
-- Índices para tabela `pessoafisica`
--
ALTER TABLE `pessoafisica`
  ADD PRIMARY KEY (`id_pessoafisica`);

--
-- Índices para tabela `pessoajuridica`
--
ALTER TABLE `pessoajuridica`
  ADD PRIMARY KEY (`id_pessoajuridica`);

--
-- Índices para tabela `transacoes`
--
ALTER TABLE `transacoes`
  ADD PRIMARY KEY (`id_transferencia`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `banco`
--
ALTER TABLE `banco`
  MODIFY `id_banco` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de tabela `contacorrente`
--
ALTER TABLE `contacorrente`
  MODIFY `id_conta_corrente` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55802;

--
-- AUTO_INCREMENT de tabela `contapoupanca`
--
ALTER TABLE `contapoupanca`
  MODIFY `id_conta_poupanca` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de tabela `contato`
--
ALTER TABLE `contato`
  MODIFY `id_contato` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `endereco`
--
ALTER TABLE `endereco`
  MODIFY `id_endereco` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `pessoafisica`
--
ALTER TABLE `pessoafisica`
  MODIFY `id_pessoafisica` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `pessoajuridica`
--
ALTER TABLE `pessoajuridica`
  MODIFY `id_pessoajuridica` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `transacoes`
--
ALTER TABLE `transacoes`
  MODIFY `id_transferencia` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
