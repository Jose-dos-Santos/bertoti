package nopatter;

public class SalvaPedidoBancoDados extends Pedido{

	
	public SalvaPedidoBancoDados(int numeroPedido, String nomeCliente, String data) {
		super(numeroPedido, nomeCliente, data);
		
	}

	@Override
	public void executarAcao(Pedido pedido) {

       System.out.println("Pedido salvo no banco com sucesso");
		
	}

}
