package scr;

public class pessoaj extends pessoa{
	
	private String cnpj;
	
	public pessoaj(String nome, String endereco, String email, String cnpj) {
		 
			super(nome, cnpj, endereco, email);

	this.cnpj = cnpj;
	
	 }
	 
		public String getCnpj() {
			return cnpj;
		}
	
}
