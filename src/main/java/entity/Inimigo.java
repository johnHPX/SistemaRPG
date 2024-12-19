package entity;

import mechanics.attacksEnimies.AtaqueInimigo;
import mechanics.commands.ComandoFuga;
import mechanics.commands.ComandoStatus;
import mechanics.spells.Feitico;

public abstract class Inimigo extends Entidade implements ObserverEntidade, ComandoStatus, ComandoFuga {
    private String tipo;
    private String apelido;

    private Feitico feitico;
    private AtaqueInimigo ataque;

    public AtaqueInimigo getAtaque() {
        return ataque;
    }

    public void setAtaque(AtaqueInimigo ataque) {
        this.ataque = ataque;
    }

    public void atacar(Personagem personagem){
        getAtaque().atacar(getApelido(), personagem);
    }

    public void lancarFeitico(Entidade entidade){
        getFeitico().lancar(getNome(), entidade);
    }

    public Feitico getFeitico() {
        return feitico;
    }

    protected void setFeitico(Feitico feitico) {
        this.feitico = feitico;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void fugir() {
        System.out.println(getApelido()+" fugiu da batalha...");
    }

    @Override
    public void getStatus(){
        System.out.println("Name: "+getNome());
        System.out.println("Apelido: "+getApelido());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Nivel: "+getNivel());
        System.out.println("PV: "+getPv());
        System.out.println("MP: "+getMp());
        System.out.println("Tipo: "+getTipo());
    }

    @Override
    public void executar(String evento, Entidade entidade) {
        switch (evento){
            case "status":
                getStatus();
                break;
            case "fugir":
                fugir();
                break;
            default:
                System.out.println("Comando não reconhecido");
        }
    }
}
