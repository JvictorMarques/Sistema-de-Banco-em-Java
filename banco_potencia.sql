-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 19/10/2023 às 12:16
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

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
-- Estrutura para tabela `banco`
--

CREATE TABLE `banco` (
  `id_banco` int(30) NOT NULL,
  `agencia` int(50) DEFAULT NULL,
  `localidade` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(50) NOT NULL,
  `id_banco` varchar(500) DEFAULT NULL,
  `cpf` varchar(500) DEFAULT NULL,
  `cnpj` varchar(500) DEFAULT NULL,
  `data_criacao` datetime DEFAULT current_timestamp(),
  `Pais` varchar(3) DEFAULT 'BRA',
  `Email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `contacorrente`
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

-- --------------------------------------------------------

--
-- Estrutura para tabela `contapoupanca`
--

CREATE TABLE `contapoupanca` (
  `id_conta_poupanca` int(50) NOT NULL,
  `id_conta_corrente` int(50) DEFAULT NULL,
  `rendimentos` double DEFAULT NULL,
  `data_criacao` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `contato`
--

CREATE TABLE `contato` (
  `id_contato` int(50) NOT NULL,
  `id_conta_corrente` int(50) NOT NULL,
  `email` varchar(500) DEFAULT NULL,
  `contato1` varchar(500) DEFAULT NULL,
  `contato2` varchar(500) DEFAULT NULL,
  `data_criacao` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `endereco`
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

-- --------------------------------------------------------

--
-- Estrutura para tabela `pessoafisica`
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

-- --------------------------------------------------------

--
-- Estrutura para tabela `pessoajuridica`
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
-- Estrutura para tabela `saque`
--

CREATE TABLE `saque` (
  `destinatario` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `tb_vendedor`
--

CREATE TABLE `tb_vendedor` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `salario` decimal(8,2) DEFAULT NULL,
  `telefone` int(11) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL
) ;

-- --------------------------------------------------------

--
-- Estrutura para tabela `transacoes`
--

CREATE TABLE `transacoes` (
  `id_transferencia` int(50) NOT NULL,
  `id_conta_destinario` int(50) DEFAULT NULL,
  `id_conta_emissor` int(50) DEFAULT NULL,
  `id_conta_poupanca` int(50) DEFAULT NULL,
  `tipo_transacao` varchar(50) DEFAULT NULL,
  `credito_debito` varchar(500) DEFAULT NULL,
  `valor_transacao` double NOT NULL,
  `data_criacao` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `banco`
--
ALTER TABLE `banco`
  ADD PRIMARY KEY (`id_banco`);

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices de tabela `contacorrente`
--
ALTER TABLE `contacorrente`
  ADD PRIMARY KEY (`id_conta_corrente`);

--
-- Índices de tabela `contapoupanca`
--
ALTER TABLE `contapoupanca`
  ADD PRIMARY KEY (`id_conta_poupanca`);

--
-- Índices de tabela `contato`
--
ALTER TABLE `contato`
  ADD PRIMARY KEY (`id_contato`);

--
-- Índices de tabela `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`id_endereco`);

--
-- Índices de tabela `pessoafisica`
--
ALTER TABLE `pessoafisica`
  ADD PRIMARY KEY (`id_pessoafisica`);

--
-- Índices de tabela `pessoajuridica`
--
ALTER TABLE `pessoajuridica`
  ADD PRIMARY KEY (`id_pessoajuridica`);

--
-- Índices de tabela `tb_vendedor`
--
ALTER TABLE `tb_vendedor`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices de tabela `transacoes`
--
ALTER TABLE `transacoes`
  ADD PRIMARY KEY (`id_transferencia`);

--
-- AUTO_INCREMENT para tabelas despejadas
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
  MODIFY `id_cliente` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de tabela `contacorrente`
--
ALTER TABLE `contacorrente`
  MODIFY `id_conta_corrente` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55803;

--
-- AUTO_INCREMENT de tabela `contapoupanca`
--
ALTER TABLE `contapoupanca`
  MODIFY `id_conta_poupanca` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `contato`
--
ALTER TABLE `contato`
  MODIFY `id_contato` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `endereco`
--
ALTER TABLE `endereco`
  MODIFY `id_endereco` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `pessoafisica`
--
ALTER TABLE `pessoafisica`
  MODIFY `id_pessoafisica` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `pessoajuridica`
--
ALTER TABLE `pessoajuridica`
  MODIFY `id_pessoajuridica` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `tb_vendedor`
--
ALTER TABLE `tb_vendedor`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `transacoes`
--
ALTER TABLE `transacoes`
  MODIFY `id_transferencia` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
