package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private int numeroPedido;

	private String nomeCliente;
    
	private int tipo;
	
	private String dataPedido;

	private Email emailusuario;

	private List<Pedido> pedidos = new ArrayList<Pedido>();

	public Pedido() {

	}

	public Pedido(int numeroPedido, String nomeCliente, String data, Email emailusuario,int tipo) {
		this.numeroPedido = numeroPedido;
		this.nomeCliente = nomeCliente;
		this.dataPedido = data;
		this.emailusuario = emailusuario;
		this.tipo = tipo;

	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public Email getEmailusuario() {
		return emailusuario;
	}

	public int getTipo() {
		return tipo;
	}

	
}
