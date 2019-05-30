create database bdcadastro;
use bdcadastro;
create table tbaluno(
cod_aluno int(11) auto_increment not null,
nome_aluno varchar(40),
data_de_nascimento_aluno varchar(11),
cpf_aluno varchar(15) unique,
celular_aluno varchar(14),
endereco_aluno varchar(40),
numero_de_matricula_aluno varchar(11),
curso varchar (50),
sexo enum("Masculino", "Feminino" , "Outros"),
periodo varchar(20),
primary key(cod_aluno)
)default charset = utf8;

create table tbprofessor(
cod_prof int(11) auto_increment not null,
nome_prof varchar(40),
data_de_nascimento_prof varchar(10),
cpf_prof varchar(14) unique,
celular_prof varchar(14),
endereco_prof varchar(40),
numero_de_matricula_prof varchar(11),
escolaridade varchar (20),
salario varchar(13),
admissao varchar(4),
naturalidade varchar(20),
eixo_de_atuacao varchar(20),
sexo enum("Masculino", "Feminino" , "Outros"),
primary key(cod_prof)
)default charset = utf8;