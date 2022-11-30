package controller;

import java.util.ArrayList;
import java.util.List;
import model.CadastrandoPedido;
import model.Pedido;

public class PedidoController {

	private CadastrandoPedido pedido = new CadastrandoPedido();

	private List<TipoPedidoController> notificacoes = new ArrayList<>();

	
	public PedidoController() {
		
	}
	
	public PedidoController(List<TipoPedidoController> notificacoes) {
		this.notificacoes = notificacoes;
	}

	public void notify(String desconto) {

		this.notificacoes.forEach(a -> a.verificarTipo(desconto));

	}

	public void adicionarPedido(Pedido pedido) {

		this.pedido.subscribe(pedido);
		this.notify("");

	}

	public String removerPedido(int id) {

		this.pedido.unsubscribe(id);
		return "Pedido removido";

	}

}
