
public class conta {
	private double saldo;
	private int agencia;
	private int numero;
	String tiular;
	private pessoa titular;
	private static int  numeroDeContas;
	
	
	public conta()
	{
		numeroDeContas++;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public static int getNumeroDeContas() {
		return numeroDeContas;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public pessoa getTitular() {
		return titular;
	}
	public void setTitular(pessoa titular) {
		this.titular = titular;
	}
	public String imprime ()
	{
		return "Conta: " + this.numero+ "\n" + "Agencia: "+ this.agencia + "\n" + "Titular: " + titular.getNome() + "\n"+ "Numero de contas "+ getNumeroDeContas();
	}
}
