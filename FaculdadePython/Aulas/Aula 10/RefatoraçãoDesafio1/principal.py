import metodo

num1 = float(input("Entre com o primeiro numero:"))
num2 = float(input("Entre com o segundo numero:"))

escolha= int(input("Escolha a operação que deseja 1- Soma, 2-Subtração, 3-Multiplicação, 4-Divisão"))

if escolha == 1:
    print(f"A soma dos números é:{metodo.soma(num1, num2)}")
elif escolha == 2:
    print(f"A subtração dos números é:{metodo.sub(num1, num2)}")
elif escolha == 3:
    print(f"A multiplicação dos números é:{metodo.mult(num1, num2)}")
elif escolha == 4:
    print(f"A divisão dos números é:{metodo.div(num1, num2)}")
else:
    print("Escolha uma alternativa valida.")
