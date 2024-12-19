# Sobre o projeto

<p>Inspirado em RPGS (de turno) classicos como final fantasy, utilizando do seu sistema de combate para exemplificar o uso de 5 padrões de projeto: Strategy, Observer, Decorator, Factory e Abstract Factory.</p>
<p>Trabalho equiavale a primeira nota da disciplina de POO 2</p>
<p>Equipe: <a href="https://github.com/johnHPX" target="_blank">Jonatas</a> e <a href="https://github.com/Alesh-Silva" target="_blank">Alexandre</a>.</p>

## Uso dos padrões no contexto

### Abstract Factory
    Ainda falta implementar...

### Factory
    Usado para criar os personagens e inimigos do jogo.
    Para personagens foram criadas as fábricas para guerreiro, arqueiro, mago, ladrão e lutador. 
    Portanto pode-se criar personagens que contenham esses estilos, de forma organizada. 
    Para inimigos foram criadas as fábricas de tipo terrestre e voador. 
    Para separá qual tipo de inimigo deseja-se criar. Ás implemnetações das fábricas de personagens estão no pacote "charatere" e as fábricas de inimigos estão no pacote "enemy".

### Decorator
    Usado para equipar os personagens com armaduras.
    As armaduras estão divididas em peitorais, capacetes, luvas e calças. 
    Qualquer personagem pode usar qualquer parte de uma armadura.
    As armaduras aumenta seu PV (pontos de vida). 
    O uso do Decorator para esse tipo de finalidade é essencial pois permite de forma simples adicionar funcionalidades, atributos ou melhorias a qualquer personagem sem alterar sua classe inicial. 
    O pacote que implementa esta solução é o "armor". 

### Strategy
    Usado em dois contextos: Para definir quais serão os ataques dos personagens e quais os ataques dos inimigos e quais magias as entidades usaram contra outras entidades. 
    Básicamente, o uso do Strategy funciona como um seletor para escolher qual método causará mais dano nos oponentes (sejam personagens ou inimigos). 
    Uma verdadeira "estrategia". Os pacotes que implementam essas soluções são "entity" e "mechanics".

### Observer
    Usado para o sistema de combate. 
    Como RPG's de turno permitem que o jogador crie suas prórpias estretegias de batalha. 
    Através do padrão Observer, é possivel coodernar os personagens (ou inimigos) para que todos os inseridos na lista de atuantes em batalha possam executar ações que podem benificiar o grupo todo. 
    Como um ataque em grupo (todos os personagens focma em atacar um único inimigo), mostrar os status de todos os persanagens e ordenar que todos os personagens fujam da batalha. 


