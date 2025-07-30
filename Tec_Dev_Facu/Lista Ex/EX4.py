# Função para inverter um vetor
def inverter_vetor(vetor):
    # Inicializa um novo vetor vazio para armazenar o resultado
    resultado = []
    
    # Loop para percorrer o vetor original de trás para frente
    for i in range(len(vetor) - 1, -1, -1):
        resultado.append(vetor[i])  # Adiciona o elemento ao resultado
    
    return resultado  # Retorna o vetor invertido

# Cria um vetor com 15 valores digitados pelo usuário
vetor = []
for i in range(15):
    valor = int(input(f"Digite o {i + 1}º valor: "))
    vetor.append(valor)

# Chama a função para inverter o vetor
vetor_invertido = inverter_vetor(vetor)

# Exibe o vetor original e o vetor invertido
print("Vetor original:", vetor)
print("Vetor invertido:", vetor_invertido)
