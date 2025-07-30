# NOME: Gabriel Bigarato
# RGM:32831048
# NOME: Kayo Rodrigues Gomes de Freitas
# RGM:33013128

matriz = 54000
contador = 0
filial = 0

while contador < 5:
    contador += 1
    n = float(input("Digite o valor da sua compra:"))
    filial += n

if filial > matriz:
    sub= filial - matriz
    conta = (sub/matriz)*100
    print("A filial ultrapassou %.2f Porcento"%conta)
else:
    print("A filial não ultrapassou a Matriz")


