# Campo Minado

### Neste projeto foi desenvolvido uma versão ao jogo já conhecido como Campo Minado.
#

![](/readme/gif.gif)

##### Ao perder ou ganhar exibe a mesagem:
![](/readme/mensagem.png)

#
### Funcionalidades
#### - Ao clicar com botão esquerdo do mouse, o campo se abre. Caso seus vizinhos não possuirem minas, se abrem também.
#### - Ao clicar com botão direito do mouse, o campo é marcado ou desmacardo.
#### - Caso o campo aberto tenha bomba ao seu redor, exibira quantas bombas possuem como vizinho, e não abrira seus vizinhos.
#### - Pode ser marcado um campo caso ache que ele possua mina, não será possível abri-lo.
#### - Pode ser desmarcado um campo marcado.
#### - Ao abrir um campo minado, todos os campos que possuem bombas/minas são revelados.
#### - As minas serã sorteadas aleatoriamente em cada jogada.
#### - Para ganhar um jogo, precisa não abrir nenhum campo minado e abrir ou marcar todos os campos.

## Tecnologias usadas
##### Java 8.
##### Utilização do Java Swing para a parte visual do jogo.
##### Utilização de Lambdas.
##### Padrão de objeto observer.

## Como testar ?
#### Será necessário ter configurado e instalado JDK e IDE.
#### Baixar o projeto em sua maquina e abri-lo com a IDE.
#### Navegar até a pasta src\cod3r\java\curso\cm\visao/TelaPrincipal e rodar a classe.

## Melhorias:
#### 1 - Adicionar possibilidade de escolher qual o nível de dificuldade do jogo.
#### 2 - Adicionar opção de perguntar se quer jogar novamente, atualmente sempre será iniciado novo jogo.
#### 3 - Melhorar a parte visual.
