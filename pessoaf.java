package scr;


public class pessoaf extends pessoa {
	
	private String telefone;

	public pessoaf(String nome, String cpf, String endereco, String email, String telefone) {
		super(nome, cpf, endereco, email);
		this.telefone = telefone;

	}
	public String getTelefone() {
		return telefone;
	}
	
}


