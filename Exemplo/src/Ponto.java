import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ponto implements IExpression {
	public Map<String,String> palavras = new HashMap<String,String>();
	public StringBuilder acronimo;
	
	public Ponto(StringBuilder acronimo) {
		this.acronimo = acronimo;
		this.palavras.put("vc","Você");
	
	}

	@Override
	public String interpret() {		
		for(String p : palavras){
			if(this.palavras.contains(this.acronimo)){
				return p;
			}
		}
		return "Nao eh uma expressao valido";				
	}

}