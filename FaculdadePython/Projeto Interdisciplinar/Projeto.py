# INTEGRANTES
#
# NOME: Gabriel Bigarato
# RGM: 32831048
#
# NOME:Nicolas Mazzone Barros
# RGM:32879750
#
# NOME:Pedro Henrique Belforti
# RGM:33959129

escolha = "s"
dados = "s"
while escolha == "s" or escolha == "S":
    op = int(input("Voce deseja converter decimal para (1-Binario, 2-Hexadecimal, 3-Octadecimal) :"))
    if op ==1:
        decimal = int(input("Digite o valor em DECIMAL:"))
        binario = ""
        while decimal > 0:
            resto = decimal % 2
            binario = str(resto) + binario
            decimal = decimal // 2


        print(f"O numero decimal convertido em binario é:{binario}")

    elif op ==2:
        decimal = int(input("Digite o valor em DECIMAL:"))
        hexadecimal = ""
        while decimal > 0:
            resto = decimal % 16
            if resto < 10:
                hexadecimal = str(resto) + hexadecimal  # adiciona o dígito à esquerda
            elif resto == 10:
                hexadecimal = 'A' + hexadecimal
            elif resto == 11:
                hexadecimal = 'B' + hexadecimal
            elif resto == 12:
                hexadecimal = 'C' + hexadecimal
            elif resto == 13:
                hexadecimal = 'D' + hexadecimal
            elif resto == 14:
                hexadecimal = 'E' + hexadecimal
            else:
                hexadecimal = 'F' + hexadecimal
            decimal = decimal // 16
        print(f"O numero decimal convertido em hexadecimal é: {hexadecimal}")

    elif op == 3:
        decimal = int(input("Digite o valor em DECIMAL:"))
        octadecimal = ""
        while decimal > 0:
            resto = decimal % 8
            octadecimal = str(resto) + octadecimal
            decimal = decimal // 8
        print(f"O numero decimal convertido em octadecimal é:{octadecimal}")

    escolha = input("Voce deseja converter mais um decimal ? (S/N) ?")

if escolha == "n" or escolha =="N":
    dados = input("Voce deseja ver os Dados do Projeto ? (S/N)")
    if dados == "s" or dados == "S":
        print("---------------------------------------------")
        print("Curso: Ciencias da Computadoção Bacharelado")
        print("---------------------------------------------")
        print("Componentes do grupo: \n NOME: Gabriel Bigarato RGM: 32831048 \n NOME:Nicolas Mazzone Barros RGM:32879750 \n NOME: Pedro Henrique Belforti RGM:33959129")
        print("---------------------------------------------")
        print("Disciplinas envolvidas:\n Programação de Computadores \n Organização e Arquitetura de Computadores")
        print("---------------------------------------------")
        print(" Versão do aplicativo: 1.0")
        print("---------------------------------------------")

    else:
        print("Programa Encerrado")
else:
    print("Programa Encerrado")






