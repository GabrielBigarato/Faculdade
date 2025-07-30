print("Exercicio 1")
num = int(input("Escreva um Numero:"))

if num % 2 == 1:
    print("Seu numero é impar!!!")

if num % 2 == 0:
    print("Seu numero é PAR !!!")

print("Exercicio 2")

a = int(input("Digite valor A:"))
b = int(input("Digite valor B:"))
c = int(input("Digite valor C:"))

if b < a and b < c:
    print("O número B é menor que A e C")
elif b > a and b > c:
    print("O número B é maior que A e C")
elif b < a and b > c:
    print("O número B é menor que A mas é maior que C")
elif b > a and b < c:
    print("O número B é menor que C mas é maior que A")
elif b == a and b > c:
    print("O número B é igual a A e é maior que C")
elif b == a and b < c:
    print("O número B é igual a A mas é menor que C")
elif b == c and b > a:
    print("O número B é igual a C e é maior que A")
elif b == c and b < a:
    print("O número B é igual a C e é menor que A")
else:
    b == a and b == c
    print("O número B é igual a A e igual a C")





