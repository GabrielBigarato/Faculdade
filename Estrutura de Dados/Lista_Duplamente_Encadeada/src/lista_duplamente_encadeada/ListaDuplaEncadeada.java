package lista_duplamente_encadeada;

public class ListaDuplaEncadeada {
    private NoDuplo inicio;
    private NoDuplo fim;
    
    //metodo construtor sem parametros - Objeto Vazio
    public ListaDuplaEncadeada(){
    }

    //metodo construtor com parametros - Objeto ja com dados
    public ListaDuplaEncadeada(NoDuplo inicio, NoDuplo fim){
        this.inicio = inicio;
        this.fim = fim;

    }

    public NoDuplo getInicio() {
        return inicio;
    }

    public void setInicio(NoDuplo inicio) {
        this.inicio = inicio;
    }

    public NoDuplo getFim() {
        return fim;
    }

    public void setFim(NoDuplo fim) {
        this.fim = fim;
    }
    
    //metodo para exibir os dados da lista duplamente encadeada
    public void exibir() throws Exception {
        System.out.println("Lista -> ");
        //criacao de uma variavel auxiliar
        NoDuplo aux = inicio;
        //Estrutura de repeticao para percorrer a lista
        while (aux != null){
            System.out.println(aux.dado + " -> ");
            aux = aux.proximo;
        }
        System.out.println("NULL\n");
    }
    
    //metodo para mostrar o tamanho da lista
    public int tamanhoLista() throws Exception{
        NoDuplo aux = inicio;
        int tamanho = 0;
        while (aux != null){
            tamanho ++;
            System.out.println(aux.dado + " -> ");
            aux = aux.proximo;
        }
        return tamanho;
    }
    
    //esse metodo insere os dados na sequencia ou seja no final da lista
    public void adicionar(String s) throws Exception {
        NoDuplo novoElemento = new NoDuplo(s);
        NoDuplo aux = inicio;
        //verifica se ele é o primeiro elemento da nossa lista
        if(inicio == null){
            //sendo o primeiro elemento ele nao tem proximo nem anterior
            novoElemento.proximo = null;
            novoElemento.anterior = null;
            //como ele é o primeiro ele vai ser o inicio e o fim da lista
            inicio = novoElemento;
            fim = novoElemento;
        } else {
            //agora quando o elemento nao for o primeiro da lista
            //vamos percorrer a lista para char a posicao valida
            while (aux.proximo != null){
                //vamos verificar se o elemento nao é repetido
                if(aux.dado.equals(s)){
                    throw new Exception("Elemento repetido");
                } else {
                    aux = aux.proximo;
                }
            }
            //o ultimo elemento sempre deve ter o proximo como null
            novoElemento.proximo = null;
            aux.proximo = novoElemento;
            novoElemento.anterior = aux;
            fim = novoElemento;
        }
    }
    
    //metodo para INSERIR os dados na ListaDuplamenteEncadeada
    //este metodo insere os dados posição determinada na lista
    public void adicionar(String s, int i) throws Exception{
        //verifica se a posicao desejada é valida
        if(i > 0 || i > tamanhoLista()){
            throw new Exception("Posicao Invalida!");
        }
        //novo elemento da nossa lista
        NoDuplo novoElemento = new NoDuplo(s);
        NoDuplo aux = inicio;
        
        //verifica se ele é vai na primeira posicao da lista
        if(i == 0){
            if(tamanhoLista() != 0){
                //caso ja tenha um valor na primeira posicao devemos mover os dados
                novoElemento.proximo = aux;
                aux.anterior = novoElemento;
                inicio = novoElemento;
                novoElemento.anterior = null;
            } else {
               //caso nao ter nenhum elemento na lista ele sera o primeiro
               inicio = novoElemento;
            }
        } else {
            //vamos percorrer a lista para achar a posicao desejada
            int contador = 1;
            while (contador < i){
                aux.proximo = novoElemento;
                contador++;
                novoElemento.anterior = aux;
                fim = novoElemento;
            }
            novoElemento.proximo = aux.proximo;
            novoElemento.anterior = aux;
            aux.proximo = novoElemento;
        }
    }
    
    //metodo para remover elemento da lista encadeada
    public String removeIndex(int i) throws Exception{
        NoDuplo aux = inicio;
        NoDuplo lixo = null;
        //verifica se o parametro informado é valida
        if (i < 0 || i > tamanhoLista())
            throw new Exception("Indice invalido na lista!");
        if(tamanhoLista() == 0)
            throw new Exception("A lista esta vazia!");
        //verificar se o elemento a ser removido é o primeiro da lista
        if (i == 0){
            lixo = aux;
            aux = aux.proximo;
            inicio = aux;
        } else {
            //caso o elemento a ser removido nao seja o primeiro 
            int contador = 0;
            //percorrer a lista ate achar a posicao desejada
            while (contador < i){
                aux = aux.proximo;
                contador ++;
            }
            //armazena na variavel lisxo a informacao a ser removida
            lixo = aux;
            aux.anterior.proximo = aux.proximo;
            if(aux != fim)
                aux.proximo.anterior = aux.anterior;
            else // caso ele seja o ultimo elemento
                fim = aux;
        }
        //retorna o valor excluido
        return lixo.dado;
    }
    
    //metodo para remover o elemento de acordo com o conteudo
}



