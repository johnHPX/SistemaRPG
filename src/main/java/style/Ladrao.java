package style;

import entity.Inimigo;
import entity.Entidade;
import weapon.Arma;

public class Ladrao extends Estilo {
    public Ladrao(){
        setNome("Ladrão");
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
