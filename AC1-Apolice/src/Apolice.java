
public class Apolice {
 private String nomeSegurado;
 private int idade;
 private double valorPremio;
 
 public Apolice(String nome, int idade, double valor)
 {
	this.nomeSegurado = nome;
	this.idade = idade;
	this.valorPremio= valor;
	
 }
 public Apolice()
 {
	  
 }
  public String imprime()
  {
	  String retorno;
	  String.valueOf(idade);
	  String.valueOf(valorPremio);
	  retorno ="Informações da apolice : " + nomeSegurado + " Idade: " + idade +" Valor prêmio " + valorPremio;
	  return retorno;
  }
public String getNomeSegurado() {
	return nomeSegurado;
}
public void setNomeSegurado(String nomeSegurado) {
	this.nomeSegurado = nomeSegurado;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public double getValorPremio() {
	return valorPremio;
}
public void setValorPremio(double valorPremio) {
	this.valorPremio = valorPremio;
}
  
public int concedeDesconto(String p, int i)
{ 
	int aux = 0;
	if(i >= 18 && i <=25 )
	{
		aux = 20;
	}
	else if(i > 25 && i <=36 )
	{
		aux = 15;
	}
	else if(i ==36 )
	{
		aux = 10;
	}
	
	if (p.equals("Curitiba"))
	{
		aux+= 20;
	}
	else if (p.equals("RiodeJaneiro") )
	{
		aux+= 15;
	}
	else if (p.equals("BeloHorizonte") )
	{
		aux+= 5;
	}
	else if (p.equals("SãoPaulo"))
	{
		aux+= 10;
	}
	
	
	return aux;
}
  
}
