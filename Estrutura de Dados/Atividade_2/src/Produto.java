// Classe que representa um produto
public class Produto {
    String nome; // Nome do produto
    String dataValidade; // Data de validade do produto

    // Método construtor que cria um novo produto com um nome e uma data de validade
    public Produto(String nome, String dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    // Método que retorna uma representação textual do produto
    public String toString() {
        return "Nome: " + nome + ", Data de Validade: " + dataValidade;
    }
}
