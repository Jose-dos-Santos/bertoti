package composite;

public class DepartamentoFinaceiro implements Departamento {

	private int id;

	private String nome;

	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());
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
