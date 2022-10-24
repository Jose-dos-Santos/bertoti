package br.jose.santos.facade;

import java.time.LocalDate;
import java.time.Month;

public class TesteFacate {

	public static void main(String[] args) {


		ContaCorrente contaCorrente = new ContaCorrente(LocalDate.of(2026, Month.OCTOBER, 20), 5000,"José Maria");
		
		ContaCorrente contaCorrente2 = new ContaCorrente(LocalDate.of(2026, Month.OCTOBER, 20), 5000,"João");
		
		System.out.println(contaCorrente2.getSaldo());
		
		contaCorrente.transfeir(200, contaCorrente2);
		
		System.out.println(contaCorrente2.getSaldo());
		System.out.println(contaCorrente.getSaldo());

		System.out.println(contaCorrente.getValidadeConta());
		
		boolean teste = contaCorrente.validarConta(contaCorrente);
		
		System.out.println(teste);
	}

}
