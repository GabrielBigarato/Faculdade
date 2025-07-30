# Aula sobre Tuplas e Dicionario
# Mexendo com listas:
# lista = [1 ,2 ,3]
# tupla = (4, 5, 6)
# for item in lista:
#     print(item)
# for item in tupla:
#     print(item)    
# -------------------------------------
# lista = [1 ,2 ]
# lista.append(3)
# tupla = (1,2,3)
# nova_tupla = tupla + (4,)
# print(lista)
# print(tupla)
# print(nova_tupla)
# -------------------------------------
# tupla1 = (4,5,6)
# tupla2 = tupla1 + (7,)
# tupla3 = ("Nissan","Kicks","2025")
# print(tupla3[1])
# -------------------------------------
# Exercicio 1 Tuplas
# dados_aluno = ("Ana", 20, "Engenharia")
# print("Nome: ", dados_aluno[0])
# print("Idade: ", dados_aluno[1],"Anos")
# print("Curso: ", dados_aluno[2])
# -------------------------------------
# Exercicio 2 Tuplas
# materias = ("Matematica", "Fisica","Quimica", "Biologia")
    
# for item in materias:
#     print(item)

# if "Historia" not in materias:
#     print("Historia nao está na Tupla")
# else:
#     print("Historia está na Tupla")

# if "Fisica" not in materias:
#     print("Fisica nao está na Tupla")
# else:
#     print("Fisica está na Tupla")

# Exibir apenas em True ou False
# print("Historia" in materias) #False
# print("Fisica" in materias) #True
# -------------------------------------
# Exercicio 3 Tuplas
# tupla1 = (1,2,3)
# tupla2 = (4,5,6)
# tupla3 = tupla1 + tupla2
# tupla4 = tupla1 *3
# print(tupla3, tupla4)
# -------------------------------------
# como converter lista em tupla
# nomes_lista = ["Ana", "Carlos", "Beatriz"]
# nomes_tupla = tuple(nomes_lista)

# print("Lista: ", nomes_lista)
# print("Tupla: ",nomes_tupla)
# -------------------------------------
# como converter tupla em lista
# nomes_tupla = ("Ana", "Carlos", "Beatriz")
# nomes_lista = list(nomes_tupla)

# print("Lista: ", nomes_lista)
# print("Tupla: ",nomes_tupla)
# -------------------------------------
# Exercicio 4 Tuplas
# nomes_lista = []
# nomes_tupla = ()

# while True:
#     nome = input("Digite Nomes: ")
#     if nome == "":
#         nomes_tupla = tuple(nomes_lista)
#         for i in range(len(nomes_tupla)):
#             print(f"Nome{i+1}: {nomes_tupla[i]}")
#         if "ana" in nomes_tupla:
#             print("Ana está na lista")
#         else:
#             print("Ana não está na lista")
#         print("Programa encerrado")
#         break
#     else:
#         nomes_lista.append(nome)
# -------------------------------------
# Explicando Dicionario em profundidade
# dicionario = {"gato":"cat","cachorro":"dog"}
# print(dicionario["gato"])

#adicionar outro item
# dicionario["cavalo"] = "Horse"
# dicionario.update({"pato":"duck"})
# print(dicionario["pato"])

# deletar
# del dicionario["gato"]
# dicionario.popitem() #remove ultimo item

# verificar a existecia de uma chave
# if "cachorro" in dicionario:
#     print("Existe!")

#funcoes uteis
# len(dicionario)
# dicionario.keys()
# dicionario.values()
# dicionario.items()
# -------------------------------------
# Dicionario com tupla
# notas_alunos = {
#     "Ana": (8, 9, 10),
#     "Carlos": (7, 6)
# }
# print(notas_alunos["Ana"])

# for aluno, notas in notas_alunos.items():
#     print(f"{aluno}:{notas}")
# -------------------------------------
# cadastro de dados com validação

alunos = {}

while True:
    nome = input("Digite Nomes: ")
    if nome == "":
        print("Programa encerrado")
        break
    nota = float(input(f"Digite a nota para {nome}:"))
    if nota < 0 or nota > 10:
        print("Nota Inválida, tente novamente")
        continue
    else:
        if nome in alunos: #adiciona a nota na tupla ja existente se o aluno ja existir 
            notas_antigas = alunos[nome] # "puxa" as notas antigas do aluno e poe na tupla(notas_antigas)
            nova_tupla = notas_antigas + (nota,) # adiciona a nota nova(nota,) na tupla com as notas passadas(notas_antigas)
            alunos[nome] = nova_tupla #é "atualizado" o dicionario adicionando a nova_tupla com a nova nota
        else:
            alunos[nome] = (nota,)#se o aluno nao tiver no dicionario, é criado uma nova tupla no nome do cara
    print("\nMedia dos Alunos")
    for nome in alunos:
        soma = 0 
        for nota in alunos[nome]: #para cada nota em aluno especifico
            soma = soma + nota #vai somar a nota em soma. Exemplo soma = 0 + 5(nota escolhida), soma = 5 + 10(outra nota escolhida), soma = 15 ...
        media = soma / len(alunos[nome]) #media divide o resultado da soma pelo tanto de notas armazenadas no aluno especifico do dicionario alunos
        print(f"{nome}:{alunos[nome]} Média ={media: .2f}")
    

