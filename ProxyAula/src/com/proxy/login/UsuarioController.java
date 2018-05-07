package com.proxy.login;

public class UsuarioController extends Controller{
	
	UsuarioController(){
		
	}
	
	@Override
	public void perfil() {
		System.out.println("Acessado - Ok: 200");
	}

	@Override
	public void index() {
		// TODO Auto-generated method stub
		System.out.println("Página inicial como Usuário");
	}

}
