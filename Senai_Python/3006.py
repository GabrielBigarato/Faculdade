lista_inicial = ['Arroz','Feijão','Macarrao','Tomate','Leite']

print(lista_inicial)

print("Item na posição 2:",lista_inicial[2])

print("Parte da lista (2 primeiros itens):", lista_inicial[0:2])

print("Total de itens: ", len(lista_inicial))

i = int(input("Digite a posicao do indice do item que deseja remover:"))

item_removido = lista_inicial.pop(i)

print(f"Removendo {item_removido} da lista . . .")
print("Lista atualizada: ",lista_inicial)

lista_inicial.append('Banana')

lista_inicial.insert(1,'Cafe')

for lista in lista_inicial:
    print(lista)

lista_inicial.sort()
print(lista_inicial)
