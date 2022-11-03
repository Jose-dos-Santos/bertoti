package nopatter;

public class DepartamentoFinaceiro extends Departamento {

	private int id;

	private String nome;

	@Override
	public void printDepartamentoNome() {
		System.out.println(nome);
	}

	public DepartamentoFinaceiro(int id, String name) {
		super();
		this.id = id;
		this.nome = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

}
