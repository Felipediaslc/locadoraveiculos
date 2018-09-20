-- Criando o banco de dados
DROP DATABASE locadora_noca_bd;
CREATE DATABASE IF NOT EXISTS locadora_noca_bd;
USE locadora_noca_bd;



-- Criando a tabela carro

CREATE TABLE carro (
	id INT NOT NULL AUTO_INCREMENT,
	renavam VARCHAR (11) NOT NULL,
	modelo VARCHAR(30) NOT NULL,
	marca VARCHAR (20) NOT NULL,
	potencia VARCHAR(5) NOT NULL,
	anoFab VARCHAR(4) NOT NULL,
    anoMod VARCHAR(4) NOT NULL,
	cor VARCHAR (10) NOT NULL,
	combGasolina BOOLEAN NOT NULL,
	combEtanol BOOLEAN NOT NULL,
	abs BOOLEAN NOT NULL,
	dataAquisicao VARCHAR(8) NOT NULL,
	localizacao VARCHAR(20) NOT NULL,
	porcentNivelComb INT NOT NULL,
	combDiesel BOOLEAN NOT NULL,
	combGas BOOLEAN NOT NULL,
	arCondicionado BOOLEAN NOT NULL,
	vidroEletrico BOOLEAN NOT NULL,
	gps BOOLEAn NOT NULL,
	travas BOOLEAN NOT NULL,
	alarme BOOLEAN NOT NULL,
    PRIMARY KEY (id)
);



-- Criando a tabela moto

CREATE TABLE moto (
	id INT NOT NULL AUTO_INCREMENT,
    renavam VARCHAR (11) NOT NULL,
    modelo VARCHAR(20) NOT NULL,
    marca VARCHAR (20) NOT NULL,
	potencia VARCHAR(5) NOT NULL,
	anoFab VARCHAR(4) NOT NULL,
    anoMod VARCHAR(4) NOT NULL,
	cor VARCHAR (10) NOT NULL,
	combGasolina BOOL NOT NULL,
    combEtanol BOOL NOT NULL,
    abs BOOL NOT NULL,
	dataAquisicao VARCHAR(8) NOT NULL,
	localizacao VARCHAR(20) NOT NULL,
    porcentNivelComb INT NOT NULL,
    cbs BOOL NOT NULL,
    cilindradas VARCHAR (5) NOT NULL,
    PRIMARY KEY (id)
);



-- Criando a tabela agencia

CREATE TABLE agencia (
	idAgencia INT NOT NULL AUTO_INCREMENT,
	nomeFantasia VARCHAR (40),
	cnpj VARCHAR(20),
	inscEstadual VARCHAR(20),
	telefone VARCHAR(15), 
	gerenteResponsavel VARCHAR(30),
	PRIMARY KEY (idAgencia)	
);



-- Criando a tabela endereco

CREATE TABLE endereco (
	idEndereco INT NOT NULL AUTO_INCREMENT,
	rua VARCHAR(40),
	numero VARCHAR(10),
	complemento VARCHAR(50),
	bairro VARCHAR(40),
	cidade VARCHAR(40),
	unidadeFederativa VARCHAR(2),
	cep VARCHAR(10),	
	FOREIGN KEY (idEndereco) REFERENCES agencia (idAgencia)
);



-- Inserindo elementos na tabela agencia e endereco

INSERT INTO agencia (nomeFantasia, cnpj, inscEstadual, telefone, gerenteResponsavel)
VALUES ('SL Locadora', '99.425.986/0036-15', '579.857.770.108', '(83)99827-6920', 'Reginaldo Lacerda');

INSERT INTO endereco (rua, numero, complemento, bairro, cidade, unidadeFederativa, cep)
VALUES ('Rua José Vieira de Lima', '199', '', 'Cruzeiro', 'Campina Grande', 'PB', '58417-510');


INSERT INTO agencia (nomeFantasia, cnpj, inscEstadual, telefone, gerenteResponsavel)
VALUES ('JK Locadora', '99.425.986/0996-15', '579.857.440.108', '(83)98827-6920', 'João Kraka');

INSERT INTO endereco (rua, numero, complemento, bairro, cidade, unidadeFederativa, cep)
VALUES ('Rua Raul Farias', '200', 'Por trás do mercadinho três irmãs', 'Cruzeiro', 'Campina Grande', 'PB', '58417-580');


INSERT INTO agencia (nomeFantasia, cnpj, inscEstadual, telefone, gerenteResponsavel)
VALUES ('João Veículos', '99.425.986/2226-15', '889.857.770.108', '(81)99827-0020', 'João Batista');

INSERT INTO endereco (rua, numero, complemento, bairro, cidade, unidadeFederativa, cep)
VALUES ('Rua das Castanholas', '98', 'Próximo ao viaduto', 'Curado I', 'Jaboatão dos Guararapes', 'PE', '58672-776');


INSERT INTO agencia (nomeFantasia, cnpj, inscEstadual, telefone, gerenteResponsavel)
VALUES ('Vagner Veículos', '99.425.000/0036-15', '345.857.770.108', '(21)78827-6920', 'Vagner Gomes');

INSERT INTO endereco (rua, numero, complemento, bairro, cidade, unidadeFederativa, cep)
VALUES ('Avenida das Piedades', '108098', 'Próximo ao batalhão da PM', 'Salgueiro', 'Rio de Janeiro', 'RJ', '58893-900');


INSERT INTO agencia (nomeFantasia, cnpj, inscEstadual, telefone, gerenteResponsavel)
VALUES ('Locadora Gaviões da Fiel', '99.000.986/0036-12', '579.000.770.108', '(11)99827-0020', 'Negão da Fiel');

INSERT INTO endereco (rua, numero, complemento, bairro, cidade, unidadeFederativa, cep)
VALUES ('Avenida Paulista', '26', '', 'Jardins', 'São Paulo', 'SP', '58300-230');



-- Inserindo elemetnos na tabela carro

INSERT INTO carro (renavam, modelo, marca, potencia, anoFab, anoMod, cor, combGasolina, combEtanol, abs,
dataAquisicao, localizacao, porcentNivelComb, combDiesel, combGas, arCondicionado, vidroEletrico, gps, travas, alarme)
VALUES ('055399977-0', 'Palio', 'FIAT', '88', '2013', '2013', 'Cinza', 1, 1, 0,
'01012018', 'Campina Grande', 50, 0, 0, 0, 0, 0, 0, 0);

INSERT INTO carro (renavam, modelo, marca, potencia, anoFab, anoMod, cor, combGasolina, combEtanol, abs,
dataAquisicao, localizacao, porcentNivelComb, combDiesel, combGas, arCondicionado, vidroEletrico, gps, travas, alarme)
VALUES ('222399977-0', 'Siena', 'FIAT', '88', '2014', '2014', 'Preto', 1, 1, 0,
'01012018', 'Campina Grande', 60, 0, 1, 0, 1, 0, 1, 0);

INSERT INTO carro (renavam, modelo, marca, potencia, anoFab, anoMod, cor, combGasolina, combEtanol, abs,
dataAquisicao, localizacao, porcentNivelComb, combDiesel, combGas, arCondicionado, vidroEletrico, gps, travas, alarme)
VALUES ('022219977-0', 'Onix', 'GM Chevrolet', '90', '2015', '2016', 'Vinho', 1, 1, 0,
'01012018', 'Campina Grande', 70, 0, 0, 1, 1, 0, 1, 1);

INSERT INTO carro (renavam, modelo, marca, potencia, anoFab, anoMod, cor, combGasolina, combEtanol, abs,
dataAquisicao, localizacao, porcentNivelComb, combDiesel, combGas, arCondicionado, vidroEletrico, gps, travas, alarme)
VALUES ('723999770-2', 'March', 'NISSAN', '95', '2013', '2013', 'Branco', 1, 1, 0,
'01012018', 'Campina Grande', 80, 0, 0, 1, 1, 1, 1, 1);

INSERT INTO carro (renavam, modelo, marca, potencia, anoFab, anoMod, cor, combGasolina, combEtanol, abs,
dataAquisicao, localizacao, porcentNivelComb, combDiesel, combGas, arCondicionado, vidroEletrico, gps, travas, alarme)
VALUES ('802321997-7', 'FOX', 'volkswagen', '106', '2013', '2013', 'Vermelho', 1, 1, 0,
'01012018', 'Campina Grande', 90, 0, 0, 1, 1, 0, 1, 1);


-- Inserindo elementos na tabela moto

INSERT INTO moto (renavam, modelo, marca, potencia, anoFab, anoMod, cor, combGasolina, combEtanol, abs,
dataAquisicao, localizacao, porcentNivelComb, cbs, cilindradas)
VALUES ('022387677-9', 'Ténéré', 'Yamaha', '21', '2016', '2017', 'Cinza', 1, 1, 0,
'01012018', 'Campina Grande', 50, 0, '250');

INSERT INTO moto (renavam, modelo, marca, potencia, anoFab, anoMod, cor, combGasolina, combEtanol, abs,
dataAquisicao, localizacao, porcentNivelComb, cbs, cilindradas)
VALUES ('062399977-8', 'CB300', 'Honda', '24', '2015', '2015', 'Preta', 1, 1, 1,
'01012018', 'Campina Grande', 60, 0, '300');

INSERT INTO moto (renavam, modelo, marca, potencia, anoFab, anoMod, cor, combGasolina, combEtanol, abs,
dataAquisicao, localizacao, porcentNivelComb, cbs, cilindradas)
VALUES ('027562977-5', 'Titan', 'Honda', '17', '2012', '2012', 'Branca', 1, 0, 0,
'01012018', 'Campina Grande', 70, 1, '150');

INSERT INTO moto (renavam, modelo, marca, potencia, anoFab, anoMod, cor, combGasolina, combEtanol, abs,
dataAquisicao, localizacao, porcentNivelComb, cbs, cilindradas)
VALUES ('022392297-3', 'XTZ125', 'Yamaha', '13', '2013', '2013', 'Branca', 1, 0, 0,
'01012018', 'Campina Grande', 80, 0, '125');

INSERT INTO moto (renavam, modelo, marca, potencia, anoFab, anoMod, cor, combGasolina, combEtanol, abs,
dataAquisicao, localizacao, porcentNivelComb, cbs, cilindradas)
VALUES ('067261997-4', 'Next', 'Dafra', '25', '2014', '2014', 'Vermelha', 1, 1, 0,
'01012018', 'Campina Grande', 90, 0, '250');