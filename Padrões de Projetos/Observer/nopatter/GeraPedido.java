package nopatter;


public class GeraPedido {

	

	public void execute(Pedido pedido) {
		
		System.out.println("Pedido Executado");
		
		pedido.executarAcao(pedido);
		  
	}
	

}
