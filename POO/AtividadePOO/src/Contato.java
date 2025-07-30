import java.util.Calendar;
import java.util.GregorianCalendar;

// Classe que representa um contato básico
public class Contato extends ContatoBasico {
    protected Calendar dtnasc; // Data de nascimento do contato

    // Construtor da classe Contato
    public Contato(String nome, Calendar dtnasc) {
        super(nome); // Chama o construtor da classe pai
        this.dtnasc = dtnasc; // Inicializa a data de nascimento do contato
    }

    // Sobrescreve o método para obter os dados do contato
    @Override
    public String getDados() {
        // Retorna os dados do contato incluindo a data de nascimento e a idade
        return super.getDados() + "Nascido em " +
                dtnasc.get(Calendar.DATE) + "/" +
                dtnasc.get(Calendar.MONTH) + "/" +
                dtnasc.get(Calendar.YEAR) + "\nIdade: ";
    }

    // Método para calcular e obter a idade do contato
    public int getIdade() {
        Calendar hoje = new GregorianCalendar(); // Obtém a data atual
        int idade = hoje.get(Calendar.YEAR) - dtnasc.get(Calendar.YEAR); // Calcula a idade
        hoje.set(Calendar.YEAR, dtnasc.get(Calendar.YEAR)); // Configura o ano de hoje para o ano de nascimento do contato
        if (hoje.before(dtnasc))
            idade--; // Reduz a idade se a data de hoje for antes da data de nascimento
        return idade; // Retorna a idade do contato
    }
}
