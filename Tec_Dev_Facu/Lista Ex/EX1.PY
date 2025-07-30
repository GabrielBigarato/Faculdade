# Definindo a função para calcular o fatorial
def calcular_fatorial(n):
    # Verificando se n é negativo
    if n < 0:
        return "Fatorial não está definido para números negativos"
    # Se n for zero, o fatorial é 1
    elif n == 0:
        return 1
    else:
        # Inicializando a variável para armazenar o fatorial
        fatorial = 1
        # Usando um loop "for" para calcular o fatorial
        for i in range(1, n + 1):
            fatorial *= i  # Multiplicando o fatorial pelo número atual do loop
        return fatorial  # Retornando o resultado do cálculo do fatorial

try:
    # Solicitando ao usuário que insira um número inteiro
    n = int(input("Digite um número inteiro para calcular o fatorial: "))
    # Chamando a função para calcular o fatorial
    resultado = calcular_fatorial(n)
    # Exibindo o resultado
    print(f"{n}! = {resultado}")
except ValueError:
    # Lidando com erro se o usuário não inserir um número inteiro válido
    print("Por favor, digite um número inteiro válido.")
