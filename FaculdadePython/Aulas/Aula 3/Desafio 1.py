trabalhouseg = input("Joao trabalhou segunda?")
trabalhouqua = input("Joao trabalhou quarta?")
trabalhousex = input("joao Trabalhou sexta?")

tvtubo = eval(trabalhouseg) or eval(trabalhouqua) or eval(trabalhousex)

print(f"Joao pode comprar uma tv de tubo? {tvtubo}")

tv32 = eval(trabalhouseg) and eval(trabalhouqua) or \
       eval(trabalhouqua) and eval(trabalhousex) or \
       eval(trabalhousex) and eval(trabalhouseg)

print(f"Joao pode comprar uma TV de 32 Polegadas? {tv32}")

tv55 = eval(trabalhouseg) and eval(trabalhouqua) and eval(trabalhousex)

print(f"Joao pode comprar uma TV de 55 Polegadas 4K? {tv55}")

