// Define a classe `Main` como pública, permitindo que seja acessada por outras classes.
public class App {

    // Define o método `main` como público e estático, sendo o ponto de entrada da aplicação.
    // O método não recebe parâmetros e retorna `void`.
    public static void main(String[] args) {

        // Cria um novo objeto da classe `Pessoa` chamado `pessoa1`.
        Pessoa pessoa1 = new Pessoa();

        // Define o valor do atributo `nome` do objeto `pessoa1` usando o método `setNome`.
        pessoa1.setNome("João Silva");

        // Define o valor do atributo `idade` do objeto `pessoa1` usando o método `setIdade`.
        pessoa1.setIdade(25);

        // Chama o método `apresentar` do objeto `pessoa1`.
        pessoa1.apresentar();

        // Cria um novo objeto da classe `Pessoa` chamado `pessoa2`.
        Pessoa pessoa2 = new Pessoa();

        // Define o valor do atributo `nome` do objeto `pessoa2` usando o método `setNome`.
        pessoa2.setNome("Maria Oliveira");

        // Define o valor do atributo `idade` do objeto `pessoa2` usando o método `setIdade`.
        pessoa2.setIdade(30);

        // Chama o método `apresentar` do objeto `pessoa2`.
        pessoa2.apresentar();
    }
    
}
