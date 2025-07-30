def insereAI(vetor, compostoV):
    vetor = [compostoV] + vetor
    return vetor

def vetorrr_insercao():
    vetor = []
    while True:
        compostoV = input("Digite o numeroziho que voce quer inser (se nao quiser aperta Enter para sair): ")
        if compostoV:
            compostoV = int(compostoV)
            vetor = insereAI(vetor, compostoV)
            print("Vetor atual:", vetor)
        else:
            break

vetorrr_insercao()
