/*CREATE DATABASE SistemaBanco;
CREATE TABLE Conta( Nome 	VARCHAR(256) 	NOT NULL,
					CPF	 	VARCHAR(14) 	NOT NULL	PRIMARY KEY,
                    Numero 	INTEGER 		NOT NULL,
                    Saldo 	FLOAT(8,2) 		NOT NULL);

CREATE TABLE ContaEspecial( Limite FLOAT(8,2) NOT NULL,
							CPF VARCHAR(14) PRIMARY KEY, 
                            FOREIGN KEY(CPF) REFERENCES Conta(CPF));
*/

-- ALTER TABLE ContaEspecial ADD COLUMN Nome VARCHAR(256) NOT NULL; 
-- ALTER TABLE ContaEspecial ADD COLUMN Numero INTEGER NOT NULL;
-- ALTER TABLE ContaEspecial ADD COLUMN Saldo FLOAT(8,2) NOT NULL;

-- DROP TABLE ContaEspecial;

/*
CREATE TABLE ContaEspecial( Nome 	VARCHAR(256) 	NOT NULL,
							CPF	 	VARCHAR(14) 	NOT NULL	PRIMARY KEY,
							Numero 	INTEGER 		NOT NULL,
							Saldo 	FLOAT(8,2) 		NOT NULL,
                            Limite	FLOAT(8,2)		NOT NULL);
*/