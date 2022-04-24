
public class pessoa {
	private String nome;
	private String CPF;
	private String profissão;
	
	
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
	public String getProfissão() {
		return profissão;
	}
	public void setProfissão(String profissão) {
		this.profissão = profissão;
	} 
	public String imprime()
	{
	
		
		return  "CPF: "+ this.CPF+ "\n"+"Nome do titular: "+this.nome+ "\n" + "Profissão: "+this.profissão + "\n";
	}
}
