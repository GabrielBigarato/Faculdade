programa {
  funcao inicio() {
    inteiro n1, n2
    escreva("Digite a jogada do jogador N1 (1 - Pedra, 2 - Papel, 3 - Tesoura): \n")
    leia(n1)
    escreva("Digite a jogada do jogador N2 (1 - Pedra, 2 - Papel, 3 - Tesoura): \n")
    leia(n2)

    se (n1 == 1 e n2 == 3){
      escreva("N1 ganhou")
    }
    senao se(n1 == 2 e n2 == 1){
      escreva("N1 ganhou")
    }
    senao se(n1 == 3 e n2 == 1){
      escreva("N1 ganhou")
    }
    senao se (n2 == 1 e n1 == 3){
      escreva("N2 ganhou")
    }
    senao se(n2 == 2 e n1 == 1){
      escreva("N2 ganhou")
    }
    senao se(n2 == 3 e n1 == 1){
      escreva("N2 ganhou")
    }
    
  }
}
