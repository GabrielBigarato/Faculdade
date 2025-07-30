// Classe que representa uma pilha de produtos
public class Pilha {
    private Produto[] produtos; // Array para armazenar os produtos
    private int topo; // Índice do topo da pilha

    // Método construtor que cria uma nova pilha com uma capacidade especificada
    public Pilha(int capacidade) {
        produtos = new Produto[capacidade]; // Inicializa o array com o tamanho especificado
        topo = -1; // Inicializa o topo como -1, indicando que a pilha está vazia
    }

    // Método para adicionar um produto à pilha
    public void push(Produto produto) {
        if (topo < produtos.length - 1) { // Verifica se a pilha não está cheia
            topo++; // Incrementa o topo
            produtos[topo] = produto; // Adiciona o produto ao topo da pilha
        } else {
            System.out.println("A pilha está cheia!"); // Exibe uma mensagem se a pilha estiver cheia
        }
    }

    // Método para remover e retornar o produto do topo da pilha
    public Produto pop() {
        if (topo >= 0) { // Verifica se a pilha não está vazia
            Produto produto = produtos[topo]; // Obtém o produto no topo da pilha
            produtos[topo] = null; // Remove o produto da pilha
            topo--; // Decrementa o topo
            return produto; // Retorna o produto removido
        } else {
            System.out.println("A pilha está vazia!"); // Exibe uma mensagem se a pilha estiver vazia
            return null;
        }
    }

    // Método para listar todos os produtos na pilha
    public void listar() {
        System.out.println("Produtos na pilha:"); // Exibe um título
        for (int i = topo; i >= 0; i--) { // Loop para percorrer a pilha do topo ao fundo
            System.out.println(produtos[i]); // Exibe cada produto na pilha
        }
    }

    // Método para ordenar os produtos por data de validade
    public void ordenarPorDataValidade() {
        // Implementação simples de ordenação por inserção
        for (int i = 1; i <= topo; i++) {
            Produto chave = produtos[i]; // Seleciona o produto atual como chave de ordenação
            int j = i - 1; // Define o índice do produto anterior na pilha
            // Move os produtos para frente enquanto sua data de validade for maior que a da chave
            while (j >= 0 && produtos[j].dataValidade.compareTo(chave.dataValidade) > 0) {
                produtos[j + 1] = produtos[j]; // Move o produto para frente na pilha
                j--; // Move para o produto anterior
            }
            produtos[j + 1] = chave; // Coloca a chave na posição correta na pilha ordenada
        }
    }

    // Método para vender produtos com base na data atual
    public void vender(String dataAtual) {
        while (topo >= 0 && produtos[topo].dataValidade.compareTo(dataAtual) <= 0) {
            Produto produtoVendido = pop(); // Remove o produto do topo da pilha
            System.out.println("Produto vendido: " + produtoVendido); // Exibe uma mensagem de venda
        }
    }
}
