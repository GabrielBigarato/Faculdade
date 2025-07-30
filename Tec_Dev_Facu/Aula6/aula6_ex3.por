programa
{
	
	funcao inicio()
 {
	real sal, ir, salliq, irr
	escreva("Digite seu Salário: ")
	leia(sal)
	se (sal <= 2112){
		escreva("Isento")
		escreva("Salario Bruto R$:", sal)
	}
	senao{
		se (sal > 2112 e sal <= 2826.65){
			escreva("Salario Bruto R$:", sal,"\n")
			ir = sal*(7.5/100)
			escreva("Imposto de Renda R$:", ir,"\n")
			salliq = sal - (sal*(7.5/100))
			escreva("Salario Liquido R$:", salliq,"\n")
		}
		senao{
			se (sal > 2826.65 e sal <= 3751.05){
				escreva("Salario Bruto R$:", sal,"\n")
				irr = sal*(15.0/100)
				escreva("Imposto de Renda R$:", irr,"\n")
				salliq = sal - (sal*(15.0/100))
				escreva("Salario Liquido R$:", salliq,"\n")
			}
			senao{
				se (sal > 3751.06 e sal <= 4664.68){
					escreva("Salario Bruto R$:", sal,"\n")
					irr = sal*(22.5/100)
					escreva("Imposto de Renda R$:", irr,"\n")
					salliq = sal - (sal*(22.5/100))
					escreva("Salario Liquido R$:", salliq,"\n")
				}
				senao{
					se (sal > 4664.68){
						escreva("Salario Bruto R$:", sal,"\n")
						irr = sal*(27.5/100)
						escreva("Imposto de Renda R$:", irr,"\n")
						salliq = sal - (sal*(22.5/100))
						escreva("Salario Liquido R$:", salliq,"\n")
					}
				}
			
			}
		}
	}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 185; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */