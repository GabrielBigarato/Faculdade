programa {
  funcao inicio() {
    real n1, n2, b_n1
    inteiro cont_n1

    cont_n1 = 0
    escreva("VAlor que vai buscar: \n")
    leia(n1)

    escreva("Vezes que vai buscar: \n")
    leia(n2)

    para(inteiro cont = 1; cont <= n2; cont += 1){
      escreva("TENTATIVA ", cont ," DE ", n2 ,"\n")
      escreva("Digite um numero: \n")
      leia(b_n1)

      se(b_n1 == n1){
        cont_n1 += 1
      }
    }

    escreva("Acertou ", cont_n1, " vezes")
  }
}
