programa
{
  funcao inicio()
  {
    inteiro opcao
    real raio, lado, altura, comprimento, resultado, largura

    escreva("Selecione a forma (1 - C�rculo/Esfera, 2 - Quadrado/Cubo, 3 - Ret�ngulo/Paralelep�pedo): ")
    leia(opcao)

    se (opcao == 1) {
      escreva("Informe o raio do c�rculo ou da esfera: ")
      leia(raio)

      resultado = 3.14 * raio * raio
      escreva("�rea do c�rculo/esfera: ", resultado, "\n")

      resultado = (4/3) * 3.14 * raio * raio * raio
      escreva("Volume da esfera: ", resultado, "\n")

    }
    senao se (opcao == 2) {
      escreva("Informe o lado do quadrado ou do cubo: ")
      leia(lado)

      resultado = lado * lado
      escreva("�rea do quadrado/cubo: ", resultado, "\n")

      resultado = lado * lado * lado
      escreva("Volume do cubo: ", resultado, "\n")
    }
    senao se (opcao == 3) {
      escreva("Informe o comprimento do ret�ngulo/paralelep�pedo: ")
      leia(comprimento)
      escreva("Informe a altura do ret�ngulo/paralelep�pedo: ")
      leia(altura)
      escreva("Informe a largura do paralelep�pedo: ")
      leia(largura)

      resultado = comprimento * altura
      escreva("�rea do ret�ngulo/paralelep�pedo: ", resultado, "\n")

      resultado = comprimento * altura * largura
      escreva("Volume do paralelep�pedo: ", resultado, "\n")
    }
    senao {
      escreva("Op��o inv�lida!\n")
    }
  }
}
