package obsever;

import java.util.Arrays;

public class TestaPedido {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(0123, "José Maria", "20/10/2022");
		Pedido pedidoNovo = new Pedido(0123, "José Maria Reis", "20/10/2022");

		GeraPedido geraPedido = new GeraPedido(Arrays.asList(new EnviaEmailPedido(), new SalvaPedidoBancoDados()));

		geraPedido.subscribe(pedido);
		geraPedido.notify(pedidoNovo, 0);
		geraPedido.unsubscribe(pedido);
		
	
	}

}
