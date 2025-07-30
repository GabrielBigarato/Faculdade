import java.util.Calendar;

// Classe que representa um contato de e-mail
public class EContato extends Contato {
    protected String email; // Endereço de e-mail do contato
    protected String homepage; // Página inicial do contato

    // Construtor da classe EContato
    public EContato(String nome, Calendar dtnasc, String email, String hp) {
        super(nome, dtnasc); // Chama o construtor da classe pai
        this.email = email; // Inicializa o endereço de e-mail
        homepage = hp; // Inicializa a página inicial
    }

    // Sobrescreve o método para obter os dados do contato de e-mail
    @Override
    public String getDados() {
        // Retorna os dados do contato básico e adiciona o e-mail e a homepage
        return super.getDados() + "Email: " + email + "\nHomepage: " + homepage + "\n";
    }

    // Método para obter o endereço de e-mail do contato
    public String getEmail() {
        return email; // Retorna o endereço de e-mail
    }

    // Método para obter a homepage do contato
    public String getHomepage() {
        return homepage; // Retorna a homepage
    }
}
