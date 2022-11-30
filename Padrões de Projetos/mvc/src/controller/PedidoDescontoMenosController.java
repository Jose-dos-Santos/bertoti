package controller;

public class PedidoDescontoMenosController implements TipoPedidoController {

	@Override
	public void verificarTipo(String desconto) {

		System.out.println(desconto + "10%");

	}

}
