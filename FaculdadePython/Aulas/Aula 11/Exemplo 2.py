# palavra = input("Digite uma palavra:")
#
# for letra in palavra:
#     print(letra)

print("-------------------------------------------------------------------------------------------------------------------")

palavra1 = input("Digite uma palavra:")
reverso=""

for letra in palavra1:
    reverso = letra + reverso

print(reverso)

print("-------------------------------------------------------------------------------------------------------------------")

palavra1 = input("Digite uma palavra:")

for letra in palavra1[::-1]:
    print(letra)

print("-------------------------------------------------------------------------------------------------------------------")

