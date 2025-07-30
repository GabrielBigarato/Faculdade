import java.util.Scanner;#

// Classe principal do programa
public class Main {
    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um scanner para ler entradas do teclado
        Pilha pilha = new Pilha(5); // Cria uma nova pilha com capacidade para 5 produtos

        // Adiciona alguns produtos à pilha
        pilha.push(new Produto("Leite", "2024-04-20"));
        pilha.push(new Produto("Ovos", "2024-04-18"));
        pilha.push(new Produto("Pão", "2024-04-15"));
        pilha.push(new Produto("Queijo", "2024-04-25"));

        // Ordena os produtos por data de validade
        pilha.ordenarPorDataValidade();
        pilha.listar(); // Lista os produtos ordenados

        // Solicita a data atual ao usuário
        System.out.print("Digite a data atual (AAAA-MM-DD): ");
        String dataAtual = scanner.next();

        // Simula uma venda de produtos vencidos com base na data atual
        pilha.vender(dataAtual);
    }
}
