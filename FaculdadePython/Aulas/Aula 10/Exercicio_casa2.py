def valor_da_parcela(valor_c, qtd_parc):
    if qtd_parc == 0 or qtd_parc == 1:
        valor_c = valor_c
        valor_parc = valor_c
    else:
        valor_c = ((valor_c*5)/100)+valor_c
        valor_parc = valor_c / qtd_parc
    return valor_c, valor_parc

valor_c = float(input("Digite o valor da compra:"))
qtd_parc = float(input("Digite o a quantidade de parcelas:"))

valor_c, valor_parc = valor_da_parcela(valor_c, qtd_parc)

print(f"O valor total da compra com os juros é R$ {valor_c: .2f}")
print(f"O valor da parcela é R$ {valor_parc:.2f}")

