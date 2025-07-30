#AULA DE TRY E EXCEPT
#--------------------------------------------------------------------------------------------------
#Codigo sem tratamento de Erro
# num = int(input("Digite um numero: "))
# print("O dobro do numero é: ", num * 2)
#--------------------------------------------------------------------------------------------------
#erro com tratamento para ValueError
# try:
#     num = int(input("Digite um numero: "))
#     print("O dobro do numero é: ", num * 2)
# except ValueError:
#     print("Erro: Voce precisa digitar um numero inteiro")
#--------------------------------------------------------------------------------------------------
#Codigo sem tratamento de erro
# numero = int(input("Digite um numero:"))
# print(10/ numero)
#--------------------------------------------------------------------------------------------------
#Erro com tratamento para ZeroDivisionError e para ValueError
# try:
#     numero = int(input("Digite um numero:"))
#     print(10/ numero)
# except ZeroDivisionError: #Erro para divisao por 0
#     print("Não é possivel dividir por 0")
#--------------------------------------------------------------------------------------------------    
# except ValueError: #Erro para erro de valor(foi inserido uma Str em uma variavel Int)
#     print("Voce precisa digitar um numero valido.")
#--------------------------------------------------------------------------------------------------
#EXERCICIO 1
# try:
#     numero1 = int(input("Digite o numero :"))
#     numero2 = int(input("Digite o numero :"))
#     divisao = numero1 / numero2
#     print(f"A divisão dos números é: {divisao}")
# except ZeroDivisionError: #Erro para divisao por 0
#     print("Não é possivel dividir por 0")
#--------------------------------------------------------------------------------------------------
# except ValueError: #Erro para erro de valor(foi inserido uma Str em uma variavel Int)
#     print("Voce precisa digitar um numero valido.")
#--------------------------------------------------------------------------------------------------
#EXERCICIO 2
# try:
#     idade = int(input("Digite a sua idade: "))
#     print(f"Sua idade é {idade}")
# except ValueError:
#     print("Digite um valor Numerico para a idade.")
#--------------------------------------------------------------------------------------------------
#EXERCICIO 3
# try:
#     lista = ["macaco","cachorro","urubu"]
#     #            0         1        2
#     indice = int(input("Digite o indice que deseja acessar da lista: "))
#     print(f"Voce escolheu o item {lista[indice]} da lista")
# except IndexError:
#     print("Erro: Indice invalido")
#--------------------------------------------------------------------------------------------------
#EXERCICIO 4
# try:
#     celcius = int(input("Digite a temperatura em celcius que deseja converter: "))
#     fahrenheit = (celcius * 9/5) + 32
#     print(f"A temperatura atual em Fahrenheit é de: {fahrenheit}")
# except ValueError:
#     print("Erro: Entrada inválida, Digite um numero")
#--------------------------------------------------------------------------------------------------
#EXERCICIO 5
# try:
#     idade = int(input("Digite sua idade: "))
#     if idade >= 18:
#         print("Você é maior de idade !")
# except ValueError:
#     print(f"Erro: O valor digitado não é permitido. Digite um numero. ")
#--------------------------------------------------------------------------------------------------
#EXERCICIO 6 - preciso melhorar
# while True:
#     try:
#         n1 = int(input("Digite o primeiro numero: "))
#         n2 = int(input("Digite o segundo numero: "))
#         print("\n### MENU ###")
#         print("1. Soma")
#         print("2. Subtração")    
#         print("3. Multiplicação")
#         print("4. Divisão.")
#         print("5. Sair")  
#         opcao = int(input("\nEscolha a operação:"))
#         if opcao == 1:
#             soma = n1 + n2
#             print(f"A soma dos numeros é = {soma}")

#         elif opcao == 2:
#             sub = n1 - n2
#             print(f"A soma dos numeros é = {sub}")

#         elif opcao == 3:
#             mult = n1 * n2
#             print(f"A soma dos numeros é = {mult}")
            
#         elif opcao == 4:
#             try:
#                 div = n1 / n2
#                 print(f"A divisão dos números é = {div}")
#             except ZeroDivisionError:
#                 print("Divisao por 0 não é possivel")
#         elif opcao == 5:
#             print("Programa Encerrado")
#             break
#         else:
#             print("\nOpção inválida.")
#     except ValueError:
#         print("Digite valores válidos. Digite numeros")
#--------------------------------------------------------------------------------------------------
#EXERCICIO 7 cadastro de produtos com dicionario
armazem = {"Leite":4.99, "Fuba": 3.99, "Cafe":20.99}

try: 
    produto = input("Digite o nome do produto que deseja: ")
    print(f"O valor do {produto} é {armazem[produto]}")
except NameError:
    print("Produto Inexistente")
except ValueError:
    print("Digite um valor válido") 
    
    