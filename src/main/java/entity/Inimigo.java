package entity;

import mechanics.commands.ComandoStatus;

public abstract class Inimigo extends Entidade implements ObserverEntidade, ComandoStatus {
    private String tipo;
    private String apelido;

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
        getStatus();
    }
}
