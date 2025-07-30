// Declaração de uma classe chamada RecursaoExemplo
public class RecursaoExemplo {
    // Método principal, o ponto de entrada do programa Java
    public static void main(String[] args) {
        // Inicializa uma variável chamada 'numero' com o valor 5
        int numero = 5;

        // Chama a função calcularFatorial passando 'numero' como argumento
        // e armazena o resultado na variável 'resultado'
        int resultado = calcularFatorial(numero);

        // Imprime o resultado do fatorial
        System.out.println("Fatorial de " + numero + " é " + resultado);
    }

    // Função recursiva para calcular o fatorial de um número 'n'
    public static int calcularFatorial(int n) {
        // Verifica se 'n' é 0 ou 1, caso em que o fatorial é 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Chamada recursiva para calcular o fatorial
            // Multiplica 'n' pelo fatorial de 'n - 1'
            return n * calcularFatorial(n - 1);
        }
    }
}