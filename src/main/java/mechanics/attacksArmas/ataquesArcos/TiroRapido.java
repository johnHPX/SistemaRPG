package mechanics.attacksArmas.ataquesArcos;

import entity.Inimigo;
import mechanics.attacksArmas.AtaquePersonagem;
import style.Arqueiro;
import style.Estilo;
import weapon.Arma;
import weapon.bows.Arco;

public class TiroRapido implements AtaquePersonagem {
    @Override
    public void executarAtaque(String nome, Estilo estilo, Arma arma, Inimigo inimigo) {
        if (verificarArma(arma)){
            System.out.println(nome+" disparou: tiro rápido em "+inimigo.getNome());
            int calculo = arma.getDano();

            if (estilo instanceof Arqueiro)
                calculo += (arma.getDano() * estilo.getBonusDano()/100);

            inimigo.setPv(inimigo.getPv() - calculo);
            System.out.println(inimigo.getApelido()+" perdeu "+calculo+" de PV.");
            System.out.println("Ataque bem sucessedido!");
            return;
        }

        System.out.println("Arma incompativel com este ataque.");
    }

    public boolean verificarArma(Arma arma) {
        return arma instanceof Arco;
    }
}
