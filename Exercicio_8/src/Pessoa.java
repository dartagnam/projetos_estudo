
public class Pessoa {

	// Atributos
    private String nome;
    private int idade;
    private String cidade;

    // Construtor para inicializar os atributos
    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    // Método para exibir as informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }
    
    

	
}
