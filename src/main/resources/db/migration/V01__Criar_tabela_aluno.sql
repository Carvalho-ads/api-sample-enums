/* Example script*/

CREATE TABLE bd_api_sample.tb_aluno (
	id serial NOT NULL,
	nome varchar(40) NOT NULL,
	cpf varchar(12) NOT NULL,
	data_cadastro DATE NOT NULL,
	data_alteracao DATE NULL,
	CONSTRAINT aluno_pk PRIMARY KEY (id)
);