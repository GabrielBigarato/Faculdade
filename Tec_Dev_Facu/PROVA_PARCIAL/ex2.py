def calc_fato(n):
    if n == 0:
        return 1
    else:
        return n * calc_fato(n - 1)

numero = int(input("Fala ai um númerozinho para calcular o fatorialzinho: "))
resultado = calc_fato(numero)
print("O fatorialzinho de", numero, "é", resultado, "agora nao me enche mais meeuuuuu saco poh")
