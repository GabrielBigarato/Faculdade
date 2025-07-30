n = 0
soma = 0
soma2 = 0
escolha = "s"
while escolha == "s" or escolha == "S":
    n = float(input("Digite um numero:"))
    if n > 0:
        soma += n
        escolha = input("Voce deseja cadastrar mais uma nota (S/N) ?")

    elif n < 0:
        soma2 += n
        escolha = input("Voce deseja cadastrar mais uma nota (S/N) ?")


print(f"A soma dos positivos é {soma}, a soma dos negativos é {soma2}, e a soma de todos é {soma + soma2}")
