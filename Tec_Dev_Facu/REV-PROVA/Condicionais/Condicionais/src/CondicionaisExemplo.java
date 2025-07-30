// Declaração de uma classe chamada CondicionaisExemplo
public class CondicionaisExemplo {
    // Método principal, o ponto de entrada do programa Java
    public static void main(String[] args) {
        // Declaração e inicialização de uma variável inteira chamada 'numero'
        int numero = 10;

        // Verifica se 'numero' é maior que zero
        if (numero > 0) {
            // Se verdadeiro, imprime que o número é positivo
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            // Se a condição acima for falsa e 'numero' é menor que zero, imprime que é negativo
            System.out.println("O número é negativo.");
        } else {
            // Se nenhuma das condições acima for verdadeira, imprime que o número é zero
            System.out.println("O número é zero.");
        }
    }
}