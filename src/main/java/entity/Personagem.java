package entity;
import mechanics.commands.ComandoFuga;
import mechanics.commands.ComandoStatus;
import mechanics.attacksArmas.AtaquePersonagem;
import mechanics.spells.Feitico;
import style.Estilo;
import weapon.Arma;

public abstract class Personagem extends Entidade implements ObserverEntidade, ComandoFuga, ComandoStatus {
    private Estilo estilo;
    private Arma arma;
    private AtaquePersonagem ataque;
    private Feitico feitico;

    private String armadura = "";

    public String getArmadura() {
        return armadura;
    }

    protected void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public void setAtaque(AtaquePersonagem ataquePersonagem) {
        this.ataque = ataquePersonagem;
    }

    public void executarAtaque(Inimigo inimigo){
        getAtaque().executarAtaque(getNome(), getEstilo(), getArma(), inimigo);
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

    public AtaquePersonagem getAtaque() {
        return ataque;
    }

    public Feitico getFeitico() {
        return feitico;
    }

    public void setFeitico(Feitico feitico) {
        this.feitico = feitico;
    }

    public void lancarFeitico(Entidade entidade){
        getFeitico().lancar(getNome(), entidade);
    }

    @Override
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

    @Override
    public void fugir() {
        System.out.println(getNome()+" fugiu da batalha...");
    }

    @Override
    public void executar(String evento, Entidade entidade) {
        switch (evento) {
            case "fuga":
                fugir();
                break;
            case "status":
                getStatus();
                break;
            case "ataqueCombinado":
                executarAtaque((Inimigo) entidade);
                break;
            default:
                System.out.println(getNome() + " recebeu um evento desconhecido: " + evento);
        }
    }
}
