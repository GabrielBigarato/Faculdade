package insertionsort;

public class InsertionSort {
    public static void main(String[] args) {
        //criando um vetor de numero inteiros de 10 posicoes
        int[] vetor = new int[10];
        
        //inserindo valores no vetor
        for(int i = 0; i< vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            // exibindo os valores do vetor 
            System.out.println(vetor[i]);
        }
        
        int aux, j;
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i - 1;
            while(j >= 0 && vetor[j] > aux){
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
        
        //Exibindo o nosso vetor ordenado
        System.out.println("Nosso vetor ordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
    
}
