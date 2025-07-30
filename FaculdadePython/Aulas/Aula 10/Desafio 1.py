def soma (a, b):
    resul = a + b
    return resul

def sub (a, b):
    resul = a - b
    return resul

def mult (a , b):
    resul = a * b
    return resul

def div (a, b):
    resul = a / b
    return resul

num1 = float(input("Entre com o primeiro numero:"))
num2 = float(input("Entre com o segundo numero:"))

escolha= int(input("Escolha a operação que deseja 1- Soma, 2-Subtração, 3-Multiplicação, 4-Divisão"))

if escolha == 1:
    print(f"A soma dos números é:{soma(num1, num2)}")
elif escolha == 2:
    print(f"A subtração dos números é:{sub(num1, num2)}")
elif escolha == 3:
    print(f"A multiplicação dos números é:{mult(num1, num2)}")
elif escolha == 4:
    print(f"A divisão dos números é:{div(num1, num2)}")
else:
    print("Escolha uma alternativa valida.")
