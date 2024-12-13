package weapon.adagas;

import weapon.Arma;

public abstract class Adaga extends Arma {

    public Adaga(){
        setTipo("Adaga");
    }

    @Override
    public void status() {
        System.out.println("Nome: "+getNome());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Dano: "+getDano());
    }
}
