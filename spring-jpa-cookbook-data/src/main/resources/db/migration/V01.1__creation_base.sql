-- ---------------------------------------------------
-- Script de création de la base de données
-- ---------------------------------------------------



create table my_data (
	id_data SERIAL PRIMARY KEY,
	code_data character varying (10),
	label_data character varying (1024)

);

