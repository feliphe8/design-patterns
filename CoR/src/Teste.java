
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contrato c = new Contrato("Algum contrato", 92960.27);
		Analista a = new Analista();
		Coordenador cr = new Coordenador();
		Gerente g = new Gerente();
		Diretor d = new Diretor();
		a.adicionarSucessor(cr);
		cr.adicionarSucessor(g);
		g.adicionarSucessor(d);
		a.aprovar(c);	
	}

}
