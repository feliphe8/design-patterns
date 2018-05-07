
public class TesteOpera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Opera o = new Opera();
		
		o.adicionarCantor(new Tenores("João"));
		o.adicionarCantor(new Tenores("Roberto"));
		o.adicionarCantor(new Tenores("Reginaldo"));
		o.adicionarCantor(new Tenores("Ronaldo"));
		o.adicionarCantor(new Sopranos("Boyle"));
		o.adicionarCantor(new Sopranos("Susan"));
		o.adicionarCantor(new Sopranos("Batata"));
		o.adicionarCantor(new Sopranos("Sona"));
		o.iniciarOpera();
	}

}
