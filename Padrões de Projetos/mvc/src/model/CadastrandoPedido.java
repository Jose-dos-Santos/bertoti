package model;

import java.util.ArrayList;
import java.util.List;

public class CadastrandoPedido {

	private Pedido pedido = new Pedido();

	private List<NotificandoPedido> notificacoes = new ArrayList<>();

	public CadastrandoPedido() {
	}

	public CadastrandoPedido(List<NotificandoPedido> notificacoes) {
		this.notificacoes = notificacoes;
	}

	public void notify(String acao) {

		this.notificacoes.forEach(a -> a.notificar(acao));

	}

	public void subscribe(Pedido pedido) {

		this.pedido.getPedidos().add(pedido);
		this.notify("pedido adicionado");
	}

	public void unsubscribe(int id) {

		Pedido pedidoRemove = new Pedido();
		Pedido pedidoList = new Pedido();

		List<Pedido> pedidos = pedidoList.getPedidos();

		for (int i = 0; i < pedidos.size(); i++) {
			System.out.println("Teste");
			if (i == id) {
				pedidoRemove = pedidos.get(i);

			}

		}
		this.pedido.getPedidos().remove(pedido);
		this.notify("Pedido removido");

	}

}
