// ALUNOS:
// GABRIEL BIGARATO: 32831048
// NICOLAS MAZZONE: 32879750

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static double calcularMedia(int[] vetor) {
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return (double) soma / vetor.length;
    }


    public static int calcularModa(int[] vetor) {
        Map<Integer, Integer> contagem = new HashMap<>();

        for (int valor : vetor) {
            contagem.put(valor, contagem.getOrDefault(valor, 0) + 1);
        }

        int moda = 0;
        int maxFrequencia = 0;

        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            if (entry.getValue() > maxFrequencia) {
                moda = entry.getKey();
                maxFrequencia = entry.getValue();
            }
        }

        return moda;
    }


    public static double calcularMediana(int[] vetor) {
        Arrays.sort(vetor);

        if (vetor.length % 2 == 0) {
            int meio1 = vetor[vetor.length / 2 - 1];
            int meio2 = vetor[vetor.length / 2];
            return (double) (meio1 + meio2) / 2;
        } else {
            return vetor[vetor.length / 2];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();


        int[] vetor = new int[tamanho];
        System.out.println("Digite os elementos do vetor:");

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }


        double media = calcularMedia(vetor);
        int moda = calcularModa(vetor);
        double mediana = calcularMediana(vetor);

        System.out.println("Média: " + media);
        System.out.println("Moda: " + moda);
        System.out.println("Mediana: " + mediana);


        scanner.close();
    }
}
