package POO;

public class Pessoa {
    private String nome;
    private FaixaEtaria faixaEtaria;

    public Pessoa(String nome, FaixaEtaria faixaEtaria) {
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
    }

    // getters e setters

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", faixaEtaria=" + faixaEtaria +
                '}';
    }
}
