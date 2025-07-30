// Declaração de uma classe chamada FuncoesExemplo
public class FuncoesExemplo {
    // Método principal, o ponto de entrada do programa Java
    public static void main(String[] args) {
        // Chamada de procedimento para exibir uma mensagem
        exibirMensagem("Olá, mundo!");

        // Chamada de função para somar dois números
        int soma = somar(3, 4);
        
        // Imprime o resultado da soma
        System.out.println("A soma é: " + soma);
    }

    // Procedimento: não retorna valor, apenas exibe uma mensagem
    public static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    // Função: retorna a soma de dois números inteiros
    public static int somar(int a, int b) {
        // Retorna a soma dos dois números
        return a + b;
    }
}