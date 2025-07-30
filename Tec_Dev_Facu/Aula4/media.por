programa {
  funcao inicio() {
    real n1, n2, m, n, perc
    escreva("Digite a nota 1: ")
    leia(n1)
    escreva("Digite a nota 2: ")
    leia(n2)

    m = (n1+n2)/2

    se (m > 10){
      escreva("Suas notas não são válidas") 
    }
    senao{
      se (m >= 6){
      escreva("Voce Passou!!\n")
        se (m >= 8){
          escreva("Voce passou com folga \n")
        }
        senao{
          escreva("Voce passou raspando \n")
          n = m - 6
          escreva("Voce passou com ", n ," pontos de diferença \n")
          perc = (m*100)/8
          escreva("Faltou ", perc , "% para voce passar com folga")
        }
      }
      senao{
        escreva("Voce Reprovou!!\n")
        perc = 100-(m/6)*100
        escreva("Faltou ", perc , "% para voce passar")

      }
    }
    
    

  }
}
