import java.util.ArrayList;

public class Opera {
	
	ArrayList<Cantor> opera = new ArrayList<Cantor>();
	
	public Opera(){
		
	}
	
	public void adicionarCantor(Cantor c){
		opera.add(c);
	}
	
	public void iniciarOpera(){
		for(int i = 0; i < opera.size(); i++){
			opera.get(i).cantar();
		}
	}

}
