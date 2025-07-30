programa {
  funcao inicio() {

    inteiro vetor[5]
    inteiro posicao 
    inteiro i
    inteiro valorprocurado

    i = 0
    posicao = -1

    escreva("Digite o valor do vetor 0 : \n")
    leia(vetor[0])
    escreva("Digite o valor do vetor 1 : \n")
    leia(vetor[1])
    escreva("Digite o valor do vetor 2 : \n")
    leia(vetor[2])
    escreva("Digite o valor do vetor 3 : \n")
    leia(vetor[3])
    escreva("Digite o valor do vetor 4 : \n")
    leia(vetor[4])


    escreva("Digite o valor a ser procurado: \n")
    leia(valorprocurado)

    enquanto (i < 5) {
      se (vetor[i] == valorprocurado) {
        posicao = i
        pare
      }
      i = i + 1
    }

    se (posicao != -1) {
      escreva("O valor buscado, ", valorprocurado, " foi encontrado na posição: ", posicao)
    } senao {
      escreva("O valor buscado, ", valorprocurado, " não foi encontrado no vetor.")
    }

  }
}
