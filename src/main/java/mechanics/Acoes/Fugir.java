package mechanics.Acoes;

import entity.Personagem;
import mechanics.Acao;

public class Fugir implements Acao {
    @Override
    public void executar(Personagem personagem) {
        System.out.println(personagem.getNome()+" Fugiu da batalha!");
    }
}
