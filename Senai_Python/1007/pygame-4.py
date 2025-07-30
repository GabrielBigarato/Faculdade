import pygame
import sys

# Inicializa o Pygame
pygame.init()

# Configurações da janela
LARGURA = 500
ALTURA = 500
janela = pygame.display.set_mode((LARGURA, ALTURA))
pygame.display.set_caption('Ping Pong - Aula 4')

# Cores
BRANCO = (255, 255, 255)
PRETO = (0, 0, 0)
VERMELHO = (255,0,0)
AZUL = (0,0,255)
VERDE = (0,255,0)

# Posições iniciais
raquete1_x, raquete1_y = 50, 225
raquete2_x, raquete2_y = 450, 225
bola_x, bola_y = 250, 250

# Velocidades (ajustadas para 1 pixel por frame)
velocidade_raquete = 0.5
velocidade_bola_x, velocidade_bola_y = 0.1, 0.1

# Tamanhos
raquete_largura, raquete_altura = 20, 100
bola_largura, bola_altura = 20, 20

# Placar
placar1 = 0
placar2 = 0
fonte = pygame.font.SysFont(None, 55)

# Função para desenhar os elementos
def desenhar():
    janela.fill(PRETO)
    pygame.draw.rect(janela, AZUL, (raquete1_x, raquete1_y, raquete_largura, raquete_altura))
    pygame.draw.rect(janela, VERDE, (raquete2_x, raquete2_y, raquete_largura, raquete_altura))
    pygame.draw.ellipse(janela, VERMELHO ,(bola_x, bola_y, bola_largura, bola_altura))
    texto = fonte.render(f"{placar1} - {placar2}", True, BRANCO)
    janela.blit(texto, (200, 20))

# Loop principal
LOOP = True
while LOOP:
    for evento in pygame.event.get():
        if evento.type == pygame.QUIT:
            LOOP = False

    # Movimentação das raquetes
    teclas = pygame.key.get_pressed()
    if teclas[pygame.K_w] and raquete1_y > 0:
        raquete1_y -= velocidade_raquete
    if teclas[pygame.K_s] and raquete1_y < ALTURA - raquete_altura:
        raquete1_y += velocidade_raquete
    if teclas[pygame.K_UP] and raquete2_y > 0:
        raquete2_y -= velocidade_raquete
    if teclas[pygame.K_DOWN] and raquete2_y < ALTURA - raquete_altura:
        raquete2_y += velocidade_raquete

    # Movimento da bola
    bola_x += velocidade_bola_x
    bola_y += velocidade_bola_y

    # Colisão com topo e base
    if bola_y <= 0 or bola_y >= ALTURA - bola_altura:
        velocidade_bola_y = -velocidade_bola_y

    # Colisão com raquetes
    if (raquete1_x < bola_x < raquete1_x + raquete_largura) and (raquete1_y < bola_y < raquete1_y + raquete_altura):
        velocidade_bola_x = -velocidade_bola_x
    if (raquete2_x < bola_x < raquete2_x + raquete_largura) and (raquete2_y < bola_y < raquete2_y + raquete_altura):
        velocidade_bola_x = -velocidade_bola_x

    # Pontuação
    if bola_x <= 0:
        placar2 += 1
        bola_x, bola_y = 250, 250
        velocidade_bola_x = -velocidade_bola_x
    if bola_x >= LARGURA - bola_largura:
        placar1 += 1
        bola_x, bola_y = 250, 250
        velocidade_bola_x = -velocidade_bola_x

    # Desenhar e atualizar a tela
    desenhar()
    pygame.display.update()

# Encerrar o jogo
pygame.quit()
