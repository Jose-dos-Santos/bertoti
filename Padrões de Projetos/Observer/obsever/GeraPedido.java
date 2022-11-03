package obsever;

import java.util.List;

public class GeraPedido {

	private List<AcaoAposGerarPedido> acoes = new ArrayList<>();
	private List<Pedido> pedidos = new ArrayList<Pedido>();

	public GeraPedido(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(String acao) {

		this.acoes.forEach(a -> a.executarAcao(acao));

	}

	public void subscribe(Pedido pedido) {

		pedidos.add(pedido);

		this.execute("pedido adicionado");
	}

	public void unsubscribe(Pedido pedido) {
		pedidos.remove(pedido);
		this.execute("Pedido removido");
	}

	public void notify(Pedido pedido, int index) {

		for (int i = 0; i < pedidos.size(); i++) {

			if (i == index) {
				pedidos.add(index, pedido);
				this.execute("Pedido modificado");

			}

		}
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

}
