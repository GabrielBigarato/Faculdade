import java.util.GregorianCalendar;

// Classe principal que contém o método main
public class Main {
    // Método para mostrar os dados de um contato básico
    static void mostraDados(ContatoBasico obj) {
        System.out.println(obj.getDados()); // Mostra os dados do contato
        if (obj instanceof Contato) // Verifica se o objeto é uma instância de Contato
            System.out.println(((Contato) obj).getIdade()); // Mostra a idade se for um Contato
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx"); // Linha separadora
    }

    // Método principal
    public static void main(String[] args) {
        Agenda a; // Declaração de uma variável do tipo Agenda
        a = new Agenda(); // Inicialização da variável com um novo objeto Agenda

        // Criação de um Contato
        Contato cb;
        cb = new Contato("Teste", new GregorianCalendar(1980, 10, 28));
        cb.setTelefone(new Telefone("3333-5555", "Telefone residencial"));
        cb.setTelefone(new Telefone("99111-1111", "Telefone celular"));
        a.inserir(cb); // Insere o Contato na Agenda

        // Criação de um ContatoComercial
        ContatoComercial cc;
        cc = new ContatoComercial("Lanchonete", "Lanches", "Lan");
        cc.setTelefone(new Telefone("2222-0000", "Telefone residencial"));
        a.inserir(cc); // Insere o ContatoComercial na Agenda

        // Criação de um EContato
        a.inserir(new EContato("Exemplo", new GregorianCalendar(1975, 2, 22),
                "exemplo@gmail.com", "www.exemplo.com.br"));

        ContatoBasico obj = a.buscar("Teste"); // Pesquisa um contato pelo nome

        // Verifica se o contato foi encontrado
        if (obj != null)
            mostraDados(obj); // Mostra os dados do contato
        else
            System.out.println("Contato nao encontrado!"); // Mensagem de contato não encontrado
    }
}
