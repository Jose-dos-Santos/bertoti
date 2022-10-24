package facade;

import java.time.LocalDate;
import java.time.Month;

public class TesteFacate {

	public static void main(String[] args) {


		ContaBancaria contaCorrente = new ContaCorrenteFacade(LocalDate.of(2026, Month.OCTOBER, 20), 5000,"José Maria");
		
		ContaBancaria contaCorrente2 = new ContaCorrenteFacade(LocalDate.of(2026, Month.OCTOBER, 20), 5000,"João");
		
		contaCorrente.transfeir(200, contaCorrente2);
		
	
	}

}
