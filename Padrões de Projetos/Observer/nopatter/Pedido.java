package nopatter;

public class Pedido {
	
	public int getNumeroPedido() {
		return numeroPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	private int numeroPedido;
	
	private String nomeCliente;
	
	private String dataPedido;
	
	public Pedido(int numeroPedido, String nomeCliente, String data) {
		this.numeroPedido = numeroPedido;
		this.nomeCliente = nomeCliente;
		this.dataPedido = data;
		
	}

	public void executarAcao(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

}
