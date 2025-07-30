import pygame

pygame.init() #Inicializa o pygame

#tamanho da janela
largura, altura = 640, 480
#Cria uma variavel tela, chamando na biblioteca pygame.display, para criar uma tela 
tela = pygame.display.set_mode([largura, altura]) #Set mode define o tamanho da janela
pygame.display.set_caption("Minha Primeira Janela") #Set Caption define o titulo da janela 

#cores
cor_fundo = (30,30,30)#cinza Escuro
cor_retangulo = (255,0,0)#Vermelho
cor_circulo = (0,255,0)#Verde
cor_elipse = (0,0,255)#Azul

#Loop Principal
running = True
while running:#Enquanto running for verdadeiro
    #for vai continuamente capturar eventos de pygame
    for event in pygame.event.get(): #Pygame.event.get captura eventos(como fechar a janela)
        #se algum evento for == a pygame.QUIT
        if event.type == pygame.QUIT: # pygame.QUIT Encerra o Pygame corretamente
            #running se torna False, fazendo com que a janela se feche 
            running = False
            
        tela.fill((cor_fundo))#.fill preenche o fundo, definimos como branco
        
        
        pygame.draw.circle(tela, (cor_circulo),(400,250), 50) #desenha um circulo com base de (cor, posicao, raio)
        pygame.draw.rect(tela,(cor_retangulo),(100,150,200,100))
        pygame.draw.ellipse(tela, (cor_elipse),(250,350,150,80))
        # pontos = [(100, 100), (200, 50), (300, 150), (250, 250), (150, 200)]
        # pygame.draw.polygon(screen, (255,0,0),(pontos))
        
        pygame.display.flip()#display.flip() atualiza a tela
        
pygame.quit()