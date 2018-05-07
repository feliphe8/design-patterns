package com.absfactory.outros;

public enum FabricaUsuario {
	FABRICA_COMUM {
		@Override
		public Usuario criarPF() {
			// VIRIA INFORMAÇOES DO BANCO DE DADOS
			//O NOME E O CPF VEM DO BD
			//PARA O BD SERA NECESSARIO UM PARAMETRO id INTEIRO
			return new PF("Henrique",Papel.COMUM,"XXX.XXX.XXX-XX");
		}

		@Override
		public Usuario criafPJ() {
			
			return new PJ("FATEC", Papel.COMUM,"02.123456/0001-15");
		}
	}, FABRICA_ADMIN {
		@Override
		public Usuario criarPF() {
			
			return new PF("root",Papel.ADMIN,"YYY.YYY.YYY-YY");
		}

		@Override
		public Usuario criafPJ() {
			
			return new PJ("CPS",Papel.ADMIN,"01.123456/0001-15");
		}
	};
	
	public abstract Usuario criarPF();
	
	public abstract Usuario criafPJ();
}
