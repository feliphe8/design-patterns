import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		int opc,n1,n2;
		
		Scanner entrada = new Scanner(System.in);
        
        do{
            c.menu();
            opc = entrada.nextInt();
            
            switch(opc){
            	case 1:
            		System.out.println("Digite o primeiro número:");
            		n1 = entrada.nextInt();
            		System.out.println("Digite o segundo número:");           		
            		n2 = entrada.nextInt();
            		c.setOperacao(new Soma(n1,n2));
            		c.calcularResultado();
            		c.mostrarResultado();
            		break;
                
            	case 2:
            		System.out.println("Digite o primeiro número:");
            		n1 = entrada.nextInt();
            		System.out.println("Digite o segundo número:");
            		n2 = entrada.nextInt();
            		c.setOperacao(new Subtracao(n1,n2));
            		c.calcularResultado();
            		c.mostrarResultado();
            		break;
                
            	case 3:
            		System.out.println("Digite o primeiro número:");
            		n1 = entrada.nextInt();
            		System.out.println("Digite o segundo número:");
            		n2 = entrada.nextInt();
            		c.setOperacao(new Multiplicacao(n1,n2));
            		c.calcularResultado();
            		c.mostrarResultado();
            		break;
                
            	case 4:
            		System.out.println("Digite o primeiro número:");
            		n1 = entrada.nextInt();
            		System.out.println("Digite o segundo número:");
            		n2 = entrada.nextInt();
            		c.setOperacao(new Divisao(n1,n2));
            		c.calcularResultado();
            		c.mostrarResultado();
            		break;
            
            }
        } while(opc != 0);

	}

}
