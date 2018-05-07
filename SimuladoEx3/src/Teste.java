
public class Teste {

	public static void main(String[] args) {
		Email e = new Email("dsadas","aaaa",2);
		Spam s = new Spam();
		Virus v = new Virus();
		s.adicionarSucessor(v);
		s.filtrar(e);
		s.filtrar(e);
		s.filtrar(e);
	}

}
