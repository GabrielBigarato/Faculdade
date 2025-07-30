# ------------------------------------------------------------------------------------------------------
# Exercicio 2
# lista =[]
# while True:
#     print("\n### MENU ###")
#     print("1. Adicionar item a lista")
#     print("2. Remover item da lista")    
#     print("3. Mostrar lista")
#     print("4. Sair.")  
    
#     opcao = int(input("\nEscolha uma opção:"))
#     if opcao == 1:
#         add = input("\nAdicione um item a lista: ".strip())
#         if add == "":
#             print("\nItem vazio, tente novamente")
#         elif add in lista:
#             print("\nEste item ja está na lista, adicione outro")
#         else:
#             lista.append(add)

#     elif opcao == 2:
#         print("Items na lista: ", lista)
#         print(f"Total de items na lista: {len(lista)}")
#         if len(lista) == 0:
#             print("\nAdicione um item antes de poder remover")
#         else:
#             remove = int(input("\nDigite a posicao do indice do item que deseja remover:"))
#             item_removido = lista.pop(remove)
#             print(f"Voce removeu {item_removido}1 da lista")

#     elif opcao == 3:
#         print(lista)
        
#     elif opcao == 4:
#         print("Programa Encerrado")
#         break

#     else:
#         print("\nOpção inválida.")
# ------------------------------------------------------------------------------------------------------
# Exercicio 3
# alunos = ["gabriel","lucas","jose"]
# notas = [7,5,10]
# while True:
#     print("\n### MENU ###") 
#     print("1. Adicionar aluno")
#     print("2. Listar todos os alunos")    
#     print("3. Mostrar alunos aprovados")
#     print("4. Mostrar alunos reprovados")
#     print("5. Sair.")  
    
#     opcao = int(input("\nEscolha uma opção:"))
#     if opcao == 1:
#         aluno = input("\nAdicione um Aluno a lista: ".strip())
#         nota = float(input("Adicione a Nota do Aluno: "))

#         if aluno == "" or nota < 0 or nota > 11:
#             print("\nVocê digitou algum valor inválido")
#         elif aluno in alunos:
#             print("\nEste item ja está na lista, adicione outro")
#         else:
#             alunos.append(aluno)
#             notas.append(nota)

#     elif opcao == 2:
#         print("Lista de Alunos e Notas:")
#         for i in range(len(alunos)):
#             print(f"Aluno:{alunos[i]} - Nota: {notas[i]}")

#     elif opcao == 3:
#         for i in range(len(alunos)):
#             if notas[i] >= 6:
#                 print(f"Aluno:{alunos[i]} - Nota: {notas[i]}")
        
#     elif opcao == 4:
#         for i in range(len(alunos)):
#             if notas[i] < 6:
#                 print(f"Aluno:{alunos[i]} - Nota: {notas[i]}")

#     elif opcao == 5:
#         print("Programa Encerrado")
#         break
#     else:
#         print("\nOpção inválida.")