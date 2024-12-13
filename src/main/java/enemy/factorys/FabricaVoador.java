package enemy.factorys;

import enemy.enemies.BatEye;
import enemy.enemies.FireKeese;
import entity.Inimigo;

public class FabricaVoador implements FabricaInimigo {
    @Override
    public Inimigo criar(Class<? extends Inimigo> e) {
        if (e.equals(BatEye.class))
            return new BatEye();
        else if(e.equals(FireKeese.class))
            return new FireKeese();

        return null;
    }
}
