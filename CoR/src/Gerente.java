
public class Gerente extends Cargo{

	@Override
	public void aprovar(Contrato c) {
		if(c.getValor() <= 102300 ){
			System.out.println("Resolvido pelo Gerente");
		}else{
			sucessor.aprovar(c);
		}
	}
}
