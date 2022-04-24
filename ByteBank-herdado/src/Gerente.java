//Gerente herda de funcionario
public class Gerente extends Funcionario{

	private int senha;
	
	
	
	public double getBonificacao() {
		
		return super.salario*2;   //REESCRITA
	}

	public boolean autentica(int senha)
	{
		if (this.senha == senha)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	
	

}
