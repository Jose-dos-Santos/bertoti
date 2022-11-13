package model;

public class Email {

	private String destinatario;
	private String conteudo;

	public Email() {

	}

	public Email(String destinatario, String conteudo) {
		super();
		this.destinatario = destinatario;
		this.conteudo = conteudo;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
