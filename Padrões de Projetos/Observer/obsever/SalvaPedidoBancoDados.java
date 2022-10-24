package obsever;

public class SalvaPedidoBancoDados implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {

       System.out.println("Pedido salvo no banco com sucesso");
		
	}

}
