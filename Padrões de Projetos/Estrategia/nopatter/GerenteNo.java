package nopatter;

public class GerenteNo extends FuncionarioNo {
	
	
	
	

	@Override
	public double calculoBonificacao(double salario) {
		
		return salario +(salario*0.1);
	}

}
