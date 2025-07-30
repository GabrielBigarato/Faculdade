# Cria um vetor v com 20 elementos
v = []

# Preenche o vetor com 20 valores digitados pelo usuário
for i in range(20):
    valor = int(input(f"Digite o {i + 1}º valor: "))
    v.append(valor)
    # v = v + [valor]  # Adiciona o valor à lista v

# Separa os números pares e ímpares
pares = []
impares = []

# Loop para percorrer cada valor em v
for valor in v:
    if valor % 2 == 0:  # Verifica se o valor é par (divisível por 2)
        pares.append(valor)  # Adiciona o valor à lista de pares
        # pares = pares + [valor]  # Adiciona o valor à lista de pares
    else:
        impares.append(valor)  # Adiciona o valor à lista de ímpares
        # impares = impares + [valor]  # Adiciona o valor à lista de ímpares

# Exibe os números pares
print("Números pares:")
for par in pares:
    print(par)

# Exibe os números ímpares
print("Números ímpares:")
for impar in impares:
    print(impar)
