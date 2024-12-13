package entity;

import mechanics.Ataque;
import style.Estilo;
import mechanics.Acao;
import weapon.Arma;

public abstract class Personagem extends Entidade{
    private Estilo estilo;
    private Arma arma;
    private Acao acao;
    private Ataque ataque;

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public void executarAtaque(Inimigo inimigo){
        ataque.executarAtaque(getNome(), estilo, arma, inimigo);
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }

    public void executar(){
        acao.executar(this);
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    protected void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public void getStatus(){
        System.out.println("Name: "+getNome());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Nivel: "+getNivel());
        System.out.println("PV: "+getPv());
        System.out.println("MP: "+getMp());
        System.out.println("Estilo: "+getEstilo().getNome());
        System.out.println("Arma: "+getArma().getNome());
    }
}
