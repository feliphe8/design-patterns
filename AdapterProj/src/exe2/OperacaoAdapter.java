package exe2;

public class OperacaoAdapter implements OperacaoSimples{

	private EquacaoSegundo eq;
	
	@Override
	public String operacao(double a, double b) throws Exception {
		return "A raiz da equação eh: " + String.valueOf(eq.raiz1(a, b));
	}

	public void setEq(EquacaoSegundo eq) {
		this.eq = eq;
	}
	
}
