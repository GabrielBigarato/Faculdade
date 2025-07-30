def div(divid, divis):
    quoci = 0
    while divid >= divis:
        divid -= divis
        quoci += 1
    return quoci

divid = int(input("Digita ai bagulho chamado dividendo: "))
divis = int(input("Agora digita ai o bagulho chamado de divisor: "))
quoci = div(divid, divis)
print("O resultado da divisão é:", quoci, "agora aprende a fazer sozinho, to com preguica de calcular mais")
