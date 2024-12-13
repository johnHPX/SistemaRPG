package style;

import entity.Inimigo;
import entity.Entidade;
import weapon.Arma;

public class Lutador extends Estilo {
    public Lutador(){
        setNome("Lutador");
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
