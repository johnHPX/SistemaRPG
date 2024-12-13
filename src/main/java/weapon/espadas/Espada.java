package weapon.espadas;

import weapon.Arma;

public abstract class Espada extends Arma {
    public void ataqueHorizontal(){
        System.out.println("Ataque horizontal! +50 pontos");
    }

    public void ataqueVertical(){
        System.out.println("Ataque vertical! +60 pontos");
    }

    public abstract void ataqueCritico();

}
