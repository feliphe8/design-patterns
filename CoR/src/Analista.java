
public class Analista extends Cargo{

	@Override
	public void aprovar(Contrato c) {
		if(c.getValor() <= 21500 ){
			System.out.println("Resolvido pelo Analista");
		}else{
			sucessor.aprovar(c);
		}
	}
}
