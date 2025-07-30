import pygame
import sys

# Inicializa o Pygame
pygame.init()

# Define o tamanho da janela
width = 700
height = 500
screen = pygame.display.set_mode((width, height))
pygame.display.set_caption("Movimento com Teclado")

# Cria dois retângulos
quadrado = pygame.Rect(350, 200, 150, 70)       # retângulo que se move
retangulo2 = pygame.Rect(10, 150, 50, 50)       # retângulo fixo

# Controla o tempo de atualização
clock = pygame.time.Clock()

# Loop principal
while True:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()

        # Detecta teclas pressionadas
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_RIGHT:
                quadrado.move_ip([10, 0])
            if event.key == pygame.K_LEFT:
                quadrado.move_ip([-10, 0])
            if event.key == pygame.K_UP:
                quadrado.move_ip([0, -10])
            if event.key == pygame.K_DOWN:
                quadrado.move_ip([0, 10])

            # ✅ Impede que o retângulo saia da tela
            if quadrado.left < 0:
                quadrado.left = 0
            if quadrado.right > width:
                quadrado.right = width
            if quadrado.top < 0:
                quadrado.top = 0
            if quadrado.bottom > height:
                quadrado.bottom = height

    # Preenche o fundo da tela
    screen.fill('red')

    # Desenha os retângulos
    pygame.draw.rect(screen, 'green', quadrado)
    pygame.draw.rect(screen, 'white', retangulo2)

    # Atualiza a tela
    pygame.display.update()

    # Controla a taxa de frames por segundo
    clock.tick(60)
