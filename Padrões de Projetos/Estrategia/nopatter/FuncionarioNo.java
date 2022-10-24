package nopatter;

public abstract class FuncionarioNo {
	
   private String nome;
   private double salario;
   private double  bonificacao;
   
   
   
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public double getBonificacao() {
	return bonificacao;
}


public double calculoBonificacao(double salario) {
	return salario +100;
	
};

}
