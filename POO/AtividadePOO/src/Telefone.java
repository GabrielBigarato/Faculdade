// Classe que representa um telefone
public class Telefone {
    private String numero; // Número do telefone
    private String tipo; // Tipo de telefone

    // Construtor da classe Telefone
    public Telefone(String numero, String tipo) {
        this.numero = numero; // Inicializa o número do telefone
        this.tipo = tipo; // Inicializa o tipo de telefone
    }

    // Método para obter o número e o tipo de telefone formatados
    public String getTelefone() {
        return numero + " " + tipo;
    }
}