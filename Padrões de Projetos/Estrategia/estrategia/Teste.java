package br.jose.santos.estrategia;

import br.jose.santos.estrategia.Funcionario;
import br.jose.santos.estrategia.Gerente;
import br.jose.santos.estrategia.Programador;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario jose = new Funcionario();
		
		jose.setNome("José Maria");
		jose.setSalario(10000.00);
		jose.setBonificacao(new Gerente());
		
	Funcionario joao = new Funcionario();
		
		joao.setNome("João Pedro");
		joao.setSalario(5000.00);
		joao.setBonificacao(new Programador());
			
		
		System.out.println(jose.getBonificacao().calculoBonificacao(jose.getSalario()));
		System.out.println(joao.getBonificacao().calculoBonificacao(joao.getSalario()));

	}

}
