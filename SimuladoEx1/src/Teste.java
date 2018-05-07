
public class Teste {

	public static void main(String[] args) {
		Cruzeiro c = new Cruzeiro(5000);
		Bebidas b = new Bebidas(500);
		Passeios p = new Passeios(1000);
		b.setProximo(c);
		p.setProximo(b);
		System.out.println(p.calcPreco());
		System.out.println(p.toString());

	}

}
