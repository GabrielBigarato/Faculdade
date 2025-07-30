def imc (a, b):
    resu = a / b**2
    return resu

peso = float(input("Digite seu peso em KG: "))
altura = float(input("Digite sua altura em M (Ex:1.50):"))

print(f"Seu IMC é: {imc(peso, altura)}")