package POO;

public class FaixaEtaria {
    private String descricao;

    public FaixaEtaria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAdulto() {
        return descricao.equalsIgnoreCase("adulto");
    }

    public boolean isCrianca() {
        return descricao.equalsIgnoreCase("crianca");
    }

    public boolean isIdosa() {
        return descricao.equalsIgnoreCase("idoso");
    }

    @Override
    public String toString() {
        return "FaixaEtaria{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}