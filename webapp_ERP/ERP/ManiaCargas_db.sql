USE db_maniacargas;
/* table criada.
CREATE TABLE USUARIOS(
	id_usuario INT PRIMARY KEY auto_increment,
    Nome VARCHAR(75) NOT NULL,
    Nivel_Acesso ENUM("Cliente", "Operador_logistica", "Gestao_operacao", "Administracao", "ADM_sistema") NOT NULL,
    email VARCHAR(100) NOT NULL,
    senha_hash VARCHAR(250)
);
*/

SELECT * FROM USUARIOS;

/*
#O há certos diaristas que operam e recebem com termos diferentes (quinzenal, por mês ou por dia). Após reunião de definição
# de requisitos posso modificar a tabela. 
CREATE TABLE OPERADORES_LOGISTICA(
	id_operador INT PRIMARY KEY auto_increment,
	nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL, 
    Tipo_contrato ENUM("Diarista", "CLT") NOT NULL
);

CREATE TABLE FUNCIONARIOS(
	id_funcionario INT PRIMARY KEY auto_increment,
    id_usuario INT NOT NULL,
    cargo VARCHAR(100) NOT NULL,
    
    FOREIGN KEY (id_usuario) REFERENCES USUARIOS(id_usuario)
);


CREATE TABLE CLIENTES(
	id_cliente INT PRIMARY KEY auto_increment,
    Nome_empresa VARCHAR(100) NOT NULL,
    CNPJ VARCHAR(100) NOT NULL
);

CREATE TABLE SERVICOS_ATIVOS(
	id_servico INT PRIMARY KEY auto_increment,
    id_cliente INT NOT NULL,
    tipo_servico VARCHAR(200) NOT NULL,
    qtd_operadores INT,
    FOREIGN KEY (id_cliente) REFERENCES CLIENTES(id_cliente)
);

*/
