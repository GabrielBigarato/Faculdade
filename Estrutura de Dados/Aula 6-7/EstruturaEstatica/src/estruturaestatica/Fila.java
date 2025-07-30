
package estruturaestatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(){
        super();
    }
    
    public Fila(int capacidade){
        super(capacidade);
    }
    
    public void enfileira(T elemento){
        //this.aumentaCapacidade();
        //this.elementos[this.tamanho] = elemento;
        //this.tamanho++;
         
        //Vamos aproveitar o codigo que ja existe
        this.adiciona(elemento);
    }

    public T desenfileira(){
        if (this.estaVazia()){
            return null;
        }
        //ja temos um metodo para remover na classe pai porem precisa indicar 
        //a posicao e para isso vamos criar uma constante
        final int POS = 0;

        T elementoASerRemovido = this.elementos[POS];
        this.remove(POS);
        return elementoASerRemovido;
    }
}
