package entity;
import mechanics.Ataque;
import style.Estilo;
import weapon.Arma;

public abstract class Personagem extends Entidade{
    private Estilo estilo;
    private Arma arma;
    private Ataque ataque;

    private String armadura = "";

    public String getArmadura() {
        return armadura;
    }

    protected void setArmadura(String armadura) {
        this.armadura = armadura;
    }

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

    public Arma getArma() {
        return arma;
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public void getStatus(){
        System.out.println("Name: "+getNome());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Nivel: "+getNivel());
        System.out.println("PV: "+getPv());
        System.out.println("MP: "+getMp());
        if (getArmadura().isEmpty()){
            System.out.println("Armaduras: nenhuma armadura");
        }else{
            System.out.println("Armaduras: "+getArmadura());
        }
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        getEstilo().status();
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        getArma().status();
    }
}
