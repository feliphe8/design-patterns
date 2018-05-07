
abstract public class ProdutoDecorator extends Produto{

	protected Produto prox;
	
	public ProdutoDecorator(double preco) {
		super(preco);
	}
 
	public double calcPreco(){
		return prox.calcPreco() + preco;
	}
	
	public void setProximo(Produto prox){
		this.prox = prox;
	}
	
	public String toString(){
		return prox.toString() + " com "+ this.getClass().getSimpleName();
	}
}
