Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/08/2023
Var
// Seção de Declarações das variáveis 
altura, peso, imc: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("Digite sua altura:")
leia(altura)

escreval("Digite seu peso:")
leia(peso)

imc := peso/altura^2

escreva(imc)

se imc < 18.5 entao
   escreval("Abaixo do Peso")
senão se imc < 24.9 então
      escreval("Peso Ideal")
senão se imc < 29.9 então
      escreval("Levemente Acima do Peso")
senão se imc < 34.9 então
      escreval("Obesidade Grau 1")
senão se imc < 39.9 então
      escreval("Obesidade Grau 2(severa)")
senão
     escreval("Obesidade Grau 3(morbida)")

fimse

Fimalgoritmo