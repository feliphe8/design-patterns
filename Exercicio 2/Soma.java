
public class Soma extends Operacao {


	public Soma(double n1, double n2) {
		super(n1, n2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tipoOperacao() {
		return n1+n2;
	}

}
