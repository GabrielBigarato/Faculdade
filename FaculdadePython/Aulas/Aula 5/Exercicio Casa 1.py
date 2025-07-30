idade = int(input("Digite sua idade:"))

if idade >= 18 and idade <= 65:
    print("Voce e Eleitor Obrigatorio")
elif idade >= 16 or idade <18 and idade > 65:
    print("Voce e Eleitor Facultativo")
else:
    print("Voce nao e Eleitor")

