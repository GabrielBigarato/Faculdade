// Define a classe `Pessoa` como pública, permitindo que seja acessada por outras classes.
public class Pessoa {

    // Declara o atributo `nome` como privado, acessível apenas dentro da classe `Pessoa`.
    private String nome;

    // Declara o atributo `idade` como privado, acessível apenas dentro da classe `Pessoa`.
    private int idade;

    // Define o método `setNome` como público, permitindo que seja chamado por outras classes.
    // O método recebe um parâmetro `String` chamado `nome` e define o valor do atributo `nome` do objeto.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define o método `getNome` como público, permitindo que seja chamado por outras classes.
    // O método retorna o valor do atributo `nome` do objeto.
    public String getNome() {
        return nome;
    }

    // Define o método `setIdade` como público, permitindo que seja chamado por outras classes.
    // O método recebe um parâmetro `int` chamado `idade` e define o valor do atributo `idade` do objeto.
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Define o método `getIdade` como público, permitindo que seja chamado por outras classes.
    // O método retorna o valor do atributo `idade` do objeto.
    public int getIdade() {
        return idade;
    }

    // Define o método `apresentar` como público, permitindo que seja chamado por outras classes.
    // O método apresenta o nome e a idade do objeto.
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
