
public class Pedidos {
	
	private int pedidos=0;
	private double valor = 0;	
	private char op='s';
	private int QuantRefrigerante=0;
	private int QuantCachorroQuente=0;
	private int QuantBatataFrita=0;
	
	
	public int getQuantRefrigerante() {
		return QuantRefrigerante;
	}
	public void setQuantRefrigerante(int quantRefrigerante) {
		QuantRefrigerante += quantRefrigerante;
	}
	public int getQuantCachorroQuente() {
		return QuantCachorroQuente;
	}
	public void setQuantCachorroQuente(int quantCachorroQuente) {
		QuantCachorroQuente += quantCachorroQuente;
	}
	public int getQuantBatataFrita() {
		return QuantBatataFrita;
	}
	public void setQuantBatataFrita(int quantBatataFrita) {
		QuantBatataFrita += quantBatataFrita;
	}
	public int getPedidos() {
		return pedidos;
	}
	public void setPedidos(int pedidos) {
		this.pedidos = pedidos;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public char getOp() {
		return op;
	}
	public void setOp(char op) {
		this.op = op;
	}
	public double calculaValorPedidos(int pedido, int quantidade)
	{
			if(pedido == 1)
				{
				
				valor += 2.00*quantidade;
				QuantRefrigerante += quantidade;
				quantidade=0;
				}
			else  if(pedido == 2)
				{
				valor += 5.00*quantidade;
				QuantCachorroQuente +=quantidade;
				quantidade=0;
				}
			
			else  if(pedido == 3)
				{
				valor += 4.00*quantidade;
				QuantBatataFrita +=quantidade;
				quantidade=0;
				}

				quantidade = 0;
	return valor;
	}
			
}
