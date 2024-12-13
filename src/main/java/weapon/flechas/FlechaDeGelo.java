package weapon.flechas;

public class FlechaDeGelo extends Flecha{

    public FlechaDeGelo(int quantidade) {
        super(quantidade);
        setNome("Flecha de Gelo");
        setDescricao("Use para congelar seus inimigos!");
        setDano(45);
    }
}
