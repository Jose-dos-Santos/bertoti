package composite;

public class TesteComposite {
	
	  public static void main(String args[]) {
	        Departamento departamentoVenda = new DepartamentoVenda(
	          1, "Departamento Venda");
	        
	        Departamento  departamentoFinaceiro = new DepartamentoFinaceiro(
	          2, "Departamento Finaceiro");

	        DepartamentoChefe departamentoChefe = new DepartamentoChefe(
	          3, "Departamento Chefe");

	        departamentoChefe.addDepartamento(departamentoVenda);
	        departamentoChefe.addDepartamento(departamentoFinaceiro);

	        departamentoChefe.printDepartamentoNome();
	    }

}
