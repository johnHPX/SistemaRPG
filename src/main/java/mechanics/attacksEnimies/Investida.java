package mechanics.attacksEnimies;

import entity.Personagem;

public class Investida implements AtaqueInimigo {

    private int dano = 70;

    @Override
    public void atacar(String apelido, Personagem personagem) {
        System.out.println(apelido+" investiou contra "+personagem.getNome());
        personagem.setPv(personagem.getPv() - dano);
        System.out.println(personagem.getNome()+" perdeu "+dano+" de PV.");
        System.out.println("Ataque bem sucedido!");
    }
}
