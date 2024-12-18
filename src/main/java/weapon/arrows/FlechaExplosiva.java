package weapon.arrows;

public class FlechaExplosiva extends Flecha{
    public FlechaExplosiva(int quantidade) {
        super(quantidade);
        setNome("Flecha de Explosiva");
        setDescricao("Use para explodir seus inimigos!");
        setDano(250);
    }
}
