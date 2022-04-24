
public class main {
 public static void main(String[] args) {
	 
	 //Conta
	conta contaA = new conta();
	contaA.setNumero(1337);
	contaA.setAgencia(1337);
	contaA.setSaldo(1000);


	//Cliente 
	pessoa paulo = new pessoa ();
	paulo.setNome("Paulo");
	
	paulo.setProfissão("Engenheiro");
	
	contaA.setTitular(paulo);
	
	
	contaA.getTitular().setCPF("XXX.XXX.XXX.XXX");
	contaA.getTitular().setCPF("XXX.XXX.XXX.XXX");
	
	conta contaB = new conta();
	contaB.setSaldo(1337);
	
	System.out.println(contaA.imprime() + "\n\n "+ contaA.getTitular().imprime());
	System.out.println(conta.getNumeroDeContas());
	
}
}
