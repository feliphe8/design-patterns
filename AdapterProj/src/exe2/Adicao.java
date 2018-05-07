package exe2;

public class Adicao implements OperacaoSimples{

	@Override
	public String operacao(double a, double b) {
		return "O resultado da soma eh: " + String.valueOf(a+b);
	}

}
