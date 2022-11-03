package nopatter;

import java.time.LocalDate;

public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(LocalDate validadeConta, double saldo, String titular) {
		super(validadeConta, saldo, titular);

	}

	public boolean verificaSaldo(double valor) {

		if (super.getSaldo() < 0 || super.getSaldo() < valor) {
			return false;
		}

		return true;

	}

	public void transfeir(double valor, ContaBancaria outra) {

		double novoValor = this.getSaldo();
		this.setSaldo(novoValor - valor);
		double novoValorOutraConta = outra.getSaldo() + valor;
		outra.setSaldo(novoValorOutraConta);

	}

}
