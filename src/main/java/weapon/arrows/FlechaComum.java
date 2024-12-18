package weapon.arrows;

public class FlechaComum extends Flecha{
    public FlechaComum(int quantidade) {
        super(quantidade);
        setNome("Comum");
        setDescricao("Um flecha Comum");
        setDano(30);
    }
}
