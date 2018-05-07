
public class ViagemDecorator extends Viagem {

	protected Viagem prox;
	
	public ViagemDecorator(double preco) {
		super(preco);
		// TODO Auto-generated constructor stub
	}

	public double calcPreco(){
		return prox.calcPreco() + preco;
	}
	
	public void setProximo(Viagem prox){
		this.prox = prox;
	}
	
	public String toString(){
		return prox.toString()  + " com "+ this.getClass().getSimpleName();
	}
}
