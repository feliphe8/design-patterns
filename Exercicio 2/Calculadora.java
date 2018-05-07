
public class Calculadora {
	private Operacao operacao;
	protected double resultado;
	
	public void setOperacao(Operacao operacao){
		this.operacao = operacao;
	}
	
	public void calcularResultado(){
		resultado = operacao.tipoOperacao();
	}
	
	public void mostrarResultado(){
		System.out.println("\n Resultado: "+resultado+ "\n");
	}
	
	public void menu(){
        System.out.println("\tSelecione a operacão:");
        System.out.println("0. Encerrar");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("Opção:");
    }
}
