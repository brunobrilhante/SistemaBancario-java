CREATE DATABASE SistemaBanco;
CREATE TABLE Conta( Nome 	VARCHAR(256) 	NOT NULL,
					CPF	 	VARCHAR(14) 	NOT NULL	PRIMARY KEY,
                    Numero 	INTEGER 		NOT NULL,
                    Saldo 	FLOAT(8,2) 		NOT NULL);

CREATE TABLE ContaEspecial( Limite FLOAT(8,2) NOT NULL,
							CPF VARCHAR(14) PRIMARY KEY, 
                            FOREIGN KEY(CPF) REFERENCES Conta(CPF));
