package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.CadastrandoPedido;
import model.Email;
import model.EmailPedido;
import model.Pedido;
import model.SalvandoPedido;

public class PedidoController implements TipoPedidoController {

	private CadastrandoPedido pedido = new CadastrandoPedido(Arrays.asList(new EmailPedido(),new SalvandoPedido()));
	@Override
	public void verificarTipo(Pedido pedido) {

		if (pedido.getTipo() == 1) {
			System.out.println("Pedido com 10 % de desconto");
		}

	}

	public void adicionarPedido(Pedido pedido) {
        this.verificarTipo(pedido);
		this.pedido.subscribe(pedido);

	}

	public void removerPedido(int indexPedido) {
		Pedido pedidoRemove = new Pedido();
		Pedido pedidoList = new Pedido();

		List<Pedido> pedidos = pedidoList.getPedidos();
		
		for (int i = 0; i < pedidos.size(); i++) {
			System.out.println("Teste");
			if (i == indexPedido) {
				pedidoRemove = pedidos.get(i);
				
				System.out.println(pedidoRemove.getNomeCliente());
			}

		}

		this.pedido.unsubscribe(pedidoRemove);

	}

}
