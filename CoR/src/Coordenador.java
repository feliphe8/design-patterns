
public class Coordenador extends Cargo{

	@Override
	public void aprovar(Contrato c) {
		if(c.getValor() <= 57900 ){
			System.out.println("Resolvido pelo Coord");
		}else{
			sucessor.aprovar(c);
		}
	}
}
