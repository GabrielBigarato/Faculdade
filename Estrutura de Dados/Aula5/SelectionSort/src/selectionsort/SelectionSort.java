package selectionsort;

public class SelectionSort {
    public static void main(String[] args) {
        
        //criando um vetor de numeros 
        int[] vetor = new int[10];
        
        //inserindo valores no vetor
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random()*vetor.length);
            //exibindo os valores do vetor
            System.out.println(vetor[i]);
        }
        
        //metodo de ordenacao SelectionSort
        int menor_posicao, aux;
        for(int i = 0; i < vetor.length; i++){
            menor_posicao = i;
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[j] < vetor[menor_posicao]){
                    menor_posicao = j;
                }
            }
            aux = vetor[menor_posicao];
            vetor[menor_posicao] = vetor[i];
            vetor[i] = aux;   
        }
        
        //Exibindo o nosso vetor ordenado
        System.out.println("Nosso vetor Ordenado");
        for(int i = 0; i <vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
    
}
