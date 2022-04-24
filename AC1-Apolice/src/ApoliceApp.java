import java.util.Scanner;

public class ApoliceApp {
 public static void main(String[] args) {
	 
	 String cidade;
	 Scanner entrada = new Scanner (System.in);
	 Scanner entradaAux = new Scanner (System.in);
	 Apolice a1 = new Apolice("Lucas", 19,1900);
	 Apolice a2 = new Apolice();
	 System.out.println(a1.imprime());
	 System.out.println("Insira a cidade do cliente ");
	 cidade = entradaAux.next();
	 System.out.println("Desconto de " + a1.concedeDesconto(cidade, a1.getIdade()) + " concedido ");
	 
	 System.out.println(a1.imprime() + " Com desconto de " +a1.concedeDesconto(cidade, a1.getIdade()) +" % ");
	
	 

	 
	 
	 
	 System.out.println("___________________________________________________________________________________");
	
	 
	 
	 
	 Scanner entradaAux2 = new Scanner (System.in);
	 String cidade2 = null;
	 System.out.println("Insira as informaçoes do cliente");
	 System.out.println("Nome: ");
	 a2.setNomeSegurado(entrada.next());
	 System.out.println("Idade: ");
	 a2.setIdade(entrada.nextInt());
	 System.out.println("Valor premio: ");
	 a2.setValorPremio(entrada.nextDouble());
	 System.out.println(a2.imprime());
	 System.out.println("Insira a cidade : ");
	 cidade2 = entradaAux2.next();
	 System.out.println("Desconto de " + a2.concedeDesconto(cidade2, a2.getIdade()) + " concedido ");
	 System.out.println("___________________________________________________________________________________");
	 System.out.println(a2.imprime() + " Com desconto de " +a2.concedeDesconto(cidade, a2.getIdade()) +" % ");
	entrada.close();
	entradaAux.close();
	entradaAux2.close();
 }
}
