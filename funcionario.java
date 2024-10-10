package scr;

public class funcionario extends pessoa {
	
	private double salario;
	
	public funcionario(String nome, String cpf, String endereco, String email, double salario){
		
		super(nome, cpf, endereco, email);
		
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
}
