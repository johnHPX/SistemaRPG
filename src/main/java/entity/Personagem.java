package entity;

import mechanics.Ataque;
import style.Estilo;
import weapon.Arma;

public abstract class Personagem extends Entidade{
    private Estilo estilo;
    private Arma arma;
    private Ataque ataque;

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public void executarAtaque(Inimigo inimigo){
        ataque.executarAtaque(getNome(), estilo, arma, inimigo);
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    protected void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void getStatus(){
        System.out.println("Name: "+getNome());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Nivel: "+getNivel());
        System.out.println("PV: "+getPv());
        System.out.println("MP: "+getMp());
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        estilo.status();
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        arma.status();
    }
}
