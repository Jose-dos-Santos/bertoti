package obsever;

import java.util.List;

public class GeraPedido {

	private List<AcaoAposGerarPedido> acoes = new ArrayList<>();
	private List<Pedido> pedidos = new ArrayList<Pedido>();

	public GeraPedido(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void notify(String acao) {

		this.acoes.forEach(a -> a.executarAcao(acao));

	}

	public void subscribe(Pedido pedido) {

		pedidos.add(pedido);

		this.notify("pedido adicionado");
	}

	public void unsubscribe(Pedido pedido) {
		pedidos.remove(pedido);
		this.notify("Pedido removido");
	}



	public List<Pedido> getPedidos() {
		return pedidos;
	}

}
