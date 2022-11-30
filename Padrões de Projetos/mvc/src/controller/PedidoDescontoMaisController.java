package controller;


public class PedidoDescontoMaisController implements TipoPedidoController {
	
	@Override
	public void verificarTipo(String desconto) {
		
		System.out.println(desconto +" 50%");
	}
	


}
