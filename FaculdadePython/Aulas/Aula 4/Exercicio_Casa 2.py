comp1 = float(input("Digite o Valor da Compra:"))
porce = 20
import math

desc = (comp1 * porce) / 100

if comp1 >= 200:
    print(f"O desconto e :{desc}, O valor total fica {comp1 - desc}")
else:
    print("O desconto e apenas para compras acima de 200 Reais")
    print(f"O valor da compra fica:{comp1}")