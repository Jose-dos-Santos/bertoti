package nopatter;

import java.time.LocalDate;
import java.time.Month;

public class TesteFacate {

	public static void main(String[] args) {

		double valorTranferencia = 200.00;
		ContaBancaria contaCorrente = new ContaCorrente(LocalDate.of(2026, Month.OCTOBER, 20), 5000, "José Maria");

		ContaBancaria contaCorrente2 = new ContaCorrente(LocalDate.of(2026, Month.OCTOBER, 20), 5000, "João");

		ValidacaoConta validaConta = new ValidacaoConta();

		if (validaConta.ValidarConta(contaCorrente2)
				|| validaConta.transfeir(valorTranferencia, contaCorrente, contaCorrente2)) {
			contaCorrente.transfeir(valorTranferencia, contaCorrente2);
		}
		
		System.out.println(contaCorrente.getTitular() + " seu novo saldo é de: " + contaCorrente.getSaldo());
		System.out.println("Novo saldo da conta do " + contaCorrente2.getTitular() + " é de:" + contaCorrente2.getSaldo());

	}

}
