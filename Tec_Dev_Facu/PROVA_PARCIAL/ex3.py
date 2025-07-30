def multi(n1, n2):
    resul = 0
    for _ in range(n2):
        resul += n1
    return resul

num1 = int(input("Digita 1 número ai cacetada: "))
num2 = int(input("Digita 2 numero ai cacetinho: "))
resul = multi(num1, num2)
print("O resultado da multiplicação é ", resul, " agora nao me enche mais e faz o calculo na cabeca ai kraio.")
