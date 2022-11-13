package view;

import java.util.Arrays;
import java.util.Scanner;

import model.NotificandoPedido;

public class PedidoView implements NotificandoPedido {

	@Override
	public void notificar(String acao) {

		System.out.println("Pedido " + acao + " sua lista");

	}

	public void iniciar() {
		Scanner ler = new Scanner(System.in);
		String iniciar;
		System.out.printf("Você quer adicionar ou remover o Pedido? 1 adiciona 2 remove 3 sair:\n");
		iniciar = ler.nextLine();

		PedidoIndex pedidoIndex = new PedidoIndex(Arrays.asList(new PedidoView()));

		while (!iniciar.equals("3")) {
			if (iniciar.equals("1")) {

				pedidoIndex.cadatrarPedido();
			} else {
				pedidoIndex.removerPedido();
			}

			iniciar = null;

			System.out.println();
			System.out.printf("Você quer adicionar ou remover o Pedido? 1 adiciona 2 remove 3 sair:\n");
			iniciar = ler.nextLine();

		}
	}
}
