package entity;

public abstract class Inimigo extends Entidade{
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void getStatus(){
        System.out.println("Name: "+getNome());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Nivel: "+getNivel());
        System.out.println("PV: "+getPv());
        System.out.println("MP: "+getMp());
        System.out.println("Tipo: "+getTipo());
    }
}
