package facade;

import java.time.LocalDate;

public class ContaCorrenteFacade extends ContaBancaria {

	private ValidacaoConta validaConta = new ValidacaoConta();

	public ContaCorrenteFacade(LocalDate validadeConta, double saldo, String titular) {
		super(validadeConta, saldo, titular);

	}

	public boolean verificaSaldo(int valor) {

		if (super.getSaldo() < 0 || super.getSaldo() < valor) {
			return false;
		}

		return true;

	}

	public boolean transfeir(int valor, ContaBancaria outra) {

		if(!validarConta(outra)) {
			System.err.println("Conta invalida" +"\nvalidade da conta vencida: " + outra.getValidadeConta());
			return false;
		}
		if (!verificaSaldo(valor)) {
			System.out.println("Saldo insuficiente para transferência");
			return false;
		} else {
			double novoValor = super.getSaldo();
			super.setSaldo(novoValor - valor);
			double novoValorOutraConta = outra.getSaldo() + valor;
			outra.setSaldo(novoValorOutraConta);
			return true;
		}
		

	}

	public boolean validarConta(ContaBancaria conta) {

		if (!validaConta.ValidarConta(conta)) {

			return false;
		}

		return true;

	}

}
