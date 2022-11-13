package model;

import java.util.ArrayList;
import java.util.List;

public class CadastrandoPedido {

	private Pedido pedido = new Pedido();

	private List<NotificandoPedido> notificacoes = new ArrayList<>();

	

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

	public void unsubscribe(Pedido pedido) {
		this.pedido.getPedidos().remove(pedido);
		this.notify("Pedido removido");
	}

}
