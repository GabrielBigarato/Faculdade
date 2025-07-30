mes =["Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"]

totalsal= 0

for i in range(12):
    salario = float(input("Digite o salario de %s: R$ " %mes[i]))
    totalsal += salario

decimoterceiro = totalsal/ 12
ferias = (totalsal/ 12) * 0.3333

print(f"O decimo terceiro é {decimoterceiro: .2f}")
print(f"O valor das ferias é: {ferias: .2f}")


numeros = [1, 2, 3, 4, 5]
soma = 0
soma = 0
for i in range(1, 10):
    if i % 3 == 0:
        soma += i
    elif i % 4 == 0:
        soma -= i

print(soma)