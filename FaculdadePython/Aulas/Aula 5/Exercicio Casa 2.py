n1 = float(input("Digite o 1 valor:"))
n2 = float(input("Digite o 2 valor:"))
op = input("Digite qual operacao deseja fazer (‘+’, ‘-‘ , ‘*’ ou ‘/’ ):")

if op == "+":
    print(f"A soma dos numeros ={n1 + n2}")
elif op == "-":
    print(f"A subtracao dos numeros ={n1 - n2}")
elif op == "*":
    print(f"A multiplicacao dos numeros ={n1 * n2}")
elif op == "/":
    print(f"A divisao dos numeros ={n1 / n2}")
else:
    print(" Digite a operacao desejada da seguinte forma (‘+’, ‘-‘ , ‘*’ ou ‘/’ ).")