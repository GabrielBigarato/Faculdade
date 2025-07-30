programa {
  funcao inicio() {
    caracter esc 
    escreva("Decrescente ou Crescente")
    leia(esc)

    real n1, n2, n3
    escreva("Digite numero 1: ")
    leia(n1)
    escreva("Digite numero 2: ")
    leia(n2)
    escreva("Digite numero 3: ")
    leia(n3)

  se (esc == "Decrescente"){
    se (n1 < n2 e n1 < n3){
    escreva(n1)
    }
    senao{
      se (n2 < n1 e n2 < n3){
        escreva(n2)
      }
      senao{
        se (n3 < n2 e n3 < n1){
          escreva(n3)
        }
      }
    }

    se (n1 > n2 e n1 < n3){
    escreva(n1,",")
    }
    senao{
      se (n1 < n2 e n1 > n3){
        escreva(n1,",")
      }
      senao{
        se (n2 > n1 e n2 < n3){
          escreva(n2,",")
        }
        senao{
          se (n2 < n1 e n2 > n3){
            escreva(n2,",")
          }
          senao{
            se (n3 > n1 e n3 < n2){
              escreva(n3,",")
            }
            senao{
              se (n3 < n1 e n3 > n2){
                escreva(n3,",")
              }
            }
          }
        }
      }  
    }

    se (n1 > n2 e n1 > n3){
    escreva(n1,",")
    }
    senao{
      se (n2 > n1 e n2 > n3){
        escreva(n2,",")
      }
      senao{
        se (n3 > n2 e n3 > n1){
          escreva(n3,",")
        }
      }
    }
  }

  
  senao{
    se (esc == "Crescente"){
      se (n1 > n2 e n1 > n3){
        escreva(n1,",")
      }
      senao{
        se (n2 > n1 e n2 > n3){
          escreva(n2,",")
        }
        senao{
          se (n3 > n2 e n3 > n1){
            escreva(n3,",")
          }
        }
      }
      
      se (n1 > n2 e n1 < n3){
        escreva(n1,",")
      }
      senao{
        se (n1 < n2 e n1 > n3){
          escreva(n1,",")
        }
        senao{
          se (n2 > n1 e n2 < n3){
            escreva(n2,",")
          }
          senao{
            se (n2 < n1 e n2 > n3){
              escreva(n2,",")
            }
            senao{
              se (n3 > n1 e n3 < n2){
                escreva(n3,",")
              }
              senao{
                se (n3 < n1 e n3 > n2){
                  escreva(n3,",")
                }
              }
            }
          }
        }  
  }


  
    }
  }
  
  
  }
}
