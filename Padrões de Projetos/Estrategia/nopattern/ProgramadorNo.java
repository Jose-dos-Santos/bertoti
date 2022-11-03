package nopatter;

public class ProgramadorNo extends FuncionarioNo {

	@Override
	public double calculoBonificacao(double salario) {
		
		return salario + (salario * 0.05);
	}

}
