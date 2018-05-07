package exe2;

public class Divisao implements OperacaoSimples{

	@Override
	public String operacao(double a, double b) {
		if(b != 0)
			return "O resultado da divisao eh:" + String.valueOf(a/b);
		else
			return "O numero b nao pode ser zero";
	}

}
