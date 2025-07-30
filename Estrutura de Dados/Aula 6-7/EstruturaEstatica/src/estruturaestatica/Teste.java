
package estruturaestatica;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Teste {
    
    public static void main(String[] args) {
        //Pilha<Integer> pilha = new Pilha<Integer>();
        
        //for (int i=1; i<=10; i++){
        //    pilha.empilha(i);
        //}
        
        //System.out.println("Tamanho da Pilha: " + pilha.tamanho());
        
        //System.out.println(pilha);

        //System.out.println(pilha.estaVazia());
        
        // pilha.empilha(1);
        
        //System.out.println(pilha);
        
        //System.out.println(pilha.estaVazia());
    
        //System.out.println(pilha.topo());
        
        //System.out.println(pilha);
        
        //pilha.empilha(1);
        //pilha.empilha(2);
        //pilha.empilha(3);
        
        //System.out.println(pilha.topo());
        
        //System.out.println(pilha);
        
        //System.out.println("Desempilhar elemento " + pilha.desempilha());
        
        //System.out.println(pilha);
        
        //------------------------------------------------------------------
        //Agora vamos usar a API JAVA STACK
        //------------------------------------------------------------------

        //Stack<Integer> stack = new Stack<Integer>();

        //metodo para verificar se a pilha está vazia
        //System.out.println(stack.isEmpty());
        
        //metodo para empilhar
        //stack.push(1);
        //stack.push(2);
        //stack.push(3);
        
        //metodo para verificar o tamanho da pilha
        //System.out.println(stack.size());
        
        //metodo ToString para exibir a pilha
        //System.out.println(stack);
        
        //metodo para verificar o topo
        //System.out.println(stack.peek());
        
        //metodo para desempilhar
        //System.out.println(stack.pop());
        
        //metodo ToString para exibir a pilha
        //System.out.println(stack);
        
        //------------------------------------------------------------------
        //agora vamos testar a FILA
        //------------------------------------------------------------------

        //Fila<Integer> fila = new Fila<Integer>();
        
        //fila.enfileira(1);
        //fila.enfileira(2);
        //fila.enfileira(3);
        
        //vamos verificar se a fila esta vazia, nesse caso sera false
        //System.out.println("A fila esta vazia ? " + fila.estaVazia());
        
        //vamos verificar o tamanho da minha fila apos enfileirar
        //System.out.println("Qual o tamanho da fila: " + fila.tamanho());
        
        //vamos visualizar os elementos dentro da fila
        //System.out.println(fila.toString());

        //vamos espiar a fila
        //System.out.println(fila.espiar());

        //poderiamos criar uma estrutura de decisao com o retorno do metodo
        //if (fila.espiar() == null){
        //    System.out.println("Ninguem na fila");
        //} else {
        //    System.out.println("O elemento da primeira posicao e " + fila.espiar());
        //}

        //visualizar fila
        //System.out.println(fila.toString());

        //desenfileirar um elemento
        //System.out.println(fila.desenfileira());

        //visualizar a fila novamente apos remover um elemento
        //System.out.println(fila.toString()); 

        //------------------------------------------------------------------
        //VAMOS TESTAR AGORA A API JAVA QUEUE
        //------------------------------------------------------------------

        Queue<Integer> fila = new LinkedList<Integer>();
        
        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila.toString()); // Exibe

        System.out.println(fila.peek());
        //Recupera, mas nao remove, o cabecalho deste fila ou retorna nulo
        //se a file estiver vazia ou seja nosso metodo espiar

        System.out.println(fila.remove());
        //remove elemento da fila ou desinfileira, por conta da classe Queue
        // FIFO - Firs in First Out (Primeiro a entrar, primeiro a sair).





    }
        
}
