#-----------------------------------------------------
#idade = int(input("Digite a sua idade: "))
#if idade >= 18:
#    print("Voce é maior de idade!")
#else:
#9    print("Voce é menor de idade!")
#-----------------------------------------------------
#nota = int(input("Digite sua nota: "))
#if nota >=9:
#    print("Excelente")
#elif nota >=7:
#    print("Bom")
#else:
#    print("Precisa melhorar")
#-----------------------------------------------------
# idade = int(input("Digite a sua idade: "))
# habilitacao = input("Voce tem habilitação ? (S/N)")
# if idade >= 18 and habilitacao == "S":
#     print("Pode Dirigir")
# else:
#     print("Menor de idade!")
#-----------------------------------------------------
# permissao = False
# if not permissao:
#     print("Acesso negado")
# else:
#     print("Acesso permitido")
#-----------------------------------------------------
# idade = int(input("Digite a sua idade: "))
# habilitacao = input("Voce tem habilitação ? (S/N)")
# if idade >= 18 or habilitacao == "S":
#     print("Pode Dirigir")
# else:
#     print("Menor de idade!")
#-----------------------------------------------------
#Exemplo 1
# temperatura = float(input("Qual a temperatura atual em graus Celsius ? (Ex: 15):"))
# if temperatura < 15:
#     print("Está Frio!!")
# elif temperatura <=25:
#     print("Temperatura Agradavel!!")
# else:
#     print("Está quente!!")
#-----------------------------------------------------
#Exemplo 2
# vendas = float(input("Digite o valor total de vendas do mes: R$ "))
# if vendas <= 2000:
#     comissao = vendas * 0.03
# elif vendas <= 5000:
#     comissao = vendas * 0.05
# else:
#     comissao = vendas * 0.08
# print("Comissao do mes: R$ ", comissao)
#-----------------------------------------------------
#Exercicio 1
# numero = int(input("Digite um numero: "))

# if numero > 0:
#     print("Positivo")
# elif numero == 0:
#     print("Zero")
# else:
#     print("Negativo")
#-----------------------------------------------------
#Exercicio 2
# numero1 = int(input("Digite o numero 1: "))
# numero2 = int(input("Digite o numero 2: "))
# if numero1 > numero2:
#     print("Numero 1 é maior") 
# elif numero2 > numero1:
#     print("Numero 2 é maior")
# else:
#     print("Eles são Iguais")
#-----------------------------------------------------
#Exercicio 3
# idade = int(input("Digite a sua idade: "))
# if idade >= 16:
#     print("Pode votar")
# else:
#     print("Nao pode votar")
#-----------------------------------------------------
#Exercicio 4
# numero = int(input("Digite um numero: "))
# if numero % 2 == 1:
#     print("Ele é impar")
# else:
#     print("Ele é par")
#-----------------------------------------------------
#Exercicio 5
# senha = "python123"
# digitado = input("Digite a senha: ")
# if digitado == senha:
#     print("Acesso concedido")
# else:
#     print("Acesso negado")
#-----------------------------------------------------
#Exercicio 6
# nota = int(input("Digite a sua Nota: "))
# if nota >= 9:
#     print("Excelente")
# elif nota >= 7:
#     print("Bom")
# elif nota >= 5:
#     print("Regular")
# else:
#     print("Insuficiente")
#-----------------------------------------------------
#Exercicio 7
# print("Voce deve digitar o tamanho de 3 lados de um triangulo")
# lado1 = int(input("Digite o lado 1: "))
# lado2 = int(input("Digite o lado 2: "))
# lado3 = int(input("Digite o lado 3: "))
# if lado1 == lado2 == lado3:
#     print("Este é um triangulo Equilatero")
# elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
#     print("Este é um triangulo Isósceles")
# else:
#     print("Este é um triangulo Escaleno(todos os lados diferentes)")
#-----------------------------------------------------
#Exercicio 8
# usuario_correto = "gabriel"
# senha_correto = 12345

# print("Tentativa 1")
# nome = input("Digite o Nome: ")
# senha = int(input("Digite a Senha: "))
# if usuario_correto == nome and senha_correto == senha:
#     print("Bem-Vindo", nome)
# else:
#     print("Tentativa 2")
#     nome = input("Digite o Nome: ")
#     senha = int(input("Digite a Senha: "))
#     if usuario_correto == nome and senha_correto == senha:
#         print("Bem-Vindo", nome)
#     else:
#         print("Tentativa 3")
#         nome = input("Digite o Nome: ")
#         senha = int(input("Digite a Senha: "))
#         if usuario_correto == nome and senha_correto == senha:
#             print("Bem-Vindo", nome)
#         else:
#             print("Você excedeu o numero de tentativas, acesso bloqueado")
#-----------------------------------------------------
#Exercicio 9
# dia = int(input("Digite o dia do mes: "))
# mes = input("Digite o nome do mes: ")
# ano = int(input("Digite o ano: "))
# if dia == 30 or dia == 31:
#     print("O numero de dias do mes é valido")
# else:
#     if mes == "fevereiro ":
#         print("O mes é Fevereiro")
#     elif dia == 28:
#         print("O numero de dias de fevereiro é valido")
#     elif dia == 29:
#         print("O numero de dias de fevereiro é valido e é um ano bissexto")
#     else:
#         print("O numero de dias de fevereiro não é valido")
# print("A data é ", dia,"/", mes, "/", ano )
#-----------------------------------------------------
#Exercicio 10
# nota = int(input("Digite a sua nota de 0 a 100: "))
# if nota >= 0 and nota <= 100:
#     print("Sua nota é válida")
#     if nota >= 90 and nota <= 100:
#         print("Nota A")
#     elif nota >= 80 and nota <= 89:
#         print("Nota B")
#     elif nota >= 70 and nota <= 79:
#         print("Nota C")
#     elif nota >= 60 and nota <= 69:
#         print("Nota D")
#     else:
#         print("Nota F")
# else:
#     print("Sua nota é inválida")
#-----------------------------------------------------
#Exercicio 11
# valor_total = float(input("Digite o valor total da compra: "))

# if valor_total >= 0 and valor_total<= 100:
#     print("Sem desconto")
# elif valor_total >= 100.01 and valor_total <= 500:
#     desconto = valor_total * 0.05
# elif valor_total >= 500.01 and valor_total <= 1000:
#     desconto = valor_total * 0.10
# elif valor_total >= 1000:
#     desconto = valor_total * 0.15
# print("Você ganhou, R$", desconto, "de desconto")
