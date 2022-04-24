
public class Mesas {
	public static int totalDeMesas=0;
	private int numeroMesa=0;
	private boolean ocupada = false;  // False> mesa livre; True mesa ocupada;
	
	private int numeroDePessoas= 0;
	private Pedidos pedido;
	
	private double conta;
	
	
	public Mesas()
	{
		totalDeMesas++;
	}
	
	public Mesas(double conta)
	{
		this.conta=conta;
		totalDeMesas++;
	}
	
	

	public double fechaConta(int pag)
	{
		
		conta = pedido.getValor();
		
		
		if(pag ==1)
		{
		ocupada = false;
		conta-=(conta*0.1);
		
		}
		else if(pag ==2)	
		{
		ocupada = false;
		}
		else if(pag ==3)
		{
		conta-=(conta*0.05);
		}
		return conta/numeroDePessoas;
	}

	
	public Pedidos getPedido() {
		return pedido;
	}

	public void setPedido(Pedidos pedido) {
		this.pedido = pedido;
	}

	public static int getTotalDeMesas() {
		return totalDeMesas;
	}
	public static void setTotalDeMesas(int totalDeMesas) {
		Mesas.totalDeMesas = totalDeMesas;
	}
	public int getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	public int getNumeroDePessoas() {
		return numeroDePessoas;
	}
	public void setNumeroDePessoas(int numeroDePessoas) {
		this.numeroDePessoas = numeroDePessoas;
	}
	
	public double getConta() {
		return conta;
	}
	public void setConta(double conta) {
		this.conta = conta;
	}
}
