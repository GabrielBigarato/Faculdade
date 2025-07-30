print("!!!!!!!!!!!!!!!!!!!! - Metodo 1 - !!!!!!!!!!!!!!!!!!!!")

anos = int(input("Digite quantos anos voce tem: "))
meses = anos * 12
dias = anos * 365

print(f"Voce esta vivo em anos: {anos}, em meses: {meses}, e em dias: {dias}")


print("!!!!!!!!!!!!!!!!!!!! - Metodo 2 - !!!!!!!!!!!!!!!!!!!!")

anos = int(input("Digite seu tempo total em vida em anos: "))
meses = int(input("Agora os meses adicionais:"))
dias = int(input("E agora os dias adicionais:"))

anos = anos * 365
meses = meses * 30
total_dias = anos + meses + dias

print(f"Voce esta vivo a: {total_dias} dias.")





