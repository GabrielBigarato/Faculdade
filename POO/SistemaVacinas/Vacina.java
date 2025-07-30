package POO;

public class Vacina {
    private String nome;
    private String tipo;
    private Fabricante fabricante;
    private int estoque;
    private int dosesRecomendadas;
    private String doencaAlvo;

    public Vacina(String nome, String tipo, Fabricante fabricante, int estoque, int dosesRecomendadas, String doencaAlvo) {
        this.nome = nome;
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.estoque = estoque;
        this.dosesRecomendadas = dosesRecomendadas;
        this.doencaAlvo = doencaAlvo;
    }

    // getters e setters

    @Override
    public String toString() {
        return "Vacina{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fabricante=" + fabricante +
                ", estoque=" + estoque +
                ", dosesRecomendadas=" + dosesRecomendadas +
                ", doencaAlvo='" + doencaAlvo + '\'' +
                '}';
    }

    public String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}