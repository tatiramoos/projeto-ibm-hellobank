create database hellobank;

use hellobank;

create table clientes(
idcli int primary key auto_increment,
nome varchar(50) not null,
email varchar(50) not null,
telefone varchar(20) not null,
cpf varchar (15) not null unique
);

insert into clientes
values  (null, 'Luís Araujo Dias', 'luisaraujo@email.com', '(61) 7052-5627', '245.968.249-24'),
	    (null, 'Ryan Souza Azevedo', 'ryansouza@email.com', '(61) 2973-4208', '105.652.345-01'),
        (null, 'Caio Ribeiro Araujo', 'caiorib@email.com', '(21) 5212-2557', '953.537.218-10'),
        (null, 'Luan Rocha Melo', 'luanrocha@email.com', '(51) 8668-8873', '965.357.060-95'),
        (null, 'Guilherme Fernandes Ribeiro', 'guifernandes@email.com', '(11) 7110-3866', '493.304.116-49'),
        (null, 'Camila Martins Lima', 'camilima@email.com', '(11) 7969-8327', '699.014.890-08'),
        (null, 'Letícia Almeida Oliveira', 'leticiaalmeida@email.com', '(41) 5884-8512', '610.669.176-20'),
        (null, 'Sarah Correia Silva', 'sarahsilva@email.com', '(54) 6828-7102', '389.947.825-83'),
        (null, 'Luiza Fernandes Almeida', 'lufernandes@email.com', '(11) 4166-3035', '928.080.457-00'),
        (null,'Roberta Miranda Gonçalves','Berta.miranda@email.com','(011)987313455','524.963.658-78'),
		(null,'Brasil Santos Neri','Brasil_santos@email.com.br','(11)9167-8534','509.573.274-33'),
		(null,'Milena Assunção Borges','lena_almeida@email.com','(71)98753-2145','658.150.837-54'),
		(null,'Eliane Mendonça Rocha','m.eliane@email.com','(85)98678-3457','897.666.231-54'),
		(null,'Benedito Ferreira Aparecido','ditoferreira@email.com.br','(45)96487-3356','708.954.612-34'),
		(null,'Eddna Silva Souza','edsilva@email.com','(31)95431-6874','789.325.461-87'),
		(null,'Ana Domingues Cordeiro','d.ana@email.com.br','(21)93874-6124','741936547-28'),
		(null,'Milton Ferreira Justo','milton@email.com','(91)98711-2437','083.674.192-53'),
		(null,'Maria Aparecida da Conceição','M.aparecida@email.com','(45)96476-8899','766.982.311-47'),
		(null,'Rosa Diaz Domingues','Diaz@email.com','(85)96658-7489','749.638.592-74'),
		(null,'Breno Malta','Malta_breno@email.com','(61)98741-5233','087.569.231-79'),
		(null,'Paulo Augusto Santiago','paulinho.augusto@email.com','(81)99788-9965','784.932.157-49');

select * from clientes;

create table enderecos(
idend int primary key auto_increment,
endereco varchar(100) not null,
numero varchar(5) not null,
bairro varchar (20) not null,
cidade varchar (20) not null,
estado varchar (20) not null,
cep varchar(15) not null
);

insert into enderecos values
(null,'Rua da saudade','502','Pituba','Salvador','BA','41789-030' ),
(null,'Rua da alegria','744','Campo grande', 'Rio de janeiro','RJ','47890-045'),
(null,'Rua Ubatuba','870','Cocaia','São Paulo','SP','49652-087'),
(null,'Avenida das rosas','980','Tijuca', 'Rio de Janeiro','RJ', '48796-042'),
(null,'Rua das Margaridas','647','Pimentas','Guarulhos','SP','78407-089'),
(null,'Rua Itapegipe','679','Boa viagem','Recife','PE','47840-090'),
(null,'Avenida do tubarões','890','Jaqueira','Recife','PE','48089-412'),
(null,'Avenida Pescador','745','Casa Forte', 'Recife','PE','78490-303'),
(null,'Avenida Rio Branco','645','Bela Vista', 'Porto Alegre','RS','73354-645'),
(null,'Rua das Flores','222','Barra', 'Salvador','BA','46087-079');

select * from enderecos;

create table contas(
idconta int primary key not null auto_increment,
agencia int not null,
conta int not null,
saldo double default null
);

insert into contas values
(null,0001,4578,500),
(null,0001,2416,11350),
(null,0001,0495,98046),
(null,0001,7046,70984),
(null,0001,0987,30165),
(null,0001,0013,8032),
(null,0001,8325,12000),
(null,0001,7600,70648),
(null,0001,1740,15000),
(null,0001,1647,90000),
(null,0001,1546,70000),
(null,0001,7793,48696),
(null,0001,7809,30000),
(null,0001,8928,900);

select * from contas;



describe contas;
describe clientes;

create table transacoes(
idtrans int primary key not null,
numbanco int not null,
contadepo int not null,
contabene int not null,
valortrans int not null,
datatrans varchar(10) not null
);

create table usuarios(
idusuario int primary key not null auto_increment,
senha varchar(15) not null unique
);

insert into usuarios values
(null,'Senha12'),
(null,'Senha13'),
(null,'senha789'),
(null,'senha7089'),
(null,'senha430'),
(null,'senha78475'),
(null,'senha70513'),
(null,'senha70648'),
(null,'senha07684'),
(null,'senha7089314'),
(null,'senhase78rfe');

select * from usuarios;