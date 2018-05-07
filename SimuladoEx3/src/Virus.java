
public class Virus extends Filtros {

	@Override
	public void filtrar(Email e) {
		if(e.getQtVirus() != 0){
			e.setVirus(1);
			System.out.println("1 Virus removido");
		}else{
			System.out.println("Email Livre de Virus e Spam");
		}
		
	}

}
