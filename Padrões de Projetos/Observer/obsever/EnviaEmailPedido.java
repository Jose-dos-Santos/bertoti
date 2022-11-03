package obsever;

public class EnviaEmailPedido implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(String acao) {
		
		System.out.println("Email envidado " + acao);
		
	}

}
