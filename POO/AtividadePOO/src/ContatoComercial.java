// Classe que representa um contato comercial
public class ContatoComercial extends ContatoBasico {
    protected String atividade; // Atividade do contato comercial
    protected String funcionario; // Nome do funcionário de contato

    // Construtor da classe ContatoComercial
    public ContatoComercial(String nome, String atividade, String funcionario) {
        super(nome); // Chama o construtor da classe pai
        this.atividade = atividade; // Inicializa a atividade
        this.funcionario = funcionario; // Inicializa o nome do funcionário
    }

    // Sobrescreve o método para obter os dados do contato comercial
    @Override
    public String getDados() {
        String s = super.getDados(); // Obtém os dados do contato básico
        s += atividade + "\n" + "Contato Sr(a): " + funcionario; // Adiciona a atividade e o nome do funcionário
        return s; // Retorna os dados do contato comercial
    }
}
