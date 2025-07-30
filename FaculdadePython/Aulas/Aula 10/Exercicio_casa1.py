def calcular_viagem(km_i, km_f, litros_g, preco_l):
    distancia_p = km_f - km_i
    consumo_m = distancia_p / litros_g
    valor_g = litros_g * preco_l
    return distancia_p, consumo_m, valor_g

km_i = float(input("Fale a quilometragem inicial: "))
km_f = float(input("Fale a quilometragem final: "))
litros_g = float(input("Fale a quantidade de litros gastos: "))
preco_l = float(input("Fale o valor do litro: "))

distancia_p, consumo_m, valor_g = calcular_viagem(km_i, km_f, litros_g, preco_l)

print(f"Distância percorrida: {distancia_p:.2f} km")
print(f"Consumo médio: {consumo_m:.2f} km/l")
print(f"Valor gasto: R$ {valor_g:.2f}")
