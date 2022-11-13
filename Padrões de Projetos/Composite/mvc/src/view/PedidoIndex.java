package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.PedidoController;
import model.Email;
import model.NotificandoPedido;
import model.Pedido;

public class PedidoIndex {
	private Scanner ler = new Scanner(System.in);
	private PedidoController pedidoController = new PedidoController();
	private List<PedidoView> notificacoes = new ArrayList<>();

	public void notify(String acao) {

		this.notificacoes.forEach(a -> a.notificar(acao));

	}

	public PedidoIndex(List<PedidoView> notificacoes) {
		this.notificacoes = notificacoes;
	}

	public void cadatrarPedido() {
		String menssagemUsuario;
		int numeroPedido;
		String nomeCliente;
		int tipo;
		String dataPedido;
		String emailusuario;
		String nomeCliente0;

		System.out.printf("Informe o número do pedido:\n");
		numeroPedido = ler.nextInt();

		nomeCliente0 = ler.nextLine();

		System.out.printf("Informe o nome do cliente:\n");
		nomeCliente = ler.nextLine();

		System.out.printf("Informe data do pedido:\n");
		dataPedido = ler.nextLine();

		System.out.printf("Informe o conteudo do e-mail:\n");
		emailusuario = ler.nextLine();

		System.out.printf("Informe o tipo do pedido:\n");
		tipo = ler.nextInt();

		Email email = new Email(nomeCliente, emailusuario);

		Pedido pedido = new Pedido(numeroPedido, nomeCliente, dataPedido, email, tipo);

		pedidoController.adicionarPedido(pedido);

		menssagemUsuario = "Adicionado na";

		this.notify(menssagemUsuario);

	}

	public void removerPedido() {
		String menssagemUsuario;
		int numero;
		System.out.printf("Informe o numero do pedido:\n");
		numero = ler.nextInt();
		pedidoController.removerPedido(numero);

		menssagemUsuario = "Removido da";

		this.notify(menssagemUsuario);
	}

}
