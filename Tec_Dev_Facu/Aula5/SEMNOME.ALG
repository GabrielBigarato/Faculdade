Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/09/2023
Var
// Seção de Declarações das variáveis
contador, soma_impar, soma_par: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
soma_par = 0
soma_impar = 0
para contador := 1 até 10 faça
     se contador % 2 = 0 entao
        soma_par = soma_par + contador
     senao
          soma_impar = soma_impar + contador
     fimse
     fimse
     
escreval("soma_impar: ", soma_impar)
escreval("soma_par: ", soma_par)
fimpara

Fimalgoritmo