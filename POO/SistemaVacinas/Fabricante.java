package POO;

public class Fabricante {
    private String nome;
    private String endereco;
    private String contato;

    public Fabricante(String nome, String endereco, String contato) {
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
    }

    // getters e setters

    @Override
    public String toString() {
        return "Fabricante{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }
}