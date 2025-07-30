programa
{
  funcao inicio()
  {
    inteiro n_valores, i, valor, maior, menor

    escreva("Quantos valores voce deseja digitar? ")
    leia(n)

    escreva("Digite o valor 1: ")
    leia(valor)
    maior = valor
    menor = valor

    para (i = 2; i <= n_valores; i++)
    {
      escreva("Digite o valor ", i, ": ")
      leia(valor)

      se (valor > maior)
      {
        maior = valor
      }

      se (valor < menor)
      {
        menor = valor
      }
    }

    escreva("O maior valor digitado foi: ", maior, "\n")
    escreva("O menor valor digitado foi: ", menor, "\n")
  }
}
