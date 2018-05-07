
public abstract class Viagem {
	protected String descricao;
	protected double preco;
	
	public Viagem(double preco){
		this.preco = preco;
	}
	
	public double calcPreco(){
		return preco;
	}
	
	
	public String toString(){
		Class clazz = this.getClass();
		return clazz.getSimpleName();
	}
}
