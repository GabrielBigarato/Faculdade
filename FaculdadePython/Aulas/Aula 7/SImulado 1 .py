
n1 = int(input("Digite numero 1:"))
n2 = int(input("Digite numero 2:"))
n3 = int(input("Digite numero 3:"))

sequencia= [n1, n2, n3]

print(sequencia[::1])
print(sorted(sequencia))
sequencia.sort(reverse=False)
print(sequencia)
