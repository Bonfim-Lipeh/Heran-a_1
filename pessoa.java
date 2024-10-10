package scr;

public class pessoa {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	
	public pessoa(String nome, String cpf, String endereco, String email) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		
	}
	
	public String getNome() {
		return nome;
	}

	
	public String getCpf() {
		return cpf;
	}

	
	public String getEndereco() {
		return endereco;
	}
	
	
	public String getEmail() {
		return email;
	}

	
	



}