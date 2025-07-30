package POO;

import java.util.ArrayList;
import java.util.List;

public class SistemaVacinas {
    private List<Vacina> vacinas;

    public SistemaVacinas() {
        this.vacinas = new ArrayList<>();
    }

    public void adicionarVacina(Vacina vacina) {
        vacinas.add(vacina);
    }

    public void removerVacina(String nomeVacina) {
        vacinas.removeIf(v -> v.getNome().equalsIgnoreCase(nomeVacina));
    }

    public List<Vacina> listarVacinas() {
        return vacinas;
    }

    public List<Vacina> obterVacinasRecomendadasPorFaixaEtaria(Pessoa pessoa) {
        List<Vacina> recomendadas = new ArrayList<>();
        FaixaEtaria faixaEtaria = pessoa.getFaixaEtaria();
        for (Vacina vacina : vacinas) {
            // Lógica de recomendação de vacinas para cada faixa etária
            // Aqui seria implementada a lógica específica para recomendar vacinas baseadas na faixa etária da pessoa
        }
        return recomendadas;
    }
}