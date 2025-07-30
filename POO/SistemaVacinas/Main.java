package POO;

import java.util.ArrayList;
import java.util.List;

class Vacina {
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

    public Object getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

    public Object getEstoque() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEstoque'");
    }

    // Getters e Setters
}

class Fabricante {
    private String nome;
    private String endereco;
    private String contato;

    public Fabricante(String nome, String endereco, String contato) {
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
    }

    // Getters e Setters
}

class Fornecedor {
    private String nome;
    private String contato;

    public Fornecedor(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

    // Getters e Setters
}

class Pessoa {
    private String nome;
    private FaixaEtaria faixaEtaria;

    public Pessoa(String nome, FaixaEtaria faixaEtaria) {
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
    }

    public FaixaEtaria getFaixaEtaria() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFaixaEtaria'");
    }

    // Getters e Setters
}

class FaixaEtaria {
    private String descricao;

    public FaixaEtaria(String descricao) {
        this.descricao = descricao;
    }

    // Getters e Setters
}

class SistemaVacinas {
    private List<Vacina> vacinas;

    public SistemaVacinas() {
        this.vacinas = new ArrayList<>();
    }

    public void adicionarVacina(Vacina vacina) {
        vacinas.add(vacina);
    }

    public void removerVacina(String nomeVacina) {
        vacinas.removeIf(v -> v.getNome().equals(nomeVacina));
    }

    public List<Vacina> listarVacinas() {
        return vacinas;
    }

    public List<Vacina> obterVacinasRecomendadasPorFaixaEtaria(Pessoa pessoa) {
        List<Vacina> vacinasRecomendadas = new ArrayList<>();
        // Lógica para obter vacinas recomendadas com base na faixa etária da pessoa
        return vacinasRecomendadas;
    }
}

public class Main {
    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante("Fabricante1", "Endereco1", "Contato1");
        Fabricante fabricante2 = new Fabricante("Fabricante2", "Endereco2", "Contato2");
        Fornecedor fornecedor1 = new Fornecedor("Fornecedor1", "Contato1");
        Fornecedor fornecedor2 = new Fornecedor("Fornecedor2", "Contato2");
        FaixaEtaria faixaEtaria = new FaixaEtaria("Adulto");

        Vacina vacina1 = new Vacina("Vacina1", "Tipo1", fabricante1, 100, 2, "Doenca1");
        Vacina vacina2 = new Vacina("Vacina2", "Tipo2", fabricante2, 50, 1, "Doenca2");
        Vacina vacina3 = new Vacina("Vacina3", "Tipo3", fabricante1, 80, 2, "Doenca3");
        Vacina vacina4 = new Vacina("Vacina4", "Tipo4", fabricante2, 120, 1, "Doenca4");
        Vacina vacina5 = new Vacina("Vacina5", "Tipo5", fabricante1, 70, 2, "Doenca5");

        SistemaVacinas sistemaVacinas = new SistemaVacinas();
        sistemaVacinas.adicionarVacina(vacina1);
        sistemaVacinas.adicionarVacina(vacina2);
        sistemaVacinas.adicionarVacina(vacina3);
        sistemaVacinas.adicionarVacina(vacina4);
        sistemaVacinas.adicionarVacina(vacina5);

        // Exemplo de utilização do sistema de vacinas
        List<Vacina> vacinas = sistemaVacinas.listarVacinas();
        for (Vacina vacina : vacinas) {
            System.out.println(vacina.getNome() + " - Estoque: " + vacina.getEstoque());
        }
    }
}
