import java.util.ArrayList;

// Classe Agenda que gerencia uma lista de contatos
public class Agenda {
    private ArrayList<ContatoBasico> contatos; // Lista de contatos

    // Construtor da classe Agenda
    Agenda() {
        contatos = new ArrayList(); // Inicializa a lista de contatos
    }

    // Método para inserir um contato na agenda
    public void inserir(ContatoBasico c) {
        contatos.add(c); // Adiciona o contato à lista
    }

    // Método para buscar um contato pelo nome
    public ContatoBasico buscar(String nome) {
        // Percorre a lista de contatos
        for (int i = 0; i < contatos.size(); i++) {
            ContatoBasico c = contatos.get(i); // Obtém o contato atual da lista
            // Verifica se o nome do contato é igual ao nome procurado
            if (c.getNome().equalsIgnoreCase(nome))
                return contatos.get(i); // Retorna o contato encontrado
        }
        return null; // Retorna nulo se o contato não for encontrado
    }

    // Método para buscar um contato pela posição na lista
    public ContatoBasico buscar(int pos) {
        // Verifica se a posição está dentro dos limites da lista
        if (pos >= 0 && pos < contatos.size()) {
            return contatos.get(pos); // Retorna o contato na posição especificada
        }
        return null; // Retorna nulo se a posição estiver fora dos limites da lista
    }

    // Método para buscar um contato pelo email
    public EContato buscarEmail(String email) {
        // Percorre a lista de contatos
        for (int i = 0; i < contatos.size(); i++) {
            // Verifica se o contato atual é do tipo EContato (contato com email)
            if (contatos.get(i) instanceof EContato) {
                EContato c = (EContato) contatos.get(i); // Converte o contato para EContato
                // Verifica se o email do contato é igual ao email procurado
                if (c.getEmail().equalsIgnoreCase(email))
                    return c; // Retorna o EContato encontrado
            }
        }
        return null; // Retorna nulo se nenhum EContato com o email procurado for encontrado
    }

    // Método para buscar contatos que contenham uma palavra-chave nos dados
    public ContatoBasico[] buscarGeral(String palavraChave) {
        ArrayList<ContatoBasico> todos = new ArrayList(); // Cria uma lista para armazenar os contatos encontrados
        // Percorre a lista de contatos
        for (int i = 0; i < contatos.size(); i++) {
            ContatoBasico c = contatos.get(i); // Obtém o contato atual da lista
            // Verifica se os dados do contato contêm a palavra-chave
            if (c.getDados().contains(palavraChave))
                todos.add(c); // Adiciona o contato à lista de contatos encontrados
        }
        ContatoBasico[] vet = new ContatoBasico[todos.size()]; // Cria um array para armazenar os contatos encontrados
        return todos.toArray(vet); // Converte a lista para um array e retorna
    }

    // Método para buscar todos os contatos na agenda
    public ContatoBasico[] buscarTodos() {
        ContatoBasico[] vet = new ContatoBasico[contatos.size()]; // Cria um array para armazenar todos os contatos
        return contatos.toArray(vet); // Converte a lista para um array e retorna
    }

    // Método para obter a quantidade total de contatos na agenda
    public int getQuantidade() {
        return contatos.size(); // Retorna o tamanho da lista de contatos
    }
}
