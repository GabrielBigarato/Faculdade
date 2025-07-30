# NOME: Gabriel Bigarato
# RGM:32831048
# NOME: Kayo Rodrigues Gomes de Freitas
# RGM:33013128

n = 0
nP = 0
nI = 0
qntd = 0
qntdI = 0
while qntdI < 3:
    qntd += 1
    n = float(input("Digite um numero:"))
    if n%2 == 0:
        nP += n

    elif n%2 == 1:
        nI += n
        qntdI += 1
print(f"A soma dos numeros Pares é {nP}")
print(f"A soma dos numeros Impares é {nI}")
print(f"A soma de todos é {nP + nI}")
print(f"A quantidade de numeros inseridos é {qntd}")