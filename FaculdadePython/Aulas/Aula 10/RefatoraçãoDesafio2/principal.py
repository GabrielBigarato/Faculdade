import metodo

peso = float(input("Digite o peso da pessoa em KG:"))
altura = float(input("Digite a altura da pessoa em metros(0.00):"))
print(f"O IMC é: {metodo.imc(peso,altura):.2f}, KG/m2")
metodo.despedida()
