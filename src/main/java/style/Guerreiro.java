package style;

import entity.Inimigo;
import weapon.Arma;

public class Guerreiro extends Estilo {
    public Guerreiro(){
        setNome("Guerreiro");
        setBonusDano(10);
        setBonusResistencia(40);
    }

    @Override
    public void ataqueNormal(Arma arma, Inimigo inimigo) {
        int calculoDano = arma.getDano() + ((arma.getDano()*getBonusDano()/100));
        inimigo.setPv(inimigo.getPv() - calculoDano);
    }

    @Override
    public void ataqueEspecial(Arma arma, Inimigo inimigo) {
        int calculoDano = arma.getDano() + ((arma.getDano()*getBonusDano()/100)) + 20;
        inimigo.setPv(inimigo.getPv() - calculoDano);
    }
}
