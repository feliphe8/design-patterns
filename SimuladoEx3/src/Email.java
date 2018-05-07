
public class Email {
	private String destino;
	private String conteudo;
	private int qtVirus;
	
	public Email(String destino,String conteudo,int qtVirus){
		this.destino = destino;
		this.conteudo = conteudo;
		this.qtVirus = qtVirus;
	}
	
	public String getDestino(){
		return destino;
	}
	
	public String getConteudo(){
		return conteudo;
	}
	
	public void setVirus(int i){
		this.qtVirus = qtVirus - i;
	}
	
	public int getQtVirus(){
		return qtVirus;
	}
}
