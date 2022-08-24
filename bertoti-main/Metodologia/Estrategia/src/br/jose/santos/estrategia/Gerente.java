package br.jose.santos.estrategia;

public class Gerente implements Bonificacao {
	
	
	
	

	@Override
	public double calculoBonificacao(double salario) {
		
		return salario +(salario*0.1);
	}

}
