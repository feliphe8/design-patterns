
public abstract class Cargo {
	protected Cargo sucessor;
	
	public void adicionarSucessor(Cargo sucessor){
		this.sucessor = sucessor;
	}
	
	public abstract void aprovar(Contrato c);
	
}
