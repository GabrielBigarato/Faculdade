# def mensagem():
#     print("Entre um valor:")
# print("Inicio")
# mensagem()
# print("Fim")
# ------------------------------------------------------
# Exercicio 1
# def mostrarmensagem():
#     print("Boas Vindas!!!\nPor favor, digite seu nome")

# mostrarmensagem()
# nome = input("Digite seu nome: ")
# print(f"Bem vindo {nome}!!")
# ------------------------------------------------------
# Exercicio 2
# n1 = 0
# n2 = 0
# def calculadora():
#     print("MENU CALCULADORA: \n1 - SOMA\n")
#     op = int(input("Escolha a operação:"))
#     if op == 1:
#         somar()
#     else:
#         print("escolha uma opção válida!")
        
# def somar():
#     print("Você escolheu a opção de soma:")
#     n1 = int(input("Digite o N1: "))
#     n2 = int(input("Digite o N2: "))
#     soma = n1+n2    
#     print(f"A soma dos números é de: {soma}")
# escolha = str(input("Você deseja iniciar a calculadora? (S/N): ").strip().upper())
# if escolha == 'S':
#     calculadora() 
# elif escolha == 'N':
#     print("Ok, até a próxima!!")
# else:
#     print("Apenas S ou N")
# ------------------------------------------------------
# Exercicio 3
# idades = []
# def pedir_idade():
#     idade = int(input("Digite a idade de uma pessoa: "))
#     if idade == 0 or idade < 0:
#         print("Você digitou uma idade inválida")
#     else:
#         idades.append(idade) 
    
# for i in range(3):
#     pedir_idade()
    
# print("Mostrando as idades digitadas: ")
# for i in range(len(idades)):
#     print(f"Idade{i}:{idades[i]}")
# ------------------------------------------------------
# Exercicio 4
# cidades = []

# def armazenar_cidade():
#     cidade = str(input("Digite a cidade: "))
#     if cidade == '':
#         print("Você digitou uma cidade inválida")
#     else:
#         cidades.append(cidade) 
        
# escolha = int(input("1 - S\n2 - N\nDeseja armazenar as cidades ? :"))
# if escolha == 1:
#     armazenar_cidade()
#     print(cidades)
# elif escolha == 2:
#     print("Ok, até mais !!!")
# else:
#     print("Digite uma escolha válida")
# ------------------------------------------------------
# Exercicio 5
# n = 0
# def calc_media(n):
#     return ((n)/3)

# for i in range(3):
#     nota = float(input(f"Digite a Nota {i+1}: "))
#     n += nota
# else:
#     print(f"A média das notas é de: {calc_media(n):.2f}")
# ------------------------------------------------------
# Exemplo
# def mostrar_dados(nome, idade):
#     print("Nome:", nome)
#     print("Idade:", idade)
    
# nome_usuario = input("Digite seu nome: ")
# idade_usuario = input("Digite sua idade: ")

# mostrar_dados(nome_usuario, idade_usuario)
# ------------------------------------------------------
# Exercicio 6
# nomes = []
# cidades = []
# def cadastrar (nome, cidade):
#     if nome == "" or cidade == "":
#         print("Alguma informação inválida.")
#     else:
#         nomes.append(nome)
#         cidades.append(cidade)
        
# while True:
#     escolha = str(input("Deseja cadastrar outra pessoa ? (S/N): ").strip().upper())
#     if escolha == 'S':
#         nome = input("Digite o nome: ")
#         cidade = input("Digite a cidade: ")
#         cadastrar(nome, cidade)
#     else:
#         for i in range(len(nomes)):
#             print(f"Nome: {nomes[i]} - Cidade: {cidades[i]}")
#         break
# ------------------------------------------------------
# Exercicio 7
# nome = []
# idade = []
# faixa_etaria = ["Criança", "Adolescente", "Adulto", "Idoso"]
# def classificar_idade(nome, idade):
#     if idade < 0 or nome == "":
#         print("Algum valor invalido")
#     else:
#         if idade <= 12:
#             print(f"{nome} tem {idade} e é classificado como: {faixa_etaria[0]} ")
#         elif idade <= 17:
#             print(f"{nome} tem {idade} e é classificado como: {faixa_etaria[1]} ")
#         elif idade <= 59:
#             print(f"{nome} tem {idade} e é classificado como: {faixa_etaria[2]} ")
#         elif idade >= 60:
#             print(f"{nome} tem {idade} e é classificado como: {faixa_etaria[3]} ")
#        
# for i in range(3):
#     print("Pessoa", i + 1)
#     nome = input("Digite seu Nome: ")
#     idade = int(input("Digite sua Idade: "))
#     classificar_idade(nome, idade)