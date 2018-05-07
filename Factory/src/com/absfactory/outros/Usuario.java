package com.absfactory.outros;

public abstract class Usuario {
	protected String nome;
	protected Papel papel;
	
	public Usuario(String nome , Papel papel){
		this.nome = nome;
		this.papel = papel;
		
	}
	
	public abstract void informacao();
}
