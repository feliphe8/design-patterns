
public abstract class Operacao {
	
	protected double n1,n2;
	
	public Operacao(double n1, double n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public abstract double tipoOperacao();
}
