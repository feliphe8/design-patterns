package com.proxy.login;
//Placeholder controller
public class Proxy extends Controller{
    
	private Controller c;
	
	public Proxy(String login, String senha){
		//Aqui teria model + bd + session
		if(senha == "root" && login == "root"){
			//Usuario autenticado
			c = new UsuarioController();
		}else{
			c = new VisitanteController();
		}
	}
	
	@Override
	public void perfil() {
		c.perfil();
	}

	@Override
	public void index() {
		c.index();
	}
	
}
