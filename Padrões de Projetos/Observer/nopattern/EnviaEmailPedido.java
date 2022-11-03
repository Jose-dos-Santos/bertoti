package nopatter;

public class EnviaEmailPedido extends Pedido {

	
	public EnviaEmailPedido(int numeroPedido, String nomeCliente, String data) {
		super(numeroPedido, nomeCliente, data);
	
	}

	@Override
	public void executarAcao(Pedido pedido) {
		
		System.out.println("Email envidado");
		
	}

}
