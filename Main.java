package scr;

public class Main {
public static void main(String[] args) {
    // Criando objetos
    pessoaf p1 = new pessoaf("João da Silva", "12345678901", "Rua A", "joao@email.com", "(11) 98765-4321");
    pessoaj pj1 = new pessoaj("Empresa XYZ", "12.345.678/0001-99", "Avenida B", "contato@empresa.com.br");
    funcionario f1 = new funcionario("Maria Silva", "98765432109", "Rua C", "maria@email.com", 5000.0);

    // Acessando os atributos
    System.out.println(p1.getNome());
    System.out.println(p1.getCpf());
    System.out.println(p1.getEndereco());
    System.out.println(p1.getEmail());
    System.out.println(p1.getTelefone());
    System.out.println("");



    System.out.println(pj1.getNome());
    System.out.println(pj1.getCnpj());
    System.out.println(pj1.getEndereco());
    System.out.println(pj1.getEmail());
    System.out.println("");

    System.out.println(f1.getNome());
    System.out.println(f1.getCpf());
    System.out.println(f1.getEndereco());
    System.out.println(f1.getEmail());
    System.out.println(f1.getSalario());
    System.out.println("");


}
}
