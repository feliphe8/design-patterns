
public class Spam extends Filtros {

	@Override
	public void filtrar(Email e) {
		if(e.getConteudo().contains("spam")){
			System.out.println("Email marcado como SPAM");
		}else{
			sucessor.filtrar(e);
			
		}
		
	}

}
