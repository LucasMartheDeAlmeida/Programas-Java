import java.util.Scanner;

public class ProgramaPrincipal {
 public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	int numMesaA = 0;
	
	
	Mesa MesaA = new Mesa();
	Mesa MesaB = new Mesa();
	
	System.out.println("Código dos produtos: \n 1- Refrigerante R$ 2 \n 2- Cachorro quente R$ 5 \n 3 - Bata frita R$4");
	System.out.println("Insira o numero da Mesa");
	numMesaA = entrada.nextInt();
	MesaA.setNumeroMesa(numMesaA);
	System.out.println("Insira o primeiro pedido da mesa " + MesaA.getNumeroMesa() );
	MesaA.setProduto1(entrada.nextInt());
	System.out.println("Insira o segundo pedido da mesa " + MesaA.getNumeroMesa() );
	MesaA.setProduto2(entrada.nextInt());
	System.out.println("Insira a quantidade de pessoas para a mesa " + MesaA.getNumeroMesa());
	MesaA.setNumeroDePessoas(entrada.nextInt());
	MesaA.pedido1();
	MesaA.pedido2();
	System.out.println("Insira o método de pagamento\n  [1]- Dinheiro \n [2]-Cheque \n [3 ]Cartão");
	MesaA.novoValor(entrada.nextInt());
	System.out.println(MesaA.imprime());
	
	
	System.out.println("___________________________________________________________");
	
	MesaB.setNumeroMesa(numMesaA+1);
	
	System.out.println("Insira o primeiro pedido da mesa " + MesaB.getNumeroMesa() );
	MesaB.setProduto1(entrada.nextInt());
	System.out.println("Insira o segundo pedido da mesa " + MesaB.getNumeroMesa() );
	MesaB.setProduto2(entrada.nextInt());
	System.out.println("Insira a quantidade de pessoas para a mesa " + MesaB.getNumeroMesa());
	MesaB.setNumeroDePessoas(entrada.nextInt());
	MesaB.pedido1();
	MesaB.pedido2();
	System.out.println("Insira o método de pagamento\n  [1]- Dinheiro \n [2]-Cheque \n [3 ]Cartão");
	MesaB.novoValor(entrada.nextInt());
	System.out.println(MesaB.imprime());
	entrada.close();
	
	
	
	System.out.println("\n\n\n\n\n\n\n"+ "Pedidos : ");
	System.out.println(MesaA.imprime());
	
	System.out.println(MesaB.imprime());
	System.out.println("\n\n\n A mesa com maior valor gasto por pessoa foi :");
	System.out.println(MesaA.comparaMesas(MesaB));
 }
}
