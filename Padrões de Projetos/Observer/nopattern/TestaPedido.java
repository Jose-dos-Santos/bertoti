package nopatter;

public class TestaPedido {

	public static void main(String[] args) {
 
 
				Pedido pedido = new Pedido(0123, "José Maria", "20/10/2022");
				
				GeraPedido geraPedido = new GeraPedido();
				
				SalvaPedidoBancoDados salvaPedidoBanco = new SalvaPedidoBancoDados(pedido.getNumeroPedido(), pedido.getNomeCliente(), pedido.getDataPedido());
				
				EnviaEmailPedido  enviaEmailPedido = new EnviaEmailPedido(pedido.getNumeroPedido(), pedido.getNomeCliente(), pedido.getDataPedido());

				 geraPedido.execute(salvaPedidoBanco);
				 
				 geraPedido.execute(enviaEmailPedido);
			}


	}


