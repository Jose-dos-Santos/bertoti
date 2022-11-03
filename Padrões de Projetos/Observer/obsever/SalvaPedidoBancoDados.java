package obsever;

public class SalvaPedidoBancoDados implements AcaoAposGerarPedido {

	@Override
		public void executarAcao(String acao) {

		System.out.println("Informação salva com sucesso " + acao);

	}
}
