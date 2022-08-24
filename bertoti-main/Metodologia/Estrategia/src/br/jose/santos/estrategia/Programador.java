package br.jose.santos.estrategia;

public class Programador implements Bonificacao {

	@Override
	public double calculoBonificacao(double salario) {
		
		return salario + (salario * 0.05);
	}

}
