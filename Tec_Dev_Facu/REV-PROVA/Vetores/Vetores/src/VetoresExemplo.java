// Declaração de uma classe chamada VetoresExemplo
public class VetoresExemplo {
    // Método principal, o ponto de entrada do programa Java
    public static void main(String[] args) {
        // Declaração e inicialização de um vetor de inteiros
        int[] numeros = {1, 2, 3, 4, 5};

        // Iteração sobre o vetor usando um loop for
        // 'i' representa o índice do vetor
        for (int i = 0; i < numeros.length; i++) {
            // Imprime o índice e o valor do elemento atual do vetor
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }
    }
}