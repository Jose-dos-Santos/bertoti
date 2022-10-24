package singleton;

public class Usuario {
 
	private int idUsduario;
	private String nome;
	private int tipo;
	private String dataCriacao;

	public Usuario(int idUsduario, String nome, int tipo, String dataCriacao) {
		super();
		this.idUsduario = idUsduario;
		this.nome = nome;
		this.tipo = tipo;
		this.dataCriacao = dataCriacao;
	}

	public void acessarFuncionalidades(int tipoPermicao) {

		 if(this.tipo != tipoPermicao) {
			Log var = Log.getInstance(dataCriacao, nome, tipo);
			System.out.println(var);
		 }
	}

	public String getNome() {
		return nome;
	}

	public int getTipo() {
		return tipo;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public int getIdUsduario() {
		return idUsduario;
	}

}
