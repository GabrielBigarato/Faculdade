package BubbleSort;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
       
        int[] vetor = new int [15];
        
        Scanner numero = new Scanner (System.in);
        
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = numero.nextInt();
            // exibindo os valores do vetor
            System.out.println(vetor[i]);
        }
        
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i] + " ");
        }
        //variavel que registra o tempo de execução no inicio
        long inicio = System.currentTimeMillis();
        
        //metodo de ordenação bubblesort
        int aux;
        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j <vetor.length; j++){
                if (vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }   
        //RESULTADO
        System.out.println("Nosso vetor ordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
