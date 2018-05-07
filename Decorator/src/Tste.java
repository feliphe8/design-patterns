
public class Tste {

	public static void main(String[] args) {
         Cafe c = new Cafe(1.50);
         Leite l = new Leite(0.70);
         Chantily h = new Chantily(0.80);
         h.setProximo(c);
         l.setProximo(h);
         System.out.println(l.calcPreco());
         System.out.println(l.toString());
	}

}
