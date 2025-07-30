# Inicializa uma lista vazia para representar a pilha
pilha = []

# Função para adicionar elemento à pilha
def push(elemento):
    global pilha  # Indica que estamos usando a variável pilha global
    pilha = pilha + [elemento]  # Adiciona o elemento no final da lista (topo da pilha)
    print(f"Elemento {elemento} foi adicionado à pilha.")

# Função para remover o último elemento da pilha
def pop():
    global pilha  # Indica que estamos usando a variável pilha global
    if not pilha:
        print("A pilha está vazia. Não é possível remover elementos.")
        return None

    elemento = pilha[-1]  # Obtém o último elemento da lista (topo da pilha)
    pilha = pilha[:-1]  # Remove o último elemento da lista
    print(f"Elemento {elemento} foi removido da pilha.")
    return elemento

# Função principal para interagir com a pilha
def main():
    while True:
        print("\nEscolha uma ação:")
        print("1. Adicionar elemento (push)")
        print("2. Remover elemento (pop)")
        print("3. Sair")

        escolha = input("Digite o número da ação desejada: ")

        if escolha == "1":
            elemento = int(input("Digite o elemento para adicionar: "))
            push(elemento)
        elif escolha == "2":
            pop()
        elif escolha == "3":
            print("Encerrando o programa.")
            break
        else:
            print("Escolha inválida. Por favor, escolha uma opção válida.")

if __name__ == "__main__":
    main()
