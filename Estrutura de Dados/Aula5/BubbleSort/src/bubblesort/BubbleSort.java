package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        //Mudar new int, para modificar o tanto de elementos
        //fazer com 100, 1000, 10000, 100000 elementos
        
        int[] vetor = new int[10];
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random()* vetor.length);
        }
        
        //variavel que registra o tempo de execucao no inicio
        long inicio = System.currentTimeMillis();
        
        //metodo de ordenacao BubbleSort
        int aux;
        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                } 
            }
        }
        
        //variavel para registrar o tmepo de execucao no final
        long fim = System.currentTimeMillis();
        
        //exibindo o tempo de execução
        System.out.println("Tempo de execução> " + (fim-inicio));
        
    }
    
}
