cont_maior = 0
cont_menor = 0
cont_95 = 0
ano_ant = 0
ano_95 = 0
ano_dps = 0

while True:

    mod = input("Digite o modelo do carro")
    ano = int(input("Digite o ano do carro:"))

    if ano < 1990:
        cont_menor += 1
        ano_ant += ano
        if cont_menor == 5:
            break

    elif ano == 1995:
        cont_95 += 1
        ano_95 += ano
        if cont_95 == 3:
            break

    elif ano > 1990:
        cont_maior +=1
        ano_dps += ano

    if cont_menor > 0:
        med_menor = ano_ant / cont_menor
    else:
        med_menor = 0

    if cont_maior > 0:
        med_maior = ano_dps / cont_maior
    else:
        med_maior = 0

    cont_total = cont_menor + cont_95 + cont_maior
    ano_total = ano_95 + ano_dps + ano_ant
print(f"A media dos anos dos carros anteriores a 1990 é {med_menor}")
print(f"A media dos anos dos carros posteriores a 1990 é {med_maior}")
print(f"A media dos anos de todos os carros inseridos é: {ano_total / cont_total}")
