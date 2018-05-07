
public class Letra implements IExpression {
	public String letra;
	
	
	public Letra(String letra){
		this.letra = letra;
	}
	@Override
	public String interpret() {
		if(this.letra.contains("ABCDEFGHIJKLMNOPQRSTUWVXYZabcdefghijklmnopqrstuwvxyz")){ 
			return this.letra;
		}
		
		return "";
	}
}