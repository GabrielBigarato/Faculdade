# print("Exercicio 1")
#
# n1 =float(input("Digite a primeira nota:"))
# n2 =float(input("Digite a segunda nota:"))
#
# media = (n1 + n2)/ 2
# if media >= 6:
#     print("Aprovado")
# else:
#     print("Reprovado")

print("Exercicio 2")

import math

n1 = int(input("Digite 1 número:"))

if n1 < 0:
    print("Seu número é NEGATIVO, tente outro.")

else:
    print(math.sqrt(n1))

