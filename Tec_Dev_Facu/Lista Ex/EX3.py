# Função para exibir o tabuleiro
def exibir_tabuleiro(tabuleiro):
    # Loop para percorrer as posições do tabuleiro
    for i in range(0, 9, 3):
        # Exibe uma linha do tabuleiro
        print(f"{tabuleiro[i]} | {tabuleiro[i+1]} | {tabuleiro[i+2]}")
        # Adiciona uma linha de separação, exceto na última linha
        if i < 6:
            print("---------")

# Função para verificar se alguém venceu
def verificar_vitoria(tabuleiro, jogador):
    # Verifica linhas, colunas e diagonais para encontrar uma combinação vencedora
    for i in range(0, 9, 3):
        if tabuleiro[i] == tabuleiro[i+1] == tabuleiro[i+2] == jogador:
            return True
    for i in range(3):
        if tabuleiro[i] == tabuleiro[i+3] == tabuleiro[i+6] == jogador:
            return True
    if tabuleiro[0] == tabuleiro[4] == tabuleiro[8] == jogador or tabuleiro[2] == tabuleiro[4] == tabuleiro[6] == jogador:
        return True
    return False

# Função principal do jogo da velha
def jogo_da_velha():
    # Inicializa o tabuleiro com espaços vazios
    tabuleiro = [" " for _ in range(9)]
    jogador = "X"  # Começa com o jogador X

    while True:
        # Exibe o tabuleiro
        exibir_tabuleiro(tabuleiro)
        
        # Solicita ao jogador atual que escolha uma posição no tabuleiro
        escolha = int(input(f"Jogador {jogador}, escolha uma posição de 1 a 9: ")) - 1
        
        # Verifica se a escolha é válida (posição vazia)
        if tabuleiro[escolha] == " ":
            tabuleiro[escolha] = jogador
        else:
            print("Posição ocupada. Escolha outra.")

        # Verifica se o jogador venceu
        if verificar_vitoria(tabuleiro, jogador):
            exibir_tabuleiro(tabuleiro)
            print(f"Jogador {jogador} venceu!")
            break

        # Verifica se houve empate (tabuleiro cheio)
        if " " not in tabuleiro:
            exibir_tabuleiro(tabuleiro)
            print("DEU VELHA SUA VELHA!")
            break

        # Alterna para o próximo jogador
        if jogador == "X":
            jogador = "O"
        else:
            jogador = "X"

# Chama a função principal para iniciar o jogo
jogo_da_velha()
