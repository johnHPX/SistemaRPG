package mechanics;

import entity.Personagem;

public class Fugir implements Acao{
    @Override
    public void executar(Personagem personagem) {
        System.out.println(personagem.getNome()+" Fugiu da batalha!");
    }
}
