# ----------------------------------------------
# Exercicio 1
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
# Exercicio 2
# tentativas = 3
# senha_correta = "12345"
# usuario_correto = "gabriel"

# while tentativas > 0:
#     usuario = input("Digite seu usuário: ")
#     senha = input("Digite sua senha: ")
#     if tentativas == 3:
#         if usuario_correto != usuario or senha_correta != senha:
#             print("Alguma informação está errada, tente novamente.(Tentativa 1)")
#             tentativas -= 1
#         else:
#             print("Acesso permitido.")
#             break
#     elif tentativas == 2:
#         if usuario_correto != usuario or senha_correta != senha:
#             print("Alguma informação está errada, tente novamente.(Tentativa 2)")
#             tentativas -= 1
#         else:
#             print("Acesso permitido.")
#             break
#     elif tentativas == 1:   
#         if usuario_correto != usuario or senha_correta != senha:
#             print("Alguma informação está errada.(Tentativa 3)")
#             tentativas -= 1
#         else:
#             print("Acesso permitido.")
#             break
# else:
#     print("Acesso Negado")
# ----------------------------------------------
# Exercicio 3
# for i in range (5):
#     n = int(input(f"Digite o {i+1} numero:"))
#     if n > 0:
#        print("Este numero é Positivo")
#     elif n < 0:
#         print("Este numero é Negativo")
#     else:
#         print("Este numero é Zero")
# else:
#     print("Verificação concluida.")
# ----------------------------------------------
# Exercicio 4
# import random
# tentativas = 3
# numero = random.randint(1, 10)

# while tentativas > 0:
#     escolha = int(input(f"Digite um numero de 1 a 10.(Tentativas: {tentativas}):"))
#     if escolha == numero:
#         print("Você acertou o numero")
#         break
#     else:
#         print("Você errou o numero")
#         tentativas -= 1
# else:
#     print("Acabou as tentativas")
#     print("O numero era:", numero)
# ----------------------------------------------
# Exercicio 5
# for i in range (3):
#     nota = int(input(f"Digite sua {i+1} nota:"))
#     if nota < 0 or nota > 10:
#         nota = int(input(f"Essa nota é inválida digite novamente a nota {i+1}:"))
#         if nota < 5:
#             print("Reprovado")
#         elif nota < 7:
#             print("Recuperação")
#         else:
#             print("Você Passou !!")
#     else:
#         if nota < 5:
#             print("Reprovado")
#         elif nota < 7:
#             print("Recuperação")
#         else:
#             print("Você Passou !!")
# else:
#     print("Programa encerrado.")
# ----------------------------------------------
# Exercicio 6
# while True:

#     print("\n### MENU ###")
#     print("0. Sair")
#     print("1. Verificar se os numeros são Multiplos um do outro.")
#     opcao = int(input("\nEscolha a opção: "))
#     if opcao == 0:
#         print("Programa Encerrado")
#         break
#     elif opcao == 1:
#         n1 = int(input("\nDigite o Numero 1:"))
#         n2 = int(input("Digite o Numero 2:"))
#         if n1 % n2 == 0:
#             print("\nOs numeros são multiplos um do outro.")
#         else:
#             print("\nOs numeros não são multiplos um do outro.")
#         continue
#     else:
#         print("\nOpção inválida")
#         continue
# ----------------------------------------------
# Exercicio 7
# numero = int(input("Digite um numero: "))
# for num in range ( 0, numero + 1):
#     if num % 2 == 0:
#         print(num)
# else:
#     print("Todos os pares foram listados.")
# ----------------------------------------------
# Exercicio 8
# nome = input("Me diga seu nome: ")
# while True:
    
#     print("\n### MENU ###")
#     print("1. Dizer Olá")
#     print("2. Mostrar uma Curiosidade")    
#     print("3. Sair.")    
    
#     opcao = int(input("\nEscolha uma opção:"))
#     if opcao == 1:
#         print("\nOlá", nome)
        
#     elif opcao == 2:
#         print("\nAs Aves VOAM")
        
#     elif opcao == 3:
#         print("Programa Encerrado")
#         break
#     else:
#         print("\nOpção inválida.")
# ----------------------------------------------
# Exercicio 9
# cofre = 0.0
# escolha = "S"

# while escolha == "S":
#     valor = float(input("Digite o valor que deseja depositar: "))
#     if valor < 0:
#         print("Este valor é negativo e não é permitido.")
#     else:
#         cofre += valor
    
#     escolha = input("Deseja fazer outro deposito (S/N)? ").strip().upper()
#     while escolha != "S" and escolha != "N":
#         print("Opção invalida. Digite penas S ou N.")
#         escolha = input("Deseja fazer outro deposito (S/N)? ").strip().upper()
# else:
#     print(f"O valor no Cofrinho é de R${cofre: .2f}")
# ----------------------------------------------
# Exercicio 10
# cofre = 100.0
# escolha = "S"

# while escolha == "S":
#     valor = float(input("Digite o valor que deseja sacar: "))
#     if valor < 0:
#         print("Este valor é negativo e não é permitido.")
#     elif valor > cofre:
#         print(f"Este valor é maior que seu saldo. Seu saldo atual é de: R$ {cofre: .2f}")
#         break
#     else:
#         cofre -= valor
#         print(f"Você sacou R$ {valor}")
#         print(f"Seu saldo atual é de: R$ {cofre: .2f}")
#         if cofre == 0.0:
#             print("Deposite antes de poder fazer outro saque.")
#             break

#     escolha = input("Deseja fazer outro Saque(S/N) ? ").strip().upper()
#     while escolha != "S" and escolha != "N":
#         print("Opção invalida. Digite apenas S ou N.")
#         escolha = input("Deseja fazer outro Saque(S/N) ? ").strip().upper()
# else:
#     print(f"O valor no Cofre é de R${cofre: .2f}")
# ----------------------------------------------
# Desafio Final
cofre = 0.0

while True:
    print("\n### MENU ###")
    print("1. Depositar")
    print("2. Sacar")    
    print("3. Consultar saldo")
    print("4. Sair.")  
    
    opcao = int(input("\nEscolha uma opção:"))
    if opcao == 1:
        deposito = float(input("Digite o valor que deseja depositar: "))
        if deposito < 0:
            print("Este valor é negativo e não é permitido.")
        else:
            cofre += deposito
            print(f"\nVocê depositou R$ {deposito}")
            print(f"\nSeu saldo atual é de: R$ {cofre: .2f}")

    elif opcao == 2:
        saque = float(input("\nDigite o valor que deseja sacar: "))
        if saque < 0:
            print("\nEste valor é negativo e não é permitido.")
        elif saque > cofre:
            print(f"\nEste valor é maior que seu saldo. Seu saldo atual é de: R$ {cofre: .2f}")
            continue
        else:
            cofre -= saque
            print(f"\nVocê sacou R$ {saque}")
            print(f"\nSeu saldo atual é de: R$ {cofre: .2f}")
            if cofre == 0.0:
                print("\nDeposite antes de poder fazer outro saque.")
                continue

    elif opcao == 3:
        print(f"Seu saldo atual é de: R$ {cofre: .2f}")
        
    elif opcao == 4:
        print("Programa Encerrado")
        break

    else:
        print("\nOpção inválida.")