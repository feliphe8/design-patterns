
public abstract class Filtros {
	protected Filtros sucessor;
	
	public void adicionarSucessor(Filtros sucessor){
		this.sucessor = sucessor;
	}
	
	public abstract void filtrar(Email e);
}
