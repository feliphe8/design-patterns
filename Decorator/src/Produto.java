
public abstract class Produto {
	protected double preco;
	
	public Produto(double preco){
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
