package obsever;

import java.util.List;

public class GeraPedido {

	private List<AcaoAposGerarPedido> acoes;

	public GeraPedido(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(Pedido pedido) {
		
		  this.acoes.forEach(a -> a.executarAcao(pedido));
		  
	}
	

}
