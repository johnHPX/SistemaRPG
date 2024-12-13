package mechanics;

import entity.Inimigo;
import style.Estilo;
import weapon.Arma;

public class CorteHorizontal implements Ataque{
    @Override
    public void executarAtaque(String nome, Estilo estilo, Arma arma, Inimigo inimigo) {
        System.out.println(nome+" Desferiu um ataque a "+inimigo.getNome());
        int calculo = (estilo.getBonusDano()*arma.getDano()/100) + arma.getDano();
        inimigo.setPv(inimigo.getPv() - calculo);
        System.out.println("Ataque bem sucedido.");
    }
}
