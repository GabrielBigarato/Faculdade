# Tabela verdade do AND
# print(True and True)
# print(True and False)
# print(False and True)
# print(False and False)
#
# #Tabela verdade do OR
# print(True or True)
# print(True or False)
# print(False or True)
# print(False or False)
#
# Tabela verdade do NOT
# print(Not True)
# print(Not False)


p1 = input("O participante é menino?")
p2 = input("A participante é menina?")

print(f"{eval(p1)} e {eval(p2)}")

# resposta = (bool(p1) and bool(p2))

resposta = (eval(p1) and eval (p2))

print(f"{resposta}")
