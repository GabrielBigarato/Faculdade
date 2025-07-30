programa
{
  funcao inicio()
  {
    inteiro opcao
    real raio, lado, altura, comprimento, resultado, largura

    escreva("Selecione a forma (1 - Círculo/Esfera, 2 - Quadrado/Cubo, 3 - Retângulo/Paralelepípedo): ")
    leia(opcao)

    se (opcao == 1) {
      escreva("Informe o raio do círculo ou da esfera: ")
      leia(raio)

      resultado = 3.14 * raio * raio
      escreva("Área do círculo/esfera: ", resultado, "\n")

      resultado = (4/3) * 3.14 * raio * raio * raio
      escreva("Volume da esfera: ", resultado, "\n")

    }
    senao se (opcao == 2) {
      escreva("Informe o lado do quadrado ou do cubo: ")
      leia(lado)

      resultado = lado * lado
      escreva("Área do quadrado/cubo: ", resultado, "\n")

      resultado = lado * lado * lado
      escreva("Volume do cubo: ", resultado, "\n")
    }
    senao se (opcao == 3) {
      escreva("Informe o comprimento do retângulo/paralelepípedo: ")
      leia(comprimento)
      escreva("Informe a altura do retângulo/paralelepípedo: ")
      leia(altura)
      escreva("Informe a largura do paralelepípedo: ")
      leia(largura)

      resultado = comprimento * altura
      escreva("Área do retângulo/paralelepípedo: ", resultado, "\n")

      resultado = comprimento * altura * largura
      escreva("Volume do paralelepípedo: ", resultado, "\n")
    }
    senao {
      escreva("Opção inválida!\n")
    }
  }
}
