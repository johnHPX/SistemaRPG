package weapon.arcos;

import weapon.Arma;

public abstract class Arco extends Arma {
    public Arco(){
        setTipo("Arco");
    }

    @Override
    public void status() {
        System.out.println("Nome: "+getNome());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Dano: "+getDano());
    }
}
