package weapon.fistWeapons;

import weapon.Arma;

public abstract class FistWeapon extends Arma {
    public FistWeapon(){
        setTipo("FistWeapon");
    }

    @Override
    public void status() {
        System.out.println("Nome: "+getNome());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Dano: "+getDano());
    }
}
