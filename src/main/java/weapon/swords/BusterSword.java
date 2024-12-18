package weapon.swords;

public class BusterSword extends Espada{

    private String habilidade;
    private int danoExtra;

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public int getDanoExtra() {
        return danoExtra;
    }

    public void setDanoExtra(int danoExtra) {
        this.danoExtra = danoExtra;
    }

    public BusterSword(){
        setNome("BusterSword");
        setDescricao("Espada longa");
        setDano(520);
        setHabilidade("fogo");
        setDanoExtra(100);
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Habilidade: "+getHabilidade());
        System.out.println("Dano Extra: "+getDanoExtra());
    }
}
