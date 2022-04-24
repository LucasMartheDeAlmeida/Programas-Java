import java.text.DecimalFormat;

public class Mesa {
	private int numeroDePessoas;
	private double valorTotal=0;
	private int numeroMesa;
	private int produto1;
	private int produto2;
	public static int totalMesas=0;
	
	void pedido1()
	{
			
		if(this.produto1 == 1)
			this.valorTotal = 2;
		else if(produto1 == 2)
			this.valorTotal = 5;
		else if(produto1 == 3)
			this.valorTotal = 4;
	}
	
	void pedido2()
	{
			
		if(this.produto2 == 1)
			this.valorTotal += 2;
		else if(this.produto2 == 2)
			this.valorTotal += 5;
		else if(this.produto2 == 3)
			this.valorTotal += 4;
	}
	
	
	double novoValor(int pagamento)
	{
		if(pagamento == 1)
	
		{valorTotal -= valorTotal*0.10;}
		
		else if(pagamento == 2)
			
		{System.out.println("Não há desconto");}
		
		else if(pagamento == 3)
			
		{valorTotal -= valorTotal*0.05;}
		
		return	valorTotal;
	}
	
	String imprime ()
	{
		
		String Produto1=null;
		String Produto2=null;
		String retorno=null;
		double valorPorPessoa = this.valorTotal/this.numeroDePessoas;
				
				if(this.produto1 ==1)
			Produto1= "Refrigerante";
		else if(this.produto1 ==2)
			Produto1= "Cachorro Quente";
		else if(this.produto1 ==3)
			Produto1= "Batata Frita";
		
		if(this.produto2 ==1)
			Produto2= "Refrigerante";
		else if(this.produto2 ==2)
			Produto2= "Cachorro Quente";
		else if(this.produto2 ==3)
			Produto2= "Batata Frita";
		
		
		
		 String formato = "R$ #,##0.00";
		 DecimalFormat deci = new DecimalFormat(formato);
		 
		 retorno = "Mesa["+this.numeroMesa+"]: "+ "\n" + "Pedido 1: ["+ this.produto1 + "]" + "" +Produto1 + "\n" + "Pedido 2: ["+ this.produto2 + "]" + " " + Produto2 +"\n" +"Valor total R$"+ " " + this.valorTotal + "\n"+"Valor por pessoa " + deci.format(valorPorPessoa);
		 return retorno;
	}
	
	
	
	
	
	public String comparaMesas(Mesa MesaF)
	{
		if(this.valorTotal/this.numeroDePessoas >MesaF.valorTotal/MesaF.numeroDePessoas)
		{
			return this.imprime();
		}
		else if(this.valorTotal/this.numeroDePessoas <MesaF.valorTotal/MesaF.numeroDePessoas)
		{
			return MesaF.imprime();
		}
		
		else
		{
			return "As mesas possuem o mesmo valor gasto por pessoa ";
		}
	}
	
	
	
	
	
	
	
	public int getNumeroDePessoas() {
		return numeroDePessoas;
	}
	public void setNumeroDePessoas(int numeroDePessoas) {
		this.numeroDePessoas = numeroDePessoas;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public int getProduto1() {
		return produto1;
	}
	public void setProduto1(int produto1) {
		this.produto1 = produto1;
	}
	public int getProduto2() {
		return produto2;
	}
	public void setProduto2(int produto2) {
		this.produto2 = produto2;
	}
}
