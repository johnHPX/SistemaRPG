package weapon.flechas;

import weapon.Arma;

public abstract class Flecha extends Arma {
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Flecha(int quantidade){
        setTipo("Arco");
        setQuantidade(quantidade);
    }

    public void status() {
        System.out.println("Nome: "+getNome());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Dano: "+getDano());
        System.out.println("Quantiade: "+getQuantidade());
    }
}
