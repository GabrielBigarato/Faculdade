# MANIPULAÇÃO DOS EVENTOS

# JOGO LABIRINTO
import pygame

# Inicializa o Pygame
pygame.init()
pygame.mixer.init()

som_passos = pygame.mixer.Sound("D:\\Senai_Python\\1407\\passos.wav")
som_vitoria = pygame.mixer.Sound("D:\\Senai_Python\\1407\\vitoria.ogg")

#Definição da tela do jogo, tamanho 400x400, e escrita da janela definida como "Labirinto"
largura, altura = 400, 400
tela = pygame.display.set_mode((largura, altura))
pygame.display.set_caption("Labirinto")

#Definição das cores que serão utilizadas durante a programação do jogo
preto = (0, 0, 0)
branco = (255, 255, 255)
vermelho = (255, 0, 0)
azul = (0,0,255)
verde = (0,255,0)

fonte = pygame.font.SysFont(None, 60)
fonte2 = pygame.font.SysFont(None,36)
movimento = 0



#Determina o tamanho de cada quadrado do jogo
tamanho_celula = 40
#Define o caminho do labirinto, os zeros representam caminhos livrres, e 1 caminhos onde 
#o jogador nao pode passar
labirinto = [
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
    [1, 0, 0, 0, 1, 0, 0, 0, 0, 1],
    [1, 0, 1, 0, 1, 0, 1, 1, 0, 1],
    [1, 0, 1, 0, 1, 0, 0, 0, 0, 1],
    [1, 0, 0, 0, 0, 1, 1, 1, 0, 1],
    [1, 1, 1, 1, 0, 0, 1, 0, 0, 1],
    [1, 1, 0, 0, 0, 0, 0, 0, 0, 1],
    [1, 0, 1, 1, 1, 1, 1, 1, 0, 1],
    [1, 0, 0, 0, 0, 0, 0, 0, 0, 1],
    [1, 1, 1, 1, 1, 1, 1, 1, 2, 1]
]

#Define a distancia que o quadrado do jogador vai jogar, a posição que ele vai estar
x, y = 1 * tamanho_celula, 1 * tamanho_celula
#Define a velocidade do quadrado do jogador
velocidade = 40

#Funcao para desenhar os quadrados pretos do labirinto
def desenhar_labirinto():
    #para cada LISTA que tem dentro de labirinto execute :
    for linha in range(len(labirinto)):
        # para cada LISTA é executado para cada QUADRADO(coluna):
        for coluna in range(len(labirinto[linha])):
            #para cada QUADRADO, a cor é definida sendo preto se dentro de quadrado(coluna)
            #dentro da linha for 1 e se nao vai ser branco
            if labirinto[linha][coluna] == 1: cor = preto 
            elif labirinto[linha][coluna] == 2: cor = azul
            elif labirinto[linha][coluna] == 0: cor = branco
            #É desenhado o quadrado pegando a coluna e linhas atuais da lista e multiplicando pelo 
            #tamanho da celula para adicionar um "quadrado" no jogo, e é definido o tamanho identico
            #ao do quadrado do jogador
            
            pygame.draw.rect(tela, cor, (coluna * tamanho_celula, linha * 
            tamanho_celula, tamanho_celula, tamanho_celula))

#Ja define o While como True
executando = True

#Enquanto executando for verdadeiro
while executando:
    #para cada evento que aconceter durante o game, pygame.even.get() ele recebe os eventos que ocorrem
    for evento in pygame.event.get():
        #caso receba um evento do tipo QUIT(sair do jogo, fechar janela), executando se tornara FALSE,
        #e o loop se encerrará

        if evento.type == pygame.QUIT:
            executando = False
        #define uma variavel chamada teclas, onde ela vai receber o estado atual de todas as teclas do teclado
        #onde recebe uma lista com valores booleanos, onde cada valor indica se a tecla correspondente está
        #pressionada ou não no momento da chamada da função.    
        teclas = pygame.key.get_pressed()
        #entao, caso a telca seta para esquerda estiver TRUE
        if teclas[pygame.K_LEFT]:
            #calcula a nova posição do personagem se ele for para esquerda
            novo_x = x - velocidade
            #aqui ele faz a verificação da colisão com o labirinto, verifica se a celula onde o jogador 
            #quer ir é igual a 0(livre)
            if labirinto[y // tamanho_celula][novo_x // tamanho_celula] == 0 or labirinto[y // tamanho_celula][novo_x // tamanho_celula] == 2:
                som_passos.play()
                x = novo_x
                movimento += 1

        if teclas[pygame.K_RIGHT]:
            novo_x = x + velocidade
            if labirinto[y // tamanho_celula][novo_x // tamanho_celula] == 0 or labirinto[y // tamanho_celula][novo_x // tamanho_celula] == 2:
                som_passos.play()
                x = novo_x
                movimento += 1

        if teclas[pygame.K_UP]:
            novo_y = y - velocidade
            if labirinto[novo_y // tamanho_celula][x // tamanho_celula] == 0 or labirinto[novo_y // tamanho_celula][x // tamanho_celula] == 2:
                som_passos.play()
                y = novo_y
                movimento += 1

        if teclas[pygame.K_DOWN]:
            novo_y = y + velocidade
            if labirinto[novo_y // tamanho_celula][x // tamanho_celula] == 0 or labirinto[novo_y // tamanho_celula][x // tamanho_celula] == 2:
                som_passos.play()
                y = novo_y
                movimento += 1
        #o mesmo se repete para todos os acimas

        linha_atual = y // tamanho_celula
        coluna_atual = x // tamanho_celula
        if labirinto[linha_atual][coluna_atual]==2:
            som_vitoria.play()
            print("Vitoria, voce chegou ao fim do labirinto")
            print(f"Você usou {movimento} movimentos.")
            texto_vitoria = fonte.render(f"VITORIA!!", True, verde)
            texto_final = fonte.render(f"Movimentos: {movimento}", True, verde)

            tela.fill((0,0,0))
            tela.blit(texto_vitoria, (100,100))
            tela.blit(texto_final, (50,160))
            pygame.display.update()
            pygame.time.delay(3000)
            executando = False

    #define a tela como branca
    tela.fill(branco)

    #chama a função que desenha o labirinto
    desenhar_labirinto()
    #desenha o personagem(quadrado vermelho)
    pygame.draw.rect(tela, vermelho, (x, y, tamanho_celula, tamanho_celula))

    #exibe os movimentos em tempo real na tela
    texto_mov = fonte2.render(f"Movimentos: {movimento}",True,(verde))
    tela.blit(texto_mov, (10,10))

    pygame.display.update()
    pygame.display.flip()
    pygame.time.Clock().tick(10)

pygame.quit()