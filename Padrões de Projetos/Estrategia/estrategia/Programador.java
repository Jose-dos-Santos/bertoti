package br.jose.santos.estrategia;

import br.jose.santos.estrategia.Bonificacao;

public class Programador implements Bonificacao {

	@Override
	public double calculoBonificacao(double salario) {
		
		return salario + (salario * 0.05);
	}

}
