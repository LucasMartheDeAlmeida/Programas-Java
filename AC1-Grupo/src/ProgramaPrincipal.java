import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		int i=0,aux=0,Qtde=0,auxPedido=0;
		int formaDePagamento=0;
		String op ="s",op2="n";
		Mesas Mesa[] = new Mesas[30];
		Pedidos Pedido[] = new Pedidos[30];
			for(i=0; i<30;i++) // 30 mesas => 0 a 29
			{
				Mesa[i]= new Mesas(0); //Inicialização dos objetos Mesa e Pedidos
				Pedido[i]=new Pedidos();
				Mesa[i].setPedido(Pedido[i]);
			}
			
			
			i=0;
			@SuppressWarnings("resource")
			Scanner entradaOP = new Scanner(System.in);
			@SuppressWarnings("resource")
			Scanner entradaMesas = new Scanner(System.in);
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
			while(op.equals("s"))
			{
				i++;
				System.out.println("|=========Cadastramento de Mesas=========");
				Mesa[i].setNumeroMesa(i);
				Mesa[i].setOcupada(true);
				System.out.println("Digite o numro de pessoas da Mesa " + Mesa[i].getNumeroMesa());
				Mesa[i].setNumeroDePessoas(entradaMesas.nextInt());
				
				System.out.println("Deseja continuar cadastrando mesas [s]-sim  [n]-não");
				op= entradaOP.next();
				aux=i;
				if(i==29)
				{
					System.out.println("O numero máximo de mesaS foi cadastrado!!!");
					break ;
				}
				else
					continue;
				
			}
			
			op="s";			
			//Pedidos
			while(op.equals("s"))
			{
				System.out.println("Digite o numero da mesa da qual deseja fazer o pedido");
				aux = entrada.nextInt();
				while(!Mesa[aux].isOcupada())
				{
					System.out.println("Insira outra mesa, pois a mesa inserida não está registrada ainda: ");
					aux = entrada.nextInt();
						while(aux<0 || aux>31)
							{
							System.out.println("Insira um numero válido");
							aux = entrada.nextInt();
							}
				}
				i=0;
				while(i!=aux)
				{
					
					Mesa[i].getNumeroMesa();
					i++;
				}
				op2="s"	;		
				while(op2.equals("s")) {
					System.out.println("Cardápio: \n [1]-Refrigerante R$ 2,00  \n [2]- Cachorro Quente R$ 5,00 \n [3]-Batata Frita R$4,00");
					Qtde=0;
					auxPedido=0;
					System.out.println("Digite qual item do cardápio deseja pedir: ");
					auxPedido = entrada.nextInt();
							while(auxPedido!=1 && auxPedido!=2 && auxPedido!=3)
							{
							System.out.println("Insira um item do cardapio válido ");
							auxPedido = entrada.nextInt();
							}
					System.out.println("Quantidade");
					Qtde = entrada.nextInt();
					Pedido[i].calculaValorPedidos(auxPedido, Qtde);
					System.out.println("Deseja continuar fazendo pedidos para Mesa ["+Mesa[i].getNumeroMesa()+"] ?");
					op2= entradaOP.next();	
				}
			Qtde=0;
			auxPedido=0;
					if(op.equals("n"))
						{
						System.out.println("Mesa " + Mesa[i].getNumeroMesa());
						System.out.println("Pedidos : "+"\n" +"Cachorro quente "+ Mesa[i].getPedido().getQuantCachorroQuente());
						System.out.println("Refrigerante: "+ Mesa[i].getPedido().getQuantRefrigerante());;
						System.out.println("Batata Frita: "+ Mesa[i].getPedido().getQuantBatataFrita());;
						System.out.println("Total : " + Pedido[i].getValor());
						}	
				System.out.println("Deseja continuar fazendo pedidos  ?");
				op= entradaOP.next();		
			}
			op = "s";
			
			i=0;
			while(op.equals("s")) {
				
				System.out.println("Digite o numero da mesa da qual deseja fechar a conta");
				aux = entrada.nextInt();
				
				while(!Mesa[aux].isOcupada())
				{
					System.out.println("Insira outra mesa, pois a mesa inserida não está registrada ainda: ");
					aux = entrada.nextInt();	
				}
				i=0;
				while(i!=aux)
				{
					Mesa[i].getNumeroMesa();
					i++;
				}
				aux = i;	
			System.out.println("Mesa ["+ Mesa[i].getNumeroMesa()+"]"+ "-Numero de pessoas ("+Mesa[i].getNumeroDePessoas()+")");
			System.out.println("Insira a forma de pagamento: \n [1]-Dinheiro \n[2]-Cheque \n[3]-Cartao");
			formaDePagamento = entrada.nextInt();
			System.out.println("A conta ficou "+ Mesa[i].fechaConta(formaDePagamento)+ " Por pessoa" + "Total: "+ Mesa[i].getConta());
			
			
				
			System.out.println("Deseja continuar fechando contas?");
			op= entradaOP.next();
			
				
			}
			
	}
}
