package nopatter;

public class TesteNo {

	public static void main(String[] args) {
		
		FuncionarioNo jose = new GerenteNo();
		
		jose.setNome("José Maria");
		jose.setSalario(10000.00);
		System.out.println(jose.calculoBonificacao(jose.getSalario()));	
		
	FuncionarioNo joao = new ProgramadorNo();
		
		joao.setNome("João Pedro");
		joao.setSalario(5000.00);
		
		System.out.println(joao.calculoBonificacao(joao.getSalario()));	
	}

}
