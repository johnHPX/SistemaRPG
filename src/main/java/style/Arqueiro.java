package style;

import entity.Inimigo;
import entity.Entidade;
import weapon.Arma;

public class Arqueiro extends Estilo {
    public Arqueiro(){
        setNome("Arqueiro");
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
