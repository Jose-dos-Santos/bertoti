package singleton;

public class Log {

	private String data;
	private String descricao;
	private int tipo;

	private static Log instanciaUnica = new Log();

	private Log() {
	}

	public static Log getInstance(String data, String descricao, int tipo) {

		instanciaUnica.data = data;
		instanciaUnica.descricao = descricao;
		instanciaUnica.tipo = tipo;
		return instanciaUnica;
	}

	public String getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Log [data=" + data + ", descricao=" + descricao + ", tipo=" + tipo + "]";
	}

	

}
