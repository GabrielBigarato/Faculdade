programa {
  
  funcao inteiro buscaVetor(inteiro buscado, inteiro lista[]){
    inteiro resp = 0
    para(inteiro i = 0; i < 10; i++){
      se(buscado == lista[i]){
        resp = 1
      }
    }
    retorne resp
  }
  
  funcao inicio() {
    inteiro lista[10] = {1, 54, 568, 3, 4, 85, 2, 8, 7, 10}
    inteiro param
    escreva("Digite um numero para ser buscado: \n")
    leia(param)

    se(buscaVetor(param,lista) == 1){
      escreva("Elemento existe na lista")
    }senao{
      escreva("Elemento nao existe na lista")
    }
  }

}
