package enemy.factorys;
import enemy.enemies.Dodongo;
import enemy.enemies.FlameFlan;
import enemy.enemies.Lizalfos;
import enemy.enemies.Ork;
import entity.Inimigo;

public class FabricaTerrestre implements FabricaInimigo{
    @Override
    public Inimigo criar(Class<? extends Inimigo> e, String apelido) {
        if(e.equals(Dodongo.class))
            return new Dodongo();
        else if(e.equals(FlameFlan.class))
            return new FlameFlan();
        else if(e.equals(Lizalfos.class))
            return new Lizalfos();
        else if(e.equals(Ork.class))
            return new Ork();

        return null;
    }
}
