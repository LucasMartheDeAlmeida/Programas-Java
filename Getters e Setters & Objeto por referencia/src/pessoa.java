
public class pessoa {
	private String nome;
	private String CPF;
	private String profiss�o;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getProfiss�o() {
		return profiss�o;
	}
	public void setProfiss�o(String profiss�o) {
		this.profiss�o = profiss�o;
	} 
	public String imprime()
	{
	
		
		return  "CPF: "+ this.CPF+ "\n"+"Nome do titular: "+this.nome+ "\n" + "Profiss�o: "+this.profiss�o + "\n";
	}
}
