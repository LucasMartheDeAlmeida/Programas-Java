
public class TesteFuncionario {
	public static void main(String[] args) {
		

		Gerente g1 = new Gerente();
		g1.setCpf("XXX.XXX.XXX-XX");
		g1.setNome("Lukelvers");
		g1.setSalario(1900);
		
		System.out.println(g1.getNome()+g1.getCpf());
		
		g1.setSenha(222);
		boolean autenticou = g1.autentica(222);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
