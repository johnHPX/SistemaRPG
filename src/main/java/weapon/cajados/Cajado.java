package weapon.cajados;

import weapon.Arma;

public abstract class Cajado extends Arma {

    public Cajado(){
        setTipo("Cajado");
    }

    @Override
    public void status() {
        System.out.println("Nome: "+getNome());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Dano: "+getDano());
    }
}
