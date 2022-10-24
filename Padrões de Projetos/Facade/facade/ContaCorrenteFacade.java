package br.jose.santos.facade;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class ContaCorrente extends ContaBancaria{

	private List<ValidacaoConta> validacoes;
	
	public ContaCorrente(LocalDate validadeConta, double saldo, String titular) {
		super(validadeConta, saldo, titular);

	}

	public boolean verificaSaldo(int valor) {

		if (super.getSaldo() < 0 || super.getSaldo() < valor) {
			return false;
		}

		return true;

	}

	public void transfeir(int valor, ContaBancaria outra) {

		if (!verificaSaldo(valor)) {
			System.out.println("Saldo insuficiente para transferência");
		} else {
			double novoValor = super.getSaldo();
			super.setSaldo(novoValor - valor);
			double novoValorOutraConta = outra.getSaldo() + valor;
			outra.setSaldo(novoValorOutraConta);
		}

	}
	
	public boolean validarConta(ContaBancaria conta) {
	
	for (ValidacaoConta validacaoConta : validacoes) {
		
		System.out.println("Tetse");
		if(!validacaoConta.validar(conta)) {
			return false;
		}
		
	}
	return true;
		
	}

}
