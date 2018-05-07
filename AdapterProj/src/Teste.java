
public class Teste {
	public static void main(String[] args){
		Peru pe = new Peru();
		Pato p = new PatoAdapter(pe);
		p.voar();
		p.grasnar();
	}
}
