# contador = int(input("Digite um numero: "))
# while contador > 0:
#     print("Contador: ", contador)
#     contador -= 1
# ---------------------------------------------
# while True:
#   print("Estou preso em um loop")
# ---------------------------------------------
# maior = -9999999999999
# numero= int(input("Digite um numero ou -1 para parar:"))
# while numero != -1:
#     if numero > maior:
#         maior =  numero
#     numero= int(input("Digite um numero ou -1 para parar:"))
# print("Numero maior é :", maior)
# ---------------------------------------------
# pares = 0
# impares = 0
# numero = int(input("Digite um numero, ou digite 0 para parar: "))
# while numero != 0:
#     if numero % 2 == 0:
#         pares += 1
#     else:
#         impares += 1
#     numero = int(input("Digite um numero, ou digite 0 para parar: "))
# print("Pares:", pares, "Impares:", impares)
# ---------------------------------------------
# for i in range(1, 6):
#     print("Contando:", i)
# ---------------------------------------------
# for i in range(2, 20, 3):
#     print("Contando:", i)
# ---------------------------------------------
# import random
# segredo = random.randint(1, 10)
# print("Numero secreto gerado: ", segredo)
# ---------------------------------------------
# import random
# segredo = random.randint(1,10)
# tentativas = 3

# while tentativas > 0:
#     palpite = int(input("Adivinhe o numero: "))
#     if palpite == segredo:
#         print("Você acertou o numero secredo !!")
#         break
#     else:
#         print("Você ERROU, tente NOVAMENTE!")
#         tentativas -= 1
# else:
#     print("Você perdeu, o numero era: ", segredo)
# ---------------------------------------------
# import random
# segredo = random.randint(1,10)
# palpite = random.randint(1,10)
# tentativas = 3
# while True:
#     if tentativas > 0:
#         if palpite == segredo:
#             print("Você acertou o numero secredo !!")
#             break
#         else:
#             print("Você ERROU, tente NOVAMENTE!")
#             tentativas -= 1
#     else:
#         print("Você perdeu, o numero era: ", segredo)
#         break
# ---------------------------------------------
# while True:
#     nota = int(input("Digite a nota: "))
#     if nota < 0 or nota > 10:
#         print("Nota Invalida. Tente Novamente")
#     else: 
#         if nota < 5:
#             print("Você Reprovou !")
#             break
#         elif nota < 7:
#             print("Você está de Recuperação!")
#             break
#         else:
#             print("Você Passou!")
#             break
# ---------------------------------------------
# opcao = ""
# while opcao != "3":
#     print("\n### MENU ###")
#     print("1. Python")
#     print("2. Senai")
#     print("3. Sair")
#     opcao = input("Escolha a opção: ")
#     if opcao == "1":
#         print("\nO python é uma linguagem de programação")
#     elif opcao == "2":
#         print("\nO Senai é uma instuição de ensino, sem fins lucrativos")
#     elif opcao == "3":
#         print("Você saiu da aplicação")
#     else:
#         print("Opção Inválida. Tente Novamente!")
# ----------------------------------------------
# while True:
#     idade = int(input("Digite a sua Idade: "))
#     if idade < 0:
#         print("Idade Invalida, Tente Novamente")
#     else:
#         if idade < 18:
#             print("Você é menor de idade")
#             break
#         elif idade < 60:
#             print("Você é Adulto")
#             break
#         elif idade < 120:
#             print("Você é idoso")
#             break
#         else:
#             print("Você é um Fóssil")
#             break
# ----------------------------------------------