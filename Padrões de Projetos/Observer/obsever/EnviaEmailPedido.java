package obsever;

public class EnviaEmailPedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		
		System.out.println("Email envidado");
		
	}

}
