cont_mas = 0
cont_fem = 0
idade_mas = 0
idade_fem = 0

while True:

    sex = input("Digite o seu sexo (M ou F):")
    nome = input("Digite o seu nome:")
    idade = int(input("Digite a sua idade:"))

    if sex == "M":
        cont_mas +=1
        idade_mas += idade
        if cont_mas == 5:
            break
    elif sex == "F":
        cont_fem += 1
        idade_fem+=idade

    if cont_mas > 0:
        med_mas = idade_mas / cont_mas
    else:
        med_mas = 0

    if cont_fem > 0:
        med_fem = idade_fem / cont_fem
    else:
        med_fem = 0

print(f"A media de idade do sexo feminino é {med_fem}")
print(f"A media de idade do sexo masculino é {med_mas}")
print(f"A soma das idades do sexo feminino e masculino é {idade_fem + idade_mas}")
