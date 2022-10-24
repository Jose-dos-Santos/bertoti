package composite;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoChefe {
	
	 private int id;
	    private String nome;

	    private List<Departamento> departamentos;

	    public DepartamentoChefe(int id, String name) {
	        this.id = id;
	        this.nome = name;
	        this.departamentos = new ArrayList<>();
	    }

	    public void printDepartamentoNome() {
	        departamentos.forEach(Departamento::printDepartmentName);
	    }

	    public void addDepartamento(Departamento departamento) {
	        departamentos.add(departamento);
	    }

	    public void removeDepartamento(Departamento departamento) {
	        departamentos.remove(departamento);
	    }

}
