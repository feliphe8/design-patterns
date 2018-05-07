package com.proxy.login;

public class VisitanteController extends Controller{
	
    VisitanteController(){
		
	}
	
	@Override
	public void perfil() {
		//seria chamada da view
		System.out.println("Erro 402 - Unauthorized");
	}

	@Override
	public void index() {
		//seria chamada da view
		System.out.println("Página inicial como visitante");
	}

}
