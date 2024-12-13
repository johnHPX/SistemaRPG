package weapon.espadas;

import weapon.Arma;

public abstract class Espada extends Arma {
    public Espada(){
        setTipo("espada");
    }

    @Override
    public void status() {
        System.out.println("Nome: "+getNome());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Dano: "+getDano());
    }
}
