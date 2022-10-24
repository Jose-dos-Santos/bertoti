package nopatter;

import java.time.LocalDate;

public class ValidacaoConta {

	private LocalDate data = LocalDate.now();

	public boolean ValidarConta(ContaBancaria conta) {
		if (conta.getValidadeConta().isAfter(data)) {
			return true;
		}
		return false;
	}

	public boolean transfeir(double valor, ContaBancaria outra, ContaBancaria conta) {

		if (conta.getSaldo() < 0 || conta.getSaldo() < valor) {
			System.out.println("Saldo insuficiente para transferência");
			return false;
		}
		return true;

	}

}
