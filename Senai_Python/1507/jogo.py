# MANIPULAÇÃO DOS EVENTOS

# JOGO LABIRINTO
import pygame
import random
import sys

# Inicializa o Pygame
pygame.init()
pygame.mixer.init()

som_passos = pygame.mixer.Sound("D:\\Senai_Python\\1507\\passos.wav")
som_vitoria = pygame.mixer.Sound("D:\\Senai_Python\\1507\\vitoria.ogg")

#Definição da tela do jogo, tamanho 600x400, e escrita da janela definida como "Caça ao tesouro"
largura, altura = 600, 400
tela = pygame.display.set_mode((largura, altura))
pygame.display.set_caption("Caça ao Tesouro")

#Definição das cores que serão utilizadas durante a programação do jogo
preto = (0, 0, 0)
branco = (255, 255, 255)
vermelho = (255, 0, 0)
azul = (0,0,255)
verde = (0,255,0)
amarelo = (255,255,0)

cor_fundo = branco

fonte = pygame.font.SysFont(None, 60)

jogador_tamanho = 30
jogador = pygame.Rect(50, 50, jogador_tamanho, jogador_tamanho)
velocidade = 20

tesouro_raio = 15
tesouro_x = random.randint(tesouro_raio, largura - tesouro_raio)
tesouro_y = random.randint(tesouro_raio, altura - tesouro_raio)

movimento = 0
fonte2 = pygame.font.SysFont(None,36)

vitoria = False
relogio = pygame.time.Clock()

executando = True
#Enquanto executando for verdadeiro
while executando:
    relogio.tick(60)
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
        movimento_feito = False
        posicao_anterior = jogador.topleft

        if not vitoria:
            if teclas[pygame.K_LEFT]:
                jogador.x = max(jogador.x - velocidade, 0)
                
            if teclas[pygame.K_RIGHT]:
                jogador.x = min(jogador.x + velocidade, largura - jogador.width)
                
            if teclas[pygame.K_UP]:
                jogador.y = max(jogador.y - velocidade, 0)
                
            if teclas[pygame.K_DOWN]:
                jogador.y = min(jogador.y + velocidade, altura - jogador.height)
                
        
        if jogador.topleft != posicao_anterior:
            movimento += 1
            som_passos.play()
        
        distancia = ((jogador.centerx - tesouro_x) ** 2 + (jogador.centery - tesouro_y) ** 2) ** 0.5
        if distancia < tesouro_raio + jogador_tamanho // 2:
            vitoria = True

    tela.fill(cor_fundo)

    pygame.draw.circle(tela, vermelho, (100, 300), 40)
    pygame.draw.rect(tela, amarelo, (400,50,100,60))
    
    if not vitoria:
        pygame.draw.circle(tela, verde,(tesouro_x, tesouro_y), tesouro_raio)

    pygame.draw.rect(tela, azul, jogador)

    #exibe os movimentos em tempo real na tela
    texto_mov = fonte2.render(f"Movimentos: {movimento}",True,(verde))
    tela.blit(texto_mov, (10,10))

    if vitoria:
            som_vitoria.play()
            print("Vitoria, voce chegou ao fim do labirinto")
            print(f"Você usou {movimento} movimentos.")
            texto_vitoria = fonte.render(f"VITORIA!!", True, verde)
            texto_final = fonte.render(f"Movimentos: {movimento}", True, verde)
            tela.fill(preto)
            tela.blit(texto_vitoria, (100,100))
            tela.blit(texto_final, (50,160))
            pygame.display.update()
            pygame.time.delay(3000)
            executando = False

    pygame.display.update()
    pygame.display.flip()

pygame.quit()