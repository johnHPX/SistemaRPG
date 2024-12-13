package mechanics.AtaquesEspadas;

import entity.Inimigo;
import mechanics.Ataque;
import style.Estilo;
import style.Guerreiro;
import weapon.Arma;

public class CorteHorizontal implements Ataque {
    @Override
    public void executarAtaque(String nome, Estilo estilo, Arma arma, Inimigo inimigo) {
        System.out.println(nome+" Desferiu: Corte Horizontal a "+inimigo.getNome());
        int calculo = arma.getDano();

        // Se for guerreiro recebe 10% de dano extra
        if (estilo instanceof Guerreiro)
            calculo += (estilo.getBonusDano()*arma.getDano()/100);

        inimigo.setPv(inimigo.getPv() - calculo);
        System.out.println("Ataque bem sucedido.");
    }
}
