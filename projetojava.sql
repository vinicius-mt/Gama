create database projetojava;
create table aluno(
    id int NOT NULL AUTO_INCREMENT,
    nome varchar(40),
    idade  int(3),
    address varchar(127),
    estado varchar (3),
    cep varchar (12),
    telefone varchar (15),
    matricula varchar (20),
    PRIMARY KEY (id)
)