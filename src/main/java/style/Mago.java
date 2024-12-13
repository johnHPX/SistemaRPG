package style;

import entity.Inimigo;
import weapon.Arma;

public class Mago extends Estilo {
    public Mago(){
        setNome("Mago");
        setBonusDano(10);
        setBonusResistencia(40);
    }

    @Override
    public void ataqueNormal(Arma arma, Inimigo inimigo) {

    }

    @Override
    public void ataqueEspecial(Arma arma, Inimigo inimigo) {

    }
}
