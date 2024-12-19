package enemy.factorys;
import enemy.enemies.Dodongo;
import enemy.enemies.FlameFlan;
import enemy.enemies.Lizalfos;
import enemy.enemies.Ork;
import entity.Inimigo;

public class FabricaTerrestre implements FabricaInimigo{
    @Override
    public Inimigo criar(Class e, String apelido) {
        if(e.equals(Dodongo.class))
            return new Dodongo(apelido);
        else if(e.equals(FlameFlan.class))
            return new FlameFlan(apelido);
        else if(e.equals(Lizalfos.class))
            return new Lizalfos(apelido);
        else if(e.equals(Ork.class))
            return new Ork(apelido);

        return null;
    }
}
