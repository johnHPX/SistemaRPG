package weapon.arcos;

public class ChamaDeFenix extends Arco{
    private String habilidade;
    private int danoExtra;

    public ChamaDeFenix(){
        setNome("Chama De Fenix");
        setDescricao("Um arco raro, criado apatir das chanas de uma fenix.");
        setDano(350);
        setHabilidade("fogo");
        setDanoExtra(150);
    }

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

    @Override
    public void status() {
        super.status();
        System.out.println("Habilidade: "+getHabilidade());
        System.out.println("Dano Extra: "+getDanoExtra());
    }
}
