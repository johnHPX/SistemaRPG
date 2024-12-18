package weapon.arrows;

public class FlechaDeFogo extends Flecha{

    public FlechaDeFogo(int quantidade) {
        super(quantidade);
        setNome("Flecha de Fogo");
        setDescricao("Use para queimar seus inimigos!");
        setDano(75);
    }

}
