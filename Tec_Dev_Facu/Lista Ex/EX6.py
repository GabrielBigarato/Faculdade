def busca_binaria(vetor, buscado):
    # Inicializa os índices para o intervalo de busca, esquerda no início do vetor e direita no final.
    esquerda, direita = 0, len(vetor) - 1

    # Realiza a busca binária enquanto o intervalo de busca é válido.
    while esquerda <= direita:
        # Calcula o índice do meio do intervalo de busca.
        meio = (esquerda + direita) // 2

        # Compara o valor no índice do meio com o valor buscado.
        if vetor[meio] == buscado:
            # Se encontramos o elemento, retornamos True. (Melhoria)
            return True
        elif vetor[meio] < buscado:
            # Se o valor no meio é menor, o elemento desejado está à direita, atualiza esquerda.
            esquerda = meio + 1
        else:
            # Se o valor no meio é maior, o elemento desejado está à esquerda, atualiza direita.
            direita = meio - 1

    # Se esquerda for maior que direita, o elemento não está no vetor, retornamos False. (Melhoria)
    return False

def main():
    # Lista ordenada onde faremos a busca. Essa é uma das melhorias, a lista deve ser ordenada. (Melhoria)
    lista = [1, 2, 3, 4, 7, 8, 10, 54, 85, 568]
    
    # Solicita ao usuário um número a ser buscado.
    param = int(input("Digite um número para ser buscado: "))

    # Chama a função busca_binaria para verificar se o elemento existe na lista.
    if busca_binaria(lista, param):
        print("Elemento existe na lista")
    else:
        print("Elemento não existe na lista")

if __name__ == "__main__":
    main()
