from random import *

num = randint(0, 100)

controle = 0

tentativas = 0

while controle == 0:
    tentativas += 1

    palpite = int(input("Digite seu palpite:"))

    if num == palpite:
        print(f"Parabens voce acertou em {tentativas} tentativas.")
        controle = 1

    elif num > palpite:
        print(f"O numero sorteado é maior que {palpite}")

    else:
        print(f"O numero sorteado é menor que {palpite}")