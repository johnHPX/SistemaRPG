package mechanics.AtaquesArcos;

import entity.Inimigo;
import mechanics.Ataque;
import style.Arqueiro;
import style.Estilo;
import weapon.Arma;
import weapon.flechas.Flecha;

import java.util.ArrayList;

public class TiroRapido implements Ataque {
    @Override
    public void executarAtaque(String nome, Estilo estilo, Arma arma, Inimigo inimigo) {
        System.out.println(nome+" disparou: tiro rápido em "+inimigo.getNome());
        int calculo = arma.getDano();

        if (estilo instanceof Arqueiro)
            calculo += (arma.getDano() * estilo.getBonusDano()/100);

        inimigo.setPv(inimigo.getPv() - calculo);
        System.out.println("Ataque bem sucessedido!");
    }
}
