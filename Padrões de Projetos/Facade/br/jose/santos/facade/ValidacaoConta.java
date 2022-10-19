package br.jose.santos.facade;

import java.time.LocalDate;

public class ValidacaoConta implements Valida {

	private LocalDate data = LocalDate.now ();

	@Override
	public boolean validar(ContaBancaria conta) {
		if (conta.getValidadeConta().isAfter(data)) {

		}
		return false;
	}

}
