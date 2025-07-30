import java.util.ArrayList;

// Classe abstrata que representa um contato básico
abstract public class ContatoBasico {
    protected String nome; // Nome do contato
    protected ArrayList<Telefone> telefones; // Lista de telefones do contato

    // Construtor padrão da classe ContatoBasico
    public ContatoBasico() {
        nome = ""; // Inicializa o nome como uma string vazia
        telefones = new ArrayList(); // Inicializa a lista de telefones
    }

    // Construtor da classe ContatoBasico com o nome fornecido
    public ContatoBasico(String nome) {
        this.nome = nome; // Inicializa o nome com o valor fornecido
        telefones = new ArrayList(); // Inicializa a lista de telefones
    }

    // Método para obter o nome do contato
    public String getNome() {
        return nome; // Retorna o nome do contato
    }

    // Método para definir o nome do contato
    public void setNome(String nome) {
        this.nome = nome; // Define o nome do contato com o valor fornecido
    }

    // Método para adicionar um telefone ao contato
    public void setTelefone(Telefone tf) {
        telefones.add(tf); // Adiciona o telefone à lista de telefones do contato
    }

    // Método para obter os dados do contato
    public String getDados() {
        String s = nome + "\n"; // Inicia uma string com o nome do contato
        // Itera sobre a lista de telefones
        for (Telefone t : telefones) {
            s += t.getTelefone() + "\n"; // Adiciona o telefone à string
        }
        return s; // Retorna a string com os dados do contato
    }
}
