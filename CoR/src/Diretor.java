
public class Diretor extends Cargo{

	@Override
	public void aprovar(Contrato c) {
		if(c.getValor() <= 3000000){
			System.out.println("Aprovado pelo Diretor");
		}else{
			System.out.println("N�o aprovado, pois, n�o h� dinheiro");
		}
	}
}
