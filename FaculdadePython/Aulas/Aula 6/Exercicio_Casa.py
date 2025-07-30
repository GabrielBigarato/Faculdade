#Faca um programa em Python que solicite um numero binario, faca a conversao e exiba um numero digitado na base decimal. use a estrutursa de repeticao for.
x = 1

resul = 0

n = input("Digite um numero binario:")

n = n[::-1]

try:
    int(n, 2)
    print("Este e um numero Binario")
except:
    print("Este nao e um numero binario")
    exit()

for i in n:
    resul = resul + (int(i) * x)
    x = x * 2

print(resul)

