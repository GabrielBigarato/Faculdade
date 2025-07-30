nota = 0
somaNotas = 0
qtdNotas = 0
escolha = input("Voce deseja cadastrar uma nota (S/N) ?")

while escolha == "s" or escolha == "S":
    nota = float(input("Digite uma nota:"))
    somaNotas += nota
    qtdNotas += 1
    escolha = input("Voce deseja cadastrar mais uma nota (S/N) ?")

media = somaNotas/qtdNotas

print(f"A media das notas é {media}")
